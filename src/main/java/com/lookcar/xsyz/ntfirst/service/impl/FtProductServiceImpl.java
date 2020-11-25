package com.lookcar.xsyz.ntfirst.service.impl;

import com.lookcar.xsyz.ntfirst.dao.FtProductMapper;
import com.lookcar.xsyz.ntfirst.service.FtProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kongmingliang
 * @date 2020-11-25 17:36
 **/
@Service
public class FtProductServiceImpl implements FtProductService {

    @Autowired
    private FtProductMapper ftProductMapper;


}
