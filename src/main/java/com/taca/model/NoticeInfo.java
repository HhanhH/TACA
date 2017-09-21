package com.taca.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;
@Alias("NoticeInfo")
public class NoticeInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_NOTICE_INFO.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_NOTICE_INFO.TITLE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_NOTICE_INFO.ICON_ADDRESS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String iconAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_NOTICE_INFO.STATUS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_NOTICE_INFO.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_NOTICE_INFO.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_NOTICE_INFO.CONTENT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_NOTICE_INFO.ID
     *
     * @return the value of IM_B_NOTICE_INFO.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_NOTICE_INFO.ID
     *
     * @param id the value for IM_B_NOTICE_INFO.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_NOTICE_INFO.TITLE
     *
     * @return the value of IM_B_NOTICE_INFO.TITLE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_NOTICE_INFO.TITLE
     *
     * @param title the value for IM_B_NOTICE_INFO.TITLE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_NOTICE_INFO.ICON_ADDRESS
     *
     * @return the value of IM_B_NOTICE_INFO.ICON_ADDRESS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getIconAddress() {
        return iconAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_NOTICE_INFO.ICON_ADDRESS
     *
     * @param iconAddress the value for IM_B_NOTICE_INFO.ICON_ADDRESS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setIconAddress(String iconAddress) {
        this.iconAddress = iconAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_NOTICE_INFO.STATUS
     *
     * @return the value of IM_B_NOTICE_INFO.STATUS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_NOTICE_INFO.STATUS
     *
     * @param status the value for IM_B_NOTICE_INFO.STATUS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_NOTICE_INFO.CREATE_TIME
     *
     * @return the value of IM_B_NOTICE_INFO.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_NOTICE_INFO.CREATE_TIME
     *
     * @param createTime the value for IM_B_NOTICE_INFO.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_NOTICE_INFO.UPDATE_TIME
     *
     * @return the value of IM_B_NOTICE_INFO.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_NOTICE_INFO.UPDATE_TIME
     *
     * @param updateTime the value for IM_B_NOTICE_INFO.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_NOTICE_INFO.CONTENT
     *
     * @return the value of IM_B_NOTICE_INFO.CONTENT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_NOTICE_INFO.CONTENT
     *
     * @param content the value for IM_B_NOTICE_INFO.CONTENT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setContent(String content) {
        this.content = content;
    }
}