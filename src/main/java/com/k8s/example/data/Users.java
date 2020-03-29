package com.k8s.example.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Users {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
}
