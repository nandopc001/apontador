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
@Document(collation = "cities")
public class City {
	
	@Id
	private String id;
	
	private String name;
	
	private String state_id;

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
	 * @return the state_id
	 */
	public String getState_id() {
		return state_id;
	}

	/**
	 * @param state_id the state_id to set
	 */
	public void setState_id(String state_id) {
		this.state_id = state_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((state_id == null) ? 0 : state_id.hashCode());
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
		City other = (City) obj;
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
		if (state_id == null) {
			if (other.state_id != null)
				return false;
		} else if (!state_id.equals(other.state_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", state_id=" + state_id + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getState_id()=" + getState_id() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

	/**
	 * @param id
	 * @param name
	 * @param state_id
	 */
	public City(String id, String name, String state_id) {
		super();
		this.id = id;
		this.name = name;
		this.state_id = state_id;
	}

	/**
	 * 
	 */
	public City() {
		// TODO Auto-generated constructor stub
	}

	

}
