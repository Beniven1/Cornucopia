package beniven.mods.cornucopia.worldgen.biome;
import beniven.mods.cornucopia.cornucopia;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class TerraBlenderAPIInit {
    public static void registerRegions() {
        Regions.register(new OverworldRegionInit(new ResourceLocation(cornucopia.MODID, "overworld"), 5));
    }
}