package Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;

import Entity.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void insert(Student student)
	{
		hibernateTemplate.save(student);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public Student fetch()
	{
		Student s =hibernateTemplate.get(Student.class, 1);
		return s;
	}
	
	public List<Student> fetchAll()
	{
		List<Student> s= hibernateTemplate.loadAll(Student.class);
		return s;
	}
	
	@Transactional
	public void update(Student student)
	{
		hibernateTemplate.update(student);
	}
	
	
	@Transactional
	public void delete(Student student)
	{
		hibernateTemplate.delete(student);
	}

}
