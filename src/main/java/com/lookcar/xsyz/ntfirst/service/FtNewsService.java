package com.lookcar.xsyz.ntfirst.service;

import com.alibaba.fastjson.JSONObject;
import com.lookcar.xsyz.ntfirst.entity.FtNews;

import java.util.List;

/**
 * @author kongmingliang
 * @date 2020-11-24 15:40
 **/
public interface FtNewsService {

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
    FtNews getNewsDetail(int id);

    /**
     * 上一篇新闻
     *
     * @param id
     * @return
     */
    FtNews prevNews(int id);

    /**
     * 下一篇新闻
     *
     * @param id
     * @return
     */
    FtNews nextNews(int id);

}
