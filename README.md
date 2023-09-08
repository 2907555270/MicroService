## 2023-9-8 更新
### 更新的目录结构
* Controller (由后端解析视图并返回)
![img.png](source/img_micro.png)

* html文件
![img_1.png](source/img_micro_1.png)

* 微服务模块
![img_2.png](source/img_micro_2.png)

#### Maven管理微服务模块
![img.png](source/img.png)
#### 搭建Eureka集群，并完成服务注册
![img_6.png](source/img_6.png)


#### 完成WebPage编写
<code>多条件查询和分数录入参数传递类似，这里采用了查询，就没有做录入分数了</code>
* 首页

![img_1.png](source/img_1.png)
* ElementUI + Vue + Axios异步获取数据

![img_2.png](source/img_2.png)
* 多条件查询

![img_3.png](source/img_3.png)
* 原生HTML + Form + ModelAndView刷新页面获取数据
    * ModelAndView方式中采用Thymeleaf传递参数

![img_4.png](source/img_4.png)
![img_5.png](source/img_5.png)
#### Ribbon负载均衡
![img_7.png](source/img_7.png)
![img_8.png](source/img_8.png)
