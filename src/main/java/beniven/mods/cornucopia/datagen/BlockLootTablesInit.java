package beniven.mods.cornucopia.datagen;
import beniven.mods.cornucopia.blocks.BlockInit;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class BlockLootTablesInit extends BlockLootSubProvider {
    public BlockLootTablesInit() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(BlockInit.MAPLE_LOG.get());
        this.dropSelf(BlockInit.STRIPPED_MAPLE_LOG.get());
        this.dropSelf(BlockInit.MAPLE_PLANKS.get());
        this.dropSelf(BlockInit.MAPLE_SAPLING.get());
        this.dropSelf(BlockInit.PUMPKILN_BRICKS.get());

        this.dropSelf(BlockInit.MOSSY_PUMPKILN_BRICKS.get());
        this.dropSelf(BlockInit.MOLDY_PUMPKILN_BRICKS.get());
        this.dropSelf(BlockInit.CRACKED_PUMPKILN_BRICKS.get());
        this.dropSelf(BlockInit.CHISELED_PUMPKILN_BRICKS.get());
        this.dropSelf(BlockInit.SMOOTH_PUMPKILN_BRICKS.get());

        this.dropSelf(BlockInit.DEAD_ROSE.get());

        this.add(BlockInit.MAPLE_LEAVES.get(), block ->
                createLeavesDrops(block, BlockInit.MAPLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}