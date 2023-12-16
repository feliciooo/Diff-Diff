/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.renturatailrecur;

/**
 *
 * @author user
 */
import java.util.*;
import java.io.*;

public class RenturaTailRecursion {

    public static void main(String[] args) {
        
        String albumList[] = {"Frank Ocean  / White Ferrari", "Tyler, The Creator / She", "Playboi Carti / FlatBed Freestyle", "Steve Lacy / Donchano", "Travis Scott"};
        
        ArrayList <String> alList = new ArrayList<String>(Arrays.asList(albumList));
        
        String artistList[] = {"Frank Ocean", "Tyler, The Creator", "Playboi Carti", "Steve Lacy", "Travis Scott"};
        
        ArrayList <String> arList = new ArrayList<String>(Arrays.asList(artistList));   
        
        String songList[] = {"White Ferrari", "She", "FlatBed Freestyle", "Donchano", "Carousel"};
        
        ArrayList <String> soList = new ArrayList<String>(Arrays.asList(songList));
        
        Iterator <String> listAl = null;
        Iterator <String> listAr = null;
        Iterator <String> listSo = null;
        
        listAl = alList.listIterator();
        listAr = arList.listIterator();
        listSo = soList.listIterator();
        
        System.out.printf("%-18s %-18s %-25s\n", "Album", "Artist", "Songs");
        
        while (listAl.hasNext() && listAr.hasNext() && listSo.hasNext()){
        
        System.out.printf( "%-18s %-18s %-25s\n", listAl.next(),listAr.next(), listSo.next());
        }
        
    
    }
}