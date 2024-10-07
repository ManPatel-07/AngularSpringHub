package org.mm.controller;

import java.util.List;

import org.mm.entities.CourseEntity;
import org.mm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/course")
public class CourseController
{
	@Autowired
	private CourseService courseService;
	
	@PostMapping(path = "/save")
	public CourseEntity saveCourse(@RequestBody CourseEntity courseEntity)
	{
		return courseService.saveCourse(courseEntity);
	}
	
	@GetMapping(path = "/getAll")
	public List<CourseEntity> findAllCourse()
	{
		return courseService.getAllCourse();
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public void deleteCourseById(@PathVariable("id") Long id)
	{
		courseService.deleteCourseById(id);
	}
}
