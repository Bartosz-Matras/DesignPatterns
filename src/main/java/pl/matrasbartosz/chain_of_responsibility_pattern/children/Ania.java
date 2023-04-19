package pl.matrasbartosz.chain_of_responsibility_pattern.children;

import pl.matrasbartosz.chain_of_responsibility_pattern.request.MotherRequest;

public class Ania extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println("Ania took off the jar.");
        }else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
