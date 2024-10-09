package org.mm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.mm.entities.CourseEntity;
import org.mm.entities.StudentEntity;
import org.mm.repository.CourseRepository;
import org.mm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private CourseRepository courseRepo;
	
	public StudentEntity saveStudent(StudentEntity studentEntity)
	{
		return studentRepo.save(studentEntity);
	}
	
	public List<StudentEntity> findAllStudent()
	{
		return studentRepo.findAll();
	}
	
    public StudentEntity addStudentWithCourses(String name, String email, List<Long> courseIds) {
        StudentEntity student = new StudentEntity();
        student.setStudentName(name);
        student.setEmail(email);
        
        List<CourseEntity> courses = new ArrayList<>();

        courseIds.forEach(id -> {
        	CourseEntity course = courseRepo.findById(id).orElseThrow();
        	courses.add(course);
        });
        
        student.setCourses(courses);
        
        StudentEntity studentEntity = studentRepo.save(student);
        
        courses.forEach(course -> {
        	course.getStudents().add(studentEntity);
        	courseRepo.save(course);
        });
        
        return studentEntity;
    }
    
    public String deleteStudentById(Long id)
    {
        StudentEntity studentEntity = studentRepo.findById(id).orElseThrow();
      
        studentEntity.getCourses()
            		.forEach(course -> course.getStudents().remove(studentEntity));
            
        studentEntity.getCourses().clear();

        studentRepo.deleteById(id);
        
        return "Student deleted successfully!";
        
    }
    
    public String removeStudentFromCourse(Long courseId, Long studentId)
    {
    	CourseEntity courseEntity = courseRepo.findById(courseId).orElseThrow();
    	
    	StudentEntity studentEntity = studentRepo.findById(studentId).orElseThrow();
    	
    	if(courseEntity.getStudents().remove(studentEntity) && 
    			studentEntity.getCourses().remove(courseEntity))
    	{
    		courseRepo.save(courseEntity);
    		studentRepo.save(studentEntity);
    		return "Student Remove From Course...";
    		
    	}else{
    		return "Data Not Found ..";
    	}

    }
}
