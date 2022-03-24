package com.melon.JobCandidateInfo.controller;

import com.melon.JobCandidateInfo.domain.entity.JobCandidateInfo;
import com.melon.JobCandidateInfo.domain.responseDto.JobCandidateInfoRequestDto;
import com.melon.JobCandidateInfo.service.JobCandidateInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ms/v1/jobcandidatesinfo/")
public class JobCandidateController {

    @Autowired
    public JobCandidateInfoService service;

    @PostMapping("add")
    public ResponseEntity<HttpStatus> add(@RequestBody JobCandidateInfoRequestDto requestDto) {

        this.service.addJobCandidateInfo(requestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("get")
    public ResponseEntity<List<JobCandidateInfo>> getAll() {

        List<JobCandidateInfo> allJobCandidateInfo = this.service.getAll();
       return new ResponseEntity<>(allJobCandidateInfo, HttpStatus.OK);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<JobCandidateInfo> getById(@PathVariable(value = "id") long id) {

        JobCandidateInfo jobCandidateInfo = this.service.getById(id);
        return new ResponseEntity<>(jobCandidateInfo, HttpStatus.OK);
    }

}
