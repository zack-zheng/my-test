package com.zzz.test.my_test;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

public class QuestionParser {

    public static void main(String[] args) {
        String json = "{\"code\":200,\"msg\":\"\",\"data\":{\"orderTest\":[{\"content\":\"美元彩钞版扩大了缩微文字的应用，（）在背面也设置了缩微文字。\",\"id\":\"1935573461124542466\",\"type\":1,\"analysis\":null,\"opts\":[{\"content\":\"1美元和2美元\\n\",\"value\":1},{\"content\":\"50美元和10美元\\n\",\"value\":2},{\"content\":\"20美元和10美元\\n\",\"value\":3},{\"content\":\"100美元和5美元。\",\"value\":4}],\"answer\":[4]},{\"content\":\"在紫外光下，大头版和彩钞版10美元的全埋安全线整体呈（）荧光。\",\"id\":\"1935573461141319682\",\"type\":1,\"analysis\":null,\"opts\":[{\"content\":\"橙色\\n\",\"value\":1},{\"content\":\"黄色\\n\",\"value\":2},{\"content\":\"蓝色\\n\",\"value\":3},{\"content\":\"绿色。\",\"value\":4}],\"answer\":[1]},{\"content\":\"2004版20美元正面人像右下侧的美国鹰图案是采用（）印制。\",\"id\":\"1935573461149708290\",\"type\":1,\"analysis\":null,\"opts\":[{\"content\":\"光变油墨\\n\",\"value\":1},{\"content\":\"磁性油墨\\n\",\"value\":2},{\"content\":\"珠光油墨\\n\",\"value\":3},{\"content\":\"金属油墨\",\"value\":4}],\"answer\":[4]},{\"content\":\"垂直或水平移动2004版100美元票面，动感安全线上的图文（）与运动方向垂直移动。\",\"id\":\"1935573461162291205\",\"type\":1,\"analysis\":null,\"opts\":[{\"content\":\"美国鹰与USA；\\n\",\"value\":1},{\"content\":\"自由钟与100；\\n\",\"value\":2},{\"content\":\"USA与100；\\n\",\"value\":3},{\"content\":\"USA与五角星。\",\"value\":4}],\"answer\":[2]},{\"content\":\"2004版5美元正面主景人像右侧的水印图案为（）\",\"id\":\"1935573461166485509\",\"type\":1,\"analysis\":null,\"opts\":[{\"content\":\"人像\\n\",\"value\":1},{\"content\":\"建筑\\n\",\"value\":2},{\"content\":\"花卉\\n\",\"value\":3},{\"content\":\"面额数字\",\"value\":4}],\"answer\":[4]},{\"content\":\"2004版10美元采用了光变油墨面额数字，其颜色变化为（）。\",\"id\":\"1935573461170679813\",\"type\":1,\"analysis\":null,\"opts\":[{\"content\":\"铜变绿；\\n\",\"value\":1},{\"content\":\"绿变黑；\\n\",\"value\":2},{\"content\":\"绿变蓝；\\n\",\"value\":3},{\"content\":\"蓝变黑。\",\"value\":4}],\"answer\":[1]},{\"content\":\"5美元上的安全线，1996版和2004版分别在主景人像的（）位置。\",\"id\":\"1935573461174874374\",\"type\":1,\"analysis\":null,\"opts\":[{\"content\":\"右侧，右侧；\\n\",\"value\":1},{\"content\":\"右侧，左侧；\\n\",\"value\":2},{\"content\":\"左侧，左侧；\\n\",\"value\":3},{\"content\":\"左侧，右侧。\",\"value\":4}],\"answer\":[4]},{\"content\":\"美元从1990版开始，在纸币中增加了（）防伪特征。\",\"id\":\"1935573461149708295\",\"type\":1,\"analysis\":null,\"opts\":[{\"content\":\"光变油墨面额数字\\n\",\"value\":1},{\"content\":\"白水印和凹印缩微文字\\n\",\"value\":2},{\"content\":\"文字安全线和凹印缩微文字\",\"value\":3}],\"answer\":[3]},{\"content\":\"港元2010年版汇丰银行券的珠光油墨特征是（）。\",\"id\":\"1935573461170680071\",\"type\":1,\"analysis\":null,\"opts\":[{\"content\":\"行徽\\n\",\"value\":1},{\"content\":\"大厦\\n\",\"value\":2},{\"content\":\"神兽\\n\",\"value\":3},{\"content\":\"面额数字。\",\"value\":4}],\"answer\":[1]},{\"content\":\"美元各面额安全线的存在的不同之处是（）。\",\"id\":\"1935573461158096906\",\"type\":1,\"analysis\":null,\"opts\":[{\"content\":\"角度不同\\n\",\"value\":1},{\"content\":\"有的面额安全线是水平的，有的是垂直的\\n\",\"value\":2},{\"content\":\"每个面额安全线在紫外光下的荧光颜色和图文不同\\n\",\"value\":3},{\"content\":\"转变不同的角度会从绿色变成黑色\",\"value\":4}],\"answer\":[3]}]}}\n";

        parseQuestions(json);
    }

    public static String parseQuestions(String json) {
        StringBuilder result = new StringBuilder();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonData jsonData = objectMapper.readValue(json, JsonData.class);

            Map<String, Question> questionMap = new HashMap<>();

            for (Question question : jsonData.getData().getOrderTest()) {
                // 根据id去重
                if (!questionMap.containsKey(question.getId())) {
                    questionMap.put(question.getId(), question);
                }
            }
            // 打印解析结果
            for (Question question : questionMap.values()) {
                System.out.print(question.getContent() + "\t");
                result.append(question.getContent()).append("\t");


                List<Option> sortedOpts = question.getOpts().stream()
                        .sorted(Comparator.comparingInt(Option::getValue))
                        .collect(Collectors.toList());
                for (Option opt : sortedOpts) {
                    System.out.print(opt.getContent().trim()+ "\t");
                    result.append(opt.getContent().trim()).append("\t");
                }
                for (int ans : question.getAnswer()) {
                    System.out.print((char) ('A' + ans - 1) + " ");
                    result.append((char) ('A' + ans - 1)).append(" ");
                }
                System.out.println();
                result.append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    // 定义用于解析JSON的类
    @lombok.Data
    static class JsonData {
        private int code;
        private String msg;
        private Data data;
        private int index;
        private int page;

        public Data getData() { return data; }
        public void setData(Data data) { this.data = data; }
    }
    @lombok.Data

    static class Data {
        private List<Question> orderTest;
        private Integer index;
        private Integer page;

        // getters and setters
        public List<Question> getOrderTest() { return orderTest; }
        public void setOrderTest(List<Question> orderTest) { this.orderTest = orderTest; }
    }
    @lombok.Data

    static class Question {
        private String content;
        private String id;
        private int type;
        private List<Option> opts;
        private List<Integer> answer;
        private Object analysis;  // 可以是Object或具体类型
        // getters and setters
        public String getContent() { return content; }
        public String getId() { return id; }
        public List<Option> getOpts() { return opts; }
        public List<Integer> getAnswer() { return answer; }
    }
    @lombok.Data

    static class Option {
        private String content;
        private int value;

        // getters and setters
        public String getContent() { return content; }
        public int getValue() { return value; }
    }
}

class App {

    // 这是必须的标准 main 方法，程序入口
    public static void main(String[] args) {
        System.out.println("程序运行成功！");
    }
}