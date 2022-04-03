package com.ItAcademy.WhiteCollars.repository;

import com.ItAcademy.WhiteCollars.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends JpaRepository<Picture,Integer> {
}
