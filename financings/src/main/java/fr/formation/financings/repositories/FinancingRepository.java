package fr.formation.financings.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.financings.dtos.FinancingViewDto;
import fr.formation.financings.entities.Financing;

public interface FinancingRepository extends JpaRepository<Financing, Long> {
    //

    FinancingViewDto getById(Long id);

    List<FinancingViewDto> getAllProjectedBy();
}
