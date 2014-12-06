package ihandy.generator.mybatis.dao;

import ihandy.generator.mybatis.model.TlClassInfo;
import ihandy.generator.mybatis.model.TlClassInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TlClassInfoMapper {
    int countByExample(TlClassInfoExample example);

    int deleteByExample(TlClassInfoExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(TlClassInfo record);

    int insertSelective(TlClassInfo record);

    List<TlClassInfo> selectByExample(TlClassInfoExample example);

    TlClassInfo selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") TlClassInfo record, @Param("example") TlClassInfoExample example);

    int updateByExample(@Param("record") TlClassInfo record, @Param("example") TlClassInfoExample example);

    int updateByPrimaryKeySelective(TlClassInfo record);

    int updateByPrimaryKey(TlClassInfo record);
}