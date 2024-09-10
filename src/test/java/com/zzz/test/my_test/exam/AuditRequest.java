package com.zzz.test.my_test.exam;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 考试请求体
 */
@Data
public class AuditRequest {
    private int time;
    private String type;
    private Map<String, List<Integer>> answer;
    private long v;
    private String userNo;
    private String userExtNo;
}
