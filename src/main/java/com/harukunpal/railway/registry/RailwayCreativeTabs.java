package com.harukunpal.railway.registry;

import com.harukunpal.railway.HarukunRailwayMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class RailwayCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HarukunRailwayMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAIN_TAB =
            CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.harukunrailway.main"))
                    .icon(() -> RailwayItems.TRAIN_ITEM.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(RailwayItems.RAILWAY_TRACK_ITEM.get());
                        output.accept(RailwayItems.STATION_BLOCK_ITEM.get());
                        output.accept(RailwayItems.TRAIN_ITEM.get());
                    })
                    .build());

    private RailwayCreativeTabs() {}
}
