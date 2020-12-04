package com.test.practice.db;

import java.util.List;

import com.test.practice.model.Fee;

public interface FeeDao {
	public void addFee(Fee f);
	public List<Fee> getAllFee();
	public Fee getById(long id);
	
	

}
