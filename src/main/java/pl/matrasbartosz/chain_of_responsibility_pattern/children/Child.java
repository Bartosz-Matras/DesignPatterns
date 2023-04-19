package pl.matrasbartosz.chain_of_responsibility_pattern.children;

import pl.matrasbartosz.chain_of_responsibility_pattern.request.MotherRequest;

public abstract class Child {

    private Child tallerChild;

    public abstract void processRequest(MotherRequest motherRequest);

    Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }
}
