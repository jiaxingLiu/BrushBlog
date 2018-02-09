package com.plug.fuzhu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by ljx@180209
 */
public class JsoupGetArticleUrl {
	/**
	 * 获取所有个人博客地址
	 * 
	 * @return
	 */
	public static List<String> getCsdnBlogsUrl() {
		List<String> urls = new ArrayList<String>();
		urls.add("http://blog.csdn.net/ljx646566715/article/details/79280989");
		urls.add("http://blog.csdn.net/ljx646566715/article/details/79269089");
		urls.add("http://blog.csdn.net/ljx646566715/article/details/79232720");
		urls.add("http://blog.csdn.net/ljx646566715/article/details/79201864");
		urls.add("http://blog.csdn.net/ljx646566715/article/details/79175035");
		urls.add("http://blog.csdn.net/ljx646566715/article/details/79165496");
		urls.add("http://blog.csdn.net/ljx646566715/article/details/79081692");
		urls.add("http://blog.csdn.net/ljx646566715/article/details/79081373");
		urls.add("http://blog.csdn.net/ljx646566715/article/details/79071796");
		urls.add("http://blog.csdn.net/ljx646566715/article/details/51136673");
		// try {
		// Document doc = getDoc("http://blog.csdn.net/LJX646566715");
		// Element body = doc.body();
		// Pattern compile =
		// Pattern.compile("/LJX646566715/article/details/\\d{8}$");
		// Elements es = body.select("a");
		// /**
		// * 用set去重
		// */
		// HashSet<String> set = new HashSet<String>();
		// for (Iterator it = es.iterator(); it.hasNext();) {
		// Element e = (Element) it.next();
		// if (compile.matcher(e.attr("href")).find()) {
		// set.add("http://blog.csdn.net" + e.attr("href"));
		// }
		// }
		// urls.addAll(set);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		return urls;
	}

	/**
	 * 模拟浏览器行为的请求头获取Document
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static Document getDoc(String url) throws IOException {
		/**
		 * 在爬之前最好看一下浏览器访问目标网站的Request Header信息，然后进行模仿
		 */
		return Jsoup.connect(url)
				// .header("accept", "application/json, text/plain,*/*")
				// .header("Accept-Encoding", "gzip, deflate,br")
				// .header("Accept-Language",
				// "zh-CN,zh;q=0.8")//,en-US;q=0.5,en;q=0.3
				// .header("Referer", "https://www.baidu.com/")
				.header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
				.header("Accept-Encoding", "gzip, deflate, sdch").header("Accept-Language", "zh-CN,zh;q=0.8")// ,en-US;q=0.5,en;q=0.3
				.header("Cache-Control", "max-age=0").header("Connection", "keep-alive").header("Host", "blog.csdn.net")
				.header("Referer", "https://www.csdn.net/").header("Upgrade-Insecure-Requests", "1")
				.header("User-Agent",
						"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.87 Safari/537.36")
				.header("Cookie",
						"uuid_tt_dd=9078491993658929928_20180208; kd_user_id=54c83aef-8f81-4efe-bc2b-5f97b4c71115; UserName=LJX646566715; UserInfo=lLY0zttprZtkEXV1dWbLudWbzbDipDsZNl5YtPMlLiZQoJQHa5rW0z6l0w%2B9eZoFm37stWCBACNGndp3EWLLps8ZmIIzzrmng7dJvlnCQwL2LwiJzLulXV6yeuKk6gI6lVPId%2FpxwmReCHFws1UPlA%3D%3D; UserNick=%E8%88%AC%E8%8B%A5%E8%8E%AB%E8%A8%80; UN=LJX646566715; AU=029; BT=1518069306957; uuid=b8c6741e-02f8-47e8-a212-44f45fcce07e; __yadk_uid=nuHiPa03Y1Cng9BlC12VbI5wfAvA0Uwt; Hm_ct_6bcd52f51e9b3dce32bec4a3997715ac=1788*1*PC_VC; Hm_lvt_6bcd52f51e9b3dce32bec4a3997715ac=1518141815,1518141851,1518141860,1518146476; Hm_lpvt_6bcd52f51e9b3dce32bec4a3997715ac=1518153328; dc_tos=p3vals; dc_session_id=10_1518146473505.952428")
				.timeout(5000).get();
	}
}
