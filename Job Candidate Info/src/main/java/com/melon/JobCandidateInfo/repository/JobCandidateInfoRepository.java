package com.melon.JobCandidateInfo.repository;

import com.melon.JobCandidateInfo.domain.entity.JobCandidateInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobCandidateInfoRepository extends JpaRepository<JobCandidateInfo, Long> {

    JobCandidateInfo findByEmail(String email);
}
