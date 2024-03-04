package com.luntek.quartz.service;

import com.luntek.quartz.model.SysTask;

import java.util.List;

/**
 * @author: luntek
 * @Date: 2019/7/12 13:58
 * @Description:
 */
public interface SysTaskService {
    /**
     * 查询启用的任务
     * @param isEnable
     * @return
     */
    List<SysTask> findEnableTask(Integer isEnable);
}
