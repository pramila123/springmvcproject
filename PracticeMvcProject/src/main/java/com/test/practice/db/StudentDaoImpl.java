package com.test.practice.db;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.practice.model.Student;
@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {
@Resource
private SessionFactory sessionFactory;
	@Override
	public void addStudent(Student s) {
		Session sess=sessionFactory.getCurrentSession();
		sess.save(s);
		
	}

	@Override
	public void deleteStd(long sid) {
		Session sess=sessionFactory.getCurrentSession();
		Student s=(Student) sess.get(Student.class, sid);
		sess.delete(s);
	}

	@Override
	public Student getById(long sid) {
		Session sess=sessionFactory.getCurrentSession();
		Student s=(Student) sess.get(Student.class, sid);
		return s;
	}

	@Override
	public void updateStd(Student s) {
		Session sess=sessionFactory.getCurrentSession();
		sess.update(s);
		
	}

	@Override
	public List<Student> getAllStudent() {
		Session sess=sessionFactory.getCurrentSession();
		Criteria crt=sess.createCriteria(Student.class);
		return crt.list();
	}

}
