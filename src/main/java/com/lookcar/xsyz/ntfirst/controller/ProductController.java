package com.lookcar.xsyz.ntfirst.controller;

import com.lookcar.xsyz.ntfirst.service.FtProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kongmingliang
 * @date 2020-11-25 17:35
 **/
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private FtProductService ftProductService;



}
