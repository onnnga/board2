package org.zerock.board.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude ="writer") //문자열 변환 하지 않음(Writer->객체화<membr
public class Board extends BaseEntity{
    @Id //PK ->댓글 연결
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동번호 생성
    private Long bno;

    private String title;

    private String content;

    // 작성자 이메일 fk처리
    @ManyToOne(fetch = FetchType.LAZY) //지연로딩(호출할때만 조인)
    private Member writer; //Memer엔티티의 pk를fk와 연결

    public void changeTitle(String title){
        this.title = title;
    }

    public void changeContent(String content){
        this.content = content;
    }
}
