package com.harukunpal.railway;

import com.harukunpal.railway.registry.RailwayBlocks;
import com.harukunpal.railway.registry.RailwayItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HarukunRailwayMod.MOD_ID)
public class HarukunRailwayMod {
    public static final String MOD_ID = "harukunrailway";

    public HarukunRailwayMod() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        RailwayBlocks.BLOCKS.register(modBus);
        RailwayItems.ITEMS.register(modBus);
    }
}
