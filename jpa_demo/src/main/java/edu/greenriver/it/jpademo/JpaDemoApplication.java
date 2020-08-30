package edu.greenriver.it.jpademo;

import edu.greenriver.it.jpademo.entities.*;
import edu.greenriver.it.jpademo.repositories.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class JpaDemoApplication
{
    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(JpaDemoApplication.class, args);

        ICakeRepository cakeRepo = context.getBean(ICakeRepository.class);

        Cake cake1 = Cake.builder()
            .flavor("Chocolate")
            .build();
        Cake cake2 = Cake.builder()
                .flavor("Carrot")
                .build();

        cakeRepo.save(cake1);
        cakeRepo.save(cake2);
    }

    public void foo()
    {
//        ApplicationContext context = SpringApplication.run(JpaDemoApplication.class, args);
//
//        //access our repositories as beans
//        IPersonRepository personRepo = context.getBean(IPersonRepository.class);
//        IAddressRepository addressRepo = context.getBean(IAddressRepository.class);
//        IPhoneNumberRepository numberRepo = context.getBean(IPhoneNumberRepository.class);
//        IBusinessRepository businessRepo = context.getBean(IBusinessRepository.class);
//
//        //add a few entities to our database
//        Person person = Person.builder()
//                .name("Barry Smith")
//                .nickname("The Soldier")
//                .numbers(new ArrayList<>()) //note here...
//                .jobs(new ArrayList<>())
//                .build();
//
//        Address address = Address.builder()
//                .number(1000)
//                .street("Turtle Lane")
//                .city("Tacoma")
//                .zip(99999)
//                .state("WA")
//                .build();
//
//        PhoneNumber[] numbers = {
//                PhoneNumber.builder().areaCode(300).number(9995555).build(),
//                PhoneNumber.builder().areaCode(253).number(8887777).build(),
//                PhoneNumber.builder().areaCode(360).number(4443333).build(),
//                PhoneNumber.builder().areaCode(301).number(2221111).build()
//        };
//
//        //save the transient objects
//        personRepo.save(person);
//        addressRepo.save(address);
//
//        //save numbers
//        Arrays.stream(numbers).forEach(num -> {
//            num.setPerson(person);
//            numberRepo.save(num);
//            person.getNumbers().add(num);
//        });
//
//        //connect the objects
//        person.setAddress(address);
//        address.setPerson(person);
//
//        //save on the owning side of the relationship
//        personRepo.save(person);
//
//        Person person2 = Person.builder()
//                .name("Susan")
//                .jobs(new ArrayList<>())
//                .build();
//
//        Business business = Business.builder()
//                .name("Costco")
//                .employees(new ArrayList<>())
//                .build();
//
//        Business business2 = Business.builder()
//                .name("Nordstrom")
//                .employees(new ArrayList<>())
//                .build();
//
//        //persist transient objects
//        personRepo.save(person2);
//        businessRepo.save(business);
//        businessRepo.save(business2);
//
//        //create some relationships
//        person.getJobs().add(business);
//        person.getJobs().add(business2);
//        person2.getJobs().add(business);
//
//        //save them
//        personRepo.save(person);
//        personRepo.save(person2);
    }
}
