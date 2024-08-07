package com.akshat.SpringBoot_Rest.repo;

import com.akshat.SpringBoot_Rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {


	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);

}


/*List<JobPost> jobs = new ArrayList<>(Arrays.asList(
		new JobPost(1, "Java Developer", "Java Developer with 5 years of experience", 5, Arrays.asList("Java", "Spring", "Hibernate")),
		new JobPost(2, "Python Developer", "Python Developer with 3 years of experience", 3, Arrays.asList("Python", "Django", "Flask")),
		new JobPost(3, "React Developer", "React Developer with 2 years of experience", 2, Arrays.asList("React", "Redux", "Javascript")),
		new JobPost(4, "Angular Developer", "Angular Developer with 4 years of experience", 4, Arrays.asList("Angular", "Typescript", "Javascript")),
		new JobPost(5, "Node Developer", "Node Developer with 3 years of experience", 3, Arrays.asList("Node", "Express", "Javascript"))
));

public List<JobPost> getAllJobs() {
	return jobs;
}

public void addJob(JobPost job) {
	jobs.add(job);
	System.out.println(jobs);
}

public JobPost getJob(int i) {
	return jobs.get(i-1
	);
}

public void updateJob(JobPost jobPost, int postId) {
	for (int i = 0; i < jobs.size(); i++) {
		JobPost job = jobs.get(i);
		if (job.getPostId() == postId) {
			jobs.set(i, jobPost);
			return;
		}
	}
}

public void deleteJob(int postId) {
	jobs.removeIf(t -> t.getPostId() == postId);
}*/
