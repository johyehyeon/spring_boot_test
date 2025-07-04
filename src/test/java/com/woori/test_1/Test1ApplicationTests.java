package com.woori.test_1;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woori.test_1.question.Question;
import com.woori.test_1.question.QuestionRepository;

@SpringBootTest
class Test1ApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void contextLoads() {
		Question q1 = new Question();
		q1.setSubject("sbb가 무엇인가요?알려주세요");
		q1.setContent("좀 더 알고싶어요");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);

		Question q2 = new Question();
		q2.setSubject("스프링부트 모델.");
		q2.setContent("id는 자동으로 생성되나요?");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);

	}

}
