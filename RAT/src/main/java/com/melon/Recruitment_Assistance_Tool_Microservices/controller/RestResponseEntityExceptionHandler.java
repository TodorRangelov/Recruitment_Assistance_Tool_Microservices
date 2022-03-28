package com.melon.Recruitment_Assistance_Tool_Microservices.controller;

import com.melon.Recruitment_Assistance_Tool_Microservices.exception.AddJobCandidateInfoException;
import com.melon.Recruitment_Assistance_Tool_Microservices.exception.JobCandidateInfoNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {

    private static final String NOT_FOUND_BY_ID_EXCEPTION_MESSAGE =
            "There was not found Job Candidate Info with id: '%s'.";
    private static final String NOT_FOUND_ANY_JOB_CANDIDATE_INFO_EXCEPTION_MESSAGE =
            "There ware not found any Job Candidate Info.";
    private static final String ADD_EXCEPTION_MESSAGE = "The Job Candidate Info hasn't add to the database!";

    @ExceptionHandler(value = {JobCandidateInfoNotFoundException.class})
    public ResponseEntity<String> handleJobCandidateInfoNotFoundException(RuntimeException ex) {

        JobCandidateInfoNotFoundException exception = (JobCandidateInfoNotFoundException) ex;

        if (exception.getJobCandidateInfoId() == 0) {
            return new ResponseEntity<>(NOT_FOUND_ANY_JOB_CANDIDATE_INFO_EXCEPTION_MESSAGE, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(String.format(NOT_FOUND_BY_ID_EXCEPTION_MESSAGE,
                exception.getJobCandidateInfoId()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {AddJobCandidateInfoException.class})
    public ResponseEntity<String> handleAddJobCandidateInfoException(RuntimeException ex) {

        AddJobCandidateInfoException exception = (AddJobCandidateInfoException) ex;
        return new ResponseEntity<>(ADD_EXCEPTION_MESSAGE, HttpStatus.NOT_MODIFIED);
    }

}
