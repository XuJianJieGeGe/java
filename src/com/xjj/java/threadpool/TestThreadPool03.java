package com.xjj.java.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ����ʹ���̳߳ص�Ч��
 * @author Administrator
 *
 */
public class TestThreadPool03 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			
			@Override
			public void run() {
  			  System.out.println("����һ������");
			}
		});
	}

}
