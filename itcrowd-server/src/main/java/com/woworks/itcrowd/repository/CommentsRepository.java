package com.woworks.itcrowd.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.woworks.itcrowd.domain.Comment;

@Repository
public interface CommentsRepository extends MongoRepository<Comment, ObjectId> {

}
