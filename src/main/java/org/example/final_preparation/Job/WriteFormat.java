package org.example.final_preparation.Job;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface WriteFormat{
    CaseFormat format() default CaseFormat.ORDINARY;
}