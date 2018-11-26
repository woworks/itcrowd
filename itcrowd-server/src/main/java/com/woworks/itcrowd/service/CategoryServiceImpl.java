package com.woworks.itcrowd.service;

import com.woworks.itcrowd.domain.Category;
import com.woworks.itcrowd.repository.CategoriesRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoriesRepository categoriesRepository;

    public CategoryServiceImpl(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    public List<Category> getAll() {
        return this.categoriesRepository.findAll(new Sort(Sort.Direction.ASC, "name"));
    }

    @Override
    public Category save(Category post) {
        return null;
    }
}
