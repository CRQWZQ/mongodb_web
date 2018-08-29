package com.metabolic.mongodb.controller;

import com.metabolic.mongodb.dao.InformationDao;
import com.metabolic.mongodb.model.InformationMongo;
import com.metabolic.mongodb.result.CodeMsg;
import com.metabolic.mongodb.result.Result;
import com.metabolic.mongodb.untils.TimeTypeCheckUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/08/21.
 */
@RestController
@RequestMapping(value = "/info")
public class InformationController {

    @Resource
    private InformationDao informationDao;

    /**
     * 查询某个日期的检验数据
     * @param time 日期 eg： 2018-08-21
     * @return
     */
    @RequestMapping(value = "/orders_info", method = RequestMethod.GET)
    public Result<List<InformationMongo>> ordersInfoList(String time) {
        if(!TimeTypeCheckUtil.isValidDate(time)) {
            Result.error(CodeMsg.REQUEST_ILLEGAL);
        }
        return  Result.success(informationDao.findInformationByTime(time));
    }

    /**
     * 查询指定日期、指定检测昵称的用户数据
     *
     * @param time 日期 eg:2018-08-20
     * @param nick 被检测人昵称  eg:tb_073****
     * @return
     */
    @RequestMapping(value = "/orders_by_nick", method = RequestMethod.GET)
    public Result<InformationMongo> ordersBynick (String time, String nick) {
        if(!TimeTypeCheckUtil.isValidDate(time) || !nick.isEmpty()) {
            Result.error(CodeMsg.REQUEST_ILLEGAL);
        }
        return Result.success(informationDao.findInformationByParam(time, nick));
    }
}

