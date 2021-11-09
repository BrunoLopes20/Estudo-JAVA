package com.java_angular.fullstackdevelop.repository;

import com.java_angular.fullstackdevelop.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

//Extende JPA Repository para ter acesso a vários métodos de manipulação de banco
public interface ServerRepository extends JpaRepository<Server, Long> {

    Server findByIpAddress(String ipAddress);
}
