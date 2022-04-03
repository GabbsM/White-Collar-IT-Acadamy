package com.ItAcademy.WhiteCollars.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table (name ="shops")
public class Shop {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shop")
    private int id;


    @Column(name = "shop_capacity")
    private int capacity;
    @Column (name =  "nombre")
    private String nombre;

    @OneToMany(mappedBy = "shopId",cascade = CascadeType.ALL)
    private List<Picture> pictures;



}
