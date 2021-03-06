package test.dao;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;

import tech.lapsa.epayment.dao.QazkomOrderDAO.QazkomOrderDAOLocal;
import tech.lapsa.epayment.domain.QazkomOrder;
import tech.lapsa.java.commons.exceptions.IllegalArgument;
import tech.lapsa.java.commons.function.MyNumbers;

public class QazkomOrderDAOTest extends ArquillianBaseTestCase {

    @Inject
    private QazkomOrderDAOLocal dao;

    @Test
    public void createNewTest() throws IllegalArgument {
	final QazkomOrder entity = dao.save(EntitiesHelper.qazkomOrder());
	assertThat(entity, not(nullValue()));
	assertTrue(MyNumbers.positive(entity.getId()));
	assertThat(entity.getForInvoice(), not(nullValue()));
	assertTrue(MyNumbers.positive(entity.getForInvoice().getId()));
    }
}
