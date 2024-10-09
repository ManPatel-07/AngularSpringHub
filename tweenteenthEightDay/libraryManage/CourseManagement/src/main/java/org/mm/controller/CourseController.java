package org.mm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mm.entities.CourseEntity;
import org.mm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping(path = "/getById/{id}")
	public CourseEntity getByIdCourse(@PathVariable("id") Long id)
	{
		return courseService.getCourseById(id);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<Map<String, String>> deleteCourseById(@PathVariable("id") Long id)
	{
		courseService.deleteCourseById(id);
		Map<String, String> response = new HashMap<>();
		response.put("message", "Data Deleted ...");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PutMapping(path = "/updateById/{id}")
	public CourseEntity updateCourseById(@RequestBody CourseEntity courseEntity,
										@PathVariable("id") Long id)
	{
		String courseName = courseEntity.getCourseName();
		String description = courseEntity.getDescription();
		
		Map<String, Object> updates = new HashMap<>();
		updates.put("courseName", courseName);
		updates.put("description", description);
		
		return courseService.updateCourseFields(id, updates);
	}
	
}
