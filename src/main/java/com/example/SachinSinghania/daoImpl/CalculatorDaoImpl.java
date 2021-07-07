package com.example.SachinSinghania.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Component;

import com.example.SachinSinghania.dao.CalculatorDao;
import com.example.SachinSinghania.entiry.CalculatorEntity;
import com.example.SachinSinghania.repository.CalculatorRepo;

@Component
public class CalculatorDaoImpl implements CalculatorDao {
	
	@Autowired
	CalculatorRepo repo;

	@Override
	public int addNum(int num1, int num2) {
		CalculatorEntity cal = new CalculatorEntity();
		cal.setResult(num1+num2);
		repo.save(cal);
		return num1+num2;
	}

	@Override
	public int addSub(int num1, int num2) {
		CalculatorEntity cal = new CalculatorEntity();
		cal.setResult(num1-num2);
		repo.save(cal);
		return num1-num2;
	}

	@Override
	public float divNum(int num1, int num2) {
		CalculatorEntity cal = new CalculatorEntity();
		float data = 0;
		try {
			if(num2 !=0) {
				 data = num1/num2;
				 cal.setResult(data);
				 repo.save(cal);
			}
		}
		catch (ArithmeticException ex) {
			ex.printStackTrace();
		}
		return data;
	}

	@Override
	public int mulNum(int num1, int num2) {
		CalculatorEntity cal = new CalculatorEntity();
		cal.setResult(num1*num2);
		repo.save(cal);
		return num1*num2;
	}

	@Override
	public List<CalculatorEntity> findAllData() {
		List<CalculatorEntity> data = new ArrayList<>();
		try {
			data = repo.findAll();
		}
		catch (JpaSystemException e) {
			e.printStackTrace();
		}
		return data;
	}

}
