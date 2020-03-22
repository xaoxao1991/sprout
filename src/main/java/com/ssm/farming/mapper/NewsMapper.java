package com.ssm.farming.mapper;

import com.ssm.farming.pojo.News;
import com.ssm.farming.pojo.NewsExample;
import java.util.List;

import com.ssm.farming.vo.NewsVo;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    int countByExample(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    int deleteByExample(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    int insert(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    int insertSelective(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    List<News> selectByExampleWithBLOBs(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    List<News> selectByExample(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    NewsVo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") News record, @Param("example") NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_news
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(News record);
}