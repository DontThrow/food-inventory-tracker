package com.dontthrow.acceptance;

import com.dontthrow.application.InventorySystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class AddItemToInventory {

    @Test
    void user_can_add_item_and_see_it_in_inventory() {
        InventorySystem system = new InventorySystem();

        system.addItem("Milk");

        List<String> items = system.listItems();

        assertTrue(items.contains("Milk"));
    }
}
