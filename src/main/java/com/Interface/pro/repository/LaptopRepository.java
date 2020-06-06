package com.Interface.pro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Interface.pro.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

	List<Laptop> findAllByName(String name);
	@Query("SELECT l FROM Laptop l WHERE l.name LIKE %:name%")
	List<Laptop> searchAllByNameLike(@Param("name") String name);
}
