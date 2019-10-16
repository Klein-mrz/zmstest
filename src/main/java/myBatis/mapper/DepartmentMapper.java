package myBatis.mapper;

import myBatis.entity.Department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface DepartmentMapper {
    @Delete({
        "delete from department",
        "where deptid = #{deptid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer deptid);

    @Insert({
        "insert into department (deptid, name)",
        "values (#{deptid,jdbcType=INTEGER}, #{name,jdbcType=CHAR})"
    })
    int insert(Department record);

    @InsertProvider(type=DepartmentSqlProvider.class, method="insertSelective")
    int insertSelective(Department record);

    @Select({
        "select",
        "deptid, name",
        "from department",
        "where deptid = #{deptid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="deptid", property="deptid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.CHAR)
    })
    Department selectByPrimaryKey(Integer deptid);

    @UpdateProvider(type=DepartmentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Department record);

    @Update({
        "update department",
        "set name = #{name,jdbcType=CHAR}",
        "where deptid = #{deptid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Department record);
}