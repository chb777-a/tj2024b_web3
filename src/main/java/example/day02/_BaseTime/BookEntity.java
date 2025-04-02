package example.day02._BaseTime;

import jakarta.persistence.*;
import lombok.Data;

@Entity // DB테이블과 매핑
@Table(name = "day02book") // db테이블명 정의
@Data
public class BookEntity extends BaseTime {
    // auto increment 자동번호 부여하기위한 int타입 / pk 선정
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private int 도서번호;

    @Column(nullable = false , length = 100) // not null , varchar(100)
    private String 도서명;

    @Column(nullable = false , length = 30) // not null , varchar(30)
    private String 저자;

    @Column(nullable = false , length = 50) // not null , varchar(50)
    private String 출판사;

    @Column
    private int 출판연도;
}
