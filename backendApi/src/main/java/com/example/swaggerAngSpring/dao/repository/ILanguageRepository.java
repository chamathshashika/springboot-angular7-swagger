package com.example.swaggerAngSpring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.swaggerAngSpring.dao.entity.Language;

@Repository
public interface ILanguageRepository extends JpaRepository<Language, Long>{

}
