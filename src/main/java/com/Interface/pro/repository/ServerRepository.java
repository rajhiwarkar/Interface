package com.Interface.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Interface.pro.entity.Server;

public interface ServerRepository extends JpaRepository<Server, Integer> {

}
