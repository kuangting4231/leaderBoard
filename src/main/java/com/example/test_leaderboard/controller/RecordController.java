package com.example.test_leaderboard.controller;

import com.example.test_leaderboard.service.RecordService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class RecordController {
    @Autowired
    private RecordService recordService;

    @RequestMapping("/record")
    public void record(@Param("userNmae") String userName,
                       @Param("problemNumber") int problemNumber,
                       @Param("timeCost") double timeCost
                       ){
        recordService.record(userName,problemNumber,timeCost,System.currentTimeMillis()/1000);
    }
}
// @Param("curreneTime") long currentTime