package org.example.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.converter.BirthdayConverter;
import org.hibernate.annotations.Type;

import javax.persistence.*;

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
    @Convert(converter = BirthdayConverter.class)
    private Birthday birthDate;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Type(type= "com.vladmihalcea.hibernate.type.json.JsonBinaryType")
    private String info;

}