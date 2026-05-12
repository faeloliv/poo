package fatecfranca.produto.service;

import fatecfranca.produto.model.Produto;
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
public class ProdutoService {
    private List<Produto> lista = new ArrayList<>();
    private Long nextId = 1L;

    public List<Produto> listar() {
        //Cria a lista de produtos
        return lista;
    }

    public Produto buscarPorId(Long id) {
        return lista.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }


    public Produto criar(Produto p) {
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

    public Produto atualizar(Long id, Produto novo) {
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
