package edu.greenriver.it.jpademo.services;

import edu.greenriver.it.jpademo.entities.Cake;
import edu.greenriver.it.jpademo.repositories.ICakeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CakeService
{
    private ICakeRepository repo;

    public CakeService(ICakeRepository repo)
    {
        this.repo = repo;
    }

    public List<Cake> getAllCakes()
    {
        return StreamSupport.stream(
            repo.findAll().spliterator(), false)
            .collect(Collectors.toList());
    }

    public Optional<Cake> getCake(String flavor)
    {
        return repo.findCakeByFlavor(flavor);
    }
}
