package com.metabolic.mongodb.dao;



import com.metabolic.mongodb.model.InformationMongo;

import java.util.List;

/**
 * Created by ZQ_W on 2018/08/11.
 */
public interface InformationDao {

    List<InformationMongo> findInformationByTime(String createTime);

    InformationMongo findInformationByParam(String nick, String createTime);
}
