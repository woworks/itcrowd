package com.woworks.itcrowd.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.woworks.itcrowd.domain.User;

@Repository
public interface UsersRepository extends MongoRepository<User, ObjectId> {
}
