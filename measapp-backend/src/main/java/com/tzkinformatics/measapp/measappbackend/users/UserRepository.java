package com.tzkinformatics.measapp.measappbackend.users;

import com.tzkinformatics.measapp.measappbackend.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
