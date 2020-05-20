package edu.greenriver.it.securitydemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
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
            .inMemoryAuthentication()
            .withUser("admin").password(encoder.encode("password")).roles("REGULAR", "ADMIN")
            .and()
            .withUser("user").password(encoder.encode("password")).roles("REGULAR");
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












