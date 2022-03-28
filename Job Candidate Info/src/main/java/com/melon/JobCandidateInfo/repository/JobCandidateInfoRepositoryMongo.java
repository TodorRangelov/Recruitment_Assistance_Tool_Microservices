package com.melon.JobCandidateInfo.repository;

import com.melon.JobCandidateInfo.domain.document.JobCandidateInfoDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobCandidateInfoRepositoryMongo extends MongoRepository<JobCandidateInfoDocument, String> {

}
