package com.sunmengjie.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunmengjie.entity.Film;
import com.sunmengjie.service.FilmService;

@Controller
public class FilmController {

	@Autowired
	private FilmService service;
	
	//查询列表
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue = "1")int pageNum,Model m) {
		
		PageHelper.startPage(pageNum, 2);
		
		List<Film> list = service.list();
		
		PageInfo<Film> pageInfo = new PageInfo<>(list);
		
		m.addAttribute("list", list);
		m.addAttribute("page", pageInfo);
		
		return "list";
	}
	
	@RequestMapping("toAdd")
	public String toAdd(Model m) {
		m.addAttribute("f", new Film());
		
		return "add";
	}
	
	@RequestMapping("add")
	public String add(@Valid @ModelAttribute("f")Film f,BindingResult result,Model m) {
		if(result.hasErrors()) {
			m.addAttribute("f", f);
			return "add";
		}
		
		service.add(f);
		
		return "redirect:list";
	}
	
	@RequestMapping("updSta")
	public String updSta(int state,int id) {
		
		service.updSta(state,id);
		return "redirect:list";
	}
}
