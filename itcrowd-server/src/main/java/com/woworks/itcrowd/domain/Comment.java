package com.woworks.itcrowd.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Document(collection="comments")
public class Comment {

    @Id
    private ObjectId id;

    @Field("postId")
    private ObjectId postId;

    @Field("parentId")
    private ObjectId parentId;

    @NotBlank
    @Size(max=100)
    @Field("authorName")
    private String authorName;

    @NotBlank
    @Size(max=100)
    @Field("authorUsername")
    private String authorUsername;

    @Field("text")
    private String text;

    @NotBlank
    @Field("createdDate")
    @CreatedDate
    private LocalDate createdDate;

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

    public ObjectId getPostId() {
        return postId;
    }

    public void setPostId(ObjectId postId) {
        this.postId = postId;
    }

    public ObjectId getParentId() {
        return parentId;
    }

    public void setParentId(ObjectId parentId) {
        this.parentId = parentId;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
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
