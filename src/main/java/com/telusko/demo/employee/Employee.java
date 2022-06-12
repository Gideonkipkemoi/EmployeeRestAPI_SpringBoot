package com.telusko.demo.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.*;


@Entity
@Table(name = "employee")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Employee {

	@Id
	private long id;
	private String first_name;
	private String last_name;
	private String email;
}
