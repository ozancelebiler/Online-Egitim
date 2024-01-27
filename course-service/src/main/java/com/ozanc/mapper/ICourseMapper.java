package com.ozanc.mapper;


import com.ozanc.dto.request.NewCourseCreateRequestDto;
import com.ozanc.repository.entity.Course;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
// eşleşmeyen değerleri ignore et görmezden gel. spring componenetmodelde
public interface ICourseMapper {


    ICourseMapper INSTANCE = Mappers.getMapper(ICourseMapper.class);

 Course toCourse(final NewCourseCreateRequestDto dto);








}
