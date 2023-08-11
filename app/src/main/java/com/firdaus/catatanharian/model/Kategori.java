package com.firdaus.catatanharian.model;
// 10120082,
// Firdaus Muhammad Ridho,
// IF2,
// firdausmuhammadridho9@gmail.com

public class Kategori {
    public String id_kategori;
    public String kategori;

    public Kategori() {
        // Default constructor required for Firebase
    }

    public Kategori(String id_kategori, String kategori) {
        this.id_kategori = id_kategori;
        this.kategori = kategori;
    }

    public String getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(String id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}