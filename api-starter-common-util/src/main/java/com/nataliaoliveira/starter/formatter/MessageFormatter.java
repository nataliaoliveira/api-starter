package com.nataliaoliveira.starter.formatter;

/**
 * Created by: Natália Oliveira
 * Date: 09/08/2019 18:02
 */
public class MessageFormatter {

    private static final String CURLY_BRACKETS = "{}";
    private static final String PARAMETER_INDICATOR = "%s";

    public static String format(String message, Object... parameters) {
        String template = message.replace(CURLY_BRACKETS, PARAMETER_INDICATOR);
        return String.format(template, parameters);
    }

}
