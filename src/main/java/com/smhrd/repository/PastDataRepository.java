package com.smhrd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.entity.PastData;

@Repository
public interface PastDataRepository extends JpaRepository<PastData, Integer> {

}