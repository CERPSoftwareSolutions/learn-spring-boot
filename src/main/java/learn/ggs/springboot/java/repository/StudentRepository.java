package learn.ggs.springboot.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import learn.ggs.springboot.java.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
