package com.ItAcademy.WhiteCollars.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "pictures")
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_picture")
    private int id;
    @Column(name = "author")
    private String autor;
    @Column(name = "picture_name")
    private String pictureName;
    @Column(name = "price")
    private double price;

    @Temporal(TemporalType.DATE)
    @Column(name = "entry_date")

    // IMPORTANTE!!: Siempre que se pueda hora en formato ISO
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date entryDate;

    @Column(name = "shop_id")
    private int shopId;




}
