package nl.vorsen.ooapi.v4;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class AcademicSession extends Data {

    public static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm.ssS'Z'";

    private String academicSessionId;
    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    private ZonedDateTime startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    private ZonedDateTime endDate;

    private AcademicSession year;
    private AcademicSession parent;

}
