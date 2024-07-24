package dio.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.gof.model.Client;
import dio.gof.model.ClientRepository;
import dio.gof.model.Address;
import dio.gof.model.AddressRepository;
import dio.gof.service.ClientService;
import dio.gof.service.ViaCepService;

/**
 * Implementação da <b>Strategy</b> {@link ClientService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 * @author walassi
 */
@Service
public class ClientServiceImpl implements ClientService {

  // Singleton: Injetar os componentes do Spring com @Autowired.
  @Autowired
  private ClientRepository clientRepository;
  @Autowired
  private AddressRepository addressRepository;
  @Autowired
  private ViaCepService viaCepService;

  // Strategy: Implementar os métodos definidos na interface.
  // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

  @Override
  public Iterable<Client> buscarTodos() {
    // Buscar todos os Clients.
    return clientRepository.findAll();
  }

  @Override
  public Client buscarPorId(Long id) {
    // Buscar Client por ID.
    Optional<Client> cliente = clientRepository.findById(id);
    return cliente.get();
  }

  @Override
  public void inserir(Client client) {
    salvarClienteComCep(client);
  }

  @Override
  public void atualizar(Long id, Client client) {
    Optional<Client> clientDb = clientRepository.findById(id);
    if (clientDb.isPresent()) {
      salvarClienteComCep(client);
    }
  }

  @Override
  public void deletar(Long id) {
    // Deletar Client por ID.
    clientRepository.deleteById(id);
  }

  public void salvarClienteComCep(Client cliente) {
    String cep = cliente.getAddress().getCep();
    Address address = addressRepository.findById(cep).orElseGet(() -> {
      Address newAddress = viaCepService.consultarCep(cep);
      addressRepository.save(newAddress);
      return newAddress;
    });
    cliente.setAddress(address);
    clientRepository.save(cliente);
  }
}