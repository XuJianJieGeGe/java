package com.xjj.java.thread;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

/**
 * ����ͼƬ
 * @author Administrator
 *
 */
public class WebDownload {
	
	/**
	 * ����
	 */
	public void download(String url,String name) {
		try {
			FileUtils.copyURLToFile(new URL(url),new File(name));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("���Ϸ���url");
		}
	}


}
