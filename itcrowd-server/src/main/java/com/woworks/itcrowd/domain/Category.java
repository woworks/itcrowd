package com.woworks.itcrowd.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Document(collection="categories")
@Getter
@Setter
public class Category {

    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;

    @NotBlank
    @Indexed(unique=true)
    @Size(max=30)
    @Field("code")
    private String code;

    @NotBlank
    @Size(max=100)
    @Indexed
    @Field("name")
    private String name;

    @Size(max=255)
    @Field("description")
    private String description;
}
