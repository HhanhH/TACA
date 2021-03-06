package com.taca.mapper;


import com.taca.model.Shopping;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShoppingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_D_SHOPPING
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_D_SHOPPING
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int insert(Shopping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_D_SHOPPING
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int insertSelective(Shopping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_D_SHOPPING
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    Shopping selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_D_SHOPPING
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int updateByPrimaryKeySelective(Shopping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_D_SHOPPING
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(Shopping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_D_SHOPPING
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int updateByPrimaryKey(Shopping record);
}