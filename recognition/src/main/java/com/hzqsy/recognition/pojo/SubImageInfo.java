package com.hzqsy.recognition.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class SubImageInfo {

	@JSONField(name = "imageID")
	private String ImageID;
	@JSONField(name = "eventSort")
	private Integer EventSort;
	@JSONField(name = "deviceID")
	private String DeviceID;
	@JSONField(name = "storagePath")
	private String StoragePath;
	@JSONField(name = "type")
	private String Type; // 图像类型
	@JSONField(name = "fileFormat")
	private String FileFormat; // 图片格式
	@JSONField(name = "shotTime")
	private Long ShotTime;
	@JSONField(name = "width")
	private Integer Width;
	@JSONField(name = "height")
	private Integer Height;
	@JSONField(name = "data")
	private String Data; // 图片的base64Binary

	public String getImageID() {
		return ImageID;
	}

	public void setImageID(String imageID) {
		ImageID = imageID;
	}

	public Integer getEventSort() {
		return EventSort;
	}

	public void setEventSort(Integer eventSort) {
		EventSort = eventSort;
	}

	public String getDeviceID() {
		return DeviceID;
	}

	public void setDeviceID(String deviceID) {
		DeviceID = deviceID;
	}

	public String getStoragePath() {
		return StoragePath;
	}

	public void setStoragePath(String storagePath) {
		StoragePath = storagePath;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getFileFormat() {
		return FileFormat;
	}

	public void setFileFormat(String fileFormat) {
		FileFormat = fileFormat;
	}

	public Long getShotTime() {
		return ShotTime;
	}

	public void setShotTime(Long shotTime) {
		ShotTime = shotTime;
	}

	public Integer getWidth() {
		return Width;
	}

	public void setWidth(Integer width) {
		Width = width;
	}

	public Integer getHeight() {
		return Height;
	}

	public void setHeight(Integer height) {
		Height = height;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

}
