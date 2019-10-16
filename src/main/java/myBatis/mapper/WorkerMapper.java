package myBatis.mapper;

import myBatis.entity.Worker;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface WorkerMapper {
    @Delete({
        "delete from worker",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into worker (id, name, pthone, ",
        "salary, absence, ",
        "deptid)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=CHAR}, #{pthone,jdbcType=INTEGER}, ",
        "#{salary,jdbcType=INTEGER}, #{absence,jdbcType=INTEGER}, ",
        "#{deptid,jdbcType=INTEGER})"
    })
    int insert(Worker record);

    @InsertProvider(type=WorkerSqlProvider.class, method="insertSelective")
    int insertSelective(Worker record);

    @Select({
        "select",
        "id, name, pthone, salary, absence, deptid",
        "from worker",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.CHAR),
        @Result(column="pthone", property="pthone", jdbcType=JdbcType.INTEGER),
        @Result(column="salary", property="salary", jdbcType=JdbcType.INTEGER),
        @Result(column="absence", property="absence", jdbcType=JdbcType.INTEGER),
        @Result(column="deptid", property="deptid", jdbcType=JdbcType.INTEGER)
    })
    Worker selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, name, pthone, salary, absence, deptid",
            "from worker"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="name", property="name", jdbcType=JdbcType.CHAR),
            @Result(column="pthone", property="pthone", jdbcType=JdbcType.INTEGER),
            @Result(column="salary", property="salary", jdbcType=JdbcType.INTEGER),
            @Result(column="absence", property="absence", jdbcType=JdbcType.INTEGER),
            @Result(column="deptid", property="deptid", jdbcType=JdbcType.INTEGER)
    })
    List<Worker> selectAll();

    @UpdateProvider(type=WorkerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Worker record);

    @Update({
        "update worker",
        "set name = #{name,jdbcType=CHAR},",
          "pthone = #{pthone,jdbcType=INTEGER},",
          "salary = #{salary,jdbcType=INTEGER},",
          "absence = #{absence,jdbcType=INTEGER},",
          "deptid = #{deptid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Worker record);
}