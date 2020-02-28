package com.tzkinformatics.measapp.api.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "Api test model for users")
public class UserData {

    @ApiModelProperty(notes = "Defines the name of the user:)")
    private String userName;
    private String emailAddress;
    private String location;
    private boolean isAdmin;
    private boolean isExecutor;

}
