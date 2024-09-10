package com.zzz.test.my_test.ifTest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import okhttp3.*;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class ScFullDtoTest {
    private final static ObjectMapper objectMapper = new ObjectMapper();
    private final static String TOKEN = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyRWRPVmFNOTFIWVFaZzVuRUFGdWFOdndTdTBfaGVuNDJzU05PSXpFSmQ4In0.eyJleHAiOjE2OTk2NzUyOTQsImlhdCI6MTY5OTY3MTY5NCwiYXV0aF90aW1lIjoxNjk5NjcxNjkzLCJqdGkiOiIzZjY0MGJkZS0zMzY4LTRjOWEtYjBkNi02ZGQ3NmI4Y2QxNjgiLCJpc3MiOiJodHRwczovL3Nzby1ucC5pbnRyYS5lbXBmLm9yZy5oay9hdXRoL3JlYWxtcy9iYWNrb2ZmaWNlIiwiYXVkIjoiYWNjb3VudCIsInN1YiI6IjJDRDY4RDUxLTY1RDUtNEIxMC05NUY4LTNDMzAzNDhBODgyRCIsInR5cCI6IkJlYXJlciIsImF6cCI6ImJhY2tvZmZpY2UtYWRtaW5wb3J0YWwtZGV2LWNsaWVudCIsInNlc3Npb25fc3RhdGUiOiJiZGMwNDlkYS1mNWJkLTQ3NWEtYWQ0Ny02ZjhiNGQzZmJhNWUiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbImRlZmF1bHQtcm9sZXMtYmFja29mZmljZS1yZWFsbSIsIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGVtYWlsIGVtcGYtcm9sZXMgZW1wZi11dWlkLWFzLXN1YmplY3QiLCJzaWQiOiJiZGMwNDlkYS1mNWJkLTQ3NWEtYWQ0Ny02ZjhiNGQzZmJhNWUiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsInJvbGUiOiJST0xFX0FETUlOIiwibmFtZSI6IlpoZW5nLCBKYWNrIFpaIiwicHJlZmVycmVkX3VzZXJuYW1lIjoiamFjay56ei56aGVuZ0BwY2N3LmNvbSIsImd0IjoiYWMiLCJmYW1pbHlfbmFtZSI6IlpoZW5nLCBKYWNrIFpaIiwiZW1haWwiOiJqYWNrLnp6LnpoZW5nQHBjY3cuY29tIn0.juppp1laDA86ZavtGcIZzEeOiYCv87soBMuIclI5FxzTr7gECaJROrZMf0R36umdi6p3n-OOJ2WWKYoSxqbrEeV4nBjBHZt27VPEbkRks4MlBvX3uEtV_DSluoe7VV22I4GfieA8AWpxiZGs8irTdvOF78m6LA7R3Qr99LHp50mPaBSNTeNpIwwAeIN4S7coKis1j5zD4XOeQOQCHX4-oO3rmQKMdFxSzDYxgvLNqZG_DFyl-hwI4reR19d2jG2Npedpn0By64azmmwlorg6iF5tb35MFqiO-yjoya1xdeDC4ljR_zPAf-JRFvThfDZC_JJYR5UTNNnzUZNWWgB9IA";

    /**
     * 获取整体的json
     */
    @Test
    public void test_getFull() throws Exception {
        getSchemeDto();
    }

    /**
     * 获取json中dto的
     *
     * @throws Exception
     */
    @Test
    public void getAllDtoNameTest() throws Exception {
        String json = getCellContet(1, 1, 1);
        System.out.println("=====处理的json=====" + json);
        JsonNode jsonNode = objectMapper.readTree(json);
        for (Iterator<String> it = jsonNode.fieldNames(); it.hasNext(); ) {
            String jsonNode1 = it.next();
            System.out.println(jsonNode1);
        }


    }

    public static void getSchemeDto() throws Exception {
        ObjectNode objectNode = objectMapper.createObjectNode();
        Map<String, List<String>> urlInfos = getInterfactInfo();
        urlInfos.forEach((url, dtoNames) -> {
            try {
                JsonNode jsonNode = request(url);
                if (dtoNames.size() == 1) {
                    objectNode.set(dtoNames.get(0), jsonNode.get("payload"));
                    System.out.println(dtoNames.get(0)+"\t"+jsonNode.get("payload"));
                } else if (dtoNames.size() > 1) {
                    for (String dtoName : dtoNames) {
                        objectNode.set(dtoName, jsonNode.get("payload"));
                        System.out.println(dtoName+"\t"+jsonNode.get("payload"));
                    }

                } else {
                    throw new Exception("没有dtoName");
                }
                Thread.sleep(500);

            } catch (Exception e) {
                e.printStackTrace();
            }

        });
//        System.out.println(objectNode.toPrettyString());

    }

    public static JsonNode request(String uri) throws Exception {
        String url = String.format("https://dev.apps.ocp01.nonprod.empf.local/cas/adm/sc/v1%s?schemeUuid=E3E9A72E-09E0-33F7-E053-0B15D70A5BE2", uri);
        OkHttpClient client = getUnsafeOkHttpClient();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", "Bearer " + TOKEN)
                .addHeader("Cookie", "d45813b31598fa7359b95a11dbdff833=544ef3e14add460b496c82f4f02edfe1")
                .build();
        Response response = client.newCall(request).execute();

        assert response.body() != null;
        String bodyString = response.body().string();
//        System.out.println(bodyString);
        return objectMapper.readTree(bodyString);
    }


    private static Workbook getExcel() throws Exception {
        String filePath = "C:\\Users\\zheng\\Downloads\\SC开发记录excel - 副本.xlsx"; // 指定 Excel 文件的路径
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
            return workbook;
        } catch (IOException e) {
            throw new Exception();
        }
    }

    private static Map<String, List<String>> getInterfactInfo() throws Exception {
        Workbook workbook = getExcel();
        Sheet sheet = workbook.getSheetAt(0); // 获取第一个工作表
        Map<String, List<String>> result = new LinkedHashMap<>();
        for (Row row : sheet) {
            if (!row.getZeroHeight() && row.getRowNum() != 0) { // 跳过隐藏的行 和首行
                Cell cellA = row.getCell(0); // 获取 A 列的单元格
                Cell cellC = row.getCell(2); // 获取 C 列的单元格
                Cell cellH = row.getCell(7); // 获取 C 列的单元格
                Cell cellF = row.getCell(5); // 获取 C 列的单元格

                if (cellA != null && cellC != null) {
                    String valueA = cellA.getStringCellValue(); // 获取 A 列的内容
                    String valueC = cellC.getStringCellValue(); // 获取 C 列的内容
                    if (StringUtils.isBlank(valueA)) {
                        continue;
                    }
                    result.put(valueA, Arrays.asList(valueC.split("\n")));
                }

            }

        }
        return result;
    }

    private static String getCellContet(int sheetIndex,
                                        int rowNum,
                                        int colNum) throws Exception {

        Workbook workbook = getExcel();
        Sheet sheet = workbook.getSheetAt(sheetIndex); // 获取第一个工作表
        for (Row row : sheet) {
            if (row.getRowNum() == rowNum) {
                Cell cellA = row.getCell(colNum);
                return cellA.getStringCellValue();
            }
        }
        throw new Exception("获取不到单元格");
    }

    private static int getIndex() {
        return 1;
    }

    public static OkHttpClient getUnsafeOkHttpClient() {
        try {
            // 创建一个不验证证书链的 TrustManager
            final TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // 获取 SSL 上下文实例
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

            // 创建 OkHttpClient 客户端并配置 SSL 上下文
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustAllCerts[0]);
            builder.hostnameVerifier((hostname, session) -> true);

            return builder.build();
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            throw new RuntimeException("创建 OkHttpClient 失败", e);


        }
    }
}
