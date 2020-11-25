package com.lookcar.xsyz.ntfirst.dao;

import com.alibaba.fastjson.JSONObject;
import com.lookcar.xsyz.ntfirst.entity.FtNews;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kongmingliang
 * @date 2020-11-24 15:23
 **/
public interface FtNewsMapper {

    /**
     * 获取新闻列表
     *
     * @return
     */
    List<FtNews> getNewsList();

    /**
     * 获取新闻详细信息
     *
     * @param id
     * @return
     */
    FtNews getNewsDetail(@Param("id") int id);

    /**
     * 上一篇新闻
     *
     * @param id
     * @return
     */
    FtNews prevNews(@Param("id") int id);

    /**
     * 下一篇新闻
     *
     * @param id
     * @return
     */
    FtNews nextNews(@Param("id") int id);

    /**
     * 记录访问次数
     *
     * @param id
     * @return
     */
    int recordVisitCount(@Param("id") int id);

}
