package com.hzqsy.recognition.pojo;

import java.io.Serializable;

/**
 * 二次识别存入kafka的对象
 * @author zhongh
 * @date 2019-10-30
 */
public class CPlusMotorVehicle extends Motorvehicle implements Serializable{
	private static final long serialVersionUID = -6974026885877545114L;
	private CPlusRecognition recognition;

	public CPlusRecognition getRecognition() {
		return recognition;
	}

	public void setRecognition(CPlusRecognition recognition) {
		this.recognition = recognition;
	}

}
