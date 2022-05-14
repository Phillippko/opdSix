package com.example.demo.repository;

import com.example.demo.model.Yaoy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YaoyRepository extends JpaRepository<Yaoy, Long> {
}
