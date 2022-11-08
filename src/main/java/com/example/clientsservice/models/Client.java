package com.example.clientsservice.models;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode
@ToString
//
@Entity
@Table(name = "clients")
public class Client {
    public enum Gender {
        NONE,MALE,FEMALE
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 20,nullable = false)
    private String surname;
    @Column(length = 50,nullable = false)
    private String name;
    @Column(length = 50,nullable = false)
    private String patronymic;
    @Column(nullable = false, columnDefinition = "int(1) default 0")
    private Gender gender;
    @Column(length = 50,nullable = false,unique = true)
    private String email;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private Set<Phone> phones;
}
