package com.belvi.springbootmysqlcrud.repository;

import com.belvi.springbootmysqlcrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
