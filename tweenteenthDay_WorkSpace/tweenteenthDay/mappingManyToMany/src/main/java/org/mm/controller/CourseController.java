package org.mm.controller;

import java.util.List;

import org.mm.entities.CourseEntity;
import org.mm.service.CourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/course")
public class CourseController
{
	@Autowired
	private CourceService courseService;
	
	@PostMapping(path = "/save")
	public CourseEntity saveCourse(@RequestBody CourseEntity courseEntity)
	{
		return courseService.saveCourse(courseEntity);
	}
	
	@GetMapping(path = "/getAll")
	public List<CourseEntity> getAllCourse()
	{
		return courseService.getAllCourse();
	}
}
