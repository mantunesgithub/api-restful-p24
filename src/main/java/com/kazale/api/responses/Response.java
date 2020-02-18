package com.kazale.api.responses;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {

	private T data;
	private List<String> errors;

	public Response() {
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<String> getErrors() {
		if (this.errors == null) {
			this.errors = new ArrayList<String>();
			System.out.println("Não houve nenhum erro - Lsit = null");
		}
		 
		System.out.println("Foi gerada uma lista de erros");
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

}
