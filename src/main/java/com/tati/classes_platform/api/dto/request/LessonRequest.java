package com.tati.classes_platform.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LessonRequest {

  @NotBlank(message = "Title is required")
  @Size(min = 2, max = 255, message = "Title must be between 2 and 255 characters")
  @Schema(description = "Title of the lesson", example = "Introduction to Maths")
  private String title;

  @NotBlank(message = "Content is required")
  @Size(min = 2, max = 1000, message = "Content must be between 2 and 1000 characters")
  @Schema(description = "Content of the lesson", example = "Details to Maths")
  private String content;

  @NotBlank(message = "Active status is required")
  @Schema(description = "Indicates if the class is active", example = "true")
  private Boolean isActive;

}
