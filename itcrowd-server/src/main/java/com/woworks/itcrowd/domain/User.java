package com.woworks.itcrowd.domain;


import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Document(collection="users")
@Getter
@Setter
public class User {

    @Id
    private ObjectId id;

    @Field("username")
    private String username;

    @Field("password")
    private String password;

    @NotBlank
    @Field("createdDate")
    @CreatedDate
    private LocalDate createdDate;

    @NotBlank
    @Field("modifiedDate")
    @LastModifiedDate
    private LocalDate modifiedDate;

    @Field("fullName")
    private String fullName;

    @Field("avatar")
    private String avatar;

}
