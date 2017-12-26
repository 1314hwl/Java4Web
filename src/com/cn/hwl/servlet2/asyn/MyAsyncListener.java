package com.cn.hwl.servlet2.asyn;

import java.io.IOException;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;

public class MyAsyncListener implements AsyncListener {

    @Override
    public void onComplete(AsyncEvent arg0) throws IOException {
         System.out.println("请求结束...");
    }

    @Override
    public void onError(AsyncEvent arg0) throws IOException {
        System.out.println("请求异常...");
    }

    @Override
    public void onStartAsync(AsyncEvent arg0) throws IOException {
        System.out.println("请求开始...");
    }

    @Override
    public void onTimeout(AsyncEvent arg0) throws IOException {
        System.out.println("请求超时...");
    }

}
