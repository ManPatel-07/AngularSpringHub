package org.mm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.mm.entities.StudentEntity;
import org.mm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping(path = "/student")
public class StudentController
{
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping(path = "/save")
	public StudentEntity saveStudentData(@RequestBody Map<String, Object> requestData) {
	    String name = (String) requestData.get("studentName");
	    String email = (String) requestData.get("email");
	    @SuppressWarnings("unchecked")
		List<Long> longCourseIds = ((List<Integer>) requestData.get("courses"))
	                                  .stream()
	                                  .map(Integer::longValue)
	                                  .collect(Collectors.toList());
	    
	    return studentService.addStudentWithCourses(name, email, longCourseIds);
	}

	@GetMapping(path = "/getAll")
	public List<StudentEntity> getAllStudent()
	{
		return studentService.findAllStudent();
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<Map<String, String>> deleteById(@PathVariable("id") Long id)
	{
		studentService.deleteStudentById(id);
		Map<String, String> response = new HashMap<>();
		response.put("message", "Data Deleted ...");
		return new ResponseEntity<Map<String,String>>(response , HttpStatus.OK);
	} 
	
	@DeleteMapping(path = "/{courseId}/delStudent/{studentId}")
	public ResponseEntity<Map<String, String>> deleteStudentFromCourse(
			@PathVariable("courseId") Long courseId,
			@PathVariable("studentId") Long studentId)
	{
		studentService.removeStudentFromCourse(courseId, studentId);
		Map<String, String> response = new HashMap<>();
		response.put("message", "Data Delete from Course ...");
		return new ResponseEntity<Map<String,String>>(response, HttpStatus.OK);
	}
}
