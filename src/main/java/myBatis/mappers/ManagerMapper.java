package myBatis.mappers;

import myBatis.entity.Manager;

public interface ManagerMapper {
    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 manager
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 manager
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int insert(Manager record);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 manager
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int insertSelective(Manager record);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 manager
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    Manager selectByPrimaryKey(Integer id);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 manager
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int updateByPrimaryKeySelective(Manager record);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 manager
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int updateByPrimaryKey(Manager record);
}