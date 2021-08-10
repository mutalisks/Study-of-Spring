package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    private String[] coursePrefix;
    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        boolean result = false;
        if(s != null){
            for(String tempPrefix:coursePrefix){
                result |= s.startsWith(tempPrefix);
            }
        }
        else{
            result = true;
        }
        return result;
    }
}
