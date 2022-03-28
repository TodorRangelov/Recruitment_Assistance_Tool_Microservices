package com.melon.JobCandidateInfo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.melon.JobCandidateInfo.domain.entity.JobCandidateInfo;
import com.melon.JobCandidateInfo.domain.responseDto.JobCandidateInfoRequestDto;
import com.melon.JobCandidateInfo.exception.AddJobCandidateInfoException;
import com.melon.JobCandidateInfo.exception.JobCandidateInfoNotFoundException;
import com.melon.JobCandidateInfo.repository.JobCandidateInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobCandidateInfoServiceImpl implements JobCandidateInfoService {

    private final JobCandidateInfoRepository repository;
    public final ObjectMapper objectMapper;

    @Autowired
    public JobCandidateInfoServiceImpl(JobCandidateInfoRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void addJobCandidateInfo(JobCandidateInfoRequestDto requestDto) {

        try {
            JobCandidateInfo jobCandidateInfo = this.objectMapper.convertValue(requestDto, JobCandidateInfo.class);
            this.repository.save(jobCandidateInfo);
        } catch (Exception e) {
            throw new AddJobCandidateInfoException();
        }
    }

    @Override
    public List<JobCandidateInfo> getAll() {

        try {
            List<JobCandidateInfo> allJobCandidateInfo = this.repository.findAll();
            if (allJobCandidateInfo.isEmpty()) {
                throw new JobCandidateInfoNotFoundException();
            }
            return allJobCandidateInfo;
        } catch (Exception e) {
            throw new JobCandidateInfoNotFoundException();
        }
    }

    @Override
    public JobCandidateInfo getById(long id) {

        JobCandidateInfo jobCandidateInfo = this.repository.findById(id)
                .orElseThrow(() -> new JobCandidateInfoNotFoundException(id));
        return jobCandidateInfo;
    }
}
