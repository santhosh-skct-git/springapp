package com.examly.springapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Review;

@Repository
public interface ReviewDao extends JpaRepository<Review,Long>{
    
}
