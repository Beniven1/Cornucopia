package beniven.mods.cornucopia.items;
import beniven.mods.cornucopia.blocks.BlockInit;
import beniven.mods.cornucopia.cornucopia;
import beniven.mods.cornucopia.util.TagInit;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ToolTierInit {
    public static final Tier PUMPKILN = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1400, 11f, 3f, 26,
                    TagInit.Blocks.NEEDS_PUMPKILN_TOOL, () -> Ingredient.of(BlockInit.PUMPKILN_BRICKS.get())),
            new ResourceLocation(cornucopia.MODID, "pumpkiln"), List.of(Tiers.NETHERITE), List.of());

}