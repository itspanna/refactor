/*
* File: Store.java
* Author: Sallai András
* refactored by: Teleki Panna
* Copyright: 2024, Sallai András
* Group: szit
* Date: 2025-01-08
* Version: 0.0.2
* Github: https://github.com/oktat/
* Licenc: MIT
*/

//Itt következik a Store osztály
public class Store {
    
    //Az adattagok
    String a ;
    
    String pass;
    
    String place;
    
    //Konstruktor
    public Store(String a, String pass, String place) {
        //Előkészítjük az adattagokat
        this.a = a;
        this.pass = pass;
        this.place = place;
    }
    
    //Visszaadja a felhasználónevet
    public String a () {
        return a;
    }

    //Visszaadja a jelszót
    public String retrieval() {
        return pass;
    }
    
    //Visszaadja a helyet
    public boolean hollow() {
        return "".equals(this.pass);
    }
    
    //hely visszaadása es az adattagok frissitve
    
}
