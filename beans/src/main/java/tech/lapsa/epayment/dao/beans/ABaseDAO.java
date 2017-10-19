package tech.lapsa.epayment.dao.beans;

import static com.lapsa.kkb.jpaUnit.KKBConstants.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tech.lapsa.patterns.dao.beans.AGeneralDAO;

public abstract class ABaseDAO<T, I> extends AGeneralDAO<T, I> {

    protected ABaseDAO(Class<T> entityClazz) {
	super(entityClazz);
    }

    @PersistenceContext(unitName = PERSISTENCE_UNIT_NAME)
    protected EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
	return em;
    }
}
