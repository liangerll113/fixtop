package com.lookcar.xsyz.ntfirst.service.impl;

import com.lookcar.xsyz.ntfirst.dao.FtProductMapper;
import com.lookcar.xsyz.ntfirst.entity.FtProduct;
import com.lookcar.xsyz.ntfirst.service.FtProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kongmingliang
 * @date 2020-11-25 17:36
 **/
@Service
public class FtProductServiceImpl implements FtProductService {

    @Autowired
    private FtProductMapper ftProductMapper;

    @Override
    public List<FtProduct> getProductList(int type) {
        return ftProductMapper.getProductList(type);
    }

    @Override
    public FtProduct getProductDetail(int id) {
        return ftProductMapper.getProductDetail(id);
    }

}
