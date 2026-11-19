package net.princesssj.myfirstmod.worldgen.biome;

import net.minecraft.resources.ResourceLocation;
import net.princesssj.myfirstmod.MyFirstMod;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(MyFirstMod.MOD_ID, "overworld"), 5));
    }
}