package com.maua.backendMetro.domain.repository;

import com.maua.backendMetro.domain.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(path = "Users")
@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    List<Users> findByEmail(String email);

}
