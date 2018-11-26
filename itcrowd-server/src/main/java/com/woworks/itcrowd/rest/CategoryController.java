package com.woworks.itcrowd.rest;

import com.woworks.itcrowd.domain.Category;
import com.woworks.itcrowd.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("api/categories")
    public List<Category> listCategories() {
         return categoryService.getAll();
    }

}
