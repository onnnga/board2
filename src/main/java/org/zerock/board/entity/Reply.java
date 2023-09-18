package org.zerock.board.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "board") //board객체는 문자열처리하지않음
public class Reply extends  BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//자동번호 생성
    private  Long rno;
    
    private String text;
    
    private String replyer;
    
    //board 연관관계
    @ManyToOne
    private  Board board;
}
