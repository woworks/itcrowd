package com.woworks.itcrowd.repository;

import com.woworks.itcrowd.domain.Category;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends MongoRepository<Category, ObjectId> {
}
