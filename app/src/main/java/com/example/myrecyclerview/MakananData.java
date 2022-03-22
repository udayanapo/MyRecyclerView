package com.example.myrecyclerview;

import java.util.ArrayList;

public class MakananData {
    public static String[][] data = new String[][]{
            {"Soto LAmongan ", "",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"},
            {"Nasi goreng ", "",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/President_Suharto%2C_1993.jpg/468px-President_Suharto%2C_1993.jpg"},
            {"Sate", "",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Bacharuddin_Jusuf_Habibie_official_portrait.jpg/520pxBacharuddin_Jusuf_Habibie_official_portrait.jpg"},
            {"Bubur Ayam", "",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg/486pxPresident_Abdurrahman_Wahid_-_Indonesia.jpg"},
            {"Mie Goreng", "I",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/President_Megawati_Sukarnoputri_-_Indonesia.jpg/540pxPresident_Megawati_Sukarnoputri_-_Indonesia.jpg"},
            {"Nasi Padang", "",
            "https://upload.wikimedia.org/wikipedia/commons/5/58/Presiden_Susilo_Bambang_Yudhoyono.png"},
            {"Gurami Bakar", "",
            "https://upload.wikimedia.org/wikipedia/commons/1/1c/Joko_Widodo_2014_official_portrait.jpg"}
    };
    public static ArrayList<Makanan> getListData(){
        Makanan makanan  = null;
        ArrayList<Makanan> list = new ArrayList<>();
        for (String[] aData : data) {
            makanan = new Makanan();
            makanan.setName(aData[0]);
            makanan.setRemarks(aData[1]);
            makanan.setPhoto(aData[2]);

            list.add(makanan);
        }
        return list;
    }

}
