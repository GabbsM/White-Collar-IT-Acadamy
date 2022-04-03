package com.ItAcademy.WhiteCollars.repository;

import com.ItAcademy.WhiteCollars.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop,Integer> {
}
