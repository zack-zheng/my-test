package com.zzz.test.my_test.utils;

import lombok.var;
import okhttp3.*;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public class RequestSender {
    public static Response request(String url, String method, String body, String token) throws Exception {
        OkHttpClient client = getUnsafeOkHttpClient();
        var builder = new Request.Builder();
        String requestMethod = method.toUpperCase();
        if ("POST".equals(requestMethod)) {
            //POST
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody requestBody = RequestBody.create(mediaType, body);
            builder.method(method.toUpperCase(), requestBody);
        } else {
            //GET
            builder.method(method.toUpperCase(), null);
        }

        if (token == null) {
            throw new Exception("token不能为空");
        } else {
            if (!token.startsWith("Bearer ")) {
                token = "Bearer " + token;
            }
            token = token.trim();
        }

        Request request = builder
                .url(url)
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", token)
                .build();
        return client.newCall(request).execute();

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
