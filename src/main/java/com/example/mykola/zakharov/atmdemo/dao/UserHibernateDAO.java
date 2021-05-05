package com.example.mykola.zakharov.atmdemo.dao;

import com.example.mykola.zakharov.atmdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserHibernateDAO extends JpaRepository<User, Long> {
    User findUserById(Long id);
}
