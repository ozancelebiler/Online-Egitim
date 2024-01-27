package org.ozanc.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;


@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
@Data

public class BaseEntity {

    private Long createDate;

    private Long updateDate;



}
