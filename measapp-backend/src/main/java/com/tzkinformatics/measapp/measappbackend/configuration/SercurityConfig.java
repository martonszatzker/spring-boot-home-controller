package com.tzkinformatics.measapp.measappbackend.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletResponse;

@Configuration
@Slf4j
public class SercurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private AppConfigurationProperties properties;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**",
                "/swagger-resources/**",
                "/swagger-ui.html",
                "/h2-console",
                "/h2-console/**",
                "/v2/api-docs",
                "/webjars/**");
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();//ha ez nincs akkor 403 forbidden mindenre...?miért?
        http.headers().frameOptions().disable(); //h2-console-nak kell ez valamiért, hogy megjelenjen

    }

    }
