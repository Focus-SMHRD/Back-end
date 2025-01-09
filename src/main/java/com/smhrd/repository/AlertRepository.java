package com.smhrd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.entity.Alert;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Integer> {
    long deleteByUser_email(String user_email);

    List<Alert> findAllByUser_email(String user_email);
}