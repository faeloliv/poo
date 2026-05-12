package fatecfranca.cliente.service;

import fatecfranca.cliente.model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<Cliente> lista = new ArrayList<>();
    private Long nextId = 1L;

    public List<Cliente> listar() {
        //Cria a lista de clientes
        return lista;
    }

    public Cliente buscarPorId(Long id) {
        return lista.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }


    public Cliente criar(Cliente p) {
        p.setId(nextId);
        nextId++;
        this.lista.add(p);
        return p;
    }


    public boolean remover(Long id) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (lista.get(i).getId().equals(id)) {
                this.lista.remove(i);
                return true;
            }
        }
        return false;
    }

    public Cliente atualizar(Long id, Cliente novo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equals(id)) {
                novo.setId(id);
                lista.set(i, novo);
                return novo; // Atualizou
            }
        }
        return null; // Não atualizou
    }
}
