package org.mm.service;

import java.util.HashSet;
import java.util.List;

import java.util.Set;

import org.mm.entities.CourseEntity;
import org.mm.entities.StudentEntity;
import org.mm.repository.CourseRepo;
import org.mm.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private CourseRepo courseRepo;
	
	public List<StudentEntity> getAllStudents()
	{
		return studentRepo.findAll();
	}
	
	public StudentEntity addStudent(StudentEntity studentEntity)
	{
		return studentRepo.save(studentEntity);
	}
	
	
	public StudentEntity enrollStudentInCourse(Long studentId, Set<CourseEntity> courses)
	{
		StudentEntity studentEntity = studentRepo.findById(studentId).orElse(null);
		studentEntity.setCourses(courses);
		return studentRepo.save(studentEntity);
	}

	
    public Set<CourseEntity> getCoursesByStudent(Long studentId) {
        StudentEntity student = studentRepo.findById(studentId).orElse(null);
        return student.getCourses();
    }
    
    public StudentEntity setCourseToStudent(Long studentId, Long courseId1, Long courseId2)
    {
    	StudentEntity studentEntity = studentRepo.findById(studentId).orElse(null);
    	
    	CourseEntity courseEntity1 = courseRepo.findById(courseId1).orElse(null);
    	CourseEntity courseEntity2 = courseRepo.findById(courseId2).orElse(null);
    	
    	Set<CourseEntity> courses = new HashSet<>();
    	
    	courses.add(courseEntity1);
    	courses.add(courseEntity2);
    	
    	studentEntity.setCourses(courses);
    	
    	return studentRepo.save(studentEntity);
    }
	

}
