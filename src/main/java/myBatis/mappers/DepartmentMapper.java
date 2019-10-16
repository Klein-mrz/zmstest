package myBatis.mappers;

import myBatis.entity.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer deptid);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer deptid);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}