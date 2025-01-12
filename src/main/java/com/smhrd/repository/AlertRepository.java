package com.smhrd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smhrd.entity.Alert;

import jakarta.transaction.Transactional;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Integer> {
    
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM tb_alert WHERE user_email = :user_email", nativeQuery = true)
    int deleteAlert(@Param("user_email") String userEmail);
}