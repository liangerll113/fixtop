package com.lookcar.xsyz.ntfirst.controller;

import com.alibaba.fastjson.JSONObject;
import com.lookcar.xsyz.ntfirst.service.FtNewsService;
import com.lookcar.xsyz.ntfirst.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kongmingliang
 * @date 2020-11-24 14:54
 **/
@RequestMapping("/newsCenter")
@RestController
public class NewsCenterController {

    private Logger logger = LoggerFactory.getLogger(NewsCenterController.class);

    @Autowired
    private FtNewsService ftNewsService;

    @RequestMapping("/list")
    public JSONObject getNewsList() {
        logger.info("NewsCenterController.list()");
        return ResponseUtil.getSuccessResult(ftNewsService.getNewsList());
    }

    @RequestMapping("/detail/{id}")
    public JSONObject getNewsDetail(@PathVariable("id") int id) {
        logger.info("NewsCenterController.detail()  id = {}", id);
        return ResponseUtil.getSuccessResult(ftNewsService.getNewsDetail(id));
    }

    @RequestMapping("/detail/prev/{id}")
    public JSONObject prevNews(@PathVariable("id") int id){
        logger.info("NewsCenterController.prevNews()  id = {}", id);
        return ResponseUtil.getSuccessResult(ftNewsService.prevNews(id));
    }

    @RequestMapping("/detail/next/{id}")
    public JSONObject nextNews(@PathVariable("id") int id){
        logger.info("NewsCenterController.nextNews()  id = {}", id);
        return ResponseUtil.getSuccessResult(ftNewsService.nextNews(id));
    }

}
