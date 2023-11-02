package com.example.demo.domain.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "user_profile")
public class UserProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileId;
    private Long userNo;
    private String nickname;

    @Column(nullable = true)
    private String introduction;

    @CreatedDate
    LocalDateTime joinDate;

    @LastModifiedDate
    LocalDateTime updateDate;

    @Builder
    public UserProfileEntity(String nickname, @Nullable String introduction) {
        this.nickname = nickname;
        this.introduction = introduction;
    }

}


