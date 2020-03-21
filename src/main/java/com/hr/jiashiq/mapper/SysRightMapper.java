package com.hr.jiashiq.mapper;

import com.hr.entity.SysRight;
import com.hr.entity.SysRightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRightMapper {
	public List<SysRight> queryRight();
	public List<SysRight> queryRightByParentId(Integer id);
	public List<SysRight> queryRightAndRoleByRoleId(Integer roleId);
	
    long countByExample(SysRightExample example);

    int deleteByExample(SysRightExample example);

    int deleteByPrimaryKey(Integer rightCode);

    int insert(SysRight record);

    int insertSelective(SysRight record);

    List<SysRight> selectByExample(SysRightExample example);

    SysRight selectByPrimaryKey(Integer rightCode);

    int updateByExampleSelective(@Param("record") SysRight record, @Param("example") SysRightExample example);

    int updateByExample(@Param("record") SysRight record, @Param("example") SysRightExample example);

    int updateByPrimaryKeySelective(SysRight record);

    int updateByPrimaryKey(SysRight record);
}