package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users", schema = "public")
public class User {
    @Id
    private String username;

    private String firstname;

    private String lastname;

    @Column(name = "birth_date")//if
                                // configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
                                //was not configured
    private LocalDate birthDate;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private Role role;

}