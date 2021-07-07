package com.example.SachinSinghania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SachinSinghania.entiry.CalculatorEntity;

@Repository
public interface CalculatorRepo extends JpaRepository<CalculatorEntity, Integer> {

}
