package com.plug.old;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class BrushBlog {

	public static String str = "taskkill /F /IM chrome.exe";

	/*
	 * start chrome
	 */
	public static String str1 = "cmd /c start chrome " 
			+ "http://blog.csdn.net/ljx646566715/article/details/79280989 "
			+ "http://blog.csdn.net/ljx646566715/article/details/79269089 "
			+ "http://blog.csdn.net/ljx646566715/article/details/79232720 "
			+ "http://blog.csdn.net/ljx646566715/article/details/79201864 "
			+ "http://blog.csdn.net/ljx646566715/article/details/79175035 "
			+ "http://blog.csdn.net/ljx646566715/article/details/79165496 "
			+ "http://blog.csdn.net/ljx646566715/article/details/79081692 "
			+ "http://blog.csdn.net/ljx646566715/article/details/79081373 "
			+ "http://blog.csdn.net/ljx646566715/article/details/79071796 "
			+ "http://blog.csdn.net/ljx646566715/article/details/51136673 ";

	public static ArrayList<String> list = new ArrayList<String>();

	public BrushBlog() {
		list.add(str1);
	}

	// 使用Chrome浏览器打开
	public static void openChromeBrowser(String start, String stop) {
		// 启用cmd运行chrome的方式来打开网址。
		try {
			Runtime.getRuntime().exec(start);
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Runtime.getRuntime().exec(stop);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 使用操作系统默认的浏览器打开
	private static void defaultBrowserOpenUrl() {
		// ...
		try {
			Desktop.getDesktop().browse(new URI("http://blog.csdn.net/ljx646566715/article/details/79280989"));
		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 网址被屏蔽了，手动加网址试一下。
	}

	public static void main(String args[]) {
		// defaultBrowserOpenUrl();
		BrushBlog openUrl = new BrushBlog();
		while (true) {
			int i = 0;
			String strUrl = "";
			while (i < 1) {
				strUrl = list.get(i);
				openChromeBrowser(strUrl, str);
				// 每关闭一次浏览器，等待大概30s再重启
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
			}
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}