package dio.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.gof.model.Client;
import dio.gof.service.ClientService;

@RestController
@RequestMapping("clients")
public class ClientRestController {
  @Autowired
  private ClientService clientService;

  @GetMapping
  public ResponseEntity<Iterable<Client>> buscarTodos() {
    return ResponseEntity.ok(clientService.buscarTodos());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Client> buscarPorid(@PathVariable Long id){
    return ResponseEntity.ok(clientService.buscarPorId(id));
  }


  @PostMapping
  public ResponseEntity<Client> inserir(@RequestBody Client client){
    clientService.inserir(client);
      return ResponseEntity.ok(client);
    
  }
  // @PostMapping
  // public ResponseEntity<Client> atualizar(@PathVariable Long id, @RequestBody Client client){
  //   client.atualizar(id, client);
  //   return ResponseEntity.ok(client);
  // }


  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletar(@PathVariable Long id){
    clientService.deletar(id);
    return ResponseEntity.ok().build();
  }


}
