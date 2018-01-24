package com.neo.musicshop;
import java.util.*;

public class Albumn {

    /** Constructor
     *  Note that the albumn name and band names are
     *  immutable once the albumn is created
     */
    public Albumn(String albumnName, String bandName) {
        title = albumnName;
        band = bandName;
    }

    public String bandName() {
        return band;
    }

    public String albumnName() {
        return title;
    }

    /** Adds a song to this albumn. There is no duplicate
     *  checking for songs that are added.
     */
    public void addSong(Song song) {
        songs.add(song);
    }

    /** Returns a string representation of an album listing
     *  the albumn name and the band name
     */
    public Iterator<Song> getSongs() {
        return songs.iterator();
    }

    /** Returns a string representation of the albumn
     *  listing, the albumn name and the band name
     */
    public String toString() {
        return ("\"" + title + "\"by" + band);
    }

    /** Private instance variables */
    private String title;
    private String band;
    private ArrayList<Song> songs = new ArrayList<Song>();
}
