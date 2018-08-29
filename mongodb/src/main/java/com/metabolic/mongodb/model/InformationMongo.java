package com.metabolic.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZQ_W on 2018/08/10.
 */
@Document(collection = "detector")
public class InformationMongo implements Serializable{

    private static final long serialVersionUID = 7404007392451312794L;

    @Id
    private String id;

    private String nick;//被检测的用户名
    @Field("punish_count_str")
    private Integer punishCountStr;//违规记录
    @Field("no_sales_count")
    private String noSalesCount;//不计销量次数
    @Field("true_name")
    private String trueName; //真实姓名

    private String sex; //性别

    private String birthday;//账号中生日

    private String credit;//信用评分
    @Field("feedback_rate")
    private String feedbackRate;//好评率
    @Field("create_time")
    private String createTime;

    @Field("orders_info")
    private List<OrdersInfo> ordersInfo = new ArrayList<>();

    @Field("comment_info")
    private List<CommentInfo> commentInfo = new ArrayList();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Integer getPunishCountStr() {
        return punishCountStr;
    }

    public void setPunishCountStr(Integer punishCountStr) {
        this.punishCountStr = punishCountStr;
    }

    public String getNoSalesCount() {
        return noSalesCount;
    }

    public void setNoSalesCount(String noSalesCount) {
        this.noSalesCount = noSalesCount;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getFeedbackRate() {
        return feedbackRate;
    }

    public void setFeedbackRate(String feedbackRate) {
        this.feedbackRate = feedbackRate;
    }

    public List<OrdersInfo> getOrdersInfo() {
        return ordersInfo;
    }

    public void setOrdersInfo(List<OrdersInfo> ordersInfo) {
        this.ordersInfo = ordersInfo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<CommentInfo> getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(List<CommentInfo> commentInfo) {
        this.commentInfo = commentInfo;
    }

    @Override
    public String toString() {
        return "InformationMongo{" +
                "id='" + id + '\'' +
                ", nick='" + nick + '\'' +
                ", punishCountStr=" + punishCountStr +
                ", noSalesCount='" + noSalesCount + '\'' +
                ", trueName='" + trueName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", credit='" + credit + '\'' +
                ", feedbackRate='" + feedbackRate + '\'' +
                ", createTime='" + createTime + '\'' +
                ", ordersInfo=" + ordersInfo +
                ", commentInfo=" + commentInfo +
                '}';
    }
}
