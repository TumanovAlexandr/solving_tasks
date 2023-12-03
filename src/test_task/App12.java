package test_task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class App12 {
    static DateTimeFormatter MULTIFORMAT_DATE = new DateTimeFormatterBuilder()
            .parseCaseInsensitive()
            .optionalStart()
            .append(DateTimeFormatter.ISO_OFFSET_DATE)
            .optionalEnd()
            .optionalStart()
            .append(DateTimeFormatter.ISO_LOCAL_DATE)
            .optionalEnd()
            .optionalStart()
            .appendValue(ChronoField.DAY_OF_MONTH, 2)
            .appendLiteral('.')
            .appendValue(ChronoField.MONTH_OF_YEAR, 2)
            .appendLiteral('.')
            .appendValue(ChronoField.YEAR, 4)
            .optionalEnd()
            .toFormatter(Locale.ENGLISH)
            .withResolverStyle(ResolverStyle.STRICT);

    public static void main(String[] args) {
        String dateString3 = "02.12.2001";
        LocalDate parsedDate3 = toLocalDate(dateString3);
        System.out.println("Parsed LocalDate: " + parsedDate3);
    }

    public static LocalDate toLocalDate(String date) {
        return LocalDate.parse(date, MULTIFORMAT_DATE);
    }
}
