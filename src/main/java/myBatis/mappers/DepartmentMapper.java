package myBatis.mappers;

import myBatis.entity.Department;

public interface DepartmentMapper {
    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 department
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int deleteByPrimaryKey(Integer deptid);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 department
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int insert(Department record);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 department
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int insertSelective(Department record);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 department
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    Department selectByPrimaryKey(Integer deptid);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 department
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 department
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int updateByPrimaryKey(Department record);
}