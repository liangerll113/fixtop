package com.lookcar.xsyz.ntfirst.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lookcar.xsyz.ntfirst.entity.FtNews;
import com.lookcar.xsyz.ntfirst.entity.FtProduct;
import com.lookcar.xsyz.ntfirst.entity.PageResultData;
import com.lookcar.xsyz.ntfirst.service.FtNewsService;
import com.lookcar.xsyz.ntfirst.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public JSONObject getNewsList(@RequestParam(required = false, defaultValue = "1") int pageNum, @RequestParam(required = false, defaultValue = "5") int pageSize) {
        logger.info("NewsCenterController.list(), page={}, pageSize={}", pageNum, pageSize);
        if (pageNum < 1) {
            pageNum = 1;
        }
        if (pageSize < 1 || pageSize > 50) {
            pageSize = 50;
        }
        PageHelper.startPage(pageNum, pageSize);

        List<FtNews> list = ftNewsService.getNewsList();
        PageInfo<FtNews> pageInfo = new PageInfo<>(list);

        JSONObject data = new JSONObject();
        data.put("pageInfo", PageResultData.renderPageResultData(pageInfo));
        data.put("news", list);

        return ResponseUtil.getSuccessResult(data);
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
