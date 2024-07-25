package com.tati.classes_platform.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tati.classes_platform.api.dto.response.StudentResponseDetails;
import com.tati.classes_platform.infrastructure.abstract_services.IStudentService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/students")
public class StudentController {

  @Autowired
  private final IStudentService studentService;

  @Operation(summary = "Get students by name")
  @GetMapping
  public ResponseEntity<Page<StudentResponseDetails>> getAllByName(
      @RequestParam(defaultValue = "1") int page,
      @RequestParam(defaultValue = "5") int size,
      @RequestParam(defaultValue = "") String name) {

    Pageable pageable = PageRequest.of(page - 1, size);
    return ResponseEntity.ok(studentService.findAllByName(pageable, name));
  }

}
