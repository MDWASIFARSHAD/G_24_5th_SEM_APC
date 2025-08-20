package Dao;

import org.springframework .jdbc.core.JdbcTemplate;

import Entity.Student;

public class StudentDao {
	
	private JdbcTemplate jd;
	public JdbcTemplate getJd() {
		return jd;
	}

	public void setJd(JdbcTemplate jd) {
		this.jd = jd;
	}
	
	public StudentDao(JdbcTemplate jd) {
		super();
		this.jd = jd;
	}

	public void insert(Student s)
	{
		String query = "insert into student(rollNo,name) values(?,?)";
		jd.update(query,s.getRollNo(),s.getName());
	}
	
	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void update(Student s)
	{
		String query="update student set name=? where rollNo=?";
		jd.update(query,s.getName(),s.getRollNo());
	}
	
	public void delete(Student s)
	{
		String query="delete from student where rollNo=?";
		jd.update(query,s.getRollNo());
	}
	
	public  Student fetch()
	{
		String query="select * from student";
		Student s =jd.queryForObject(query, new RW());
		return s;
	}

	
	

}
