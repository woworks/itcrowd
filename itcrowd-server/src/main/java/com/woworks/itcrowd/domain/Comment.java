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

}
