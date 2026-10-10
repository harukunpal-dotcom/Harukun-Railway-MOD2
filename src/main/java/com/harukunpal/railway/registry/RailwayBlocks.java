package com.harukunpal.railway.registry;

import com.harukunpal.railway.HarukunRailwayMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class RailwayBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HarukunRailwayMod.MOD_ID);

    public static final RegistryObject<Block> RAILWAY_TRACK = BLOCKS.register("railway_track",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .strength(2.0F, 6.0F)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> STATION_BLOCK = BLOCKS.register("station_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .strength(2.0F, 6.0F)
                    .sound(SoundType.METAL)));

    private RailwayBlocks() {}
}
