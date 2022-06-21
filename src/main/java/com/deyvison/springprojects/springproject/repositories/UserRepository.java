package com.deyvison.springprojects.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deyvison.springprojects.springproject.User;

public interface UserRepository extends JpaRepository <User,Long>{

	
	
}
