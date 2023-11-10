package com.mvc.Dao;

	import java.util.List;

	import javax.swing.tree.RowMapper;

	import org.springframework.jdbc.core.JdbcTemplate;

import com.mvc.entity.EmpEntity;


	public class EmpDao {  
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}    

	public int saveEmp(EmpEntity e) {
		String query="insert into emp values("+e.getId()+",'"+e.getName()+"','"+e.getRole()+"','"+e.getAddress()+"')";  
	    return jdbcTemplate.update(query);  
	}

	public int deleteEmp(EmpEntity e)
	{
		String query="delete from emp where id="+e.getId();
		return jdbcTemplate.update(query);
	}

	public int updateEmp(int id,String role) {
		String query="update emp set role="+role+" where id="+id;
		return jdbcTemplate.update(query);
	}

	    
	}  
	

