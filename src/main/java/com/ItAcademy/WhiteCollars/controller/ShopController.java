package com.ItAcademy.WhiteCollars.controller;

import com.ItAcademy.WhiteCollars.entity.Picture;
import com.ItAcademy.WhiteCollars.entity.Shop;
import com.ItAcademy.WhiteCollars.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    private ShopService shopService;

    //Crear botiga: li direm el nom i la capacitat (POST /shops/)
    //Create a shop
    @PostMapping("/")
    public ResponseEntity<Shop>createShop(@RequestBody Shop shop){
        return ResponseEntity.status(HttpStatus.CREATED).body(shopService.create(shop));

    }

    // Llistar botigues: retorna la llista de botigues amb el seu nom i la capacitat (GET /shops/). *
    // Show all shops
    @GetMapping("/allshops")
    public List<Shop>getallshops(){
        return shopService.findall();
    }



     //Afegir quadre: li donarem el nom del quadre i el del autor (POST /shops/{ID}/pictures)
    // Create a picture
    @PostMapping("/{id}/picture")
    public ResponseEntity<Picture>createPicture(
            @PathVariable(value = "id") int id,
            @RequestBody Picture picture) {
        Picture picture1 = shopService.addPicture(id,picture);
        if(picture1==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(picture1);
    }

    // Llistar els quadres de la botiga (GET /shops/{ID}/pictures).

    @GetMapping("/{id}/pictures")
    public List<Picture>getPicturebyIdShop(@PathVariable int id){
        return shopService.findPictureByIdShop(id);
    }


    //Incendiar quadres: per si ve la policia, es poden eliminar tots els quadres de la botiga
    // sense deixar rastre.

    @DeleteMapping("/{id}/pictures")
    public void deletePicturesByIdShop(@PathVariable int id){
        shopService.deletePicturebyIdShop(id);
    }

}
