package com.imxss.web.service;

import java.util.Map;

import org.coody.framework.context.annotation.CacheWrite;
import org.coody.framework.context.entity.HttpEntity;
import org.coody.framework.util.HttpUtil;
import org.coody.framework.util.StringUtil;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

@Service
public class SortUrlService {

	

	@CacheWrite(fields="url",validTime=72000)
	public String getSortUrl(String url) {
		try {
			String sortUrl=getSortUrlImplLiuDu(url);
			if(!StringUtil.isNullOrEmpty(sortUrl)){
				return sortUrl;
			}
			return getSortUrlImplSina(url);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private String getSortUrlImplSina(String url) {
		try {
			HttpEntity entity = HttpUtil
					.Get("http://api.t.sina.com.cn/short_url/shorten.json?source=3213676317&url_long="
							+ url);
			String html = entity.getHtml().replace("[", "").replace("]", "");
			Map<String, Object> jsonMap = JSON.parseObject(html, new TypeReference<Map<String, Object>>() {
			});
			String sortUrl = jsonMap.get("url_short").toString();
			sortUrl=sortUrl.replace("http:", "");
			return sortUrl;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	private String getSortUrlImplLiuDu(String url){
		try {
			HttpEntity entity=HttpUtil.Get("http://6du.in/?is_api=1&lurl="+url.replace("http:", ""));
			String sortUrl =  entity.getHtml();
			if(!sortUrl.startsWith("http://")){
				return null;
			}
			sortUrl=sortUrl.replace("http:", "");
			return sortUrl;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new SortUrlService().getSortUrl("http://imxss.com/"));
	}
}
