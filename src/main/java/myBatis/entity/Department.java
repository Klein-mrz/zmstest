package myBatis.entity;

import com._520it.mybatis.domain.BaseDomain;


public class Department extends BaseDomain {
    private Integer deptid;

    private String name;

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}