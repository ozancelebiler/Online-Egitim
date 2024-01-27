package com.ozanc.repository.entity;


import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Document // mongodb tarafında maping işlemi için
public class Course extends  BaseEntity{

    @Id
    private String id;

    private String title;

    private String description;

    private Double price;

    private Long instuctorId; //userserviceden gelen id user  // mictoserviste postgresql kullanılmaktadır.

    private List<Long> students; // userserviceden gelen öğrenci idleri  //user mictoserviste postgresql kullanılmaktadır.

    private  List<String> lessons; // lesson microservisindem gelen idler (lesson microservisinde mongodb kullanıılmakddır.







}
