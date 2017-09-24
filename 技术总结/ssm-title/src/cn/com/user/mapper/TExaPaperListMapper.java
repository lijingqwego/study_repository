package cn.com.user.mapper;

import cn.com.user.pojo.TExaPaperList;
import cn.com.user.pojo.TExaPaperListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExaPaperListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_PAPER_LIST
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int countByExample(TExaPaperListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_PAPER_LIST
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int deleteByExample(TExaPaperListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_PAPER_LIST
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int deleteByPrimaryKey(String examinatiListId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_PAPER_LIST
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int insert(TExaPaperList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_PAPER_LIST
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int insertSelective(TExaPaperList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_PAPER_LIST
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    List<TExaPaperList> selectByExample(TExaPaperListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_PAPER_LIST
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    TExaPaperList selectByPrimaryKey(String examinatiListId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_PAPER_LIST
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int updateByExampleSelective(@Param("record") TExaPaperList record, @Param("example") TExaPaperListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_PAPER_LIST
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int updateByExample(@Param("record") TExaPaperList record, @Param("example") TExaPaperListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_PAPER_LIST
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int updateByPrimaryKeySelective(TExaPaperList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_PAPER_LIST
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int updateByPrimaryKey(TExaPaperList record);
}