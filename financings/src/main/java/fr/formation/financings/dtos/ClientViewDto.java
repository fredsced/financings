package fr.formation.financings.dtos;

import fr.formation.financings.entities.Contact;
import fr.formation.financings.entities.LegalForm;

public interface ClientViewDto {

    String getName();

    LegalForm getLegalForm();

    Long getId();

    Contact getContact();
}
