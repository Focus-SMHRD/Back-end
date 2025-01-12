package com.smhrd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smhrd.entity.Sensor;

import jakarta.transaction.Transactional;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Integer> {

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM tb_sensor WHERE user_email = :user_email", nativeQuery = true)
    int deleteSensor(@Param("user_email") String userEmail);

}