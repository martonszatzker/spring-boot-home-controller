package com.tzkinformatics.measapp.api.data;

import lombok.Data;

@Data
public class UserData {

    private String userName;
    private String emailAddress;
    private String location;
    private boolean isAdmin;
    private boolean isExecutor;

}
