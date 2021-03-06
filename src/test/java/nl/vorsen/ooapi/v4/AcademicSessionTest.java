package nl.vorsen.ooapi.v4;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Map;

public class AcademicSessionTest extends AbstractBeanTest {

    @Test
    public void marshal_shouldSucceed() throws JsonProcessingException {
        AcademicSession session = new AcademicSession();
        session.setStartDate(LocalDate.of(2020, 9, 1));

        String json = objectMapper.writeValueAsString(session);
        Map<String, Object> values = objectMapper.readValue(json, Map.class);
        Assertions.assertEquals("2020-09-01", values.get("startDate"));
        Assertions.assertNull(values.get("endDate"));
    }

}
