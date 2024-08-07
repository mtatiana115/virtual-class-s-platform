package com.tati.classes_platform.domain.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

@Entity(name = "students")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(length = 20, nullable = false)
  private Long id;

  @Column(length = 255, nullable = false)
  private String name;

  @Column(length = 255, nullable = false)
  private String email;

  @CreationTimestamp
  @Column(nullable = false)
  private LocalDateTime createdAt;

  @Column(nullable = false)
  private Boolean isActive;

  // Relaciones debil many to one

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "class_entity_id", referencedColumnName = "id")
  private ClassEntity classEntity;

}
