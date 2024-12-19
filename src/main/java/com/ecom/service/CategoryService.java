package com.ecom.service;

import java.util.List;

import com.ecom.model.Category;
import org.springframework.stereotype.Service;

public interface CategoryService {
	public Boolean existCategory(String name);
	
	public Category saveCategory(Category category);
	
	public List<Category> getAllCategory();

	public Boolean deleteCategory(int id);

	public Category getCategoryById(int id);

	public List<Category> getAllActiveCatgory();
}
