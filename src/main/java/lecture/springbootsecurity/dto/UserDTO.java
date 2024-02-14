package lecture.springbootsecurity.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;

// DTO : 사용하는 객체를 정의 , 테이블에 대한 요청/응답 부분을 넣는 파일

@Getter
@Builder
public class UserDTO {
    private long id;

    private String username;

    private String email;

    private String password;
}
