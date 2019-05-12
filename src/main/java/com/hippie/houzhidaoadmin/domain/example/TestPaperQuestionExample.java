package com.hippie.houzhidaoadmin.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestPaperQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestPaperQuestionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(Integer value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(Integer value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(Integer value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(Integer value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<Integer> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<Integer> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andCorrectOptionIsNull() {
            addCriterion("correct_option is null");
            return (Criteria) this;
        }

        public Criteria andCorrectOptionIsNotNull() {
            addCriterion("correct_option is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectOptionEqualTo(Integer value) {
            addCriterion("correct_option =", value, "correctOption");
            return (Criteria) this;
        }

        public Criteria andCorrectOptionNotEqualTo(Integer value) {
            addCriterion("correct_option <>", value, "correctOption");
            return (Criteria) this;
        }

        public Criteria andCorrectOptionGreaterThan(Integer value) {
            addCriterion("correct_option >", value, "correctOption");
            return (Criteria) this;
        }

        public Criteria andCorrectOptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("correct_option >=", value, "correctOption");
            return (Criteria) this;
        }

        public Criteria andCorrectOptionLessThan(Integer value) {
            addCriterion("correct_option <", value, "correctOption");
            return (Criteria) this;
        }

        public Criteria andCorrectOptionLessThanOrEqualTo(Integer value) {
            addCriterion("correct_option <=", value, "correctOption");
            return (Criteria) this;
        }

        public Criteria andCorrectOptionIn(List<Integer> values) {
            addCriterion("correct_option in", values, "correctOption");
            return (Criteria) this;
        }

        public Criteria andCorrectOptionNotIn(List<Integer> values) {
            addCriterion("correct_option not in", values, "correctOption");
            return (Criteria) this;
        }

        public Criteria andCorrectOptionBetween(Integer value1, Integer value2) {
            addCriterion("correct_option between", value1, value2, "correctOption");
            return (Criteria) this;
        }

        public Criteria andCorrectOptionNotBetween(Integer value1, Integer value2) {
            addCriterion("correct_option not between", value1, value2, "correctOption");
            return (Criteria) this;
        }

        public Criteria andReplyNumIsNull() {
            addCriterion("reply_num is null");
            return (Criteria) this;
        }

        public Criteria andReplyNumIsNotNull() {
            addCriterion("reply_num is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNumEqualTo(Integer value) {
            addCriterion("reply_num =", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotEqualTo(Integer value) {
            addCriterion("reply_num <>", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThan(Integer value) {
            addCriterion("reply_num >", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_num >=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThan(Integer value) {
            addCriterion("reply_num <", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThanOrEqualTo(Integer value) {
            addCriterion("reply_num <=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumIn(List<Integer> values) {
            addCriterion("reply_num in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotIn(List<Integer> values) {
            addCriterion("reply_num not in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumBetween(Integer value1, Integer value2) {
            addCriterion("reply_num between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_num not between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionNumIsNull() {
            addCriterion("question_num is null");
            return (Criteria) this;
        }

        public Criteria andQuestionNumIsNotNull() {
            addCriterion("question_num is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionNumEqualTo(Integer value) {
            addCriterion("question_num =", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumNotEqualTo(Integer value) {
            addCriterion("question_num <>", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumGreaterThan(Integer value) {
            addCriterion("question_num >", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_num >=", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumLessThan(Integer value) {
            addCriterion("question_num <", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumLessThanOrEqualTo(Integer value) {
            addCriterion("question_num <=", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumIn(List<Integer> values) {
            addCriterion("question_num in", values, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumNotIn(List<Integer> values) {
            addCriterion("question_num not in", values, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumBetween(Integer value1, Integer value2) {
            addCriterion("question_num between", value1, value2, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("question_num not between", value1, value2, "questionNum");
            return (Criteria) this;
        }

        public Criteria andOptionaContentIsNull() {
            addCriterion("optionA_content is null");
            return (Criteria) this;
        }

        public Criteria andOptionaContentIsNotNull() {
            addCriterion("optionA_content is not null");
            return (Criteria) this;
        }

        public Criteria andOptionaContentEqualTo(String value) {
            addCriterion("optionA_content =", value, "optionaContent");
            return (Criteria) this;
        }

        public Criteria andOptionaContentNotEqualTo(String value) {
            addCriterion("optionA_content <>", value, "optionaContent");
            return (Criteria) this;
        }

        public Criteria andOptionaContentGreaterThan(String value) {
            addCriterion("optionA_content >", value, "optionaContent");
            return (Criteria) this;
        }

        public Criteria andOptionaContentGreaterThanOrEqualTo(String value) {
            addCriterion("optionA_content >=", value, "optionaContent");
            return (Criteria) this;
        }

        public Criteria andOptionaContentLessThan(String value) {
            addCriterion("optionA_content <", value, "optionaContent");
            return (Criteria) this;
        }

        public Criteria andOptionaContentLessThanOrEqualTo(String value) {
            addCriterion("optionA_content <=", value, "optionaContent");
            return (Criteria) this;
        }

        public Criteria andOptionaContentLike(String value) {
            addCriterion("optionA_content like", value, "optionaContent");
            return (Criteria) this;
        }

        public Criteria andOptionaContentNotLike(String value) {
            addCriterion("optionA_content not like", value, "optionaContent");
            return (Criteria) this;
        }

        public Criteria andOptionaContentIn(List<String> values) {
            addCriterion("optionA_content in", values, "optionaContent");
            return (Criteria) this;
        }

        public Criteria andOptionaContentNotIn(List<String> values) {
            addCriterion("optionA_content not in", values, "optionaContent");
            return (Criteria) this;
        }

        public Criteria andOptionaContentBetween(String value1, String value2) {
            addCriterion("optionA_content between", value1, value2, "optionaContent");
            return (Criteria) this;
        }

        public Criteria andOptionaContentNotBetween(String value1, String value2) {
            addCriterion("optionA_content not between", value1, value2, "optionaContent");
            return (Criteria) this;
        }

        public Criteria andOptionbContentIsNull() {
            addCriterion("optionB_content is null");
            return (Criteria) this;
        }

        public Criteria andOptionbContentIsNotNull() {
            addCriterion("optionB_content is not null");
            return (Criteria) this;
        }

        public Criteria andOptionbContentEqualTo(String value) {
            addCriterion("optionB_content =", value, "optionbContent");
            return (Criteria) this;
        }

        public Criteria andOptionbContentNotEqualTo(String value) {
            addCriterion("optionB_content <>", value, "optionbContent");
            return (Criteria) this;
        }

        public Criteria andOptionbContentGreaterThan(String value) {
            addCriterion("optionB_content >", value, "optionbContent");
            return (Criteria) this;
        }

        public Criteria andOptionbContentGreaterThanOrEqualTo(String value) {
            addCriterion("optionB_content >=", value, "optionbContent");
            return (Criteria) this;
        }

        public Criteria andOptionbContentLessThan(String value) {
            addCriterion("optionB_content <", value, "optionbContent");
            return (Criteria) this;
        }

        public Criteria andOptionbContentLessThanOrEqualTo(String value) {
            addCriterion("optionB_content <=", value, "optionbContent");
            return (Criteria) this;
        }

        public Criteria andOptionbContentLike(String value) {
            addCriterion("optionB_content like", value, "optionbContent");
            return (Criteria) this;
        }

        public Criteria andOptionbContentNotLike(String value) {
            addCriterion("optionB_content not like", value, "optionbContent");
            return (Criteria) this;
        }

        public Criteria andOptionbContentIn(List<String> values) {
            addCriterion("optionB_content in", values, "optionbContent");
            return (Criteria) this;
        }

        public Criteria andOptionbContentNotIn(List<String> values) {
            addCriterion("optionB_content not in", values, "optionbContent");
            return (Criteria) this;
        }

        public Criteria andOptionbContentBetween(String value1, String value2) {
            addCriterion("optionB_content between", value1, value2, "optionbContent");
            return (Criteria) this;
        }

        public Criteria andOptionbContentNotBetween(String value1, String value2) {
            addCriterion("optionB_content not between", value1, value2, "optionbContent");
            return (Criteria) this;
        }

        public Criteria andOptioncContentIsNull() {
            addCriterion("optionC_content is null");
            return (Criteria) this;
        }

        public Criteria andOptioncContentIsNotNull() {
            addCriterion("optionC_content is not null");
            return (Criteria) this;
        }

        public Criteria andOptioncContentEqualTo(String value) {
            addCriterion("optionC_content =", value, "optioncContent");
            return (Criteria) this;
        }

        public Criteria andOptioncContentNotEqualTo(String value) {
            addCriterion("optionC_content <>", value, "optioncContent");
            return (Criteria) this;
        }

        public Criteria andOptioncContentGreaterThan(String value) {
            addCriterion("optionC_content >", value, "optioncContent");
            return (Criteria) this;
        }

        public Criteria andOptioncContentGreaterThanOrEqualTo(String value) {
            addCriterion("optionC_content >=", value, "optioncContent");
            return (Criteria) this;
        }

        public Criteria andOptioncContentLessThan(String value) {
            addCriterion("optionC_content <", value, "optioncContent");
            return (Criteria) this;
        }

        public Criteria andOptioncContentLessThanOrEqualTo(String value) {
            addCriterion("optionC_content <=", value, "optioncContent");
            return (Criteria) this;
        }

        public Criteria andOptioncContentLike(String value) {
            addCriterion("optionC_content like", value, "optioncContent");
            return (Criteria) this;
        }

        public Criteria andOptioncContentNotLike(String value) {
            addCriterion("optionC_content not like", value, "optioncContent");
            return (Criteria) this;
        }

        public Criteria andOptioncContentIn(List<String> values) {
            addCriterion("optionC_content in", values, "optioncContent");
            return (Criteria) this;
        }

        public Criteria andOptioncContentNotIn(List<String> values) {
            addCriterion("optionC_content not in", values, "optioncContent");
            return (Criteria) this;
        }

        public Criteria andOptioncContentBetween(String value1, String value2) {
            addCriterion("optionC_content between", value1, value2, "optioncContent");
            return (Criteria) this;
        }

        public Criteria andOptioncContentNotBetween(String value1, String value2) {
            addCriterion("optionC_content not between", value1, value2, "optioncContent");
            return (Criteria) this;
        }

        public Criteria andOptiondContentIsNull() {
            addCriterion("optionD_content is null");
            return (Criteria) this;
        }

        public Criteria andOptiondContentIsNotNull() {
            addCriterion("optionD_content is not null");
            return (Criteria) this;
        }

        public Criteria andOptiondContentEqualTo(String value) {
            addCriterion("optionD_content =", value, "optiondContent");
            return (Criteria) this;
        }

        public Criteria andOptiondContentNotEqualTo(String value) {
            addCriterion("optionD_content <>", value, "optiondContent");
            return (Criteria) this;
        }

        public Criteria andOptiondContentGreaterThan(String value) {
            addCriterion("optionD_content >", value, "optiondContent");
            return (Criteria) this;
        }

        public Criteria andOptiondContentGreaterThanOrEqualTo(String value) {
            addCriterion("optionD_content >=", value, "optiondContent");
            return (Criteria) this;
        }

        public Criteria andOptiondContentLessThan(String value) {
            addCriterion("optionD_content <", value, "optiondContent");
            return (Criteria) this;
        }

        public Criteria andOptiondContentLessThanOrEqualTo(String value) {
            addCriterion("optionD_content <=", value, "optiondContent");
            return (Criteria) this;
        }

        public Criteria andOptiondContentLike(String value) {
            addCriterion("optionD_content like", value, "optiondContent");
            return (Criteria) this;
        }

        public Criteria andOptiondContentNotLike(String value) {
            addCriterion("optionD_content not like", value, "optiondContent");
            return (Criteria) this;
        }

        public Criteria andOptiondContentIn(List<String> values) {
            addCriterion("optionD_content in", values, "optiondContent");
            return (Criteria) this;
        }

        public Criteria andOptiondContentNotIn(List<String> values) {
            addCriterion("optionD_content not in", values, "optiondContent");
            return (Criteria) this;
        }

        public Criteria andOptiondContentBetween(String value1, String value2) {
            addCriterion("optionD_content between", value1, value2, "optiondContent");
            return (Criteria) this;
        }

        public Criteria andOptiondContentNotBetween(String value1, String value2) {
            addCriterion("optionD_content not between", value1, value2, "optiondContent");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}