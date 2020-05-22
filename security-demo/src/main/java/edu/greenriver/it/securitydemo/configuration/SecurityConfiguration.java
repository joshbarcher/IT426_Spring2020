package edu.greenriver.it.securitydemo.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
    private UserDetailsService service;

    public SecurityConfiguration(UserDetailsService service)
    {
        this.service = service;
    }

    @Bean
    public BCryptPasswordEncoder encoder()
    {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        BCryptPasswordEncoder encoder = encoder();

        auth
            .userDetailsService(service)
            .passwordEncoder(encoder);
    }

    @Override
    public void configure(WebSecurity web) throws Exception
    {
        web
            .ignoring().antMatchers("/resources/**")
            .and()
            .ignoring().antMatchers("/h2-console/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http
            .authorizeRequests()
                .antMatchers("/userpages/**")
                    .hasAnyRole("REGULAR", "ADMIN")
                .antMatchers("/adminpages/**")
                    .hasAnyRole("ADMIN")
                .antMatchers("/**")
                    .permitAll()
            .and()
            .formLogin()
                .permitAll()
                .loginProcessingUrl("/login");
    }
}












