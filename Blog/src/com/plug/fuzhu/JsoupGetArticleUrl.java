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
		urls.add("https://blog.csdn.net/LJX646566715/article/details/90021778");
		urls.add("https://blog.csdn.net/LJX646566715/article/details/82118235");
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
				.header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3")
				.header("Accept-Encoding", "gzip, deflate, br").header("Accept-Language", "zh-CN,zh;q=0.9")// ,en-US;q=0.5,en;q=0.3
				.header("Cache-Control", "max-age=0").header("Connection", "keep-alive").header("Host", "blog.csdn.net")
				.header("Referer", "https://blog.csdn.net/LJX646566715").header("Upgrade-Insecure-Requests", "1")
				.header("User-Agent",
						"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36")
				.header("Cookie",
						"uuid_tt_dd=10_19614514690-1554949105314-251895; UserName=LJX646566715; UserInfo=ba8dc3dcc9c3474c80189056f708602a; UserToken=ba8dc3dcc9c3474c80189056f708602a; UserNick=%E4%B8%80%E8%8E%AB%E8%A8%80%E4%B8%80; AU=029; UN=LJX646566715; BT=1555314019807; UM_distinctid=16a2e563c823-0406f8d7e31c24-e323069-151800-16a2e563c83782; _ga=GA1.2.653369905.1556000028; Hm_ct_6bcd52f51e9b3dce32bec4a3997715ac=6525*1*10_19614514690-1554949105314-251895!5744*1*LJX646566715!1788*1*PC_VC; smidV2=2019042417090384373af406c79625b4ed5ef855721eee0016502e39ca2a090; __yadk_uid=t680djJJqQu6FoA9FlFV8ywdmw4aeAdN; dc_session_id=10_1557711930911.232016; Hm_lvt_6bcd52f51e9b3dce32bec4a3997715ac=1557734817,1557735603,1557735632,1557797411; TINGYUN_DATA=%7B%22id%22%3A%22-sf2Cni530g%23HL5wvli0FZI%22%2C%22n%22%3A%22WebAction%2FCI%2FarticleList%252Flist%22%2C%22tid%22%3A%228e7e966c2f2292%22%2C%22q%22%3A0%2C%22a%22%3A63%7D; acw_tc=2760824c15578149142557215eba3c5a35255081b2c7fd7b5447f5fab14100; dc_tos=prhdz8; Hm_lpvt_6bcd52f51e9b3dce32bec4a3997715ac=1557815300")
				.timeout(5000).get();
	}
}
