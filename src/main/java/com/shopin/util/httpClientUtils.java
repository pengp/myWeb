/**
 * @Probject Name: myWeb
 * @Path: com.shopin.utilhttpClientUtils.java
 * @Create By Administrator
 * @Create In 2015年6月9日 下午2:06:51
 * TODO
 */
package com.shopin.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * @Class Name httpClientUtils
 * @Author Administrator
 * @Create In 2015年6月9日
 */

public class httpClientUtils {

	public static String httpTest() {
		String json = "";
		CloseableHttpClient httpclient = HttpClients.createDefault();

		HttpGet httpget = new HttpGet(
				"http://192.168.200.176/ssdservice/photo/queryShopInfo.html");

		try {
			CloseableHttpResponse response = httpclient.execute(httpget);
			HttpEntity httpentity = response.getEntity();
			if (httpentity != null) {
				InputStream in = httpentity.getContent();
				int i;
				byte[] b = new byte[2048];
				while ((i = in.read(b)) != -1) {
					in.read(b);
				}
				json = new String(b);
			}

			System.out.println(response.getStatusLine().getStatusCode());
			System.out.println(response.toString());
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			httpget.releaseConnection();
		}
		return json;
	}

	/**
	 * <b>获取指定的URL返回的数据信息</b>
	 * 
	 * @param <font color="#efac10"><a
	 *        href="http://www.baidu.com">_url:指定的URL</a></font>
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static String httpUtilForUrl(String _url) {
		String readContent = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(_url);

		System.out.println("发送的请求为:" + _url);

		HttpResponse response;
		try {
			response = httpclient.execute(httpget);
			HttpEntity entity = response.getEntity();

			System.out.println("获取响应状态:" + response.getStatusLine());
			if (entity != null) {
				System.out.println("获取响应内容编码:" + entity.getContentEncoding());
				System.out.println("获取响应内容长度:" + entity.getContentLength());
				InputStream in = entity.getContent();
				int count = 0;
				while (count == 0) {
					count = Integer.parseInt("" + entity.getContentLength());// in.available();
					// int count =
					// in.available();流的通讯是分批进行的,一次读不全,要分多次读取,所以不要用流的这个方法获取长度,用上面的HttpEntity对象来获取
				}
				byte[] bytes = new byte[count];
				int readCount = 0; // 已经成功读取的字节的个数
									// 已经读取的字节数,注意可能一次读不全,要多次读取,在拼接
				while (readCount <= count) {
					if (readCount == count)
						break;
					readCount += in.read(bytes, readCount, count - readCount);
				}

				// 转换成字符串
				readContent = new String(bytes, 0, readCount, "UTF-8"); 
				System.out.println("获取响应内容:\n" + readContent);
			}

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return readContent;
	}

	
	/**
	 * 
	 * @Methods Name httpUtilForUrl
	 * @Create In 2015年6月11日 By Administrator
	 * @param _url
	 * @return String
	 */
	public static String httpUtilForJson(String _url,String method,String str) {
		String readContent = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
		
		URIBuilder builder = new URIBuilder();
		builder.setPath(method);
		builder.setHost(_url);
		builder.setCustomQuery(str);
		builder.setScheme("http");

		HttpResponse response;
		try {
			System.out.println("发送的请求为:" + builder.build());
			HttpGet httpget = new HttpGet(builder.build());
			response = httpclient.execute(httpget);
			HttpEntity entity = response.getEntity();

			System.out.println("获取响应状态:" + response.getStatusLine());
			if (entity != null) {
				System.out.println("获取响应内容编码:" + entity.getContentEncoding());
				System.out.println("获取响应内容长度:" + entity.getContentLength());
				InputStream in = entity.getContent();
				int count = 0;
				while (count == 0) {
					count = Integer.parseInt("" + entity.getContentLength());// in.available();
					// int count =
					// in.available();流的通讯是分批进行的,一次读不全,要分多次读取,所以不要用流的这个方法获取长度,用上面的HttpEntity对象来获取
				}
				byte[] bytes = new byte[count];
				int readCount = 0; // 已经成功读取的字节的个数
									// 已经读取的字节数,注意可能一次读不全,要多次读取,在拼接
				while (readCount <= count) {
					if (readCount == count)
						break;
					readCount += in.read(bytes, readCount, count - readCount);
				}

				// 转换成字符串
				readContent = new String(bytes, 0, readCount, "UTF-8"); 
				System.out.println("获取响应内容:\n" + readContent);
			}

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}

		return readContent;
	}
	
	
	
	
	public static void main(String[] args) {
		// httpClientUtils.httpTest();
		// httpClientUtils.HttpTest2("");
	}

}
