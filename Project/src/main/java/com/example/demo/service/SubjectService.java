package com.example.demo.service;


import org.springframework.web.context.request.async.DeferredResult;

import com.example.demo.model.Subject;
import com.example.demo.util.ResponseUI;

public interface SubjectService {

	public void create(Subject subject, DeferredResult<ResponseUI> dr);

	public void getAll(DeferredResult<ResponseUI> dr);

}
