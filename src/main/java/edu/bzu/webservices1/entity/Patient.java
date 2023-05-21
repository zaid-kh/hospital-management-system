package edu.bzu.webservices1.entity;

import edu.bzu.webservices1.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Patient entity.
 * <p>
 * An entity in JPA represents a table stored in a database.
 * <p>
 * Author: Zaid Khamis
 */


@Data
//Generates getters for all fields, a useful toString method, and hashCode and equals implementations that check all non-transient fields

@AllArgsConstructor   //automatically generates a constructor with a parameter for each field in your class
@NoArgsConstructor     // generates a constructor with no parameter

@Entity                 // specifies that the class is an entity and is mapped to a database table
@Table
public class Patient implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String department;
    /**
     * 1-5 (1 is the highest priority)
     **/
    private int priority;
}