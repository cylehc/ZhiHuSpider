package zhiHuUserSprider.service.main;


import org.jsoup.nodes.Document;
import zhiHuUserSprider.service.util.HttpUtils;
import zhiHuUserSprider.service.util.JsoupUtils;


public class Main {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.zhihu.com/people/li-si-si-59/";// 初始解析网页地址

		while(true){
			// 设置代理ip
			HttpUtils.setProxyIp();
			Document document = JsoupUtils.getDocument(url);// 得到的document一定是正常 的document
			System.out.println(document);

			//Thread.sleep(60000);
		}
	}
}
