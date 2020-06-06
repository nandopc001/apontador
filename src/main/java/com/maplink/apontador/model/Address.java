package com.maplink.apontador.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "adresses" )
public class Address {
	
	@Id
	private String id;
	
	private String complement;

    private String district;

    private String number;

    private String postalCode;

    private String streetName;

    private Double latitude;

    private Double longitude;
    
    public Address() {
		// TODO Auto-generated constructor stub
	}

}
