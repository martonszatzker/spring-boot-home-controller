package com.tzkinformatics.measapp.measappbackend.users;

import com.tzkinformatics.measapp.api.base.PagingResponse;
import com.tzkinformatics.measapp.api.data.UserData;
import com.tzkinformatics.measapp.api.service.UserApiService;
import com.tzkinformatics.measapp.measappbackend.users.UserMapper;
import com.tzkinformatics.measapp.measappbackend.entities.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@Service
public class UserApiServiceImpl implements UserApiService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserRepository repository;


    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ResponseEntity<UserData> login(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        return null;
    }

    @Override
    public ResponseEntity<PagingResponse<UserData>> list() throws Throwable {

        final PagingResponse<UserData> result = new PagingResponse<>();

        return null;
    }

    @Override
    public ResponseEntity handleException(Throwable t) {
        return null;
    }

    @Override
    public ArrayList<UserData> jsonList() throws Throwable {
        UserEntity entity = new UserEntity();
        UserEntity entity2 = new UserEntity();
        repository.save(entity);
        repository.save(entity2);

        log.debug("/*----------jsonList()----------*/");
        ArrayList<UserData> data = mapper.toData(repository.findAll());
        log.debug("/*----------jsonList()----------*/");
        return data;
    }

    @Override
    public ResponseEntity<UserData> save(UserData user) throws Throwable {
        log.debug("<----------- test is runned ---------->");
        UserEntity user1 = new UserEntity();
        user1.setUserName("Szatzker Marci");
        user1.setEmailAddress("marton.szatzker@gmail.com");
        user1.setAdmin(false);
        user1.setLocation("Székesfehérvár");

        repository.save(user1);

        return new ResponseEntity(user1, HttpStatus.OK);
    }
}
