package com.quiz.app.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;           // The main question text
    private String description;     // Additional explanation or context

    @ElementCollection
    private List<String> options;   // Multiple choice options

    private int correctAnswerIndex; // Correct option index (0,1,2,3)

    private String topic;           // e.g., Java, DSA
    private int difficulty;         // e.g., 1=Easy, 2=Medium, 3=Hard

    // ✅ Constructor matching QuizApplication.java seeding
    public Question(String title, String description, List<String> options,
                    int correctAnswerIndex, String topic, int difficulty) {
        this.title = title;
        this.description = description;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
        this.topic = topic;
        this.difficulty = difficulty;
    }
}
