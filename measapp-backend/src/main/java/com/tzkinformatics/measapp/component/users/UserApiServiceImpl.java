package com.tzkinformatics.measapp.component.users;

import com.tzkinformatics.measapp.api.base.PagingResponse;
import com.tzkinformatics.measapp.api.data.UserData;
import com.tzkinformatics.measapp.api.service.UserApiService;
import com.tzkinformatics.measapp.entities.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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
}
