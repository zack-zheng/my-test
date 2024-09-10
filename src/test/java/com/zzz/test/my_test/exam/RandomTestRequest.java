package com.zzz.test.my_test.exam;

import java.util.List;

/**
 * 获取题目请求体
 *
 */
public class RandomTestRequest {

    /**
     * testIds : []
     * type : 2
     * categoryId : 1253247084211998721
     * page : 1
     * v : 1687094728526
     * userNo : 2022022309501471622
     * userExtNo : 2022022309501471622
     */

    private String type;
    private String categoryId;
    private int page;
    private long v;
    private String userNo;
    private String userExtNo;
    private List<?> testIds;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public long getV() {
        return v;
    }

    public void setV(long v) {
        this.v = v;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserExtNo() {
        return userExtNo;
    }

    public void setUserExtNo(String userExtNo) {
        this.userExtNo = userExtNo;
    }

    public List<?> getTestIds() {
        return testIds;
    }

    public void setTestIds(List<?> testIds) {
        this.testIds = testIds;
    }
}
