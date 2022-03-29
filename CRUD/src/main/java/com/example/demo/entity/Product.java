package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="PRODUCT_TBL")

public class Product {
	@Id
	@GeneratedValue
	private int Id;
	private String name;
	private int quantity;
	private double price;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
