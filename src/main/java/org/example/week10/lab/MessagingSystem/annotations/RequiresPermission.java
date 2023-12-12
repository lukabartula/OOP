package org.example.week10.lab.MessagingSystem.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
public @interface RequiresPermission {
    int value();
}
