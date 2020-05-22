package edu.greenriver.it.securitydemo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Authority implements GrantedAuthority
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorityId;
    private String authority;

    @ManyToOne
    @JoinColumn(name="userId")
    private User user;

    @Override
    public String getAuthority()
    {
        return authority;
    }
}
