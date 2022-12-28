package com.crud.tasks.domain;

import com.crud.tasks.controller.TaskNotFoundException;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tasks")
public class Task {
   @Id
   @GeneratedValue
   private Long id;
   @Column(name = "name")
   private String title;
   @Column(name = "description")
   private String content;
   
}
