package com.tzkinformatics.measapp.api.rest;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.tzkinformatics.measapp.api.base.PagingResponse;
import com.tzkinformatics.measapp.api.data.UserData;
import com.tzkinformatics.measapp.api.service.UserApiService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api/user")
public class UserApi {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserApiService service;

    @GetMapping("showMeTestUser")
    public ResponseEntity<PagingResponse<UserData>> testCall() {
        try {
            return service.list();
        } catch (Throwable throwable) {
            return service.handleException(throwable);
        }
    }

    @JsonBackReference
    @GetMapping("showMeSimpleTestUser")
    @ApiOperation(value = "Returns all test user") /* @ApiOperation --> swagger decoration, shows details about operation */
    public ArrayList<UserData> simpleTestCall() throws Throwable {
        return service.jsonList();
    }


    @PostConstruct
    @PostMapping
    @ApiOperation(value = "Add me as test user")
    public ResponseEntity<UserData> addTestUser() throws Throwable{
        log.debug("<----------- test is runned ---------->");
        UserData user1 = new UserData();
        user1.setUserName("Szatzker Marci");
        user1.setEmailAddress("marton.szatzker@gmail.com");
        user1.setAdmin(false);
        user1.setLocation("Székesfehérvár");
        user1.setUserName("Szatzker Marci");

        service.save(user1);

        return new ResponseEntity<>(user1, HttpStatus.OK);
    }
}
