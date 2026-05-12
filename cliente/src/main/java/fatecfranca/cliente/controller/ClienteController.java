package fatecfranca.cliente.controller;

import fatecfranca.cliente.model.Cliente;
import fatecfranca.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired // Injecao de dependencia
    //Podemos usar service sem instanciá-lo
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> listar() {
        // Status da resposta é ok (sucesso)
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente p) {
        // Chama o "garçom"
        Cliente criado = service.criar(p);
        // Cria uma URI com o id do cliente criado
        // URI - Uniform Resource Identifier
        // URL - Uniform Resource Locator
        URI uri = URI.create("/clientes/" + criado.getId());
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
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente ret = service.atualizar(id, cliente);
        if (ret == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(ret);
        }
    }
}
