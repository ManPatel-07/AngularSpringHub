package org.mm.service;

import java.util.List;

import org.mm.entities.CourseEntity;
import org.mm.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
	}
}
