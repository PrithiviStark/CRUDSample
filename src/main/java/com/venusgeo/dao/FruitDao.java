package com.venusgeo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.venusgeo.bean.Fruit;


public class FruitDao 
{
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int save(Fruit p){  
	    String sql="insert into fruit values("+p.getFid()+",'"+p.getFname()+"',"+p.getFprice()+")";
	    return template.update(sql);  
	}  
	public int update(Fruit p){  
	    String sql="update fruit set fname='"+p.getFname()+"',fprice='"+p.getFprice()+"' where fid="+p.getFid()+"";  
	    return template.update(sql);  
	}  
	public int delete(int fid){  
	    String sql="delete from fruit where fid="+fid+"";  
	    return template.update(sql);  
	}  
	public Fruit getFruitByFid(int fid){  
	    String sql="select * from fruit where fid=?";  
	    return template.queryForObject(sql, new Object[]{fid},new BeanPropertyRowMapper<Fruit>(Fruit.class));  
	}  
	public List<Fruit> getFruits(){  
	    return template.query("select * from fruit order by fid asc",new RowMapper<Fruit>(){  
	        public Fruit mapRow(ResultSet rs, int row) throws SQLException {  
	            Fruit e=new Fruit();  
	            e.setFid(rs.getInt(1));  
	            e.setFname(rs.getString(2));  
	            e.setFprice(rs.getFloat(3));   
	            return e;  
	        }  
	    });  
	}  
}
