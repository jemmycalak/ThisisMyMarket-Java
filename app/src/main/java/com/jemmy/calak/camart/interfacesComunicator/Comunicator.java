package com.example.jemmycalak.thisismymarket.interfacesComunicator;


public interface Comunicator {
    void sendListData(String id, String name, String hrga, String imgUrl, String descrip, String brt, String clr, String stock);
    void filterDataProduct(String name);
}