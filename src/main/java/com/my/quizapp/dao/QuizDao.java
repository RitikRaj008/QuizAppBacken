package com.my.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}

