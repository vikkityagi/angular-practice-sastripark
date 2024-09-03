package com.bezkoder.spring.jpa.postgresql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bezkoder.spring.jpa.postgresql.model.Tutorial;
import com.bezkoder.spring.jpa.postgresql.resource.TutorialResource;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

  @Query(value="select *from tutorials",nativeQuery=true)
  List<TutorialResource> findAllTutorial();

  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}
