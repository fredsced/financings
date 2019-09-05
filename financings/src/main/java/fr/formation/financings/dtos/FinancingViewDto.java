package fr.formation.financings.dtos;

import java.time.LocalDate;

public interface FinancingViewDto {

    Long getId();

    String getReference();

    LocalDate getStartDate();

    LocalDate getEndDate();

    Double getAmount();

    Double getRate();

    String getClientName();

    String getClientContactFirstName();

    String getClientContactLastName();
}
