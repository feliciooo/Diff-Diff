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

public class RenturaTailRecur {

    public static void main(String[] args) {
        
        System.out.printf("%-35s %-25s %-25s\n", "Artist", "Song", "Album" + "\n");
        
        LinkedList <String> songList = new LinkedList <>();
        LinkedList <String> albumList = new LinkedList <>();
        LinkedList <String> artistList = new LinkedList <>();
        
        songList.add("White Ferrari");
        songList.add("She");
        songList.add("FlatBed Freestyle");
        songList.add("Donchano");
        songList.add("Carousel");
        
        artistList.add("Frank Ocean");
        artistList.add("Tyler, The Creator");
        artistList.add("Playboi Carti");
        artistList.add("Steve Lacy");
        artistList.add("Travis Scott");
        
        albumList.add(songList.get(0) + " / " + artistList.get(0));
        albumList.add(songList.get(1) + " / " + artistList.get(1));
        albumList.add(songList.get(2) + " / " + artistList.get(2));
        albumList.add(songList.get(3) + " / " + artistList.get(3));
        albumList.add(songList.get(4) + " / " + artistList.get(4));
            
            Iterator <String> listAl = null;
            Iterator <String> listAr = null;
            Iterator <String> listSo = null;
        
            listAl = albumList.listIterator();
            listAr = artistList.listIterator();
            listSo = songList.listIterator();
            
            combine (albumList.iterator(), artistList.iterator(), songList.iterator());
        
        }
    
    public static void combine (Iterator <String> songList, Iterator <String> artistList, Iterator <String> albumList){
    
        if ( songList.hasNext() && artistList.hasNext() && albumList.hasNext() ){
        
            System.out.printf( "%-35s %-25s %-25s\n", artistList.next(), albumList.next(), songList.next());
            combine(songList, artistList, albumList);
        
        }
    
    }
}