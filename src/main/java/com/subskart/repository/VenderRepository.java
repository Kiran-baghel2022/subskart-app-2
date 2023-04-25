package com.subskart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subskart.entity.Vender;

@Repository
public interface VenderRepository extends JpaRepository<Vender, Long>{

}
