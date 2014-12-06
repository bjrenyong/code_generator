package ihandy.generator.mybatis.dao;

import ihandy.generator.mybatis.model.TlVariable;
import ihandy.generator.mybatis.model.TlVariableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TlVariableMapper {
    int countByExample(TlVariableExample example);

    int deleteByExample(TlVariableExample example);

    int deleteByPrimaryKey(Integer variableId);

    int insert(TlVariable record);

    int insertSelective(TlVariable record);

    List<TlVariable> selectByExample(TlVariableExample example);

    TlVariable selectByPrimaryKey(Integer variableId);

    int updateByExampleSelective(@Param("record") TlVariable record, @Param("example") TlVariableExample example);

    int updateByExample(@Param("record") TlVariable record, @Param("example") TlVariableExample example);

    int updateByPrimaryKeySelective(TlVariable record);

    int updateByPrimaryKey(TlVariable record);
}