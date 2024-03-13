package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.model.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("SELECT s FROM Student s ORDER BY s.gpa DESC")
    List<Student> findNameAndGpaOrderByGpaDesc(Pageable pageable);
    @Query(value = "SELECT string_agg(name, ', ') AS all_student_names FROM students", nativeQuery = true)
    String findAllStudentNamesConcatenated();
}