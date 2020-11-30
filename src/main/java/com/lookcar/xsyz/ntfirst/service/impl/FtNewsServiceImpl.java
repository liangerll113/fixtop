package com.lookcar.xsyz.ntfirst.service.impl;

import com.lookcar.xsyz.ntfirst.dao.FtNewsMapper;
import com.lookcar.xsyz.ntfirst.entity.FtNews;
import com.lookcar.xsyz.ntfirst.service.FtNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kongmingliang
 * @date 2020-11-24 15:40
 **/
@Service
public class FtNewsServiceImpl implements FtNewsService {

    @Autowired
    private FtNewsMapper ftNewsMapper;

    @Override
    public List<FtNews> getNewsList() {
        return ftNewsMapper.getNewsList();
    }

    @Override
    public FtNews getNewsDetail(int id) {
        // 记录访问次数+1
        FtNews newsDetail = ftNewsMapper.getNewsDetail(id);
        if (newsDetail != null) {
            ftNewsMapper.recordVisitCount(id);
        }
        return newsDetail;
    }

    @Override
    public FtNews prevNews(int id) {
        FtNews prevNews = ftNewsMapper.prevNews(id);
        if (prevNews != null) {
            ftNewsMapper.recordVisitCount(prevNews.getId());
        }
        return prevNews;
    }

    @Override
    public FtNews nextNews(int id) {
        FtNews nextNews = ftNewsMapper.nextNews(id);
        if (nextNews != null) {
            ftNewsMapper.recordVisitCount(nextNews.getId());
        }
        return nextNews;
    }
}
