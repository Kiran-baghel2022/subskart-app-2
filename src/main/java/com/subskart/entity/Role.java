package com.subskart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Role {
	@Id
    @GeneratedValue
    private long id;

    @Column(length = 60)
    private String name;
}