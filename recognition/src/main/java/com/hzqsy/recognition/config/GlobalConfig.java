package com.hzqsy.recognition.config;

import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

/**
 * Created By admin on 2019.11.12
 */
//@Configuration
public class GlobalConfig {
    @Bean
    public RestClient getClient() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {

        RestClientBuilder clientBuilder = RestClient.builder(new HttpHost("10.43.83.106", 9200, "http")).setRequestConfigCallback(new RestClientBuilder.RequestConfigCallback() {
            @Override
            public RequestConfig.Builder customizeRequestConfig(RequestConfig.Builder requestConfigBuilder) {
                requestConfigBuilder.setConnectTimeout(90000);
                requestConfigBuilder.setSocketTimeout(90000);
                requestConfigBuilder.setConnectionRequestTimeout(90000);
                return requestConfigBuilder;
            }
        }).setMaxRetryTimeoutMillis(5*60*1000);

        // 如果有多个从节点可以持续在内部new多个HttpHost，参数1是ip,参数2是HTTP端口，参数3是通信协议
//        RestClientBuilder clientBuilder = RestClient.builder(new HttpHost("10.43.83.106", 9200, "http"));

        // 添加其他配置，返回来的还是RestClientBuilder对象，这些配置都是可选的
        // clientBuilder.setXX()...

        // 最后配置好的clientBuilder再build一下即可得到真正的Client
        return clientBuilder.build();
    }
}
