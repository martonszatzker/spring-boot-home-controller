package com.tzkinformatics.measapp.component.users;

import com.tzkinformatics.measapp.api.data.UserData;
import com.tzkinformatics.measapp.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
@Component
public abstract class UserMapper {

    /*  GUI  */

    public abstract ArrayList<UserData> toData(List<UserEntity> entity);

    public abstract UserData toData(UserEntity entity);

}
