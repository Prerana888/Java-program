package com.xworkz.tractordto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tractor_table")
public class TractorDTO implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRACTORID")
	private int tractorID;
	@Column(name = " MODEL")
	private String model;
	@Column(name = "COST")
	private double cost;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "FUEL_CAPACITY")
	private double fuelcapacity;

//	public TractorDTO() {
//		super();
//		System.out.println(this.getClass().getSimpleName() + "object created");
//	}

	public TractorDTO(String model, double cost, String color, double fuelcapacity) {
		super();

		this.model = model;
		this.cost = cost;
		this.color = color;
		this.fuelcapacity = fuelcapacity;
	}

	public int getTractorID() {
		return tractorID;
	}

	public void setTractorID(int tractorID) {
		this.tractorID = tractorID;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getFuelcapacity() {
		return fuelcapacity;
	}

	public void setFuelcapacity(double fuelcapacity) {
		this.fuelcapacity = fuelcapacity;
	}

	@Override
	public String toString() {
		return "TractorDTO [tractorID=" + tractorID + ", model=" + model + ", cost=" + cost + ", color=" + color
				+ ", fuelcapacity=" + fuelcapacity + "]";
	}

}
