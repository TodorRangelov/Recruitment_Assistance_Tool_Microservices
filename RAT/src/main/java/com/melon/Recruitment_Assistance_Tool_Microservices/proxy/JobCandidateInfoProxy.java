package com.melon.Recruitment_Assistance_Tool_Microservices.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name ="Job-Candidate-Info")
public interface JobCandidateInfoProxy {

    @PostMapping("/ms/v1/add")
    public ResponseEntity<Object> addJobCandidateInfo(@RequestBody Object requestObject);

    @GetMapping("/ms/v1/get/{id}")
    public ResponseEntity<Object> getJobCandidateInfoById(@PathVariable long id);

    @GetMapping("/ms/v1/get")
    public ResponseEntity<Object> getAllJobCandidateInfo();
}
