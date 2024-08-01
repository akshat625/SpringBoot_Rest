package com.akshat.SpringBoot_Rest.service;

import com.akshat.SpringBoot_Rest.model.JobPost;
import com.akshat.SpringBoot_Rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

	@Autowired
	private JobRepo repo;

	public void addJob(JobPost jobPost) {
		repo.addJob(jobPost);
	}

	public List<JobPost> getALlJobs() {
		return repo.getAllJobs();
	}

	public JobPost getJob(int i) {
		return repo.getJob(i);
	}

	public void updateJob(JobPost jobPost, int postId) {
		repo.updateJob(jobPost, postId);
	}

	public void deleteJob(int postId) {
		repo.deleteJob(postId);
	}
}
