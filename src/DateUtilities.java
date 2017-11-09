/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author mattkirchner
 */
public class DateUtilities {
    /**
     * Format a LocalDateTime object into a string based on a default format
     *
     * @param date - an object with a date and time value 
     * @return a string based on the default format (12 01 2017)
     * @throws IllegalArgumentException if date argument is null
     */
    public final String toStringDefaultFormat(LocalDateTime date) throws IllegalArgumentException {
        if (date == null) {
            throw new IllegalArgumentException("Error: date argument cannot be null");
        }
        DateTimeFormatter defaultFormat = DateTimeFormatter.ofPattern("MM dd yyyy");
        return defaultFormat.format(date);
    }
    
    /**
     * Format a LocalDateTime object into a string based on the specified pattern.
     *
     * @param date -  an object with a date and time value
     * @param custFormat - a String to format the LocalDateTime based on DateTimeFormatter class
     * @return a String based on the specified pattern
     * @throws IllegalArgumentException if date is not recognized
     * @throws ParseException if date string cannot be parsed as a date
     */
    public final String toStringCustomnFormat(LocalDateTime date, String custFormat) throws IllegalArgumentException {
        if (date == null) {
            throw new IllegalArgumentException("Error: date argument cannot be null");
        }
        DateTimeFormatter defaultFormat = DateTimeFormatter.ofPattern(custFormat);
        return defaultFormat.format(date);
    }
    
    /**
     * Format a String based on a default pattern.
     *
     * @param date - a String version of a date and time object (String format must match default format(12 01 2017))
     * @return a LocalDateTime based on a default pattern
     * @throws IllegalArgumentException if date is not recognized
     */
    public final LocalDateTime toLocalDateTimeDefaultFormat(String date) throws ParseException{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        return LocalDateTime.parse(date, formatter);
    }
    
    /**
     * Format a String based on a default pattern.
     *
     * @param date - a String version of a date and time object (String format must match default format)
     * @param custFormat - a String to use as the format for the LocalDateTime
     *                     object to be returned in
     * @return a LocalDateTime based on a default pattern
     * @throws IllegalArgumentException if date is not recognized
     * @throws ParseException if date string cannot be parsed as a date
     */
    public final LocalDateTime toLocalDateTimecustomFormat(String date, String custFormat) throws ParseException{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(custFormat);
        return LocalDateTime.parse(date, formatter);
    }
    
    /**
     * Format a String based on a default pattern.
     *
     * @param startDate - a LocalDateTime object
     * @param endDate - a LocalDateTime object
     * @return a duration of the difference of the two objects passed in
     */
    public final Duration dateDiffernce(LocalDateTime startDate, LocalDateTime endDate){
        return Duration.between(startDate, endDate);
    }
}
