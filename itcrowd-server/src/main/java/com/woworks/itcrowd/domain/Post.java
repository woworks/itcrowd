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

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorUsername() {
        return authorUsername;
    }

    public void setAuthorUsername(String authorUsername) {
        this.authorUsername = authorUsername;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public List<ObjectId> getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(List<ObjectId> upVotes) {
        this.upVotes = upVotes;
    }

    public List<ObjectId> getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(List<ObjectId> downVotes) {
        this.downVotes = downVotes;
    }
}
