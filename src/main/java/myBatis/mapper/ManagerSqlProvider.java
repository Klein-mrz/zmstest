package myBatis.mapper;

import myBatis.entity.Manager;
import org.apache.ibatis.jdbc.SQL;

public class ManagerSqlProvider {

    public String insertSelective(Manager record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("manager");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=CHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=CHAR}");
        }
        
        if (record.getDeptid() != null) {
            sql.VALUES("deptid", "#{deptid,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Manager record) {
        SQL sql = new SQL();
        sql.UPDATE("manager");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=CHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=CHAR}");
        }
        
        if (record.getDeptid() != null) {
            sql.SET("deptid = #{deptid,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}