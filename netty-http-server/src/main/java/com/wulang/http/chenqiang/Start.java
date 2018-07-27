package com.wulang.http.chenqiang;

/**
 * 启动文件
 */
public class Start {
    public static void main(String[] args) {
        int port=8080;
        HttpProxyServer httpProxyServer=new HttpProxyServer(port);
        httpProxyServer.run();
    }
}
