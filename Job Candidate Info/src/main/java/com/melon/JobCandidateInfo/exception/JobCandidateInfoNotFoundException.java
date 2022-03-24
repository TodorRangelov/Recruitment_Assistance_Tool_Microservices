package com.melon.JobCandidateInfo.exception;

public class JobCandidateInfoNotFoundException extends RuntimeException {

    private long jobCandidateInfoId;

    public JobCandidateInfoNotFoundException() {
    }

    public JobCandidateInfoNotFoundException(long jobCandidateInfoId) {
        this.jobCandidateInfoId = jobCandidateInfoId;
    }

    public long getJobCandidateInfoId() {
        return jobCandidateInfoId;
    }

    public void setJobCandidateInfoId(long jobCandidateInfoId) {
        this.jobCandidateInfoId = jobCandidateInfoId;
    }
}
