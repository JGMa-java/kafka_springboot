package com.hzqsy.recognition.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @创建者： zhongh
 * 
 * @功能描述：机动车 
 * @时间：2018-11-12
 */
public class Motorvehicle {

	// columns START
	@JSONField(name = "MotorVehicleID")
	private String motorVehicleID; // 车辆标识
	@JSONField(name = "InfoKind")
	private Integer infoKind; // 信息分类
	@JSONField(name = "SourceID")
	private String sourceID; // 来源标识
	@JSONField(name = "TollgateID")
	private String tollgateID; // 关联卡口编号
	@JSONField(name = "DeviceID")
	private String deviceID; // 设备编码
	@JSONField(name = "StorageUrl1")
	private String storageUrl1; // 近景照片
	@JSONField(name = "StorageUrl2")
	private String storageUrl2; // 车牌照片
	@JSONField(name = "StorageUrl3")
	private String storageUrl3; // 远景照片
	@JSONField(name = "StorageUrl4")
	private String storageUrl4; // 合成图
	@JSONField(name = "StorageUrl5")
	private String storageUrl5; // 缩略图
	@JSONField(name = "LeftTopX")
	private Integer leftTopX; // 左上角
	@JSONField(name = "LeftTopY")
	private Integer leftTopY; // 左上角
	@JSONField(name = "RightBtmX")
	private Integer rightBtmX; // 右下角
	@JSONField(name = "RightBtmY")
	private Integer rightBtmY; // 右下角
	@JSONField(name = "MarkTime")
	private Long markTime; // 位置标记时间
	@JSONField(name = "AppearTime")
	private Long appearTime; // 车辆出现时间
	@JSONField(name = "DisappearTime")
	private Long disappearTime; // 车辆消失时间
	@JSONField(name = "LaneNo")
	private Integer laneNo; // 车道号
	@JSONField(name = "HasPlate")
	private String hasPlate; // 有无车牌
	@JSONField(name = "PlateClass")
	private String plateClass; // 号牌种类
	@JSONField(name = "PlateColor")
	private String plateColor; // 车牌颜色
	@JSONField(name = "PlateNo")
	private String plateNo; // 车牌号
	@JSONField(name = "PlateNoAttach")
	private String plateNoAttach; // 挂车牌号
	@JSONField(name = "PlateDescribe")
	private String plateDescribe; // 车牌描述
	@JSONField(name = "IsDecked")
	private String isDecked; // 是否套牌
	@JSONField(name = "IsAltered")
	private String isAltered; // 是否涂改
	@JSONField(name = "IsCovered")
	private String isCovered; // 是否遮挡
	@JSONField(name = "Speed")
	private Double speed; // 行驶速度
	@JSONField(name = "Direction")
	private Integer direction; // 行驶方向
	@JSONField(name = "DrivingStatusCode")
	private String drivingStatusCode; // 行驶状态代码
	@JSONField(name = "UsingPropertiesCode")
	private Integer usingPropertiesCode; // 车辆使用性质代码
	@JSONField(name = "VehicleClass")
	private String vehicleClass; // 车辆类型
	@JSONField(name = "VehicleBrand")
	private String vehicleBrand; // 车辆品牌
	@JSONField(name = "VehicleModel")
	private String vehicleModel; // 车辆型号
	@JSONField(name = "VehicleStyles")
	private String vehicleStyles; // 车辆年款
	@JSONField(name = "VehicleLength")
	private Integer vehicleLength; // 车辆长度
	@JSONField(name = "VehicleWidth")
	private Integer vehicleWidth; // 车辆宽度
	@JSONField(name = "VehicleHeight")
	private Integer vehicleHeight; // 车辆高度
	@JSONField(name = "VehicleColor")
	private String vehicleColor; // 车身颜色
	@JSONField(name = "VehicleColorDepth")
	private String vehicleColorDepth; // 颜色深浅
	@JSONField(name = "VehicleHood")
	private String vehicleHood; // 车前盖
	@JSONField(name = "VehicleTrunk")
	private String vehicleTrunk; // 车后盖
	@JSONField(name = "VehicleWheel")
	private String vehicleWheel; // 车轮
	@JSONField(name = "WheelPrintedPattern")
	private String wheelPrintedPattern; // 车轮印花纹
	@JSONField(name = "VehicleWindow")
	private String vehicleWindow; // 车窗
	@JSONField(name = "VehicleRoof")
	private String vehicleRoof; // 车顶
	@JSONField(name = "VehicleDoor")
	private String vehicleDoor; // 车门
	@JSONField(name = "SideOfVehicle")
	private String sideOfVehicle; // 车侧
	@JSONField(name = "CarOfVehicle")
	private String carOfVehicle; // 车厢
	@JSONField(name = "RearviewMirror")
	private String rearviewMirror; // 后视镜
	@JSONField(name = "VehicleChassis")
	private String vehicleChassis; // 底盘
	@JSONField(name = "VehicleShielding")
	private String vehicleShielding; // 遮挡
	@JSONField(name = "FilmColor")
	private String filmColor; // 贴膜颜色
	@JSONField(name = "IsModified")
	private String isModified; // 改装标志
	@JSONField(name = "HitMarkInfo")
	private String hitMarkInfo; // 撞痕信息
	@JSONField(name = "VehicleBodyDesc")
	private String vehicleBodyDesc; // 车身描述
	@JSONField(name = "VehicleFrontItem")
	private String vehicleFrontItem; // 车前部物品
	@JSONField(name = "DescOfFrontItem")
	private String descOfFrontItem; // 车前部物品描述
	@JSONField(name = "VehicleRearItem")
	private String vehicleRearItem; // 车后部物品
	@JSONField(name = "DescOfRearItem")
	private String descOfRearItem; // 车后部物品描述
	@JSONField(name = "NumOfPassenger")
	private Integer numOfPassenger; // 车内人数
	@JSONField(name = "PassTime")
	private Long passTime; // 经过时刻
	@JSONField(name = "NameOfPassedRoad")
	private String nameOfPassedRoad; // 经过道路名称
	@JSONField(name = "IsSuspicious")
	private String isSuspicious; // 是否可疑车
	@JSONField(name = "Sunvisor")
	private Integer sunvisor; // 遮阳板状态
	@JSONField(name = "SafetyBelt")
	private Integer safetyBelt; // 安全带状态
	@JSONField(name = "Calling")
	private Integer calling; // 打电话状态
	@JSONField(name = "PlateReliability")
	private String plateReliability; // 号牌识别可信度
	@JSONField(name = "PlateCharReliability")
	private String plateCharReliability; // 每位号牌号码可信度
	@JSONField(name = "BrandReliability")
	private String brandReliability; // 品牌标志识别可信度
//	@JSONField(name="SubImageList")
//	private List<SubImageInfo> subImageList = new ArrayList<SubImageInfo>(0); // 图像列表
	@JSONField(name="SubImageList")
	private SubImageInfoList SubImageList; // 图像列表
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createDate; // createDate
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date modifiedDate; // modifiedDate
	@JSONField(serialize = false)
	private String creator; // creator
	@JSONField(serialize = false)
	private String modifior; // modifior
	@JSONField(serialize = false)
	private Integer isDeleted; // isDeleted
	@JSONField(serialize = false)
	private Integer status; // status
	private String servercode;   //图片服务器编号
	private String imgcode;   //图片编号
	private String imgurl;   //图片url
	private Integer imgtype;   //图片存储方式, 1原图, 2缩略图
	// columns END

//	@JSONField(serialize = false)
//	private java.util.Date btime;
//
//	@JSONField(serialize = false)
//	private java.util.Date etime;

	@JSONField(serialize = false)
	private String fieldName;

	@JSONField(serialize = false)
	private Integer fieldNum;

	@JSONField(serialize = false)
	private String orderType;


	private String startDatetime;
	private String endDatetime;
	private String plateClassName; //车牌类型名称
	private String vehicleColorName; //车身颜色名称
	private String vehicleBrandName; //车辆品牌名称
	private String vehicleClassName; //车辆类型名称
	private String deviceName; //设备名称
	private String passtimeStr; //过车时间
	private String passportids; //卡口id组
	private String areacodes; //行政区划编号组
	private Integer apetype; //设备类型(卡口, 电警等)
	private Double longitude;//经度
	private Double latitude;//维度

	@JSONField(serialize = false)
	private String groupType;//聚合类型

	@JSONField
	private String industryCode; // 行业编号

	@JSONField
	private String typeCode; // 类型编号

	@JSONField
	private String factorycode;

	@JSONField
	private String factorydevicecode;

	@JSONField
	private String factorydirectioncode;

	public Motorvehicle() {
	}

	public String getMotorVehicleID() {
		return motorVehicleID;
	}

	public void setMotorVehicleID(String motorVehicleID) {
		this.motorVehicleID = motorVehicleID;
	}

	public Integer getInfoKind() {
		return infoKind;
	}

	public void setInfoKind(Integer infoKind) {
		this.infoKind = infoKind;
	}

	public String getSourceID() {
		return sourceID;
	}

	public void setSourceID(String sourceID) {
		this.sourceID = sourceID;
	}

	public String getTollgateID() {
		return tollgateID;
	}

	public void setTollgateID(String tollgateID) {
		this.tollgateID = tollgateID;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public String getStorageUrl1() {
		return storageUrl1;
	}

	public void setStorageUrl1(String storageUrl1) {
		this.storageUrl1 = storageUrl1;
	}

	public String getStorageUrl2() {
		return storageUrl2;
	}

	public void setStorageUrl2(String storageUrl2) {
		this.storageUrl2 = storageUrl2;
	}

	public String getStorageUrl3() {
		return storageUrl3;
	}

	public void setStorageUrl3(String storageUrl3) {
		this.storageUrl3 = storageUrl3;
	}

	public String getStorageUrl4() {
		return storageUrl4;
	}

	public void setStorageUrl4(String storageUrl4) {
		this.storageUrl4 = storageUrl4;
	}

	public String getStorageUrl5() {
		return storageUrl5;
	}

	public void setStorageUrl5(String storageUrl5) {
		this.storageUrl5 = storageUrl5;
	}

	public Integer getLeftTopX() {
		return leftTopX;
	}

	public void setLeftTopX(Integer leftTopX) {
		this.leftTopX = leftTopX;
	}

	public Integer getLeftTopY() {
		return leftTopY;
	}

	public void setLeftTopY(Integer leftTopY) {
		this.leftTopY = leftTopY;
	}

	public Integer getRightBtmX() {
		return rightBtmX;
	}

	public void setRightBtmX(Integer rightBtmX) {
		this.rightBtmX = rightBtmX;
	}

	public Integer getRightBtmY() {
		return rightBtmY;
	}

	public void setRightBtmY(Integer rightBtmY) {
		this.rightBtmY = rightBtmY;
	}

	public Long getMarkTime() {
		return markTime;
	}

	public void setMarkTime(Long markTime) {
		this.markTime = markTime;
	}

	public Long getAppearTime() {
		return appearTime;
	}

	public void setAppearTime(Long appearTime) {
		this.appearTime = appearTime;
	}

	public Long getDisappearTime() {
		return disappearTime;
	}

	public void setDisappearTime(Long disappearTime) {
		this.disappearTime = disappearTime;
	}

	public Integer getLaneNo() {
		return laneNo;
	}

	public void setLaneNo(Integer laneNo) {
		this.laneNo = laneNo;
	}

	public String getHasPlate() {
		return hasPlate;
	}

	public void setHasPlate(String hasPlate) {
		this.hasPlate = hasPlate;
	}

	public String getPlateClass() {
		return plateClass;
	}

	public void setPlateClass(String plateClass) {
		this.plateClass = plateClass;
	}

	public String getPlateColor() {
		return plateColor;
	}

	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getPlateNoAttach() {
		return plateNoAttach;
	}

	public void setPlateNoAttach(String plateNoAttach) {
		this.plateNoAttach = plateNoAttach;
	}

	public String getPlateDescribe() {
		return plateDescribe;
	}

	public void setPlateDescribe(String plateDescribe) {
		this.plateDescribe = plateDescribe;
	}

	public String getIsDecked() {
		return isDecked;
	}

	public void setIsDecked(String isDecked) {
		this.isDecked = isDecked;
	}

	public String getIsAltered() {
		return isAltered;
	}

	public void setIsAltered(String isAltered) {
		this.isAltered = isAltered;
	}

	public String getIsCovered() {
		return isCovered;
	}

	public void setIsCovered(String isCovered) {
		this.isCovered = isCovered;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
	}

	public String getDrivingStatusCode() {
		return drivingStatusCode;
	}

	public void setDrivingStatusCode(String drivingStatusCode) {
		this.drivingStatusCode = drivingStatusCode;
	}

	public Integer getUsingPropertiesCode() {
		return usingPropertiesCode;
	}

	public void setUsingPropertiesCode(Integer usingPropertiesCode) {
		this.usingPropertiesCode = usingPropertiesCode;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleStyles() {
		return vehicleStyles;
	}

	public void setVehicleStyles(String vehicleStyles) {
		this.vehicleStyles = vehicleStyles;
	}

	public Integer getVehicleLength() {
		return vehicleLength;
	}

	public void setVehicleLength(Integer vehicleLength) {
		this.vehicleLength = vehicleLength;
	}

	public Integer getVehicleWidth() {
		return vehicleWidth;
	}

	public void setVehicleWidth(Integer vehicleWidth) {
		this.vehicleWidth = vehicleWidth;
	}

	public Integer getVehicleHeight() {
		return vehicleHeight;
	}

	public void setVehicleHeight(Integer vehicleHeight) {
		this.vehicleHeight = vehicleHeight;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getVehicleColorDepth() {
		return vehicleColorDepth;
	}

	public void setVehicleColorDepth(String vehicleColorDepth) {
		this.vehicleColorDepth = vehicleColorDepth;
	}

	public String getVehicleHood() {
		return vehicleHood;
	}

	public void setVehicleHood(String vehicleHood) {
		this.vehicleHood = vehicleHood;
	}

	public String getVehicleTrunk() {
		return vehicleTrunk;
	}

	public void setVehicleTrunk(String vehicleTrunk) {
		this.vehicleTrunk = vehicleTrunk;
	}

	public String getVehicleWheel() {
		return vehicleWheel;
	}

	public void setVehicleWheel(String vehicleWheel) {
		this.vehicleWheel = vehicleWheel;
	}

	public String getWheelPrintedPattern() {
		return wheelPrintedPattern;
	}

	public void setWheelPrintedPattern(String wheelPrintedPattern) {
		this.wheelPrintedPattern = wheelPrintedPattern;
	}

	public String getVehicleWindow() {
		return vehicleWindow;
	}

	public void setVehicleWindow(String vehicleWindow) {
		this.vehicleWindow = vehicleWindow;
	}

	public String getVehicleRoof() {
		return vehicleRoof;
	}

	public void setVehicleRoof(String vehicleRoof) {
		this.vehicleRoof = vehicleRoof;
	}

	public String getVehicleDoor() {
		return vehicleDoor;
	}

	public void setVehicleDoor(String vehicleDoor) {
		this.vehicleDoor = vehicleDoor;
	}

	public String getSideOfVehicle() {
		return sideOfVehicle;
	}

	public void setSideOfVehicle(String sideOfVehicle) {
		this.sideOfVehicle = sideOfVehicle;
	}

	public String getCarOfVehicle() {
		return carOfVehicle;
	}

	public void setCarOfVehicle(String carOfVehicle) {
		this.carOfVehicle = carOfVehicle;
	}

	public String getRearviewMirror() {
		return rearviewMirror;
	}

	public void setRearviewMirror(String rearviewMirror) {
		this.rearviewMirror = rearviewMirror;
	}

	public String getVehicleChassis() {
		return vehicleChassis;
	}

	public void setVehicleChassis(String vehicleChassis) {
		this.vehicleChassis = vehicleChassis;
	}

	public String getVehicleShielding() {
		return vehicleShielding;
	}

	public void setVehicleShielding(String vehicleShielding) {
		this.vehicleShielding = vehicleShielding;
	}

	public String getFilmColor() {
		return filmColor;
	}

	public void setFilmColor(String filmColor) {
		this.filmColor = filmColor;
	}

	public String getIsModified() {
		return isModified;
	}

	public void setIsModified(String isModified) {
		this.isModified = isModified;
	}

	public String getHitMarkInfo() {
		return hitMarkInfo;
	}

	public void setHitMarkInfo(String hitMarkInfo) {
		this.hitMarkInfo = hitMarkInfo;
	}

	public String getVehicleBodyDesc() {
		return vehicleBodyDesc;
	}

	public void setVehicleBodyDesc(String vehicleBodyDesc) {
		this.vehicleBodyDesc = vehicleBodyDesc;
	}

	public String getVehicleFrontItem() {
		return vehicleFrontItem;
	}

	public void setVehicleFrontItem(String vehicleFrontItem) {
		this.vehicleFrontItem = vehicleFrontItem;
	}

	public String getDescOfFrontItem() {
		return descOfFrontItem;
	}

	public void setDescOfFrontItem(String descOfFrontItem) {
		this.descOfFrontItem = descOfFrontItem;
	}

	public String getVehicleRearItem() {
		return vehicleRearItem;
	}

	public void setVehicleRearItem(String vehicleRearItem) {
		this.vehicleRearItem = vehicleRearItem;
	}

	public String getDescOfRearItem() {
		return descOfRearItem;
	}

	public void setDescOfRearItem(String descOfRearItem) {
		this.descOfRearItem = descOfRearItem;
	}

	public Integer getNumOfPassenger() {
		return numOfPassenger;
	}

	public void setNumOfPassenger(Integer numOfPassenger) {
		this.numOfPassenger = numOfPassenger;
	}

	public Long getPassTime() {
		return passTime;
	}

	public void setPassTime(Long passTime) {
		this.passTime = passTime;
	}

	public String getNameOfPassedRoad() {
		return nameOfPassedRoad;
	}

	public void setNameOfPassedRoad(String nameOfPassedRoad) {
		this.nameOfPassedRoad = nameOfPassedRoad;
	}

	public String getIsSuspicious() {
		return isSuspicious;
	}

	public void setIsSuspicious(String isSuspicious) {
		this.isSuspicious = isSuspicious;
	}

	public Integer getSunvisor() {
		return sunvisor;
	}

	public void setSunvisor(Integer sunvisor) {
		this.sunvisor = sunvisor;
	}

	public Integer getSafetyBelt() {
		return safetyBelt;
	}

	public void setSafetyBelt(Integer safetyBelt) {
		this.safetyBelt = safetyBelt;
	}

	public Integer getCalling() {
		return calling;
	}

	public void setCalling(Integer calling) {
		this.calling = calling;
	}

	public String getPlateReliability() {
		return plateReliability;
	}

	public void setPlateReliability(String plateReliability) {
		this.plateReliability = plateReliability;
	}

	public String getPlateCharReliability() {
		return plateCharReliability;
	}

	public void setPlateCharReliability(String plateCharReliability) {
		this.plateCharReliability = plateCharReliability;
	}

	public String getBrandReliability() {
		return brandReliability;
	}

	public void setBrandReliability(String brandReliability) {
		this.brandReliability = brandReliability;
	}

//	public List<SubImageInfo> getSubImageList() {
//		return subImageList;
//	}
//
//	public void setSubImageList(List<SubImageInfo> subImageList) {
//		this.subImageList = subImageList;
//	}

	public void setCreateDate(Date value) {
		this.createDate = value;
	}

	public SubImageInfoList getSubImageList() {
		return SubImageList;
	}

	public void setSubImageList(SubImageInfoList subImageList) {
		SubImageList = subImageList;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setModifiedDate(Date value) {
		this.modifiedDate = value;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setCreator(String value) {
		this.creator = value;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setModifior(String value) {
		this.modifior = value;
	}

	public String getModifior() {
		return this.modifior;
	}

	public void setIsDeleted(Integer value) {
		this.isDeleted = value;
	}

	public Integer getIsDeleted() {
		return this.isDeleted;
	}

	public void setStatus(Integer value) {
		this.status = value;
	}

	public Integer getStatus() {
		return this.status;
	}

	public String getServercode() {
		return servercode;
	}

	public void setServercode(String servercode) {
		this.servercode = servercode;
	}

	public String getImgcode() {
		return imgcode;
	}

	public void setImgcode(String imgcode) {
		this.imgcode = imgcode;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public Integer getImgtype() {
		return imgtype;
	}

	public void setImgtype(Integer imgtype) {
		this.imgtype = imgtype;
	}

//	public java.util.Date getBtime() {
//		return btime;
//	}
//
//	public void setBtime(java.util.Date btime) {
//		this.btime = btime;
//	}
//
//	public java.util.Date getEtime() {
//		return etime;
//	}
//
//	public void setEtime(java.util.Date etime) {
//		this.etime = etime;
//	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}



	public Integer getFieldNum() {
		return fieldNum;
	}

	public void setFieldNum(Integer fieldNum) {
		this.fieldNum = fieldNum;
	}

	public String getStartDatetime() {
		return startDatetime;
	}

	public void setStartDatetime(String startDatetime) {
		this.startDatetime = startDatetime;
	}

	public String getEndDatetime() {
		return endDatetime;
	}

	public void setEndDatetime(String endDatetime) {
		this.endDatetime = endDatetime;
	}

	public String getVehicleColorName() {
		return vehicleColorName;
	}

	public void setVehicleColorName(String vehicleColorName) {
		this.vehicleColorName = vehicleColorName;
	}

	public String getVehicleBrandName() {
		return vehicleBrandName;
	}

	public void setVehicleBrandName(String vehicleBrandName) {
		this.vehicleBrandName = vehicleBrandName;
	}

	public String getVehicleClassName() {
		return vehicleClassName;
	}

	public void setVehicleClassName(String vehicleClassName) {
		this.vehicleClassName = vehicleClassName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getPasstimeStr() {
		return passtimeStr;
	}

	public void setPasstimeStr(String passtimeStr) {
		this.passtimeStr = passtimeStr;
	}

	public String getPlateClassName() {
		return plateClassName;
	}

	public void setPlateClassName(String plateClassName) {
		this.plateClassName = plateClassName;
	}

	public Date getBtime() {
		if(startDatetime!=null&&startDatetime.length()>0) {
			try {
				System.out.println("************* startDatetime: "+startDatetime);
				return DateUtil.convertStringToDate(startDatetime);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}else {
			return null;
		}
	}

	public Date getEtime() {
		if(endDatetime!=null&&endDatetime.length()>0) {
			try {
				return DateUtil.convertStringToDate(endDatetime);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}else {
			return null;
		}
	}

	public String getBdate() {
		if(startDatetime!=null&&startDatetime.length()>0) {
			try {
				System.out.println("************* startDatetime: "+startDatetime);
				return startDatetime.split(" ")[0];
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}else {
			return null;
		}
	}

	public String getEdate() {
		if(endDatetime!=null&&endDatetime.length()>0) {
			try {
				return endDatetime.split(" ")[0];
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}else {
			return null;
		}
	}

	public String getPassportids() {
		return passportids;
	}

	public void setPassportids(String passportids) {
		this.passportids = passportids;
	}

	public String getAreacodes() {
		return areacodes;
	}

	public void setAreacodes(String areacodes) {
		this.areacodes = areacodes;
	}

	public String getIndustryCode() {
		return industryCode;
	}

	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public Integer getApetype() {
		return apetype;
	}

	public void setApetype(Integer apetype) {
		this.apetype = apetype;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getFactorycode() {
		return factorycode;
	}

	public void setFactorycode(String factorycode) {
		this.factorycode = factorycode;
	}

	public String getFactorydevicecode() {
		return factorydevicecode;
	}

	public void setFactorydevicecode(String factorydevicecode) {
		this.factorydevicecode = factorydevicecode;
	}

	public String getFactorydirectioncode() {
		return factorydirectioncode;
	}

	public void setFactorydirectioncode(String factorydirectioncode) {
		this.factorydirectioncode = factorydirectioncode;
	}
	
	
	
	
}
