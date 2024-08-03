package com.akshat.SpringBoot_Rest;

import com.akshat.SpringBoot_Rest.model.JobPost;
import com.akshat.SpringBoot_Rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//The @RestController annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.
//The @Controller annotation tells a controller that the object returned is a view name, not the object itself.
//@Controller

//The @CrossOrigin annotation is used to handle the Cross-Origin Resource Sharing (CORS) in Spring Boot.
//CORS is a security feature that prevents unauthorized access to resources on a server.
// It is a security feature that allows restricting resources on a web page to be requested from another domain outside the domain from which the resource originated.
//By default, it is disabled, and it is only enabled once we add the annotation to the main Spring Boot Application file or the Controller file.
@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class RestJobController {

    @Autowired
    private JobService service;


    @GetMapping(path = "jobPosts", produces = "application/json")
    //produces = "application/json" is used to specify the type of response that the method will return.
//    @ResponseBody
    //The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.
    //It can be ignored if we use the @RestController annotation.
    public List<JobPost> getAllJobs() {
        return service.getALlJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        //The @PathVariable annotation is used to extract the values of the template variables and match them with the method parameters.
        return service.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        //The @RequestBody annotation is used to bind the HTTP request/response body with a domain object in a method parameter or return type.
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId) {
        service.deleteJob(postId);
        return "Job Post Deleted with ID: " + postId;
    }

    @GetMapping("load")
    public String load() {
        service.load();
        return "Data Loaded";
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword) {
        return service.searchByKeyword(keyword);
    }
}
