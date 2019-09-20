package com.example.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import com.example.demo.model.Subject;
import com.example.demo.repository.SubjectRepository;
import com.example.demo.service.SubjectService;
import com.example.demo.util.ResponseUI;
@Service
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	private SubjectRepository subjectRepository;

	@Override
	public void create(Subject subject, DeferredResult<ResponseUI> dr) {
		ResponseUI result=new ResponseUI();
		result.setCode("200");
		result.setData(subjectRepository.save(subject));
		result.setStatus("success");
		dr.setResult(result);
		
	}

	@Override
	public void getAll(DeferredResult<ResponseUI> dr) {
		ResponseUI responseUI= new ResponseUI();
		responseUI.setCode("200");
		responseUI.setData(subjectRepository.findAll());
		responseUI.setStatus("success");
		dr.setResult(responseUI);
	}
}
