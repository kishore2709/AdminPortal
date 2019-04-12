package com.confidential.AdminPortal.service;

import org.springframework.stereotype.Service;

import com.confidential.AdminPortal.payload.response.PageResponse;

@Service
public class PageService {

	public PageResponse getPageMessage() {
		// TODO Auto-generated method stub
		PageResponse pageResponse = new PageResponse();
		pageResponse.setMessage("Test Message from server1");
		pageResponse.setSuccess(true);
		return pageResponse;
	}

}
