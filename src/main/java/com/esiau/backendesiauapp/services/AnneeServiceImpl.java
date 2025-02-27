package com.esiau.backendesiauapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esiau.backendesiauapp.dao.AnneeRepository;
import com.esiau.backendesiauapp.models.Annee;

@Service
public class AnneeServiceImpl implements AnneeService{
    
	@Autowired
	private AnneeRepository anneeRepository;
	@Override
	public Annee saveAnnee(Annee annee) {
		// TODO Auto-generated method stub
		return anneeRepository.save(annee);
	}

	@Override
	public Annee updateAnnee(Annee annee) {
		// TODO Auto-generated method stub
		return anneeRepository.save(annee);
	}

	@Override
	public List<Annee> getAllAnnees() {
		// TODO Auto-generated method stub
		return anneeRepository.findAll();
	}

	@Override
	public void deleteAnneeById(int idAnnee) {
		// TODO Auto-generated method stub
		anneeRepository.deleteById(idAnnee);
	}

	@Override
	public Optional<Annee> getAnnee(int idAnnee) {
		// TODO Auto-generated method stub
		return anneeRepository.findById(idAnnee);
	}

	 
	
	 

}
