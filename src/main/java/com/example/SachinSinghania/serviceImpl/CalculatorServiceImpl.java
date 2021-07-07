package com.example.SachinSinghania.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SachinSinghania.dao.CalculatorDao;
import com.example.SachinSinghania.entiry.CalculatorEntity;
import com.example.SachinSinghania.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
	
	@Autowired
	CalculatorDao calDao;

	@Override
	public int addNum(int num1, int num2) {
		int res = calDao.addNum(num1, num2);
		return res;
	}

	@Override
	public int subNum(int num1, int num2) {
		int res = calDao.addSub(num1, num2);
		return res;
	}

	@Override
	public float divNum(int num1, int num2) {
		float res = calDao.divNum(num1, num2);
		return res;
	}

	@Override
	public int mulNum(int num1, int num2) {
		int res = calDao.mulNum(num1, num2);
		return res;
	}

	@Override
	public List<CalculatorEntity> findAllData() {
		List<CalculatorEntity> data = calDao.findAllData();
		return data;
	}

}
