package ihandy.generator.mybatis.dao;

import ihandy.generator.mybatis.model.TlServerInfo;
import ihandy.generator.mybatis.model.TlServerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TlServerInfoMapper {
    int countByExample(TlServerInfoExample example);

    int deleteByExample(TlServerInfoExample example);

    int deleteByPrimaryKey(Integer serverId);

    int insert(TlServerInfo record);

    int insertSelective(TlServerInfo record);

    List<TlServerInfo> selectByExample(TlServerInfoExample example);

    TlServerInfo selectByPrimaryKey(Integer serverId);

    int updateByExampleSelective(@Param("record") TlServerInfo record, @Param("example") TlServerInfoExample example);

    int updateByExample(@Param("record") TlServerInfo record, @Param("example") TlServerInfoExample example);

    int updateByPrimaryKeySelective(TlServerInfo record);

    int updateByPrimaryKey(TlServerInfo record);
}