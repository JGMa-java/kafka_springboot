package com.hzqsy.recognition.pojo;

import java.util.ArrayList;

/**
 * 二次识别的结果
 * @author zhongh
 * @date 2019-10-30
 */
public class CPlusRecognition {

	private Integer weight;
	private Integer height;
	private Integer ErrorCode;
	private String ErrorDesc;
	private String Processor;
	private ArrayList<MKObjBase> Persons;
	private ArrayList<MKObjBase> Bicycle;
	private ArrayList<MKObjBase> Motobike;
	private ArrayList<MKObjBase> Tricycle;
	private ArrayList<MKObjVehicle> vehicles;

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getErrorCode() {
		return ErrorCode;
	}

	public void setErrorCode(Integer errorCode) {
		ErrorCode = errorCode;
	}

	public String getErrorDesc() {
		return ErrorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		ErrorDesc = errorDesc;
	}

	public String getProcessor() {
		return Processor;
	}

	public void setProcessor(String processor) {
		Processor = processor;
	}

	public ArrayList<MKObjBase> getPersons() {
		return Persons;
	}

	public void setPersons(ArrayList<MKObjBase> persons) {
		Persons = persons;
	}

	public ArrayList<MKObjBase> getBicycle() {
		return Bicycle;
	}

	public void setBicycle(ArrayList<MKObjBase> bicycle) {
		Bicycle = bicycle;
	}

	public ArrayList<MKObjBase> getMotobike() {
		return Motobike;
	}

	public void setMotobike(ArrayList<MKObjBase> motobike) {
		Motobike = motobike;
	}

	public ArrayList<MKObjBase> getTricycle() {
		return Tricycle;
	}

	public void setTricycle(ArrayList<MKObjBase> tricycle) {
		Tricycle = tricycle;
	}

	public ArrayList<MKObjVehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(ArrayList<MKObjVehicle> vehicles) {
		this.vehicles = vehicles;
	}

}
