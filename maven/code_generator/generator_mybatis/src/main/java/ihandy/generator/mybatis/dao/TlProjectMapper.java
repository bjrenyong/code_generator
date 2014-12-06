package ihandy.generator.mybatis.dao;

import ihandy.generator.mybatis.model.TlProject;
import ihandy.generator.mybatis.model.TlProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TlProjectMapper {
    int countByExample(TlProjectExample example);

    int deleteByExample(TlProjectExample example);

    int deleteByPrimaryKey(Integer projectId);

    int insert(TlProject record);

    int insertSelective(TlProject record);

    List<TlProject> selectByExample(TlProjectExample example);

    TlProject selectByPrimaryKey(Integer projectId);

    int updateByExampleSelective(@Param("record") TlProject record, @Param("example") TlProjectExample example);

    int updateByExample(@Param("record") TlProject record, @Param("example") TlProjectExample example);

    int updateByPrimaryKeySelective(TlProject record);

    int updateByPrimaryKey(TlProject record);
}