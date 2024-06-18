package com.venusgeo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.venusgeo.bean.Fruit;
import com.venusgeo.dao.FruitDao;



@Controller
public class ShopController
{
	 @Autowired  
	    FruitDao dao;
	      
	    @RequestMapping("/addform")  
	    public String showform(Model m){  
	    	m.addAttribute("command", new Fruit());
	    	return "addform"; 
	    }  
	    @RequestMapping(value="/fsave",method = RequestMethod.POST)  
	    public String save(@ModelAttribute("fruit") Fruit fruit){  
	        dao.save(fruit);  
	        return "redirect:/viewfruits";
	    }  
	  
	    @RequestMapping("/viewfruits")  
	    public String viewemp(Model m){  
	        List<Fruit> list=dao.getFruits();  
	        m.addAttribute("list",list);
	        return "viewfruits";  
	    }  
	  
	    @RequestMapping(value="/editfruit/{fid}")  
	    public String edit(@PathVariable int fid, Model m){  
	        Fruit fruit=dao.getFruitByFid(fid);  
	        m.addAttribute("command",fruit);
	        return "fruiteditform";  
	    }  
	    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
	    public String editsave(@ModelAttribute("fruit") Fruit fruit){  
	        dao.update(fruit);  
	        return "redirect:/viewfruits";  
	    }  
	    @RequestMapping(value="/deletefruit/{fid}",method = RequestMethod.GET)  
	    public String delete(@PathVariable int fid){  
	        dao.delete(fid);  
	        return "redirect:/viewfruits";  
	    }   
}
