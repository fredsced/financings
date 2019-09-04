package fr.formation.financings.services;

import org.springframework.stereotype.Service;

import fr.formation.financings.dtos.ContactDto;
import fr.formation.financings.entities.Contact;
import fr.formation.financings.entities.ContactInfo;
import fr.formation.financings.repositories.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {

    private ContactRepo contactRepo;

    @Override
    public void create(ContactDto contactDto) {
	// Convert dto to entity
	Contact contact = new Contact();
	contact.setFirstName(contactDto.getFirstName());
	contact.setLastName(contactDto.getLastName());
	// Create contactInfo
	ContactInfo contactInfo = new ContactInfo();
	contactInfo.setEmail(contactDto.getEmail());
	contactInfo.setMobile(contactDto.getMobile());
	contactInfo.setPhone(contactDto.getPhone());
	contact.setInfo(contactInfo);
	// Save object
	contactRepo.save(contact);
    }
}
