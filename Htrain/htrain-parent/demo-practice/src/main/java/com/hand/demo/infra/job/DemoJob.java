package com.hand.demo.infra.job;

import java.util.Map;

import org.hzero.boot.scheduler.infra.annotation.JobHandler;
import org.hzero.boot.scheduler.infra.enums.ReturnT;
import org.hzero.boot.scheduler.infra.handler.IJobHandler;
import org.hzero.boot.scheduler.infra.tool.SchedulerTool;

/**
 * 调度任务Demo
 *
 * @author xiaoyu.tang@hand-china.com 2023/09/23 21:31
 */
@JobHandler("DEMO")
public class DemoJob implements IJobHandler {

    @Override
    public ReturnT execute(Map<String, String> map, SchedulerTool tool) {
        // 10s刷新一次任务进度和描述
        tool.updateProgress(10, "");
        // 打印日志
        tool.info("示例任务执行成功");
        return ReturnT.SUCCESS;
    }
}
