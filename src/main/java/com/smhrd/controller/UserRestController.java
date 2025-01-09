package com.smhrd.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.entity.User;
import com.smhrd.repository.AlertRepository;
import com.smhrd.repository.SensorRepository;
import com.smhrd.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/user")
public class UserRestController {
    private UserRepository user_repo;
    private SensorRepository sensor_repo;
    private AlertRepository alert_repo;

    public UserRestController(UserRepository user_repo, SensorRepository sensor_repo, AlertRepository alert_repo) {
        this.user_repo = user_repo;
        this.sensor_repo = sensor_repo;
        this.alert_repo = alert_repo;
    }

    // 로그인
    @RequestMapping("/login")
    public User login(String email, String pw) {
        User user = user_repo.login(email, pw);
        return user;
    }

    // 회원가입
    @RequestMapping("/join")
    public String join(User user) {
        try {
            user_repo.save(user);
            return "true"; // 저장 성공
        } catch (DataAccessException e) {
            e.printStackTrace();
            return "false"; // 저장 실패
        }
    }

    // 회원정보수정
    @RequestMapping("/update")
    public String update(User user) {
        try {
            user_repo.save(user);
            return "true"; // 업데이트 성공
        } catch (DataAccessException e) {
            e.printStackTrace();
            return "false"; // 업데이트 실패
        }
    }

    // 회원탈퇴
    @RequestMapping("/delete")
    public String delete(String id) {
        long sensorResult = sensor_repo.deleteByUser_email(id);
        long alertResult = alert_repo.deleteByUser_email(id);
        long userResult = user_repo.deleteByUser_email(id);

        if (sensorResult == 0 && alertResult == 0 && userResult == 0) {
            return "false";
        } else {
            return "true";
        }
    }
}