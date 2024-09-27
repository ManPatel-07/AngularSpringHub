package org.mm.controller;

import java.util.List;
import java.util.Set;

import org.mm.entities.CourseEntity;
import org.mm.entities.StudentEntity;
import org.mm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	@GetMapping(path = "/getAll")
	public List<StudentEntity> getAllStudent()
	{
		return studentService.getAllStudents();
	}
	
	@PostMapping(path = "/save")
	public StudentEntity addStudent(@RequestBody StudentEntity studentEntity)
	{
		return studentService.addStudent(studentEntity);
	}
	
    @PostMapping("/{studentId}/studentInCourse")
    public StudentEntity enrollStudentInCourses(@PathVariable Long studentId,
    									@RequestBody Set<CourseEntity> courses) 
    {
        return studentService.enrollStudentInCourse(studentId, courses);
    }
	
    @GetMapping("/{studentId}/coursesByStudent")
    public Set<CourseEntity> getCoursesByStudent(@PathVariable Long studentId) {
        return studentService.getCoursesByStudent(studentId);
    }
    
    @PutMapping(path = "/{studentId}/courseTostudent/{courseId1}/{courseId2}")
    public StudentEntity setCourseToStudent(@PathVariable("studentId") Long studentId,
    										@PathVariable("courseId1") Long courseId1,
    										@PathVariable("courseId2") Long courseId2)
    {
    	return studentService.setCourseToStudent(studentId, courseId1, courseId2);
    }
}
