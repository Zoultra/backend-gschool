package com.esiau.backendesiauapp.models;
 


import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter; 

@Entity
@Table( name = "classe")



@Data
 

public class Classe  {
	 
	 
	@Id
	@GeneratedValue
	@Column(name="idClasse")
	private int idClasse;
	 
	@Column(name="nomClasse")
	private String nomClasse;
	@Column(name="nombreEtudiant")
	private int nombreEtudiant;
	
	  public Classe() {
	    }

	    public String getNomClasse() {
	        return nomClasse;
	    }

	    public void setNomClasse(String nomClasse) {
	        this.nomClasse = nomClasse;
	    }

      public int getNombreEtudiant() {
    	  return nombreEtudiant;
      }
      public void setNombreEtudiant(int nombreEtudiant) {
    	  this.nombreEtudiant = nombreEtudiant;
      }
	 
	@ManyToOne 
	@JoinColumn(name = "niveau_id", nullable = false)
	private Niveau niveau;
	 

	
	@OneToMany(mappedBy = "classe",fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Etudiant> etudiants ;
	 


}
