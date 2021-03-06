package com.taca.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;
@Alias("HonorTitle")
public class HonorTitle {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_HONOR_TITLE.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_HONOR_TITLE.TITLE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_HONOR_TITLE.STAR_NUMBER
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long starNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_HONOR_TITLE.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_HONOR_TITLE.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_HONOR_TITLE.ID
     *
     * @return the value of IM_B_HONOR_TITLE.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_HONOR_TITLE.ID
     *
     * @param id the value for IM_B_HONOR_TITLE.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_HONOR_TITLE.TITLE
     *
     * @return the value of IM_B_HONOR_TITLE.TITLE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_HONOR_TITLE.TITLE
     *
     * @param title the value for IM_B_HONOR_TITLE.TITLE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_HONOR_TITLE.STAR_NUMBER
     *
     * @return the value of IM_B_HONOR_TITLE.STAR_NUMBER
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getStarNumber() {
        return starNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_HONOR_TITLE.STAR_NUMBER
     *
     * @param starNumber the value for IM_B_HONOR_TITLE.STAR_NUMBER
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setStarNumber(Long starNumber) {
        this.starNumber = starNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_HONOR_TITLE.CREATE_TIME
     *
     * @return the value of IM_B_HONOR_TITLE.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_HONOR_TITLE.CREATE_TIME
     *
     * @param createTime the value for IM_B_HONOR_TITLE.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_HONOR_TITLE.UPDATE_TIME
     *
     * @return the value of IM_B_HONOR_TITLE.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_HONOR_TITLE.UPDATE_TIME
     *
     * @param updateTime the value for IM_B_HONOR_TITLE.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}