package com.smhrd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_sensing")
public class Sensor {
	
	@Id
	private Integer sensing_idx;

	private Integer sensor_idx;

	private Double sensing_val;

	private String created_at;
	
	private String user_email;

	@Override
	public String toString() {
		return "Sensor 객체";
	}
}
