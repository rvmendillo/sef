package sef.module9.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of a Radar 
 * 
 *
 */
public class RadarImpl implements Radar{
	List<RadarContact> contacts;

	
	/**
	 *  Constructs a new Radar 
	 */
	public RadarImpl(){
		this.contacts = new ArrayList<>();
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#addContact(sef.module8.activity.RadarContact)
	 */
	public RadarContact addContact(RadarContact contact) {
		if (contact == null || contact.getContactID() == null)
			return null;
	    for (RadarContact existingContact : contacts)
	        if (existingContact.getContactID().equals(contact.getContactID())) {
	            existingContact.setBearing(contact.getBearing());
	            existingContact.setDistance(contact.getDistance());
	            return existingContact;
	        }

	    contacts.add(contact);
	    return contact;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#getContact(java.lang.String)
	 */
	public RadarContact getContact(String id) {
		for (RadarContact contact : contacts)
	        if (contact.getContactID().equals(id))
	            return contact;
	    return null;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#getContactCount()
	 */
	public int getContactCount() {
		
		return contacts.size();
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#removeContact(java.lang.String)
	 */
	public RadarContact removeContact(String id) {
		for (RadarContact contact : contacts)
	        if (contact.getContactID().equals(id)) {
	        	contacts.remove(contact);
	            return contact;
	        }
	    return null;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#returnContacts()
	 */
	public List<RadarContact> returnContacts() {
		return new ArrayList<>(contacts);
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#returnContacts(java.util.Comparator)
	 */
	public List<RadarContact> returnContacts(Comparator<RadarContact> comparator) {
		List<RadarContact> orderedContacts = new ArrayList<>(contacts);
	    orderedContacts.sort(comparator);
	    return orderedContacts;
	}

	
}
