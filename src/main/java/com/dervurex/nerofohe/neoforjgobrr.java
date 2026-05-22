package com.dervurex.nerofohe;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(neoforjgobrr.MODID)
public class neoforjgobrr {

    // mod id
    public static final String MODID = "neoforj_go_brr";
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(neoforjgobrr.MODID);

    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem(
            "my_own_item"
    );


    public neoforjgobrr(IEventBus modEventBus) {

        ITEMS.register(modEventBus);
    }
}