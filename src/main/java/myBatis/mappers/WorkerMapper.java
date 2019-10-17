package myBatis.mappers;

import myBatis.entity.Worker;

public interface WorkerMapper {
    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 worker
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 worker
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int insert(Worker record);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 worker
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int insertSelective(Worker record);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 worker
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    Worker selectByPrimaryKey(Integer id);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 worker
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int updateByPrimaryKeySelective(Worker record);

    /**
     * 该方法由MyBatis Generator生成。
     * 该方法对应数据库表 worker
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    int updateByPrimaryKey(Worker record);
}