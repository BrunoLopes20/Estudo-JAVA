package com.java_angular.fullstackdevelop.service;

import com.java_angular.fullstackdevelop.model.Server;

import java.io.IOException;
import java.util.Collection;

public interface ServerService {
    //Métodos que devem ser implementados
    Server create(Server server);
    Server ping(String ipAddress) throws IOException; //Execption para o método de ping funcionar.
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
