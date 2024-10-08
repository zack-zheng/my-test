import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zzz.tools.file.FileUtils;
import lombok.Data;
import okhttp3.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class SampleTest {

    @Test
    public void test_200() {
        mainProc1("F:\\相片\\杨丽纯相片\\");
    }

    public void mainProc1(String FilePath) {
        File file = new File(FilePath);

        for (File file1 : Objects.requireNonNull(file.listFiles())) {

            if (file1.isDirectory()) {
                mainProc1(file1.getAbsolutePath());
                continue;
            }

            System.out.println(file1.getAbsolutePath());
//            file1.renameTo(new File(file1.getParent() + File.separator + new StringBuilder(file1.getName()).reverse()));

        }
    }


    @Test
    public void test_1() {
    }

    @Test
    public void tet11() {
    }

    @Test
    public void tet() {
        mainProc("F:\\相片\\杨丽纯相片\\相机胶卷");
    }

    public void mainProc(String FilePath) {
        File file = new File(FilePath);
        for (File file1 : Objects.requireNonNull(file.listFiles())) {

            if (file1.isDirectory()) {
                mainProc(file1.getAbsolutePath());
                continue;
            }
//            if (file1.getName().contains(".MP4")) {
//                continue;
//            }
//            if (file1.getName().contains(".GIF")) {
//                continue;
//            }
//            if (file1.getName().contains(".mp4")) {
//                continue;
//            }
//            if (file1.getName().contains(".MOV")) {
//                continue;
//            }
//            if (file1.getName().contains(".JPG")) {
//                continue;
//            }
//            if (file1.getName().contains(".PNG")) {
//                continue;
//            }
            file1.renameTo(new File(file1.getParent() + File.separator + new StringBuilder(file1.getName()).reverse()));

        }
    }

    @Test
    public void test_2() {
        File file = new File("D:\\迅雷下载");
        for (File file1 : Objects.requireNonNull(file.listFiles())) {

            file1.renameTo(new File(file1.getParent() + File.separator + file1.getName().replace(".rmvb_", ".rmvb")));

        }
    }

    @Test
    public void test_3() {
        File f = new File("C:\\Users\\zheng\\Documents\\WeChat Files\\ylc350071546\\FileStorage\\File\\2020-02\\202002 运营业务学习");

    }

    public void listFile(File file) {


    }

    @Test
    public void test_4() {
        System.out.println("aaa");
    }

    @Test
    public void test_5() {
        File file = new File("E:\\BaiduNetdiskDownload\\Java工程师面试突击第1季（可能是史上最好的Java面试突击课程）-中华石杉老师");
    }

    @Test
    public void test_6() {
        getFileName("F:\\相片\\苹果手机相片备份");
    }

    public void getFileName(String filePath) {
        File file = new File(filePath);
        for (File file1 : file.listFiles()) {
            if (file1.isDirectory()) {
                getFileName(file1.getAbsolutePath());
                continue;
            }
            if (file1.getAbsolutePath().contains("已看")) {
                continue;
            }
            if (file1.getName().contains(".avi")) {
                System.out.println(file1.getName());
                continue;
            }

            file1.renameTo(new File(file1.getAbsolutePath()));

            FileUtils.copyFile(file1.getAbsolutePath(), file1.getAbsolutePath().replace("Java工程师面试突击第1季", "Java工程师面试突击第1季非视频提取"));
        }
    }


    @Test
    public void test_7() {
        File file = new File("E:\\BaiduNetdiskDownload\\Java工程师面试突击第1季非视频提取");
        for (File file1 : file.listFiles()) {
            System.out.println(file1.getName());
        }
    }

    @Test
    public void test_8() {
        int[] arrays = {1, 5, 3, 7, 9, 4, 8, 2};
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arrays[i] > arrays[j]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[i];
                    arrays[i] = temp;
                }
            }
        }

        for (int i : arrays) {
            System.out.print(i);
        }
    }

    @Test
    public void test_9() throws Exception {
        PDDocument pdDocument = PDDocument.load(new File("C:\\Users\\zheng\\Desktop\\历史备查\\面试专题\\JAVA核心知识点整理.pdf"));
        PDFTextStripper stripper = new PDFTextStripper();
        String pdfText = stripper.getText(pdDocument);
        System.out.println(pdfText);

    }

    @Test
    public void test_10() {
        String context = FileUtils.readFile("C:\\Users\\zheng\\Desktop\\目录保存.txt","UTF-8").toString();
        int tempCount = 0;
        for (String b : context.split("\r\n")){

            if (b.indexOf(" ")>0){
                String num = b.substring(0,b.indexOf(" "));
                tempCount = num.split("\\.").length;
                b = tDo(b,tempCount);
                System.out.println(b);
            }else {
                b = tDo(b,tempCount+1);
                System.out.println(b);
            }

        }
    }

    private String tDo(String a, int doCount){
        for (int i = 1 ;i<doCount ;i++){
            a = "\t"+a;
        }
        return a;
    }

    @Test
    public void test_11() {
        System.out.println(new Date(1681999145816L));
    }

    @Test
    public void test_12() {

    }

    private String getJson() {
        String json = FileUtils.readFile("C:\\Users\\zheng\\Desktop\\Untitled-1.ini","utf-8").toString();
        DTO dto = new DTO();
        dto.setTime(52*60+34);
        dto.setType("2");
        dto.setUserNo("2022022309501471622");
        dto.setUserExtNo("2022022309501471622");
        dto.setV(new Date().getTime());

        Map<String, List<Integer>> answer = new HashMap<>();
        JSONArray jsonArray = JSONArray.parseArray(json);
        jsonArray.forEach( a ->{
            JSONObject jsonObject = (JSONObject)a;
            JSONArray data = (JSONArray) jsonObject.get("data");
            data.forEach(b->{
                JSONObject object = (JSONObject)b;
                JSONArray answerList = (JSONArray) object.get("answer");
                List<Integer> list = new ArrayList<>();
                answerList.forEach(h ->{list.add(Integer.parseInt(h.toString()));});
                answer.put(object.get("id").toString(),list);

            });
        });

        dto.setAnswer(answer);

        return JSONObject.toJSONString(dto);
    }

    @Test
    public void test_13() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json;charset=UTF-8");
        RequestBody body = RequestBody.create(mediaType, getJson());
        Request request = new Request.Builder()
                .url("http://api.edu.sjysz.com/api/exam/auth/test/audit")
                .method("POST", body)
                .addHeader("Accept", "application/json, text/plain, */*")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.9")
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "application/json;charset=UTF-8")
                .addHeader("Origin", "http://app.edu.sjysz.com")
                .addHeader("Referer", "http://app.edu.sjysz.com/")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")
                .addHeader("token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyTm8iOiIyMDIyMDIyMzA5NTAxNDcxNjIyIiwiaXNzIjoiUk9OQ09PIiwiZXhwIjoxNjg0NTkwODgwfQ.Ad_hH8h4OCbc-or5lZ9M62E-ZPR1NfhpNd4bGHfiLbs")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.toString());
    }

    @Data
    static class DTO{
        private int time;
        private String type;
        private Map<String, List<Integer>> answer;
        private long v;
        private String userNo;
        private String userExtNo;
    }
    @Test
    public void test_14() {
        for (int i =0 ;i<2;i++){

            System.out.println(getContent());
        }
    }

    private static String getContent() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json;charset=UTF-8");
        RequestBody body = RequestBody.create(mediaType, "{\"testIds\":[],\"type\":\"2\",\"categoryId\":\"1253246255115538434\",\"page\":1,\"v\":1682006693828,\"userNo\":\"2022022309501471622\",\"userExtNo\":\"2022022309501471622\"}");
        Request request = new Request.Builder()
                .url("http://api.edu.sjysz.com/api/exam/auth/test/randomTest")
                .method("POST", body)
                .addHeader("Accept", "application/json, text/plain, */*")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.9")
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "application/json;charset=UTF-8")
                .addHeader("Origin", "http://app.edu.sjysz.com")
                .addHeader("Referer", "http://app.edu.sjysz.com/")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")
                .addHeader("token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyTm8iOiIyMDIyMDIyMzA5NTAxNDcxNjIyIiwiaXNzIjoiUk9OQ09PIiwiZXhwIjoxNjg0NTkwODgwfQ.Ad_hH8h4OCbc-or5lZ9M62E-ZPR1NfhpNd4bGHfiLbs")
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void test_15() {

    }

    @Test
    public void test_16() {

    }

    @Test
    public void test_17() {

    }

    @Test
    public void test_18() {

    }

    @Test
    public void test_19() {

    }

    @Test
    public void test_20() {

    }

    @Test
    public void test_21() {

    }

    @Test
    public void test_22() {

    }

    @Test
    public void test_23() {

    }

    @Test
    public void test_24() {

    }

    @Test
    public void test_25() {

    }

    @Test
    public void test_26() {

    }

    @Test
    public void test_27() {

    }

    @Test
    public void test_28() {

    }

    @Test
    public void test_29() {

    }

    @Test
    public void test_30() {

    }

    @Test
    public void test_31() {

    }

    @Test
    public void test_32() {

    }

    @Test
    public void test_33() {

    }

    @Test
    public void test_34() {

    }

    @Test
    public void test_35() {

    }

    @Test
    public void test_36() {

    }

    @Test
    public void test_37() {

    }

    @Test
    public void test_38() {

    }

    @Test
    public void test_39() {

    }

    @Test
    public void test_40() {

    }

    @Test
    public void test_41() {

    }

    @Test
    public void test_42() {

    }

    @Test
    public void test_43() {

    }

    @Test
    public void test_44() {

    }

    @Test
    public void test_45() {

    }

    @Test
    public void test_46() {

    }

    @Test
    public void test_47() {

    }

    @Test
    public void test_48() {

    }

    @Test
    public void test_49() {

    }

    @Test
    public void test_50() {

    }

    @Test
    public void test_51() {

    }

    @Test
    public void test_52() {

    }

    @Test
    public void test_53() {

    }

    @Test
    public void test_54() {

    }

    @Test
    public void test_55() {

    }

    @Test
    public void test_56() {

    }

    @Test
    public void test_57() {

    }

    @Test
    public void test_58() {

    }

    @Test
    public void test_59() {

    }

    @Test
    public void test_60() {

    }

    @Test
    public void test_61() {

    }

    @Test
    public void test_62() {

    }

    @Test
    public void test_63() {

    }

    @Test
    public void test_64() {

    }

    @Test
    public void test_65() {

    }

    @Test
    public void test_66() {

    }

    @Test
    public void test_67() {

    }

    @Test
    public void test_68() {

    }

    @Test
    public void test_69() {

    }

    @Test
    public void test_70() {

    }

    @Test
    public void test_71() {

    }

    @Test
    public void test_72() {

    }

    @Test
    public void test_73() {

    }

    @Test
    public void test_74() {

    }

    @Test
    public void test_75() {

    }

    @Test
    public void test_76() {

    }

    @Test
    public void test_77() {

    }

    @Test
    public void test_78() {

    }

    @Test
    public void test_79() {

    }

    @Test
    public void test_80() {

    }

    @Test
    public void test_81() {

    }

    @Test
    public void test_82() {

    }

    @Test
    public void test_83() {

    }

    @Test
    public void test_84() {

    }

    @Test
    public void test_85() {

    }

    @Test
    public void test_86() {

    }

    @Test
    public void test_87() {

    }

    @Test
    public void test_88() {

    }

    @Test
    public void test_89() {

    }

    @Test
    public void test_90() {

    }

    @Test
    public void test_91() {

    }

    @Test
    public void test_92() {

    }

    @Test
    public void test_93() {

    }

    @Test
    public void test_94() {

    }

    @Test
    public void test_95() {

    }

    @Test
    public void test_96() {

    }

    @Test
    public void test_97() {

    }

    @Test
    public void test_98() {

    }

    @Test
    public void test_99() {

    }


}
