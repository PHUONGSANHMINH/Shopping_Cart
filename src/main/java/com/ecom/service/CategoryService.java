package com.ecom.service;

import java.util.List;

import com.ecom.model.Category;

public interface CategoryService {
	public Boolean existCategory(String name);
	
	public Category saveCategory(Category category);
	
	public List<Category> getAllCateGory();
}
