package com.example.course3.service;

import com.example.course3.domain.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private Random random = new Random();
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> questionSet = new HashSet<>();
        if (amount > questionService.getAll().size()) {
            throw new OutOfSizeException();
        }
        while (amount > questionSet.size()) {
            questionSet.add(questionService.getRandomQuestion());
        }
        return questionSet;
    }
}
