package beniven.mods.cornucopia.datagen;
import beniven.mods.cornucopia.blocks.BlockInit;
import beniven.mods.cornucopia.cornucopia;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ItemTagGeneratorInit extends ItemTagsProvider {
    public ItemTagGeneratorInit(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                                CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, cornucopia.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // Add Item Tags here

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(BlockInit.MAPLE_LOG.get().asItem())
                .add(BlockInit.STRIPPED_MAPLE_LOG.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(BlockInit.MAPLE_PLANKS.get().asItem());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}