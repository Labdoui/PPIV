package com.sncf.fab.myfirstproject.business
import org.joda.time.DateTime
import org.apache.spark.sql.functions.unix_timestamp
import org.joda.time.format.DateTimeFormat

/**
  * Created by simoh-labdoui on 11/05/2017.
  * Table issue des fichiers TGA/TGD filtrer et nettoyée (Avec formattage des champs)
  */

case class TgaTgdParsed(gare:String,maj:String,train:String,ordes:String,num:String,tgatype:String,picto:String,attribut_voie:String,voie:String,heure:String ,etat:String,retard:Int)


