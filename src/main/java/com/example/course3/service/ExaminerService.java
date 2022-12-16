package com.example.course3.service;

import com.example.course3.domain.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
