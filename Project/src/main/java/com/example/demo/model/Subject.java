package com.example.demo.model;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Subject{
	@Id
	private String idSubject;
	private String idQuestions;
	private Map<String,Object> questions;
	private Boolean status;
	
	public String getIdSubject() {
		return idSubject;
	}
	public void setIdSubject(String idSubject) {
		this.idSubject = idSubject;
	}
	public String getIdQuestions() {
		return idQuestions;
	}
	public void setIdQuestions(String idQuestions) {
		this.idQuestions = idQuestions;
	}
	public Map<String, Object> getQuestions() {
		return questions;
	}
	public void setQuestions(Map<String, Object> questions) {
		this.questions = questions;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Subject [idSubject=" + idSubject + ", idQuestions=" + idQuestions + ", questions=" + questions
				+ ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idQuestions == null) ? 0 : idQuestions.hashCode());
		result = prime * result + ((idSubject == null) ? 0 : idSubject.hashCode());
		result = prime * result + ((questions == null) ? 0 : questions.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (idQuestions == null) {
			if (other.idQuestions != null)
				return false;
		} else if (!idQuestions.equals(other.idQuestions))
			return false;
		if (idSubject == null) {
			if (other.idSubject != null)
				return false;
		} else if (!idSubject.equals(other.idSubject))
			return false;
		if (questions == null) {
			if (other.questions != null)
				return false;
		} else if (!questions.equals(other.questions))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	public Subject(String idSubject, String idQuestions, Map<String, Object> questions, Boolean status) {
		super();
		this.idSubject = idSubject;
		this.idQuestions = idQuestions;
		this.questions = questions;
		this.status = status;
	}
	
	
	

}
