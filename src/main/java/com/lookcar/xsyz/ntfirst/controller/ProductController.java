package com.lookcar.xsyz.ntfirst.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lookcar.xsyz.ntfirst.entity.FtProduct;
import com.lookcar.xsyz.ntfirst.entity.PageResultData;
import com.lookcar.xsyz.ntfirst.service.FtProductService;
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
 * @date 2020-11-25 17:35
 **/
@RestController
@RequestMapping("/product")
public class ProductController {

    private Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private FtProductService ftProductService;

    @RequestMapping("/list")
    public JSONObject list(@RequestParam(required = false, defaultValue = "1") int pageNum, @RequestParam(required = false, defaultValue = "5") int pageSize, int type) {
        logger.info("ProductController.list(), page={}, pageSize={}, type={}", pageNum, pageSize, type);
        if (pageNum < 1) {
            pageNum = 1;
        }
        if (pageSize < 1 || pageSize > 50) {
            pageSize = 50;
        }
        PageHelper.startPage(pageNum, pageSize);

        List<FtProduct> list = ftProductService.getProductList(type);
        PageInfo<FtProduct> pageInfo = new PageInfo<>(list);

        JSONObject data = new JSONObject();
        data.put("pageInfo", PageResultData.renderPageResultData(pageInfo));
        data.put("products", list);
        return ResponseUtil.getSuccessResult(data);
    }

    @RequestMapping("/detail/{id}")
    public JSONObject getProductDetail(@PathVariable("id") int id) {
        return ResponseUtil.getSuccessResult(ftProductService.getProductDetail(id));
    }

}
