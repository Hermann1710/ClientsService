package com.example.clientsservice.models;

import lombok.*;

import javax.management.relation.Role;
import javax.persistence.*;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @ToString
//
    @Entity
    @Table(name = "users")
    public class User   {
        public enum Status {
            CREATED, ACTIVE,BLOCKED
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        @Column(length = 50, nullable = false,unique = true)
        private String username;
        @Column(nullable = false)
        private String password;
        @Column(nullable = false)
        private Role role;
        @Column(nullable = false)
        private Status status;


    }

