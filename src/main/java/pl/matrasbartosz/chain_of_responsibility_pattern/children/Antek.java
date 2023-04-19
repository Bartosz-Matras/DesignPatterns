package pl.matrasbartosz.chain_of_responsibility_pattern.children;

import pl.matrasbartosz.chain_of_responsibility_pattern.request.MotherRequest;

public class Antek extends Child {
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Antek took off the jar.");
        }else {
            System.out.println("The children were too short to took off the jar.");
        }
    }
}
