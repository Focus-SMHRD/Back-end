package com.smhrd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.entity.Sensor;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Integer> {

    long deleteByUser_email(String user_email);

    List<Sensor> findAllByUser_email(String user_email);
}