package com.taca.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("Shopping")
public class Shopping {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_SHOPPING.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_SHOPPING.USERNAME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_SHOPPING.GOODS_ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_SHOPPING.NAME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_SHOPPING.STAR_NUMBER
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long starNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_SHOPPING.STATUS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_SHOPPING.TRANS_ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long transId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_SHOPPING.START_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_SHOPPING.FINISH_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date finishTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_SHOPPING.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_SHOPPING.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_SHOPPING.CONTENT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_SHOPPING.ID
     *
     * @return the value of IM_D_SHOPPING.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_SHOPPING.ID
     *
     * @param id the value for IM_D_SHOPPING.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_SHOPPING.USERNAME
     *
     * @return the value of IM_D_SHOPPING.USERNAME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_SHOPPING.USERNAME
     *
     * @param username the value for IM_D_SHOPPING.USERNAME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_SHOPPING.GOODS_ID
     *
     * @return the value of IM_D_SHOPPING.GOODS_ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_SHOPPING.GOODS_ID
     *
     * @param goodsId the value for IM_D_SHOPPING.GOODS_ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_SHOPPING.NAME
     *
     * @return the value of IM_D_SHOPPING.NAME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_SHOPPING.NAME
     *
     * @param name the value for IM_D_SHOPPING.NAME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_SHOPPING.STAR_NUMBER
     *
     * @return the value of IM_D_SHOPPING.STAR_NUMBER
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getStarNumber() {
        return starNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_SHOPPING.STAR_NUMBER
     *
     * @param starNumber the value for IM_D_SHOPPING.STAR_NUMBER
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setStarNumber(Long starNumber) {
        this.starNumber = starNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_SHOPPING.STATUS
     *
     * @return the value of IM_D_SHOPPING.STATUS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_SHOPPING.STATUS
     *
     * @param status the value for IM_D_SHOPPING.STATUS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_SHOPPING.TRANS_ID
     *
     * @return the value of IM_D_SHOPPING.TRANS_ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getTransId() {
        return transId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_SHOPPING.TRANS_ID
     *
     * @param transId the value for IM_D_SHOPPING.TRANS_ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setTransId(Long transId) {
        this.transId = transId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_SHOPPING.START_TIME
     *
     * @return the value of IM_D_SHOPPING.START_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_SHOPPING.START_TIME
     *
     * @param startTime the value for IM_D_SHOPPING.START_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_SHOPPING.FINISH_TIME
     *
     * @return the value of IM_D_SHOPPING.FINISH_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_SHOPPING.FINISH_TIME
     *
     * @param finishTime the value for IM_D_SHOPPING.FINISH_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_SHOPPING.CREATE_TIME
     *
     * @return the value of IM_D_SHOPPING.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_SHOPPING.CREATE_TIME
     *
     * @param createTime the value for IM_D_SHOPPING.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_SHOPPING.UPDATE_TIME
     *
     * @return the value of IM_D_SHOPPING.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_SHOPPING.UPDATE_TIME
     *
     * @param updateTime the value for IM_D_SHOPPING.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_SHOPPING.CONTENT
     *
     * @return the value of IM_D_SHOPPING.CONTENT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_SHOPPING.CONTENT
     *
     * @param content the value for IM_D_SHOPPING.CONTENT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setContent(String content) {
        this.content = content;
    }
}