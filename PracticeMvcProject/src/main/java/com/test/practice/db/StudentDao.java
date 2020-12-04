package com.test.practice.db;

import java.util.List;

import com.test.practice.model.Student;

public interface StudentDao {
	public void addStudent(Student s);

	public void deleteStd(long sid);

	public Student getById(long sid);

	public void updateStd(Student s);

	public List<Student> getAllStudent();

}
