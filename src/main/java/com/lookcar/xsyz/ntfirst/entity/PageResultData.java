package com.lookcar.xsyz.ntfirst.entity;

import com.github.pagehelper.PageInfo;

/**
 * @author kongmingliang
 * @date 2020-11-30 14:22
 **/
public class PageResultData {

    private int pageNum;
    private int pageSize;
    private int totalPage;
    private long totalCount;
    private boolean hasPrevPage;
    private boolean hasNextPage;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public boolean isHasPrevPage() {
        return hasPrevPage;
    }

    public void setHasPrevPage(boolean hasPrevPage) {
        this.hasPrevPage = hasPrevPage;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public static PageResultData renderPageResultData(PageInfo pageInfo) {
        PageResultData pageResultData = new PageResultData();
        pageResultData.setPageNum(pageInfo.getPageNum());
        pageResultData.setPageSize(pageInfo.getPageSize());
        pageResultData.setTotalPage(pageInfo.getPages());
        pageResultData.setTotalCount(pageInfo.getTotal());
        pageResultData.setHasPrevPage(pageInfo.isHasPreviousPage());
        pageResultData.setHasNextPage(pageInfo.isHasNextPage());
        return pageResultData;
    }
}
