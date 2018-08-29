package com.metabolic.mongodb.dao.impl;

import com.metabolic.mongodb.dao.InformationDao;
import com.metabolic.mongodb.model.InformationMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ZQ_W on 2018/08/11.
 */
@Component
public class InformationDaoImpl implements InformationDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 查找指定日期的检验数据
     * @param createTime  检测时间 yyyy-MM-dd
     * @return  返回list集合形式的检测账号详情信息
     */
    @Override
    public List<InformationMongo> findInformationByTime(String createTime) {
        Query query = Query.query(Criteria.where("create_time").gte(createTime + " 00:00:00").lte(createTime + " 23:59:59"));
        return  mongoTemplate.find(query, InformationMongo.class);
    }

    /**
     * 根据被检测人昵称和指定日期匹配检测详情
     * @param nick 被检测人姓名
     * @param createTime 被检测时间 yyyy-MM-dd
     * @return 检测人员详细数据信息
     */
    @Override
    public InformationMongo findInformationByParam(String nick, String createTime) {
        Query query = Query.query(Criteria.where("nick").is(nick).and("create_time")
                .gte(createTime + " 00:00:00").lte(createTime + " 23:59:59"));
        return mongoTemplate.findOne(query, InformationMongo.class);
    }


}
