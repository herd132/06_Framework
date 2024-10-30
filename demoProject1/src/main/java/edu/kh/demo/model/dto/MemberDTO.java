package edu.kh.demo.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// Lombok 라이브러리 이용

@Getter
@Setter
@NoArgsConstructor
@ToString

public class MemberDTO {

	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	
}

