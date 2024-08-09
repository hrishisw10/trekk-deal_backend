package com.trek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trek.entity.DashboardEnity;

@Repository
public interface DashboardRepository extends JpaRepository<DashboardEnity, Long> {

}
