package com.tzkinformatics.measapp.api.service;

import com.tzkinformatics.measapp.api.base.PagingResponse;
import com.tzkinformatics.measapp.api.data.UserData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public interface UserApiService {

    ResponseEntity<UserData> login(HttpServletRequest request, HttpServletResponse response) throws Throwable;
    //ResponseEntity<PagingResponse<UserData>> list(Integer index, Integer count, String sortFieldName, Boolean sortAsc) throws Throwable;
    ResponseEntity<PagingResponse<UserData>> list() throws Throwable;

    ArrayList<UserData> jsonList() throws Throwable;

    ResponseEntity handleException(Throwable t);

    ResponseEntity<UserData> save(UserData user) throws Throwable;
}
