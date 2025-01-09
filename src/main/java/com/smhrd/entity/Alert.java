package com.smhrd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_alert")
public class Alert {
	
	@Id
	private Integer alert_idx;

	private String user_email;

	private String alert_msg;
	
	private String alerted_at;

	private String received_yn;

	@Override
	public String toString() {
		return "Alert 객체";
	}
}
