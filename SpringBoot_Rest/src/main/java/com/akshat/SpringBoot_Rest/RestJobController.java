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
//By default, it is disabled, and it is only enabled once we add the annotation to the main Spring Boot Application file or the Controller file.
@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class RestJobController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
//    @ResponseBody
    //The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.
    public List<JobPost> getAllJobs() {
        return service.getALlJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        //The @PathVariable annotation is used to extract the values of the template variables and match them with the method parameters.
        return service.getJob(postId);
    }

}
