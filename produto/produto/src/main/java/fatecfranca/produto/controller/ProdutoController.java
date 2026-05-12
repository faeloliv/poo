package fatecfranca.produto.controller;

import fatecfranca.produto.model.Produto;
import fatecfranca.produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired // Injecao de dependencia
    //Podemos usar service sem instanciá-lo
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<Produto>> listar() {
        // Status da resposta é ok (sucesso)
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping
    public ResponseEntity<Produto> criar(@RequestBody Produto p) {
        // Chama o "garçom"
        Produto criado = service.criar(p);
        // Cria uma URI com o id do produto criado
        // URI - Uniform Resource Identifier
        // URL - Uniform Resource Locator
        URI uri = URI.create("/produtos/" + criado.getId());
        // Retorna status de sucesso 201 (created)
        return ResponseEntity.created(uri).body(criado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        return service.remover(id) ?
                // Caso encontre, retorna noContent
                ResponseEntity.noContent().build() :
                // Caso NÃO encontre, retorna notFound
                ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        Produto ret = service.atualizar(id, produto);
        if (ret == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(ret);
        }
    }
}
