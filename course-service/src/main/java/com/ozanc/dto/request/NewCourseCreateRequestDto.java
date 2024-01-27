package com.ozanc.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class NewCourseCreateRequestDto {

    private String title;

    private String description;

    private Double price;

    private Long instuctorId;






}
