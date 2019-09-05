package fr.formation.financings.services;

import java.util.List;

import fr.formation.financings.dtos.FinancingDto;
import fr.formation.financings.dtos.FinancingViewDto;
//import fr.formation.financings.entities.Financing;

public interface FinancingService {

    void create(FinancingDto dto);

    void delete(Long id);

    void validate(Long id);

    void update(FinancingDto dto, Long id);

    FinancingViewDto getOne(Long id);

    List<FinancingViewDto> getAll();
}
