package com.luntek.quartz.service.impl;

import com.luntek.quartz.mapper.SysTaskMapper;
import com.luntek.quartz.mapper.SysTaskMapperEx;
import com.luntek.quartz.model.SysTask;
import com.luntek.quartz.service.SysTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: luntek
 * @Date: 2019/7/12 14:02
 * @Description:
 */
@Service
public class SysTaskServiceImpl implements SysTaskService {
    @Autowired
    SysTaskMapperEx sysTaskMapperEx;
    @Autowired
    SysTaskMapper sysTaskMapper;

    @Override
    public List<SysTask> findEnableTask(Integer isEnable) {
        if (null == isEnable) {
            return null;
        }
        List<SysTask> sysTaskList = sysTaskMapperEx.findEnableTask(isEnable);
        return sysTaskList;
    }
}
