package com.lookcar.xsyz.ntfirst.service;

import com.lookcar.xsyz.ntfirst.entity.FtProduct;

import java.util.List;

/**
 * @author kongmingliang
 * @date 2020-11-25 17:36
 **/
public interface FtProductService {

    List<FtProduct> getProductList(int type);

    FtProduct getProductDetail(int id);

}
