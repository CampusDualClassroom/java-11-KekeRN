package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");

        System.out.println("Color del mando rojo: " + redRemote.getColor());
        System.out.println("Color del mando negro: " + blackRemote.getColor());

        redRemote.turnOn();
        System.out.println("TV encendida: " + redRemote.on);

        redRemote.channelUp();
        System.out.println("Canal actual: " + redRemote.channel);

        redRemote.channelDown();
        System.out.println("Canal actual tras bajar: " + redRemote.channel);

        redRemote.channel = 0;
        redRemote.channelDown();
        System.out.println("Canal actual tras intentar bajar en 0: " + redRemote.channel);

        redRemote.volumeUp();
        System.out.println("Volumen actual: " + redRemote.volume);

        redRemote.volumeDown();
        System.out.println("Volumen actual tras bajar: " + redRemote.volume);

        redRemote.volume = 0;
        redRemote.volumeDown();
        System.out.println("Volumen actual tras intentar bajar en 0: " + redRemote.volume);

        redRemote.turnOff();
        System.out.println("TV encendida tras apagar: " + redRemote.on);
    }
}
