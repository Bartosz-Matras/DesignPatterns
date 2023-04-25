package pl.matrasbartosz.facade_pattern.task1.deliverybox;

public class DeliveryBoxFacade {

    private static DeliveryBoxFacade instance;

    private final DeliveryBox deliveryBox;
    private final DeliveryBoxSystem deliveryBoxSystem;

    private DeliveryBoxFacade() {
        this.deliveryBox = new DeliveryBox();
        this.deliveryBoxSystem = new DeliveryBoxSystem();
    }

    public static DeliveryBoxFacade getInstance() {
        if(instance == null) {
            instance = new DeliveryBoxFacade();
        }
        return instance;
    }

    public void pickupPackage() {
        deliveryBox.getUserData();
        if (deliveryBoxSystem.isUserDataValidated()
                && deliveryBoxSystem.isPaymentSecured()) {
            deliveryBox.openBox();
        }
    }
}
