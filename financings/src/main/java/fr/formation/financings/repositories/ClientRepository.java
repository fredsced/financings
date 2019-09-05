package fr.formation.financings.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.financings.dtos.ClientViewDto;
import fr.formation.financings.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

    ClientViewDto getById(Long id);

    List<ClientViewDto> getAllProjectedBy();
}
