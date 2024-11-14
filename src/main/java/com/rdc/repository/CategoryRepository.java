package com.rdc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdc.entity.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> findByIsActiveTrueAndIsDeletedFalse();

}
