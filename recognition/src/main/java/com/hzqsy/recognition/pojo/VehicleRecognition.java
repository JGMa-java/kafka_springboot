package com.hzqsy.recognition.pojo;

 /**
  * @创建者： zhongh
  * @功能描述：车辆二次识别记录表 
  * @时间：2019-10-28
  */
public class VehicleRecognition {
	
	//columns START
	private String id;   //二次识别id, 48位motorvehicleid+2位序号
	private String motorvehicleid;   //过车记录id
	private Integer isDeleted;   //删除标志, 1删除,0未删除
	private java.util.Date createdate;	//创建时间
	private java.util.Date modifydate;	//修改时间
	private String creator;   //创建人
	private String platenumber;   //车牌号码
	private String platetype;   //车牌类型
	private String platecolor;   //车牌颜色
	private java.util.Date passtime;	//过车时间
	private String firstpicpath;   //图片地址1
	private String secondpicpath;   //图片地址2
	private String thirdpicpath;   //厂家图片地址
	private String servercode;   //图片服务器编号
	private String imgcode;   //图片编号
	private Integer status;   //状态
	private Long datenumber;   //过车时间（20170101112659）
	private Integer datepart;   //过车时间（20170101）
	private String carcolor;   //车身颜色
	private String passportid;   //卡口编号
	private Long brandcode;   //车辆子品牌编号
	private Long vendorcode;   //车辆大品牌编号
	private Long yearcode;   //年代款编号
	private String vehiclebrandcode;   //车辆品牌完整编号
	private String vehicletype;   //车辆类型,参考GA 24.4-2005_机动车登记信息代码_第4部分：车辆类型代码.pdf
	private Long plateconfidence;   //车牌置信度,范围[0,100]，-1 表示未知
	private Long brandconfidence;   //车辆品牌置信度,范围[0,100]，-1 表示未知
	private Long carcolorconfidence;   //车身颜色置信度,范围[0,100]，-1 表示未知
	private String factorypassportid;   //厂家卡口编号
	private String factoryid;   //厂家编号
	private String orgplatenumber;   //厂家识别车牌号码
	private String orgplatetype;   //厂家识别车牌类型
	private String orgcarcolor;   //厂家识别车身颜色
	private Long safebelt;   //是否系安全带： 1 系， 0 未系，-1 表示未知
	private Integer sunvisor;   //是否放下遮阳板，0未放，1放下
	private Integer cellphone;   //是否打手机，0未打，1打手机
	private String driverposition;   //驾驶员位置
	private String secplatenumber;   //第二车牌号码
	private String secplatetype;   //第二车牌类型
	private String secplatecolor;   //第二车牌颜色
	private Long secplateconfidence;   //第二车牌置信度,范围[0,100]，-1 表示未知
	private String platepos;   //车牌位置
	private String rangelist;   //图片上车辆各特征的位置坐标集合
	private Integer vehicleseats;   //车辆座位数
	private Long personincar;   //驾驶室人员
	private Integer person;   //行人
	private Integer bicycle;   //自行车
	private Integer motorbike;   //摩托车/电动车
	private Integer tricycle;   //三轮车
	private Integer dangerousgoods;   //危险品标识
	private Integer tissuebox;   //纸巾盒
	private Integer pendant;   //挂坠
	private Integer withoutfeatures;   //车前窗无特征
	private Integer headortail;   //车头车尾
	private Integer racks;   //货架
	private Integer taxi;   //出租车
	private Integer sunroof;   //天窗
	private Integer modflag;   //年检标识
	private Long sourcetype;   //数据来源
	private Integer smoke;   //驾驶人抽烟
	private Integer holdbaby;   //抱小孩
	private String additionstr;   //附加字段, 保存json格式字符串
	private Long vehicleno;   //图片上第一辆车, 标识1, 第二辆车标识2
	private Long picwidth;  //图片宽度
	private Long picheight;  //图片高度
	private Long recognitionenable;  //是否开启识别, 1开启, 0未开启
	private String recognitionserver;  //识别服务器IP
	private Long recognitionid;//识别的唯一id

	//columns END

	public VehicleRecognition() {
	}

	public void setId(String value) {
		this.id = value;
	}

	public String getId() {
		return this.id;
	}
	public void setMotorvehicleid(String value) {
		this.motorvehicleid = value;
	}

	public String getMotorvehicleid() {
		return this.motorvehicleid;
	}
	public void setIsDeleted(Integer value) {
		this.isDeleted = value;
	}

	public Integer getIsDeleted() {
		return this.isDeleted;
	}
	public void setCreatedate(java.util.Date value) {
		this.createdate = value;
	}

	public java.util.Date getCreatedate() {
		return this.createdate;
	}

	public void setModifydate(java.util.Date value) {
		this.modifydate = value;
	}

	public java.util.Date getModifydate() {
		return this.modifydate;
	}

	public void setCreator(String value) {
		this.creator = value;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setPlatenumber(String value) {
		this.platenumber = value;
	}

	public String getPlatenumber() {
		return this.platenumber;
	}
	public void setPlatetype(String value) {
		this.platetype = value;
	}

	public String getPlatetype() {
		return this.platetype;
	}
	public void setPlatecolor(String value) {
		this.platecolor = value;
	}

	public String getPlatecolor() {
		return this.platecolor;
	}
	public void setPasstime(java.util.Date value) {
		this.passtime = value;
	}

	public java.util.Date getPasstime() {
		return this.passtime;
	}

	public void setFirstpicpath(String value) {
		this.firstpicpath = value;
	}

	public String getFirstpicpath() {
		return this.firstpicpath;
	}
	public void setSecondpicpath(String value) {
		this.secondpicpath = value;
	}

	public String getSecondpicpath() {
		return this.secondpicpath;
	}
	public void setThirdpicpath(String value) {
		this.thirdpicpath = value;
	}

	public String getThirdpicpath() {
		return this.thirdpicpath;
	}
	public void setServercode(String value) {
		this.servercode = value;
	}

	public String getServercode() {
		return this.servercode;
	}
	public void setImgcode(String value) {
		this.imgcode = value;
	}

	public String getImgcode() {
		return this.imgcode;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}

	public Integer getStatus() {
		return this.status;
	}
	public void setDatenumber(Long value) {
		this.datenumber = value;
	}

	public Long getDatenumber() {
		return this.datenumber;
	}
	public void setDatepart(Integer value) {
		this.datepart = value;
	}

	public Integer getDatepart() {
		return this.datepart;
	}
	public void setCarcolor(String value) {
		this.carcolor = value;
	}

	public String getCarcolor() {
		return this.carcolor;
	}
	public void setPassportid(String value) {
		this.passportid = value;
	}

	public String getPassportid() {
		return this.passportid;
	}
	public void setBrandcode(Long value) {
		this.brandcode = value;
	}

	public Long getBrandcode() {
		return this.brandcode;
	}
	public void setVendorcode(Long value) {
		this.vendorcode = value;
	}

	public Long getVendorcode() {
		return this.vendorcode;
	}
	public void setYearcode(Long value) {
		this.yearcode = value;
	}

	public Long getYearcode() {
		return this.yearcode;
	}
	public void setVehiclebrandcode(String value) {
		this.vehiclebrandcode = value;
	}

	public String getVehiclebrandcode() {
		return this.vehiclebrandcode;
	}
	public void setVehicletype(String value) {
		this.vehicletype = value;
	}

	public String getVehicletype() {
		return this.vehicletype;
	}
	public void setPlateconfidence(Long value) {
		this.plateconfidence = value;
	}

	public Long getPlateconfidence() {
		return this.plateconfidence;
	}
	public void setBrandconfidence(Long value) {
		this.brandconfidence = value;
	}

	public Long getBrandconfidence() {
		return this.brandconfidence;
	}
	public void setCarcolorconfidence(Long value) {
		this.carcolorconfidence = value;
	}

	public Long getCarcolorconfidence() {
		return this.carcolorconfidence;
	}
	public void setFactorypassportid(String value) {
		this.factorypassportid = value;
	}

	public String getFactorypassportid() {
		return this.factorypassportid;
	}
	public void setFactoryid(String value) {
		this.factoryid = value;
	}

	public String getFactoryid() {
		return this.factoryid;
	}
	public void setOrgplatenumber(String value) {
		this.orgplatenumber = value;
	}

	public String getOrgplatenumber() {
		return this.orgplatenumber;
	}
	public void setOrgplatetype(String value) {
		this.orgplatetype = value;
	}

	public String getOrgplatetype() {
		return this.orgplatetype;
	}
	public void setOrgcarcolor(String value) {
		this.orgcarcolor = value;
	}

	public String getOrgcarcolor() {
		return this.orgcarcolor;
	}
	public void setSafebelt(Long value) {
		this.safebelt = value;
	}

	public Long getSafebelt() {
		return this.safebelt;
	}
	public void setSunvisor(Integer value) {
		this.sunvisor = value;
	}

	public Integer getSunvisor() {
		return this.sunvisor;
	}
	public void setCellphone(Integer value) {
		this.cellphone = value;
	}

	public Integer getCellphone() {
		return this.cellphone;
	}
	public void setDriverposition(String value) {
		this.driverposition = value;
	}

	public String getDriverposition() {
		return this.driverposition;
	}
	public void setSecplatenumber(String value) {
		this.secplatenumber = value;
	}

	public String getSecplatenumber() {
		return this.secplatenumber;
	}
	public void setSecplatetype(String value) {
		this.secplatetype = value;
	}

	public String getSecplatetype() {
		return this.secplatetype;
	}
	public void setSecplatecolor(String value) {
		this.secplatecolor = value;
	}

	public String getSecplatecolor() {
		return this.secplatecolor;
	}
	public void setSecplateconfidence(Long value) {
		this.secplateconfidence = value;
	}

	public Long getSecplateconfidence() {
		return this.secplateconfidence;
	}
	public void setPlatepos(String value) {
		this.platepos = value;
	}

	public String getPlatepos() {
		return this.platepos;
	}
	public void setRangelist(String value) {
		this.rangelist = value;
	}

	public String getRangelist() {
		return this.rangelist;
	}
	public void setVehicleseats(Integer value) {
		this.vehicleseats = value;
	}

	public Integer getVehicleseats() {
		return this.vehicleseats;
	}
	public void setPersonincar(Long value) {
		this.personincar = value;
	}

	public Long getPersonincar() {
		return this.personincar;
	}
	public void setPerson(Integer value) {
		this.person = value;
	}

	public Integer getPerson() {
		return this.person;
	}
	public void setBicycle(Integer value) {
		this.bicycle = value;
	}

	public Integer getBicycle() {
		return this.bicycle;
	}
	public void setMotorbike(Integer value) {
		this.motorbike = value;
	}

	public Integer getMotorbike() {
		return this.motorbike;
	}
	public void setTricycle(Integer value) {
		this.tricycle = value;
	}

	public Integer getTricycle() {
		return this.tricycle;
	}
	public void setDangerousgoods(Integer value) {
		this.dangerousgoods = value;
	}

	public Integer getDangerousgoods() {
		return this.dangerousgoods;
	}
	public void setTissuebox(Integer value) {
		this.tissuebox = value;
	}

	public Integer getTissuebox() {
		return this.tissuebox;
	}
	public void setPendant(Integer value) {
		this.pendant = value;
	}

	public Integer getPendant() {
		return this.pendant;
	}
	public void setWithoutfeatures(Integer value) {
		this.withoutfeatures = value;
	}

	public Integer getWithoutfeatures() {
		return this.withoutfeatures;
	}
	public void setHeadortail(Integer value) {
		this.headortail = value;
	}

	public Integer getHeadortail() {
		return this.headortail;
	}
	public void setRacks(Integer value) {
		this.racks = value;
	}

	public Integer getRacks() {
		return this.racks;
	}
	public void setTaxi(Integer value) {
		this.taxi = value;
	}

	public Integer getTaxi() {
		return this.taxi;
	}
	public void setSunroof(Integer value) {
		this.sunroof = value;
	}

	public Integer getSunroof() {
		return this.sunroof;
	}
	public void setModflag(Integer value) {
		this.modflag = value;
	}

	public Integer getModflag() {
		return this.modflag;
	}
	public void setSourcetype(Long value) {
		this.sourcetype = value;
	}

	public Long getSourcetype() {
		return this.sourcetype;
	}
	public void setSmoke(Integer value) {
		this.smoke = value;
	}

	public Integer getSmoke() {
		return this.smoke;
	}
	public void setHoldbaby(Integer value) {
		this.holdbaby = value;
	}

	public Integer getHoldbaby() {
		return this.holdbaby;
	}
	public void setAdditionstr(String value) {
		this.additionstr = value;
	}

	public String getAdditionstr() {
		return this.additionstr;
	}
	public void setVehicleno(Long value) {
		this.vehicleno = value;
	}

	public Long getVehicleno() {
		return this.vehicleno;
	}

	public Long getPicwidth() {
		return picwidth;
	}

	public void setPicwidth(Long picwidth) {
		this.picwidth = picwidth;
	}

	public Long getPicheight() {
		return picheight;
	}

	public void setPicheight(Long picheight) {
		this.picheight = picheight;
	}

	public Long getRecognitionenable() {
		return recognitionenable;
	}

	public void setRecognitionenable(Long recognitionenable) {
		this.recognitionenable = recognitionenable;
	}

	public String getRecognitionserver() {
		return recognitionserver;
	}

	public void setRecognitionserver(String recognitionserver) {
		this.recognitionserver = recognitionserver;
	}

	public Long getRecognitionid() {
		return recognitionid;
	}

	public void setRecognitionid(Long recognitionid) {
		this.recognitionid = recognitionid;
	}	

}

