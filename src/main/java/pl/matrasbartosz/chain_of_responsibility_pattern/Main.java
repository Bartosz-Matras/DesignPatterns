package pl.matrasbartosz.chain_of_responsibility_pattern;

import pl.matrasbartosz.chain_of_responsibility_pattern.children.*;
import pl.matrasbartosz.chain_of_responsibility_pattern.request.MotherRequest;

class Main {

    public static void main(String[] args) {

        MotherRequest motherFirstRequest = new MotherRequest(Shelf.HIGH);
        Child ania = new Ania();
        Child tomek = new Tomek();
        Child antek = new Antek();

        ania.setTallerChild(tomek);
        tomek.setTallerChild(antek);

        ania.processRequest(motherFirstRequest);

    }
}
