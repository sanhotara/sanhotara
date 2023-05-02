package com.springsecurity.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityAppInitializer extends AbstractSecurityWebApplicationInitializer{
    public SecurityAppInitializer(){
    //     super(SecurityConfig.class); //If NOT using SpringMVC, we need to pass the SecurityConfig class to superclass
    }
}
