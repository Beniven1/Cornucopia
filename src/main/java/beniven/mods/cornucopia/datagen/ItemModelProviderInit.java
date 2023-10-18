package beniven.mods.cornucopia.datagen;
import beniven.mods.cornucopia.blocks.BlockInit;
import beniven.mods.cornucopia.cornucopia;
import beniven.mods.cornucopia.items.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemModelProviderInit extends ItemModelProvider {
    public ItemModelProviderInit(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, cornucopia.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ItemInit.CAN);
        simpleItem(ItemInit.CANNED_PUMPKIN);
        simpleItem(ItemInit.CANNED_APPLE);
        simpleItem(ItemInit.APPLE_PIE);
        simpleItem(ItemInit.CANNED_MELON);
        simpleItem(ItemInit.MELON_PIE);
        simpleItem(ItemInit.CORNUCOPIA);
        simpleItem(ItemInit.CORNUCOPIA_CANNON);
        simpleBlockItem(BlockInit.MAPLE_PLANKS);
        simpleBlockItem(BlockInit.MAPLE_LOG);
        simpleBlockItem(BlockInit.STRIPPED_MAPLE_LOG);
        simpleItemLikeBlock(BlockInit.MAPLE_SAPLING);
        simpleItemLikeBlock(BlockInit.DEAD_ROSE);
        simpleBlockItem(BlockInit.PUMPKILN_BRICKS);
        simpleBlockItem(BlockInit.CHISELED_PUMPKILN_BRICKS);
        simpleBlockItem(BlockInit.MOLDY_PUMPKILN_BRICKS);
        simpleBlockItem(BlockInit.MOSSY_PUMPKILN_BRICKS);
        simpleBlockItem(BlockInit.CRACKED_PUMPKILN_BRICKS);
        simpleBlockItem(BlockInit.SMOOTH_PUMPKILN_BRICKS);

        handheldItem(ItemInit.PUMPKILN_SWORD);
        handheldItem(ItemInit.PUMPKILN_GREAT_SWORD);
        handheldItem(ItemInit.PUMPKILN_PICKAXE);
        handheldItem(ItemInit.PUMPKILN_SHOVEL);
        handheldItem(ItemInit.PUMPKILN_AXE);
        handheldItem(ItemInit.PUMPKILN_HOE);
    }
    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(cornucopia.MODID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(cornucopia.MODID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(cornucopia.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(cornucopia.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(cornucopia.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }


    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(cornucopia.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation(cornucopia.MODID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(cornucopia.MODID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder simpleItemLikeBlock(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(cornucopia.MODID,"block/" + item.getId().getPath()));
    }
}