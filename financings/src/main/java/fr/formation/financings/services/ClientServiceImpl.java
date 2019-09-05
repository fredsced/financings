package fr.formation.financings.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.financings.dtos.ClientDto;
import fr.formation.financings.dtos.ClientViewDto;
import fr.formation.financings.entities.Client;
import fr.formation.financings.entities.Contact;
import fr.formation.financings.repositories.ClientRepository;
import fr.formation.financings.repositories.ContactRepository;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepo;

    private final ContactRepository contactRepo;

    protected ClientServiceImpl(ClientRepository clientRepo,
	    ContactRepository contactRepo) {
	this.clientRepo = clientRepo;
	this.contactRepo = contactRepo;
    }

    @Override
    public void create(ClientDto dto) {
	Client client = new Client();
	client.setName(dto.getName());
	client.setLegalForm(dto.getLegalForm());
	Contact contact = contactRepo.getOne(dto.getContactId());
	client.setContact(contact);
	clientRepo.save(client);
    }

    @Override
    public void update(ClientDto dto, Long id) {
	Client client = clientRepo.findById(id).get();
	client.setName(dto.getName());
	client.setLegalForm(dto.getLegalForm());
	Contact contact = contactRepo.getOne(dto.getContactId());
	client.setContact(contact);
	clientRepo.save(client);
    }

    @Override
    public void delete(Long id) {
	clientRepo.deleteById(id);
    }

    @Override
    public Client getOne(Long id) {
	return clientRepo.findById(id).get();
    }

    @Override
    public List<ClientViewDto> getAll() {
	return clientRepo.getAllProjectedBy();
    }
}
