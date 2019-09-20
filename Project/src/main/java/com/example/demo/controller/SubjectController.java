package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.example.demo.model.Subject;
import com.example.demo.service.SubjectService;
import com.example.demo.util.ResponseUI;


@RestController
@RequestMapping("/api/subject")
public class SubjectController {
	@Autowired
	private SubjectService subjectService;

	@RequestMapping(method =RequestMethod.POST,value= "/create",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public DeferredResult<ResponseUI> create(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse,@RequestBody Subject subject) {
		DeferredResult<ResponseUI> dr = new DeferredResult<ResponseUI>();
		subjectService.create(subject, dr);
		return dr;
	}
	
	@RequestMapping(method =RequestMethod.GET,value= "/getAll",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public DeferredResult<ResponseUI>  getAll(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse){
		DeferredResult<ResponseUI> dr = new DeferredResult<ResponseUI>();
		 subjectService.getAll(dr);
		 return dr;
	}

}
