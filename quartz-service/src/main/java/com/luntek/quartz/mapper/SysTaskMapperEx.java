package com.luntek.quartz.mapper;

import com.luntek.quartz.model.SysTask;

import java.util.List;

/**
 * @author: luntek
 * @Date: 2019/7/12 14:03
 * @Description:
 */
public interface SysTaskMapperEx {
    List<SysTask> findEnableTask(Integer isEnable);
}
