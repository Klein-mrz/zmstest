package myBatis.mapper;

import myBatis.entity.Manager;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ManagerMapper {
    @Delete({
        "delete from manager",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into manager (id, name, password, ",
        "deptid)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=CHAR}, #{password,jdbcType=CHAR}, ",
        "#{deptid,jdbcType=INTEGER})"
    })
    int insert(Manager record);

    @InsertProvider(type=ManagerSqlProvider.class, method="insertSelective")
    int insertSelective(Manager record);

    @Select({
        "select",
        "id, name, password, deptid",
        "from manager",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.CHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.CHAR),
        @Result(column="deptid", property="deptid", jdbcType=JdbcType.INTEGER)
    })
    Manager selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ManagerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Manager record);

    @Update({
        "update manager",
        "set name = #{name,jdbcType=CHAR},",
          "password = #{password,jdbcType=CHAR},",
          "deptid = #{deptid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Manager record);
}