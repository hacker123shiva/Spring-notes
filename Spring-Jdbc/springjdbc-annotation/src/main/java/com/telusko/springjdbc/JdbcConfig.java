package com.telusko.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.telusko.springjdbc.dao.RowMapperImpl;
import com.telusko.springjdbc.dao.StudentDao;
import com.telusko.springjdbc.dao.StudentDaoImpl;
import com.telusko.springjdbc.entities.Student;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages= {"com.telusko"})
public class JdbcConfig {

	@Bean(name="datasource")
	public HikariDataSource getDataSource() {
		HikariDataSource datasource=new HikariDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setJdbcUrl("jdbc:mysql://localhost:3306/springjdbc");
		datasource.setUsername("root");
		datasource.setPassword("root");
		datasource.setMaximumPoolSize(5);
		return datasource;
	}
	
	@Bean(name="jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean(name="rowMapper")
	public RowMapper<Student> getRowMapper() {
		RowMapper<Student> rowMapper=new RowMapperImpl();
		return rowMapper;
	}
 
	
}
