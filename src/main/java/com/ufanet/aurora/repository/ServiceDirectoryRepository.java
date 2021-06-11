package com.ufanet.aurora.repository;

import com.ufanet.aurora.repository.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceDirectoryRepository extends JpaRepository<ServiceEntity, Integer> {
}

