package org.mm.service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.mm.entities.CourseEntity;
import org.mm.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Service;

@Service
public class CourseService 
{
	@Autowired
	private CourseRepository courseRepo;
	
	public CourseEntity saveCourse(CourseEntity courseEntity)
	{
		return courseRepo.save(courseEntity);
	}
	
	public List<CourseEntity> getAllCourse()
	{
		return courseRepo.findAll();
	}
	
	public void deleteCourseById(Long id)
	{
		courseRepo.deleteById(id);
		CourseEntity courseEntity = courseRepo.findById(id).orElseThrow();
		
        courseEntity.getStudents()
        			.forEach(student -> student.getCourses().remove(courseEntity));
        
        courseEntity.getStudents().clear();
        
        courseRepo.deleteById(id);
	}

	public CourseEntity getCourseById(Long id)
	{
		return courseRepo.findById(id).orElseThrow();
	}
	
    public CourseEntity updateCourseFields(Long courseId, Map<String, Object> updates) {
    	
        boolean exists = courseRepo.existsById(courseId);
        
        if (!exists) return null;

        CourseEntity courseEntity = courseRepo.findById(courseId).get();
    
            updates.forEach((field, value) -> {
                if (!field.equals("students")) {
                    Field fieldToBeUpdated = ReflectionUtils.findRequiredField(CourseEntity.class, field);
                    fieldToBeUpdated.setAccessible(true);
                    ReflectionUtils.setField(fieldToBeUpdated, courseEntity, value);
                }
            });

         return courseRepo.save(courseEntity);
    }
}
