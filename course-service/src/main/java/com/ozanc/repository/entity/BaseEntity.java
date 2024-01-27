package com.ozanc.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;




@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data

public class BaseEntity {

    private Long createDate;

    private Long updateDate;



}
