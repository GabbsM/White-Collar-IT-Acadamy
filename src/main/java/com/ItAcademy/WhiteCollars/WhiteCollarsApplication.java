package com.ItAcademy.WhiteCollars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//		Tenim una franquicia de botiga de quadres il·legals que fa veure que ven collarets blancs,
//		per això es diu “white collar”.
//		Aquesta franquicia té varies botigues, cadascuna amb un nom i una capacitat màxima de quadres (o collars^^).
//		Hi ha quadres que tenen un nom d’autor i d’altres que són anònims. Això sí, tots tenen un nom, un preu i una
//		data d’entrada (és la data del moment en el que entra a la botiga). El client ens demana implementar una API amb Spring
//		amb les següents funcionalitats:

//		Crear botiga: li direm el nom i la capacitat (POST /shops/). *
//		Llistar botigues: retorna la llista de botigues amb el seu nom i la capacitat (GET /shops/). *
//		Afegir quadre: li donarem el nom del quadre i el del autor (POST /shops/{ID}/pictures)
//		Llistar els quadres de la botiga (GET /shops/{ID}/pictures).
//		Incendiar quadres: per si ve la policia, es poden eliminar tots els quadres de la botiga sense deixar rastre (DELETE /shops/{ID}/pictures).

//Has de tindre en compte els següents detalls de construcció:
//
//		Inclou en un directori de el projecte la col·lecció Postman per a les invocacions http
//		Utilitza el projecte SpringBootInitialDemo com a exemple d'estructura
//		Has de persistir les dades en una base de dades en memòria h2 (inclosa en Spring boot)


@SpringBootApplication
public class WhiteCollarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhiteCollarsApplication.class, args);
	}

}
