package com.luntek.quartz.mapper;




import com.luntek.quartz.model.SysTask;

import java.util.List;

public interface SysTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysTask record);

    int insertSelective(SysTask record);

    SysTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysTask record);

    int updateByPrimaryKey(SysTask record);

    List<SysTask> findEnableTask(Integer isEnable);
}
