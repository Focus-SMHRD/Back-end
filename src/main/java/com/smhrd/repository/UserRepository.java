package com.smhrd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smhrd.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    // private String user_email;

	// private String user_pw;

	// private String user_name;
	
	// private String user_birthdate;

	// private String user_region;

	// private String created_at;

    @Query("select m from User m where user_email = :user_email and user_pw = :user_pw")
    public User login(String user_email, String user_pw);

    long deleteByUser_email(String user_email);
}