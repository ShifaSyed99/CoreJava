package com.abc.h2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.h2.entity.Job;
import com.abc.h2.exception.ResourceNotFoundException;
import com.abc.h2.repository.JobRepository;

import jakarta.transaction.Transactional;

@Service

@Transactional

public class JobService {
	
	@Autowired
	
	private JobRepository repo;
	
	public Job saveJob(Job job) {
		
		return repo.save(job);
	}
	
	public List<Job> getJobs() {
		
		return repo.findAll();
	}

	public Job updateJob(Job job) throws ResourceNotFoundException {
	
	Optional<Job> job_new = repo.findById(job.getId());
	
	if(!job_new.isPresent()) {
		
		throw new ResourceNotFoundException("Resource Not Found Exception");
	}
	else
	{
		Job job2 = job_new.get();
		job2.setJobDescription(job.getJobDescription());
		job2.setId(job.getId());
		job2.setJobLocation(job.getJobLocation());
		job2.setJobName(job.getJobName());
		job2.setJobType(job.getJobType());
		repo.save(job2);
		return job2;
	}
	
}
	
	public Job getJobById(long id) throws ResourceNotFoundException {
		
		Optional<Job> job_new = repo.findById(id);
		if(!job_new.isPresent()) {
			
			throw new ResourceNotFoundException("Resource Not Found Exception");
		}
		else
		{
			return job_new.get();
		}
	}
	
	public void deleteJobById(long id) throws ResourceNotFoundException {
		
		Optional<Job> job_new = repo.findById(id);
		if(!job_new.isPresent()) {
			
			throw new ResourceNotFoundException("Resource Not Found Exception");
		}
		else
		{
			repo.delete(job_new.get());
		}
	}
	
	public void deleteJob(long id) throws ResourceNotFoundException {
		
		Optional<Job> job_new = repo.findById(id);
		if(!job_new.isPresent()) {
			
			throw new ResourceNotFoundException("Resource Not Found Exception");
		}
		else
		{
			repo.delete(job_new.get());
		}
	}
	
}
