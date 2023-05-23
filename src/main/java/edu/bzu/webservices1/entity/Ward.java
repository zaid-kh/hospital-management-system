package edu.bzu.webservices1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ward entity.
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
public class Ward {
    @Id
    private int id;
    private String name;
    private int capacity;
    private String type; // ICU, normal
    private int bedsCount;  // number of beds in the ward (occupied + available)
}
