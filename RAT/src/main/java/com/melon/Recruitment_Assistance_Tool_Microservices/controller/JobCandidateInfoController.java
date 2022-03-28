package com.melon.Recruitment_Assistance_Tool_Microservices.controller;

import com.melon.Recruitment_Assistance_Tool_Microservices.exception.AddJobCandidateInfoException;
import com.melon.Recruitment_Assistance_Tool_Microservices.exception.JobCandidateInfoNotFoundException;
import com.melon.Recruitment_Assistance_Tool_Microservices.proxy.JobCandidateInfoProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JobCandidateInfoController {

    @Autowired
    private JobCandidateInfoProxy proxy;

    @PostMapping("Job-Candidate-Info/ms/v1/add")
    public ResponseEntity<Object> addJobCandidateInfo(@RequestBody Object requestObject) {

        try {
            ResponseEntity<Object> responseEntity = proxy.addJobCandidateInfo(requestObject);
            return responseEntity;
        } catch (Exception e) {
            throw new AddJobCandidateInfoException();
        }
    }

    @GetMapping("Job-Candidate-Info/ms/v1/get/{id}")
    public ResponseEntity<Object> getJobCandidateInfoById(@PathVariable long id) {

        try {
            ResponseEntity<Object> responseEntity = proxy.getJobCandidateInfoById(id);
            return responseEntity;
        } catch (Exception e) {
            throw new JobCandidateInfoNotFoundException(id);
        }
    }

    @GetMapping("Job-Candidate-Info/ms/v1/get")
    public ResponseEntity<Object> getAllJobCandidateInfo() {

        try {
            ResponseEntity<Object> responseEntity = proxy.getAllJobCandidateInfo();
            return responseEntity;
        } catch (Exception e) {
            throw new JobCandidateInfoNotFoundException();
        }
    }

}
