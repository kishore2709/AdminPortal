package com.confidential.AdminPortal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.confidential.AdminPortal.payload.response.PageResponse;
import com.confidential.AdminPortal.service.PageServiceImpl;


@RestController
@RequestMapping("/api/page")
public class PageController {

    @Autowired
    private PageServiceImpl pageService;

    private static final Logger logger = LoggerFactory.getLogger(PageController.class);
    
    @GetMapping("/msg")
   // @PreAuthorize("hasRole('ADMIN')")
    //  public PageResponse getPolls(@CurrentUser UserPrincipal currentUser) {
    public PageResponse getPolls() {
        return pageService.getPageMessage();
    }

}
