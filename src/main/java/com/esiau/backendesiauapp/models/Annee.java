package com.esiau.backendesiauapp.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;


@Entity
@Table(name = "annee")
@Data 

public class Annee {
	
	 
		@Id
		@GeneratedValue
		@Column(name="idAnnee")
		private int idAnnee;
		
		@Column(name="nom_annee")
		private String nomAnnee;
		

}
