package com.rdc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdc.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
