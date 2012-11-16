package rdproject.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.web.util.WebUtils;

import rdproject.dao.RdDrugDao;
import rdproject.model.Drug;
import rdproject.model.User;

@Repository
public class RdDrugDaoImpl implements RdDrugDao
{
	private EntityManager entityManager;
	
	/**
	 * Injects the entity manager into each Dao
	 * @param entityManager
	 */
	@PersistenceContext
    public void setEntityManager(EntityManager entityManager)
    {
    	this.entityManager = entityManager;
    }
    
	/**
	 * if the Drugs id is not preset
	 *   add the new drug
	 *   else update the drug
	 */	
	public void saveDrug(Drug aDrug) throws DataAccessException
	{
		if (aDrug.getId() !=  null)
		{
			entityManager.persist(aDrug);
		}
		else
		{
			entityManager.merge(aDrug);
		}
	}

	/**
	 * removes the aDrug from database
	 */
	public void deleteDrug(Drug aDrug) throws DataAccessException
	{
		entityManager.remove(aDrug);
	}

	/**
	 * Search Database for drug with aDrug's id
	 *   Return Drug object.
	 */
	public Drug searchDrug(Drug aDrug) 
	{
		String hql = "select d from Drug d where d.id = :aDrugId";
		Query query = entityManager.createQuery(hql);
		query.setParameter("aDrugId", aDrug.getId());
		return (Drug)query.getSingleResult();	
	}

	public Double calcDrugDose(Drug aDrug) 
	{
		// Still unsure of the calculations
		return null;
	}

	public List<Drug> retrieveDrugList(Long id) throws DataAccessException
	{
		String hql = "select d from Drug d where d.user.id = :userId";
		Query query = entityManager.createQuery(hql);
		query.setParameter("userId", id);
		@SuppressWarnings("unchecked")
		List<Drug> d = (List<Drug>)query.getResultList();
		return d;
	}

	public Drug getDrug(Long id) throws DataAccessException
	{
		String hql = "select d from Drug d where d.id = :id";
		Query query = entityManager.createQuery(hql);
		query.setParameter("id", id);
		return (Drug)query.getSingleResult();
	}

}
