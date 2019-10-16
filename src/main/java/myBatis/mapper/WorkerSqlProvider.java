package myBatis.mapper;

import myBatis.entity.Worker;
import org.apache.ibatis.jdbc.SQL;

public class WorkerSqlProvider {

    public String insertSelective(Worker record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("worker");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=CHAR}");
        }
        
        if (record.getPthone() != null) {
            sql.VALUES("pthone", "#{pthone,jdbcType=INTEGER}");
        }
        
        if (record.getSalary() != null) {
            sql.VALUES("salary", "#{salary,jdbcType=INTEGER}");
        }
        
        if (record.getAbsence() != null) {
            sql.VALUES("absence", "#{absence,jdbcType=INTEGER}");
        }
        
        if (record.getDeptid() != null) {
            sql.VALUES("deptid", "#{deptid,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Worker record) {
        SQL sql = new SQL();
        sql.UPDATE("worker");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=CHAR}");
        }
        
        if (record.getPthone() != null) {
            sql.SET("pthone = #{pthone,jdbcType=INTEGER}");
        }
        
        if (record.getSalary() != null) {
            sql.SET("salary = #{salary,jdbcType=INTEGER}");
        }
        
        if (record.getAbsence() != null) {
            sql.SET("absence = #{absence,jdbcType=INTEGER}");
        }
        
        if (record.getDeptid() != null) {
            sql.SET("deptid = #{deptid,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}