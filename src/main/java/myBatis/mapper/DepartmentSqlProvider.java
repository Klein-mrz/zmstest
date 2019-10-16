package myBatis.mapper;

import myBatis.entity.Department;
import org.apache.ibatis.jdbc.SQL;

public class DepartmentSqlProvider {

    public String insertSelective(Department record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("department");
        
        if (record.getDeptid() != null) {
            sql.VALUES("deptid", "#{deptid,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Department record) {
        SQL sql = new SQL();
        sql.UPDATE("department");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=CHAR}");
        }
        
        sql.WHERE("deptid = #{deptid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}