package com.lookcar.xsyz.ntfirst.dao;

import com.lookcar.xsyz.ntfirst.entity.FtProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kongmingliang
 * @date 2020-11-24 15:23
 **/
public interface FtProductMapper {

    List<FtProduct> getProductList(@Param("type") int type);

    FtProduct getProductDetail(@Param("id") int id);

}
