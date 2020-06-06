/**
 * 
 */
package com.maplink.apontador.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author fernando
 *
 */
@Document(collation = "companies")
public class Company {

	@Id
	private String id;
	private String name;
	private String address_id;
	private String contact_id;

	/**
	 * 
	 */
	public Company() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address_id
	 */
	public String getAddress_id() {
		return address_id;
	}

	/**
	 * @param address_id the address_id to set
	 */
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}

	/**
	 * @return the contact_id
	 */
	public String getContact_id() {
		return contact_id;
	}

	/**
	 * @param contact_id the contact_id to set
	 */
	public void setContact_id(String contact_id) {
		this.contact_id = contact_id;
	}

	public Company(String id, String name, String address_id, String contact_id) {
		super();
		this.id = id;
		this.name = name;
		this.address_id = address_id;
		this.contact_id = contact_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address_id == null) ? 0 : address_id.hashCode());
		result = prime * result + ((contact_id == null) ? 0 : contact_id.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (address_id == null) {
			if (other.address_id != null)
				return false;
		} else if (!address_id.equals(other.address_id))
			return false;
		if (contact_id == null) {
			if (other.contact_id != null)
				return false;
		} else if (!contact_id.equals(other.contact_id))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address_id=" + address_id + ", contact_id=" + contact_id
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress_id()=" + getAddress_id()
				+ ", getContact_id()=" + getContact_id() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
