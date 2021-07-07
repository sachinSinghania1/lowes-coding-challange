package com.example.SachinSinghania.dao;

import java.util.List;

import com.example.SachinSinghania.entiry.CalculatorEntity;

public interface CalculatorDao {

	int addNum(int num1, int num2);

	int addSub(int num1, int num2);

	float divNum(int num1, int num2);

	int mulNum(int num1, int num2);

	List<CalculatorEntity> findAllData();

}
