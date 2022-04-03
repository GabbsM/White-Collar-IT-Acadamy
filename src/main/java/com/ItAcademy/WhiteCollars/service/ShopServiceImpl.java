package com.ItAcademy.WhiteCollars.service;

import com.ItAcademy.WhiteCollars.entity.Picture;
import com.ItAcademy.WhiteCollars.entity.Shop;
import com.ItAcademy.WhiteCollars.repository.PictureRepository;
import com.ItAcademy.WhiteCollars.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopRepository shopRepository;
    @Autowired
    private PictureRepository pictureRepository;

    @Override
    public List<Shop> findall() {
        return shopRepository.findAll();
    }

    @Override
    public Shop create(Shop shop) {
        return shopRepository.save(shop);
    }

    @Override
    public Optional<Shop> findById(Integer id) {
        return shopRepository.findById(id);
    }

    @Override
    public Shop deleteById(Integer id) {
        shopRepository.deleteById(id);

        return null;
    }

    public Picture addPicture(int shopId, Picture picture){

        Optional<Shop> optionalShop = shopRepository.findById(shopId);
        if(optionalShop.isPresent()) {
            picture.setShopId(shopId);
            optionalShop.get().getPictures().add(picture);
            shopRepository.save(optionalShop.get());
            return picture;
        } else {
            return null;
        }

    }


    public List<Picture> findPictureByIdShop(int shopId){
       Shop shop = shopRepository.findById(shopId).get();
       return shop.getPictures();

    }

    @Transactional
    public void deletePicturebyIdShop(int shopId){
        Shop shop = shopRepository.getById(shopId);

        for (int i = 0; i < shop.getPictures().size(); i++) {
            Picture picture = shop.getPictures().get(0);
            shop.getPictures().remove(picture);
            pictureRepository.delete(picture);
        }
//
        shopRepository.save(shop);
    }
}
