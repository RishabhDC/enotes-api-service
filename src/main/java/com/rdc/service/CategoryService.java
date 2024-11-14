package com.rdc.service;

import java.util.List;

import com.rdc.entity.Category;

public interface CategoryService {
	
	public Boolean saveCategory(Category category);
	
	public List<Category> getAllCategory();

}
