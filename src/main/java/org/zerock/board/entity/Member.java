package org.zerock.board.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter //데이터베이스에 내용을 가져오는 역할
@ToString //객체 문자열 변환
public class Member  extends BaseEntity{
        //최근 트랜드는 이메일주소로 기본키를 만듬.

    @Id //pk
    private String email;

    private String password;

    private String name;
}
