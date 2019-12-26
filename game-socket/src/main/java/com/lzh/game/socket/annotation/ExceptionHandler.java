package com.lzh.game.socket.annotation;

import java.lang.annotation.*;

/**
 * Exception type handler{@link ControllerAdvice}
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExceptionHandler {
    /**
     * Exceptions handled by the annotated convent. If empty, will default to any
     * exceptions listed in the convent argument list.
     */
    Class<? extends Throwable>[] value() default {};
}
