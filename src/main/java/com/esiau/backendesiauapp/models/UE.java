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

import lombok.Data;

@Entity
@Table(name = "ue")
@Data
public class UE {
	
	@Id
	@GeneratedValue
	@Column(name = "id_ue")
	private int idUe;
    
	@Column(name = "nom_ue")
	private String nomUe;
	
	@OneToMany(mappedBy = "ue",fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Matiere> matieres ;
	

    @ManyToOne
    @JoinColumn(name = "departement_id", nullable = false)
    private Departement departement; 
}
