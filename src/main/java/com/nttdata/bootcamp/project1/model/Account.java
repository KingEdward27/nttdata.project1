package com.nttdata.bootcamp.project1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
@Document
public class Account {
	@Id
	private int id;
	private String name;
	private Product product;
}
