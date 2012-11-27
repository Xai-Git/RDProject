package rdproject.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import rdproject.dao.RdOrganizationDao;
import rdproject.model.Organization;

@Repository
public class RdOrganizationDaoImpl implements RdOrganizationDao {

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
	 * if it is new organization info. save it new
	 * else edit and save old organization
	 */
	public void save(Organization anOrg) {
		if (anOrg.getId() ==  null)
		{
			entityManager.persist(anOrg);
		}
		else
		{
			entityManager.merge(anOrg);
		}
		
	}
	
	public Organization getOrg(Long id) {
		String hql = "select o from Organization o where o.user.id = :id";
		Query query = entityManager.createQuery(hql);
		query.setParameter("id", id);
		return (Organization)query.getSingleResult();
	}

}
