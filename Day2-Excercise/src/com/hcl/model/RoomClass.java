package com.hcl.model;

public class RoomClass {
	
	private int roomNo;
	private String roomType;
	private String roomArea;
	private String acMachine;
	
	public RoomClass() {
		super();
	}

	public RoomClass(int roomNo, String roomType, String roomArea, String acMachine) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.acMachine = acMachine;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	public String getAcMachine() {
		return acMachine;
	}

	public void setAcMachine(String acMachine) {
		this.acMachine = acMachine;
	}
	
	public void display() {
		System.out.println(roomNo);
		System.out.println(roomType);
		System.out.println(roomArea);
		System.out.println(acMachine);
	}
}
