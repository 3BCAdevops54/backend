package com.example.jobtracker.service;

import com.example.jobtracker.model.JobApplication;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for job application operations.
 */
public interface JobApplicationService {

    JobApplication createJob(JobApplication job);

    List<JobApplication> getAllJobs();

    Optional<JobApplication> getJobById(Long id);

    JobApplication updateJob(Long id, JobApplication job);

    void deleteJob(Long id);
}
