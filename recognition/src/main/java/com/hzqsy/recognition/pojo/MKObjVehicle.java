package com.hzqsy.recognition.pojo;

import java.util.ArrayList;

public class MKObjVehicle extends MKObjBase {
	private Long id;
	private String vehicletype;
	private MKObjBase Taxi;
	private MKObjBaseExt carcolor;
	private MKObjBaseExt brandinfo;
	private MKObjBase sunroof;
	private ArrayList<MKObjBase> rack;
	private ArrayList<MKObjBase> sunvisor;
	private ArrayList<MKObjBase> cellphone;
	private ArrayList<MKObjBase> safebelt;
	private ArrayList<MKObjBase> dangerflags;
	private ArrayList<MKObjBase> tissuebox;
	private ArrayList<MKObjBase> pendant;
	private ArrayList<MKObjBase> driverposition;
	private ArrayList<MKObjBase> label;
	private MKObjPlate plateRecog;
	private Integer feat_flag;
	private String feat_bin;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVehicletype() {
		return vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}

	public MKObjBase getTaxi() {
		return Taxi;
	}

	public void setTaxi(MKObjBase taxi) {
		Taxi = taxi;
	}

	public MKObjBaseExt getCarcolor() {
		return carcolor;
	}

	public void setCarcolor(MKObjBaseExt carcolor) {
		this.carcolor = carcolor;
	}

	public MKObjBaseExt getBrandinfo() {
		return brandinfo;
	}

	public void setBrandinfo(MKObjBaseExt brandinfo) {
		this.brandinfo = brandinfo;
	}

	public MKObjBase getSunroof() {
		return sunroof;
	}

	public void setSunroof(MKObjBase sunroof) {
		this.sunroof = sunroof;
	}

	public ArrayList<MKObjBase> getRack() {
		return rack;
	}

	public void setRack(ArrayList<MKObjBase> rack) {
		this.rack = rack;
	}

	public ArrayList<MKObjBase> getSunvisor() {
		return sunvisor;
	}

	public void setSunvisor(ArrayList<MKObjBase> sunvisor) {
		this.sunvisor = sunvisor;
	}

	public ArrayList<MKObjBase> getCellphone() {
		return cellphone;
	}

	public void setCellphone(ArrayList<MKObjBase> cellphone) {
		this.cellphone = cellphone;
	}

	public ArrayList<MKObjBase> getSafebelt() {
		return safebelt;
	}

	public void setSafebelt(ArrayList<MKObjBase> safebelt) {
		this.safebelt = safebelt;
	}


	public ArrayList<MKObjBase> getDangerflags() {
		return dangerflags;
	}

	public void setDangerflags(ArrayList<MKObjBase> dangerflags) {
		this.dangerflags = dangerflags;
	}

	public ArrayList<MKObjBase> getTissuebox() {
		return tissuebox;
	}

	public void setTissuebox(ArrayList<MKObjBase> tissuebox) {
		this.tissuebox = tissuebox;
	}

	public ArrayList<MKObjBase> getPendant() {
		return pendant;
	}

	public void setPendant(ArrayList<MKObjBase> pendant) {
		this.pendant = pendant;
	}

	
	public ArrayList<MKObjBase> getDriverposition() {
		return driverposition;
	}

	public void setDriverposition(ArrayList<MKObjBase> driverposition) {
		this.driverposition = driverposition;
	}

	public ArrayList<MKObjBase> getLabel() {
		return label;
	}

	public void setLabel(ArrayList<MKObjBase> label) {
		this.label = label;
	}

	public MKObjPlate getPlateRecog() {
		return plateRecog;
	}

	public void setPlateRecog(MKObjPlate plateRecog) {
		this.plateRecog = plateRecog;
	}

	public int getFeat_flag() {
		return feat_flag;
	}

	public void setFeat_flag(Integer feat_flag) {
		this.feat_flag = feat_flag;
	}

	public String getFeat_bin() {
		return feat_bin;
	}

	public void setFeat_bin(String feat_bin) {
		this.feat_bin = feat_bin;
	}

}
