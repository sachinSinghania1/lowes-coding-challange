package com.example.SachinSinghania.service;

import java.util.List;

import com.example.SachinSinghania.entiry.CalculatorEntity;

public interface CalculatorService {

	int addNum(int num1, int num2);

	int subNum(int num1, int num2);

	float divNum(int num1, int num2);

	int mulNum(int num1, int num2);

	List<CalculatorEntity> findAllData();

}
