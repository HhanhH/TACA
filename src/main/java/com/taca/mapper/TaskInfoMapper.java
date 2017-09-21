package com.taca.mapper;


import com.taca.model.TaskInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TaskInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_B_TASK_INFO
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_B_TASK_INFO
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int insert(TaskInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_B_TASK_INFO
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int insertSelective(TaskInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_B_TASK_INFO
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    TaskInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_B_TASK_INFO
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int updateByPrimaryKeySelective(TaskInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_B_TASK_INFO
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(TaskInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_B_TASK_INFO
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int updateByPrimaryKey(TaskInfo record);
}