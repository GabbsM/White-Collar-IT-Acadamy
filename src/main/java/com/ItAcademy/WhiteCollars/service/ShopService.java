package com.ItAcademy.WhiteCollars.service;

import com.ItAcademy.WhiteCollars.entity.Picture;
import com.ItAcademy.WhiteCollars.entity.Shop;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ShopService {

     List<Shop> findall();
     Shop create(Shop shop);
     Optional<Shop> findById(Integer id);
     Shop deleteById(Integer id);
     Picture addPicture(int shopId, Picture picture);
     List<Picture> findPictureByIdShop(int shopId);
     void deletePicturebyIdShop(int shopId);

}
