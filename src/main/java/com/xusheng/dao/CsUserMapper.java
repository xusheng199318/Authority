package com.xusheng.dao;

import com.xusheng.model.CsUser;
import com.xusheng.model.CsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsUserMapper {
    long countByExample(CsUserExample example);

    int deleteByExample(CsUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(CsUser record);

    int insertSelective(CsUser record);

    List<CsUser> selectByExample(CsUserExample example);

    CsUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") CsUser record, @Param("example") CsUserExample example);

    int updateByExample(@Param("record") CsUser record, @Param("example") CsUserExample example);

    int updateByPrimaryKeySelective(CsUser record);

    int updateByPrimaryKey(CsUser record);

    CsUser getUserByUsername(String username);
}