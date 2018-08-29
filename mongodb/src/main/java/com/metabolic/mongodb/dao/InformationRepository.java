package com.metabolic.mongodb.dao;

import com.metabolic.mongodb.model.InformationMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ZQ_W on 2018/08/10.
 */
public interface InformationRepository extends MongoRepository<InformationMongo, String> {


}
