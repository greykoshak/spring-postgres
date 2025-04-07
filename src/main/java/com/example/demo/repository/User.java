package com.example.demo.repository;
import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;
import lombok.extern.log4j.Log4j2;

@Entity @Table(name="users") @Getter @Setter @NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    private String email;
    private LocalDate birth;
    private Integer age;

    public User(Long id, String name, String email, LocalDate birth, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birth = birth;
        this.age = age;
    }

//    public User() {
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birth=" + birth +
                ", age=" + age +
                '}';
    }

//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public LocalDate getBirth() {
//        return birth;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setBirth(LocalDate birth) {
//        this.birth = birth;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
}
