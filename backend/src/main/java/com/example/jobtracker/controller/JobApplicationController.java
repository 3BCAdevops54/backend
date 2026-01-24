package com.example.jobtracker.controller;

import com.example.jobtracker.model.JobApplication;
import com.example.jobtracker.service.JobApplicationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for job application operations.
 */
@RestController
@RequestMapping("/jobs")
@CrossOrigin(origins = "*") // allow all origins for local development (adjust for production)
public class JobApplicationController {

    private final JobApplicationService service;

    public JobApplicationController(JobApplicationService service) {
        this.service = service;
    }

    // Create a new job application
    @PostMapping
    public ResponseEntity<JobApplication> createJob(@RequestBody JobApplication job) {
        JobApplication created = service.createJob(job);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    // Get all job applications
    @GetMapping
    public ResponseEntity<List<JobApplication>> getAllJobs() {
        List<JobApplication> list = service.getAllJobs();
        return ResponseEntity.ok(list);
    }

    // Get job by id
    @GetMapping("/{id}")
    public ResponseEntity<JobApplication> getJobById(@PathVariable Long id) {
        return service.getJobById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update job by id
    @PutMapping("/{id}")
    public ResponseEntity<JobApplication> updateJob(@PathVariable Long id, @RequestBody JobApplication job) {
        try {
            JobApplication updated = service.updateJob(id, job);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete job by id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJob(@PathVariable Long id) {
        service.deleteJob(id);
        return ResponseEntity.noContent().build();
    }
}
