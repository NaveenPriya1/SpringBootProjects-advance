package com.college.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.management.entities.Timetable;

@Repository
public interface TimetableRepo extends JpaRepository<Timetable, Long>{

}
