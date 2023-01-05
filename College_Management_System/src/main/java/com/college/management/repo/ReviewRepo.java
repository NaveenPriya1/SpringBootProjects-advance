package com.college.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.management.entities.Review;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Long>{
    
	Review findReviewByCourseId(long courseId);
	
	Review findReviewByCoursename(String courseName);
}
