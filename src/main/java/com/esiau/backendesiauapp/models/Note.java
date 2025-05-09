package com.esiau.backendesiauapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "note")
@Data
public class Note {
	
	@Id
	@GeneratedValue
	@Column(name = "id_note")
	private int idNote;
	@Column(name = "note_exam")
	private Double noteExamen;
	@Column(name = "note_devoir")
	private Double noteDevoir;
	//@Column(name = "remarque")
	//private String remarque;
	//@Column(name = "statut")
	//private String statut;
	@Column(name = "examen")
	private String examen;
	//@Column(name = "annee_scolaire")
	//private String anneeScolaire; 
	
    
	@ManyToOne
    @JoinColumn(name = "idEtudiant", nullable = false)
    private Etudiant etudiant; 
	
	@ManyToOne
    @JoinColumn(name = "idMatiere", nullable = false)
    private Matiere matiere; 
    
    
}
