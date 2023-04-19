package com.example.grademanagement_hamzarami.repositories;

import com.example.grademanagement_hamzarami.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
