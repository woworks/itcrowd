package com.woworks.itcrowd.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document(collection="posts")
public class Post {
    @Id
    private ObjectId id;

    @NotBlank
    @Size(max=255)
    @Indexed(unique=true)
    @Field("title")
    private String title;

    @NotBlank
    @Field("body")
    private String body;

    @NotBlank
    @Field("createdDate")
    @CreatedDate
    private LocalDate createdDate;

    @NotBlank
    @Field("modifiedDate")
    @LastModifiedDate
    private LocalDate modifiedDate;

    @NotBlank
    @Size(max=100)
    @Field("authorName")
    private String authorName;

    @NotBlank
    @Size(max=100)
    @Field("authorUsername")
    private String authorUsername;

    @Field("categories")
    private List<String> categories;

    @Field("tags")
    private List<String> tags;

    @Field("views")
    private Long views;

    // user ids voted up
    @Field("upVotes")
    private List<ObjectId> upVotes;

    //user ids voted down
    @Field("downVotes")
    private List<ObjectId> downVotes;


    @Field("comments")
    private List<Comment> comments = new ArrayList<>();



}