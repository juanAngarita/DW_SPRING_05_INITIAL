package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repo;

    @Override
    public Student SearchById(Long id) {
       return  repo.findById(id).get();
    }

    @Override
    public List<Student> SearchAll() {
        return repo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Student update(Student student) {
        return repo.save(student);
    }

    @Override
    public Student add(Student student) {
        return repo.save(student);
    }

    @Override
    public List<Student> findStudentsFromTeacher(String teacherID) {
        return repo.findStudentsFromTeacher(teacherID);
    }

    @Override
    public List<Student> findStudentsByHomework(String type) {
        return repo.findStudentsByTypeOfHomework(type);
    }
}
