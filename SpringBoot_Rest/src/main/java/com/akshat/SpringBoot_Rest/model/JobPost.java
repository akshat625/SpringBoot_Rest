package com.akshat.SpringBoot_Rest.model;

import java.util.List;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a job post in the system.
 * This class is a data model for job posts and includes various attributes
 * related to a job post such as post ID, profile, description, required experience,
 * and technology stack.
 *
 * Annotations:
 * - @Data: Generates getters, setters, toString, equals, and hashCode methods.
 * - @NoArgsConstructor: Generates a no-argument constructor.
 * - @AllArgsConstructor: Generates a constructor with all fields as parameters.
 * - @Component: Marks this class as a Spring component.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {

    /** The unique identifier for the job post. */
    private int postId;

    /** The profile or title of the job post. */
    private String postProfile;

    /** A brief description of the job post. */
    private String postDesc;

    /** The required experience for the job post. */
    private Integer reqExperience;

    /** The list of technologies required for the job post. */
    private List<String> postTechStack;
}