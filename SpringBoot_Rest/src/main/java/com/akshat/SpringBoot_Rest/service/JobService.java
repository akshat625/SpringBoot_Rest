package com.akshat.SpringBoot_Rest.service;

import com.akshat.SpringBoot_Rest.model.JobPost;
import com.akshat.SpringBoot_Rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {



	@Autowired
	private JobRepo repo;

	public void addJob(JobPost jobPost) {
//		repo.addJob(jobPost);
		repo.save(jobPost);
	}

	public List<JobPost> getALlJobs() {
//		return repo.getAllJobs();
		return repo.findAll();
	}

	public JobPost getJob(int postId) {
//		return repo.getJob(postId);
		return repo.findById(postId).orElse(new JobPost());
	}

	public void updateJob(JobPost jobPost) {
//		repo.updateJob(jobPost, postId);
		repo.save(jobPost);
	}

	public void deleteJob(int postId) {
//		repo.deleteJob(postId);
		repo.deleteById(postId);
	}

	public void load() {
		List<JobPost> jobs = new ArrayList<>(Arrays.asList(
				new JobPost(1, "Java Developer", "Java Developer with 5 years of experience", 5, Arrays.asList("Java", "Spring", "Hibernate")),
				new JobPost(2, "Python Developer", "Python Developer with 3 years of experience", 3, Arrays.asList("Python", "Django", "Flask")),
				new JobPost(3, "React Developer", "React Developer with 2 years of experience", 2, Arrays.asList("React", "Redux", "Javascript")),
				new JobPost(4, "Angular Developer", "Angular Developer with 4 years of experience", 4, Arrays.asList("Angular", "Typescript", "Javascript")),
				new JobPost(5, "Node Developer", "Node Developer with 3 years of experience", 3, Arrays.asList("Node", "Express", "Javascript"))
		));

		repo.saveAll(jobs);
	}

	public List<JobPost> searchByKeyword(String keyword) {
		return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
	}
}
