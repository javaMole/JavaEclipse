package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Tourist;

public interface IRepository extends JpaRepository<Tourist, Integer> {
	


}
