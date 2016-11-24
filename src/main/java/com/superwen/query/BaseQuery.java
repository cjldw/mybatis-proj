package com.superwen.query;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: luowen<bigpao.luo@gmail.com>
 * @time: 11/23/2016.
 */
public class BaseQuery {

    private static final int defaultPageSize = 15;

    private int pageSize;

    private int pageNo;

    private int startRow;

    private List<Sorts> sortses = new ArrayList<Sorts>();

    public BaseQuery() {
    }

    public static int getDefaultPageSize() {
        return defaultPageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public List<Sorts> getSortses() {
        return sortses;
    }

    public void setSortses(List<Sorts> sortses) {
        this.sortses = sortses;
    }
}
