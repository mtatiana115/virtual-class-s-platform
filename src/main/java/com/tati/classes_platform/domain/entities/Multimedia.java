package com.tati.classes_platform.domain.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.tati.classes_platform.util.enums.Type;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "multimedias")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Multimedia {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(length = 20, nullable = false)
  private Long id;

  @Column(length = 255, nullable = false)
  private String url;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private Type type;

  @CreationTimestamp
  @Column(nullable = false)
  private LocalDateTime createdAt;

  @Column(nullable = false)
  private Boolean isActive;

  // Relaciones dedbil many to one

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "lesson_id", referencedColumnName = "id")
  private Lesson lesson;
}
