package com.melon.JobCandidateInfo.service;

import com.melon.JobCandidateInfo.domain.entity.JobCandidateInfo;
import com.melon.JobCandidateInfo.domain.responseDto.JobCandidateInfoRequestDto;

import java.util.List;

public interface JobCandidateInfoService {

    void addJobCandidateInfo(JobCandidateInfoRequestDto requestDto);
    List<JobCandidateInfo> getAll();
    JobCandidateInfo getById(long id);
}
