package cn.com.user.mapper;

import cn.com.user.pojo.TExaQuestionDetailed;
import cn.com.user.pojo.TExaQuestionDetailedExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TExaQuestionDetailedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_QUESTION_DETAILED
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int countByExample(TExaQuestionDetailedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_QUESTION_DETAILED
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int deleteByExample(TExaQuestionDetailedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_QUESTION_DETAILED
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int deleteByPrimaryKey(String questionNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_QUESTION_DETAILED
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int insert(TExaQuestionDetailed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_QUESTION_DETAILED
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int insertSelective(TExaQuestionDetailed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_QUESTION_DETAILED
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    List<TExaQuestionDetailed> selectByExample(TExaQuestionDetailedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_QUESTION_DETAILED
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    TExaQuestionDetailed selectByPrimaryKey(String questionNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_QUESTION_DETAILED
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int updateByExampleSelective(@Param("record") TExaQuestionDetailed record, @Param("example") TExaQuestionDetailedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_QUESTION_DETAILED
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int updateByExample(@Param("record") TExaQuestionDetailed record, @Param("example") TExaQuestionDetailedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_QUESTION_DETAILED
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int updateByPrimaryKeySelective(TExaQuestionDetailed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_EXA_QUESTION_DETAILED
     *
     * @mbggenerated Mon Aug 14 15:21:26 CST 2017
     */
    int updateByPrimaryKey(TExaQuestionDetailed record);

	List<TExaQuestionDetailed> findRelation(Map<String, String> map);

	void insertList(Map<String, Object> maps);

	void insertquestion(Map<String, Object> map);
}