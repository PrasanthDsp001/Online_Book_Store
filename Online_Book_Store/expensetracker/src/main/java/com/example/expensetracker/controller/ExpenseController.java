package com.example.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.service.ExpenseService;

@RestController
@RequestMapping("/api/v1")
public class ExpenseController {
	
	@Autowired
	private ExpenseService service;
	
	@GetMapping("/expenses")
	public ResponseEntity<List<Expense>> get()
	{
		
		List<Expense> expenses=service.findAll();
		return new ResponseEntity<List<Expense>>(expenses,HttpStatus.OK) ;
		
	}

}
