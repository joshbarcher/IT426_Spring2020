package edu.greenriver.it.securitydemo.service;

import edu.greenriver.it.securitydemo.entities.User;
import edu.greenriver.it.securitydemo.repositories.IUsersRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UsersService implements UserDetailsService
{
    private IUsersRepository repo;

    public UsersService(IUsersRepository repo)
    {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        User user = repo.findByUsernameEquals(username);
        if (user == null)
        {
            throw new UsernameNotFoundException("Username not found");
        }
        return user;
    }
}
