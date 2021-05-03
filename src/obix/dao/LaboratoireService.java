package obix.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import obix.elements.LaboratoireObix;

@Repository
public class LaboratoireService {

	@PersistenceContext
    private EntityManager entityManager;
	
	
	
	public LaboratoireService() {
		super();
		//entityManager = new Enti
	}



	@Transactional
	public void insertWithQuery(LaboratoireObix laboratoire) {
	    entityManager.createNativeQuery("INSERT INTO frigo (nomFrigo, puissanceFrigo, idLaboratoire) VALUES (?,?,?)")
	      .setParameter(1, "frigotest")
	      .setParameter(2, 0)
	      .setParameter(3, 1)
	      .executeUpdate();
	}
}
