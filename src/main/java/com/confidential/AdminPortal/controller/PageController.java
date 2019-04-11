package com.confidential.AdminPortal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.confidential.AdminPortal.payload.response.PageResponse;
import com.confidential.AdminPortal.security.CurrentUser;
import com.confidential.AdminPortal.security.UserPrincipal;
import com.confidential.AdminPortal.service.PageServiceImpl;


@RestController
@RequestMapping("/api/page")
public class PageController {

    @Autowired
    private PageServiceImpl pageService;

    private static final Logger logger = LoggerFactory.getLogger(PageController.class);
    
    @GetMapping("/msg")
    
    ////@Secured({"ROLE_ADMIN", "ROLE_USER"})
    //@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    //@PreAuthorize("hasRole('ROLE_USER')")
  // @PreAuthorize("hasAuthority('ROLE_USER')")\
    //@Secured("ROLE_USER")   
    
    @PreAuthorize("hasRole('USER')")
  // @PreAuthorize("hasAuthority('USER')")
    //@Secured("USER")
     public PageResponse getPolls(@CurrentUser UserPrincipal currentUser) {
    //public PageResponse getPolls() {
        return pageService.getPageMessage();
    }

}
