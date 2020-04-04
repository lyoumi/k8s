package com.k8s.example.data;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Genre {

    @Id
    private String id = UUID.randomUUID().toString();

    @Column(name = "name")
    private String name;
}
