package com.nataliaoliveira.starter.exception;

import com.nataliaoliveira.starter.formatter.MessageFormatter;

/**
 * Created by: Natália Oliveira
 * Date: 09/08/2019 18:05
 */
public abstract class FormattedException extends Exception {

    public FormattedException(String message) {
        super(message);
    }

    public FormattedException(String message, Object... parameters) {
        super(MessageFormatter.format(message, parameters));
    }

}
