package edu.bzu.webservices1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Doctor entity.
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
public class Doctor implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String specialization;
    private String department;
    private long patients; // changed to number of patients for now,, could be changed to list of patients using TypeConverter
}