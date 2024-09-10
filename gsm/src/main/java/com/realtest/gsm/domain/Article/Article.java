package com.realtest.gsm.domain.Article;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor

public class Article {
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;
}
