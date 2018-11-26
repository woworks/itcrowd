package com.woworks.itcrowd.service;

import com.woworks.itcrowd.domain.Category;
import com.woworks.itcrowd.domain.Post;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> getAll();

    Category save(Category post);

}
