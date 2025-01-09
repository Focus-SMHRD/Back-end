package com.smhrd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.entity.LiveData;

@Repository
public interface LiveDataRepository extends JpaRepository<LiveData, Integer> {

}