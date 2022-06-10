package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDate {
    static String get() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }
}
