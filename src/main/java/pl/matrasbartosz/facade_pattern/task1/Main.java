package pl.matrasbartosz.facade_pattern.task1;

import pl.matrasbartosz.facade_pattern.task1.deliverybox.DeliveryBoxFacade;

class Main {

    public static void main(String[] args) {

        DeliveryBoxFacade deliveryBoxFacade = DeliveryBoxFacade.getInstance();
        deliveryBoxFacade.pickupPackage();
    }


}
