package pl.matrasbartosz.chain_of_responsibility_pattern.children;

import pl.matrasbartosz.chain_of_responsibility_pattern.request.MotherRequest;

public class Tomek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Tomek took off the jar.");
        }else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
