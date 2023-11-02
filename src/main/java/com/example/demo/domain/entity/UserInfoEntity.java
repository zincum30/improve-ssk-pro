package com.example.demo.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "user_info")
public class UserInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userInfoId;
    private Long userNo;
    private String userName;
    private String phone;
    private String email;
    private String birthday;
    private String sex;

    @CreatedDate
    LocalDateTime registDate;

    @Builder
    public UserInfoEntity(String userName, String phone, String email, String birthday,String sex) {
        this.userName = userName;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
        this.sex = sex;
    }

}
