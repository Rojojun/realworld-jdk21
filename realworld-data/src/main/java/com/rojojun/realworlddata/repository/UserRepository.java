package com.rojojun.realworlddata.repository;

import com.rojojun.realworlddata.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
