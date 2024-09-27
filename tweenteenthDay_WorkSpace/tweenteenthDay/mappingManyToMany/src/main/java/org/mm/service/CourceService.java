package org.mm.service;

import java.util.List;

import org.mm.entities.CourseEntity;
import org.mm.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourceService
{
	@Autowired
	private CourseRepo courseRepo;
	
	public CourseEntity saveCourse(CourseEntity courseEntity)
	{
		return courseRepo.save(courseEntity);
	}
	
	public List<CourseEntity> getAllCourse()
	{
		return courseRepo.findAll();
	}
}
