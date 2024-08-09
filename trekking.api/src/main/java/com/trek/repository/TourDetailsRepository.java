package com.trek.repository;

import com.trek.entity.TourDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourDetailsRepository extends JpaRepository<TourDetail, Long> {

}
