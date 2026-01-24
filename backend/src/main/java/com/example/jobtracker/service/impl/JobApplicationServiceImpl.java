package com.example.jobtracker.service.impl;

import com.example.jobtracker.model.JobApplication;
import com.example.jobtracker.repository.JobApplicationRepository;
import com.example.jobtracker.service.JobApplicationService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Implementation of JobApplicationService.
 */
@Service
public class JobApplicationServiceImpl implements JobApplicationService {

    private final JobApplicationRepository repository;

    public JobApplicationServiceImpl(JobApplicationRepository repository) {
        this.repository = repository;
    }

    @Override
    public JobApplication createJob(JobApplication job) {
        // default application date to today if not provided
        if (job.getApplicationDate() == null) {
            job.setApplicationDate(LocalDate.now());
        }
        // basic status default
        if (job.getStatus() == null || job.getStatus().isBlank()) {
            job.setStatus("APPLIED");
        }
        return repository.save(job);
    }

    @Override
    public List<JobApplication> getAllJobs() {
        return repository.findAll();
    }

    @Override
    public Optional<JobApplication> getJobById(Long id) {
        return repository.findById(id);
    }

    @Override
    public JobApplication updateJob(Long id, JobApplication job) {
        return repository.findById(id).map(existing -> {
            existing.setCompanyName(job.getCompanyName());
            existing.setJobTitle(job.getJobTitle());
            existing.setApplicationDate(job.getApplicationDate() != null ? job.getApplicationDate() : existing.getApplicationDate());
            existing.setStatus(job.getStatus() != null ? job.getStatus() : existing.getStatus());
            existing.setLocation(job.getLocation());
            existing.setNotes(job.getNotes());
            return repository.save(existing);
        }).orElseThrow(() -> new RuntimeException("Job application not found with id: " + id));
    }

    @Override
    public void deleteJob(Long id) {
        repository.deleteById(id);
    }
}
