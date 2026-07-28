package com.appsbs.apsbs.repository;

import com.appsbs.apsbs.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepo extends JpaRepository<UserInfoEntity,Long> {
    <T> Optional<T> findByEmailId(String emailId);

}