package com.rdc.service;

import java.util.List;

import com.rdc.dto.CategoryDto;
import com.rdc.dto.CategoryResponse;
import com.rdc.entity.Category;

public interface CategoryService {
	
	public Boolean saveCategory(CategoryDto categoryDto);
	
	public List<CategoryDto> getAllCategory();

	public List<CategoryResponse> getActiveCategory();

	public CategoryDto getCategoryById(Integer id);

	public Boolean deleteCategory(Integer id);
}
