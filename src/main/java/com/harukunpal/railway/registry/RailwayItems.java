package com.harukunpal.railway.registry;

import com.harukunpal.railway.HarukunRailwayMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class RailwayItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HarukunRailwayMod.MOD_ID);

    public static final RegistryObject<Item> RAILWAY_TRACK_ITEM = ITEMS.register("railway_track",
            () -> new BlockItem(RailwayBlocks.RAILWAY_TRACK.get(), new Item.Properties()));

    public static final RegistryObject<Item> STATION_BLOCK_ITEM = ITEMS.register("station_block",
            () -> new BlockItem(RailwayBlocks.STATION_BLOCK.get(), new Item.Properties()));

    // First milestone: a train-themed inventory item. Rideable train entity is a later milestone.
    public static final RegistryObject<Item> TRAIN_ITEM = ITEMS.register("train",
            () -> new Item(new Item.Properties()));

    private RailwayItems() {}
}
