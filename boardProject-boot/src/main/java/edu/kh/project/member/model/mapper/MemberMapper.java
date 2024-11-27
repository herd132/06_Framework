package edu.kh.project.member.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;

@Mapper
public interface MemberMapper {

	/** 로그인 SQL 실행
	 * @param memberEmail
	 * @return longinMember
	 */
	Member login(String memberEmail) throws Exception;

	/** 이메일 중복검사
	 * @param memberEmail
	 * @return count
	 */
	int checkEmail(String memberEmail);

	/** 닉네임 중복검사
	 * @param inputNickname
	 * @return
	 */
	int checkNickname(String memberNickname);

	/** 회원가입 SQL 실행
	 * @param inputMember
	 * @return result
	 */
	int signup(Member inputMember);

	List<Member> selectMemberList();


}
