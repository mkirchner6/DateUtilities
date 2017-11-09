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
     * @param LocalDateTime 
     * @return a string based on the default format
     * @throws IllegalArgumentException if pattern is not recognized
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
     * @param LocalDateTime 
     * @param pattern - a String to format the LocalDateTime
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
     * @param String
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
     * @param String
     * @param pattern - a String to format the LocalDateTime
     * @return a LocalDateTime based on a default pattern
     * @throws IllegalArgumentException if date is not recognized
     * @throws ParseException if date string cannot be parsed as a date
     */
    public final LocalDateTime toLocalDateTimecustomFormat(String date, String custFormat) throws ParseException{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(custFormat);
        return LocalDateTime.parse(date, formatter);
    }
}
