package com.akshat.SpringBoot_Rest.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Entity
public class JobPost {

    @Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
//    @ElementCollection
    // ElementCollection is used to store multiple values in a single column of a table.
    private List<String> postTechStack;
}