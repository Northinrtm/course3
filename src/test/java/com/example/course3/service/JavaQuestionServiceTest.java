package com.example.course3.service;

import com.example.course3.domain.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {

    private final JavaQuestionService out = new JavaQuestionService();

    @BeforeEach
    void setUp() {
        Question q1 = new Question("q1", "a1");
        Question q2 = new Question("q2", "a2");
        Question q3 = new Question("q3", "a3");
    }

    @Test
    void add() {
        Question q1 = new Question("q1", "a1");
        assertEquals(q1, out.add("q1", "a1"));
    }

    @Test
    void testAdd() {
        Question q1 = new Question("q1", "a1");
        assertEquals(q1, out.add(q1));
    }

    @Test
    void remove() {
        Question q1 = new Question("q1", "a1");
        out.add(q1);
        assertEquals(q1, out.remove(q1));
    }

    @Test
    void getAll() {
        Question q1 = new Question("q1", "a1");
        Question q2 = new Question("q2", "a2");
        Question q3 = new Question("q3", "a3");

        Set<Question> excpected = new HashSet<>();
        excpected.add(q1);
        excpected.add(q2);
        excpected.add(q3);

        out.add(q1);
        out.add(q2);
        out.add(q3);

        assertArrayEquals(excpected.toArray(), out.getAll().toArray());
    }

    @Test
    void getRandomQuestion() {
    }
}