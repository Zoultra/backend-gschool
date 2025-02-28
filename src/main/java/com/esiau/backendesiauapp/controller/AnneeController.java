package com.esiau.backendesiauapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esiau.backendesiauapp.models.Annee;
import com.esiau.backendesiauapp.services.AnneeService;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@RestController
@CrossOrigin(origins={"http://localhost:4200", "https://esiauwebapp.vercel.app"})
@RequestMapping("/backendesiauapp/v1/")
public class AnneeController {
	
	@Autowired
	private AnneeService anneeServce;
	
	 @PostMapping("/annee")
		public Annee createAnnee(@RequestBody Annee annnee) {
			return anneeServce.saveAnnee(annnee);
			
		}
	 @PutMapping("/annee/{idAnnee}")
	  public Annee updateAnnee(@PathVariable("idAnnee") final Integer idAnnee, @RequestBody Annee annee){
			Optional<Annee> a = anneeServce.getAnnee(idAnnee);
			if(a.isPresent()){
				
				Annee currentAnnee = a.get();
				
				String nomAnnee = annee.getNomAnnee();
				if(nomAnnee != null) {
					currentAnnee.setNomAnnee(nomAnnee);
				} 
				
				  
				anneeServce.updateAnnee(currentAnnee);
				return currentAnnee;
			} else {
				return null;
			}
		}
	 
	 @GetMapping("/annee")
     public List<Annee> getAllAnnees() {
		return anneeServce.getAllAnnees();
	}
	 
	 
	 @GetMapping("/annee/{idAnnee}")
		public Annee getAnnee(@PathVariable("idAnnee") final Integer idAnnee) {
			Optional<Annee> annee = anneeServce.getAnnee(idAnnee);
			 
			if(annee.isPresent()) {
				return annee.get();
			} else {
				return null;
			}
	 

	 }
	 
	 @DeleteMapping("/annee/{idAnnee}")
		public void deleteAnneeById(@PathVariable("idAnnee") final int idAnnee) {
		 anneeServce.deleteAnneeById(idAnnee);
		}
	 
	 

}
