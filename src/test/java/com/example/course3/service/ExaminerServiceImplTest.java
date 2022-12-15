package com.example.course3.service;

import com.example.course3.domain.Question;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    private final QuestionService questionService = mock(QuestionService.class);
    private final ExaminerService out = new ExaminerServiceImpl(questionService);

    @Test
    void getQuestions() {
        Question q1 = new Question("q1","a1");
        Question q2 = new Question("q2","a2");
        Question q3 = new Question("q2","a3");

        Collection<Question> expected = new HashSet<>();
        expected.add(q1);
        expected.add(q2);
        expected.add(q3);


    }
}