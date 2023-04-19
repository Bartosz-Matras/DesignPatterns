package pl.matrasbartosz.chain_of_responsibility_pattern.request;

import pl.matrasbartosz.chain_of_responsibility_pattern.children.Shelf;

public class MotherRequest {

    private final Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }
}
