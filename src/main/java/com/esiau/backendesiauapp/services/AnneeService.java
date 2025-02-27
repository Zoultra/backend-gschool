package com.esiau.backendesiauapp.services;

import java.util.List;
import java.util.Optional;

import com.esiau.backendesiauapp.models.Annee;


public interface AnneeService {
	
	// Modifier un Matiere
			public Annee saveAnnee(Annee annee);
			// Modifier un Matiere
		    public Annee updateAnnee(Annee annee);
		   // Liste de tous les Matiere
		   public	List<Annee> getAllAnnees();
		    // Supprimer une Matiere
		   void  deleteAnneeById(int idAnnee);
		    // Consulter une Matiere
		    Optional<Annee> getAnnee(int idAnnee);
		    
		    
}
