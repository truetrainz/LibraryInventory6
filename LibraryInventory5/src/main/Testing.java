package main;

import java.util.concurrent.ThreadLocalRandom;

public class Testing {
    private DatabaseControl control;

    public Testing(DatabaseControl control) {
        this.control = control;
    }

    public void addTestingInventoryData() {
        for (int i = 0; i < 30; i++) {
            int amount = ThreadLocalRandom.current().nextInt(5, 101);
            String description = "Test " + i;
            String name = "Test " + i;
            String barcode = "Test " + i;
            String vendorId = "Test " + i;
            String manufactorId = "Test " + i;
            int reorderAmount = ThreadLocalRandom.current().nextInt(5, 11);
            int resinRan = ThreadLocalRandom.current().nextInt(1,3);
            int specialRan = ThreadLocalRandom.current().nextInt(1, 3);
            String resin = "";
            if (resinRan == 1) {
                resin = "N";
            } else {
                resin = "Y";
            }
            String special = "";
            if (specialRan == 1) {
                special = "N";
            } else {
                special = "Y";
            }
            control.addInventory(amount, description, name, vendorId, manufactorId, reorderAmount, resin, special);
        }
    }
}
