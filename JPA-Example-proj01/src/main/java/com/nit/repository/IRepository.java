package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Phone;

public interface IRepository extends JpaRepository<Phone, Integer> {

}
