package com.tzkinformatics.measapp.api.rest;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.tzkinformatics.measapp.api.base.PagingResponse;
import com.tzkinformatics.measapp.api.data.UserData;
import com.tzkinformatics.measapp.api.service.UserApiService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/api/user")
public class UserApi {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserApiService service;


    @RequestMapping("showMeTestUser")
    public ResponseEntity<PagingResponse<UserData>> testCall() {
        try {
            return service.list();
        } catch (Throwable throwable) {
            return service.handleException(throwable);
        }
    }

    @RequestMapping("showMeSimpleTestUser")
    @JsonBackReference
    public ArrayList<UserData> simpleTestCall() throws Throwable {
        return service.jsonList();
    }


    @PostConstruct
    public void addTestUser(){
        log.debug("<----------- test is runned ---------->");
        UserData user1 = new UserData();
        UserData user2 = new UserData();

    }
}
