package com.spring.backend.repository;

import com.spring.backend.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData,Long> {
   Optional<ImageData> findByName(String fileName);
}
