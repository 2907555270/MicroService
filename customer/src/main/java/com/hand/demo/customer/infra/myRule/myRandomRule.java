package com.hand.demo.customer.infra.myRule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 14:06
 */
public class myRandomRule extends AbstractLoadBalancerRule {

    private int total = 0;
    private int currentIndex = 0;

    @Override
    public Server choose(Object o) {
        ILoadBalancer loadBalancer = getLoadBalancer();

        if (loadBalancer == null) {
            return null;
        }

        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }

            // 获取所有服务列表
            List<Server> allList = loadBalancer.getAllServers();
            // 获取可用的服务列表
            List<Server> upList = loadBalancer.getReachableServers();

            // 没有任何实例
            if (allList.isEmpty()) {
                return null;
            }

            // 每个实例默认访问3次才切换
            if (total < 3) {
                server = upList.get(currentIndex);
                total++;
            } else {
                total = 0;
                currentIndex++;
                if (currentIndex >= allList.size()) {
                    currentIndex = 0;
                }
            }

            if(server==null){
                Thread.yield();
                continue;
            }

            if(server.isAlive()){
                return server;
            }

            server = null;
            Thread.yield();
        }

        return server;
    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }
}
