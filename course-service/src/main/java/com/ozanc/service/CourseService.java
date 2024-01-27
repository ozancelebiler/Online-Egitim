package com.ozanc.service;


import com.ozanc.dto.request.NewCourseCreateRequestDto;
import com.ozanc.manager.IUserManager;
import com.ozanc.mapper.ICourseMapper;
import com.ozanc.repository.ICourseRepository;
import com.ozanc.repository.entity.Course;
import com.ozanc.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CourseService  extends ServiceManager<Course, String> {

    private final ICourseRepository courseRepository;

    private final IUserManager userManager;

    public CourseService(ICourseRepository courseRepository, IUserManager userManager) {
        super(courseRepository);
        this.courseRepository = courseRepository;
        this.userManager = userManager;
    }


    public Course create(NewCourseCreateRequestDto dto) {
        Course course = ICourseMapper.INSTANCE.toCourse(dto);
        boolean kontrol= userManager.isTeacher(dto.getInstuctorId()).getBody();



        if (kontrol){
            return save(course);
        }
        else {
            throw new RuntimeException("Yetkisiz kullanıcı");
        }




    }





}
