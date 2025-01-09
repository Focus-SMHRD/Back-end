package com.smhrd.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.smhrd.entity.Alert;
import com.smhrd.repository.AlertRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/alert")
public class AlertRestController {

    private AlertRepository alert_repo;

    public AlertRestController(AlertRepository alert_repo) {
        this.alert_repo = alert_repo;
    }

    // 본인의 알람들을을 불러오기
    @RequestMapping("/selectAll")
    public List<Alert> selectAll(String email){
        List<Alert> alerts = alert_repo.findAllByUser_email(email);

        if( alerts.size() > 0 )
        {
            return alerts;
        }
        return null;
    }
}