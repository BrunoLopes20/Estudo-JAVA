package com.java_angular.fullstackdevelop.service.implementation;

import com.java_angular.fullstackdevelop.model.Server;
import com.java_angular.fullstackdevelop.repository.ServerRepository;
import com.java_angular.fullstackdevelop.service.ServerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Random;

import static com.java_angular.fullstackdevelop.enumeration.Status.SERVER_DOWN;
import static com.java_angular.fullstackdevelop.enumeration.Status.SERVER_UP;
import static java.lang.Boolean.TRUE;

@RequiredArgsConstructor//Cria um construtor com os campos necessários que estão marcados com (FINAL) ou (@NonNull)
@Service//Indica que é uma classe de serviço
@Transactional  //Os métodos tem que ser sucesso, como não foi passado nenhum parâmetro por Default é utilizados o do Banco de dados
@Slf4j
public class ServerServiceImplementation implements ServerService {

    private final ServerRepository serverRepository;

    //Cria um novo servidor
    @Override
    public Server create(Server server) {
        log.info("Saving new server: {}",server.getName()); //Mostra no console quando salvar um novo Server
        server.setImageUrl(setServerImageUrl());//Atribui o método a ImageUrl
        return serverRepository.save(server);//Salva no banco e retorna
    }


    //Faz um teste de ping
    @Override
    public Server ping(String ipAddress) throws IOException {
        log.info("Pinging server IP: {}", ipAddress); //Mostra no console quando pingar um IP
        Server server = serverRepository.findByIpAddress(ipAddress);//Localiza no banco o Server com o IP
        InetAddress address = InetAddress.getByName(ipAddress);//Atribui a "address" o Ip para que possamos realizar o ping
        server.setStatus(address.isReachable(10000) ? SERVER_UP : SERVER_DOWN);//Realiza o Ping se conseguir alcnaçar pelo tempo TimeOut Muda pra Up se não para Down
        serverRepository.save(server);//Após o ping temos que salvar no banco com o novo status
        return server;
    }

    //Realiza uma Busca pela quantidade passada
    @Override
    public Collection<Server> list(int limit) {
        log.info("Fetching all servers");//Mostra no console que está buscando os servidores
        return serverRepository.findAll(PageRequest.of(0,limit)).toList();//Busca pela quantidade de passo no método,
                                                                                //como PageRequest iniciando dá primeira página retornaria uma página
                                                                                //e não uma lista passo .tolist(), para retorna uma lista
    }

    //Buscar um Server por ID
    @Override
    public Server get(Long id) {
        log.info("Fetching servers by ID: {}", id);//Mostra no console que está buscando pelo ID passado
        return serverRepository.findById(id).get(); //Retorna o expecifico Server que conter o ID
    }

    //Atualiza um Server
    @Override
    public Server update(Server server) {
        log.info("Updating new server: {}",server.getName()); //Mostra no console quando salvar um novo Server
        return serverRepository.save(server);//Salva no banco e retorna
    }

    //Deleta um Server
    @Override
    public Boolean delete(Long id) {
        log.info("Deleting server by ID: {}",id); //Mostra no console que está deletando pelo ID
        serverRepository.deleteById(id);//Deleta
        return TRUE;//Retorna TRUE
    }

    //Pega umas das imagens de Server de forma Randomica e atribui a um Server novo criado
    private String setServerImageUrl() {
        String[] imageNames = {"server1.png, server2.png, server3.png"};
        return ServletUriComponentsBuilder.fromCurrentContextPath().path("/server/imgServers" +
                imageNames[new Random().nextInt(3)]).toUriString();
    }
}
