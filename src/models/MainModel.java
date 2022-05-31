/*
* File: MainModel.java
* Author:Megyeri Márk Máté
* Copyright: 2022, Megyeri Márk Máté 
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/megyerimark/
* Licenc: GNU GPL
*/

package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {

    public Group[] groupArray = {
            new Group(1, "Könyvelő"),
            new Group(2, "Portás"),
            new Group(3, "Csoportvezető"),
            new Group(4, "Pultos"),
            new Group(5, "Rendszergazda"),
            new Group(6, "Igazgató"),
            new Group(7, "Ügyintéző"),
            new Group(8, "Csoportvezető"),
            new Group(9, "Értékesítési igazgató "),
            new Group(10, "Vállalatvezető általános helyettes "),
            new Group(11, "Alkalmazott"),
            new Group(12, "A program készítője")
    };
    public Vector<Group> groupList = new Vector<>(Arrays.asList(groupArray));

    public Workers[] workerArray = {
            new Workers(1, "Dr.Pala Imre", 1),
            new Workers(2, "Csobán Ákos", 10),
            new Workers(3, "Varga Zéta", 5),
            new Workers(4, "Kisladányi Jolán", 6),
            new Workers(5, "Perde Laura", 8),
            new Workers(6, "Dr.Dénes Martina", 9),
            new Workers(7, "Kala Pál", 2),
            new Workers(8, "Bangó Margit", 4),
            new Workers(9, "Verga Viola", 10),
            new Workers(10, "Dr.Cserde János", 1),
            new Workers(11, "Beharaczky András", 3),
            new Workers(12, "Boár János", 5),
            new Workers(13, "Varga János", 8),
            new Workers(14, "Zorba Zenóbia", 7),
            new Workers(14, "Frigyes András", 3),
            new Workers(14, "Fábián Zsende", 5),
            new Workers(14, "Zsiráf Zoltán", 8),
            new Workers(14, "Mercédesz Benz", 4),
            new Workers(14, "Vertes Klaudia", 7),
            new Workers(14, "Molnár Augél", 3),
            new Workers(14, "Frankó Flórián", 11),
            new Workers(14, "Gali Leo", 11),
            new Workers(14, "János Vitéz", 11),
            new Workers(14, "Megyeri Márk Máté", 12)
    };
    public Vector<Workers> workersList = new Vector<>(Arrays.asList(workerArray));

}
