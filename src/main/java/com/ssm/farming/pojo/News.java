package com.ssm.farming.pojo;

import java.util.Date;

public class News {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_news.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_news.news_title
     *
     * @mbggenerated
     */
    private String newsTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_news.news_author
     *
     * @mbggenerated
     */
    private String newsAuthor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_news.news_time
     *
     * @mbggenerated
     */
    private Date newsTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_news.news_image
     *
     * @mbggenerated
     */
    private String newsImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_news.news_content
     *
     * @mbggenerated
     */
    private String newsContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_news.id
     *
     * @return the value of tb_news.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_news.id
     *
     * @param id the value for tb_news.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_news.news_title
     *
     * @return the value of tb_news.news_title
     *
     * @mbggenerated
     */
    public String getNewsTitle() {
        return newsTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_news.news_title
     *
     * @param newsTitle the value for tb_news.news_title
     *
     * @mbggenerated
     */
    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_news.news_author
     *
     * @return the value of tb_news.news_author
     *
     * @mbggenerated
     */
    public String getNewsAuthor() {
        return newsAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_news.news_author
     *
     * @param newsAuthor the value for tb_news.news_author
     *
     * @mbggenerated
     */
    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor == null ? null : newsAuthor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_news.news_time
     *
     * @return the value of tb_news.news_time
     *
     * @mbggenerated
     */
    public Date getNewsTime() {
        return newsTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_news.news_time
     *
     * @param newsTime the value for tb_news.news_time
     *
     * @mbggenerated
     */
    public void setNewsTime(Date newsTime) {
        this.newsTime = newsTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_news.news_image
     *
     * @return the value of tb_news.news_image
     *
     * @mbggenerated
     */
    public String getNewsImage() {
        return newsImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_news.news_image
     *
     * @param newsImage the value for tb_news.news_image
     *
     * @mbggenerated
     */
    public void setNewsImage(String newsImage) {
        this.newsImage = newsImage == null ? null : newsImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_news.news_content
     *
     * @return the value of tb_news.news_content
     *
     * @mbggenerated
     */
    public String getNewsContent() {
        return newsContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_news.news_content
     *
     * @param newsContent the value for tb_news.news_content
     *
     * @mbggenerated
     */
    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }
}