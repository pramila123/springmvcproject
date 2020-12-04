package com.test.practice.db;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.practice.model.Fee;
@Repository
@Transactional
public class FeeDaoImpl implements FeeDao{
@Resource
private SessionFactory sessionFactory;
	@Override
	public void addFee(Fee f) {
		Session sess=sessionFactory.getCurrentSession();
		sess.save(f);
		
	}
	@Override
	public List<Fee> getAllFee() {
		Session sess=sessionFactory.getCurrentSession();
		Criteria crt=sess.createCriteria(Fee.class);
		return crt.list();
	}
	@Override
	public Fee getById(long id) {
		Session sess=sessionFactory.getCurrentSession();
		Fee f=(Fee) sess.get(Fee.class, id);
		return f;
	}
	

}
