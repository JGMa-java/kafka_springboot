package com.hzqsy.recognition.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

public class SubImageInfoList {

	@JSONField(name = "SubImageInfo")
	private List<SubImageInfo> SubImageInfo = new ArrayList<SubImageInfo>();

	public List<SubImageInfo> getSubImageInfo() {
		return SubImageInfo;
	}

	public void setSubImageInfo(List<SubImageInfo> subImageInfo) {
		SubImageInfo = subImageInfo;
	}
	
	
}
