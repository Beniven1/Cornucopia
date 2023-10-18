package beniven.mods.cornucopia.datagen;
import beniven.mods.cornucopia.blocks.BlockInit;
import beniven.mods.cornucopia.cornucopia;
import beniven.mods.cornucopia.items.ItemInit;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.common.data.BlockTagsProvider;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class RecipeProviderInit extends RecipeProvider implements IConditionBuilder {

    public RecipeProviderInit(PackOutput pOutput) {
        super(pOutput);
    }


    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockInit.MOSSY_PUMPKILN_BRICKS.get())
                .requires(BlockInit.PUMPKILN_BRICKS.get()).requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_pumpkiln_bricks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(BlockInit.PUMPKILN_BRICKS.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockInit.CRACKED_PUMPKILN_BRICKS.get())
                .requires(BlockInit.PUMPKILN_BRICKS.get())
                .unlockedBy("has_pumpkiln_bricks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(BlockInit.PUMPKILN_BRICKS.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.APPLE_PIE.get())
                .requires(ItemInit.CANNED_APPLE.get()).requires(Items.SUGAR).requires(Items.EGG).requires(Items.WHEAT)
                .unlockedBy("has_canned_apple", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ItemInit.CANNED_APPLE.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.MELON_PIE.get())
                .requires(ItemInit.CANNED_MELON.get()).requires(Items.SUGAR).requires(Items.EGG).requires(Items.WHEAT)
                .unlockedBy("has_canned_melon", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ItemInit.CANNED_PUMPKIN.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.CAN.get(), 1)
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', Items.IRON_NUGGET)
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.CANNED_PUMPKIN.get())
                .requires(ItemInit.CAN.get()).requires(Blocks.PUMPKIN)
                .unlockedBy("has_can", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ItemInit.CAN.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.CANNED_APPLE.get())
                .requires(ItemInit.CAN.get()).requires(Items.APPLE)
                .unlockedBy("has_can", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ItemInit.CAN.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.CANNED_MELON.get())
                .requires(ItemInit.CAN.get()).requires(Items.MELON_SLICE)
                .unlockedBy("has_can", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ItemInit.CAN.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLACK_DYE)
                .requires(BlockInit.DEAD_ROSE.get()).requires(BlockInit.DEAD_ROSE.get())
                .unlockedBy("has_dead_rose", inventoryTrigger(ItemPredicate.Builder.item().
                        of(BlockInit.DEAD_ROSE.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RED_DYE)
                .requires(BlockInit.DEAD_ROSE.get())
                .unlockedBy("has_dead_rose", inventoryTrigger(ItemPredicate.Builder.item().
                        of(BlockInit.DEAD_ROSE.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockInit.MAPLE_PLANKS.get(), 4)
                        .requires(BlockInit.MAPLE_LOG.get())
                        .unlockedBy("has_maple_log", inventoryTrigger(ItemPredicate.Builder.item()
                                .of(BlockInit.MAPLE_LOG.get()).build()))
                        .save(pWriter);

       /* ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockInit.MAPLE_PLANKS.get(), 4)
                .requires(BlockInit.STRIPPED_MAPLE_LOG.get())
                .unlockedBy("has_stripped_maple_log", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.STRIPPED_MAPLE_LOG.get()).build()))
                .save(pWriter);*/

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.CHISELED_PUMPKILN_BRICKS.get(), 9)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', BlockInit.PUMPKILN_BRICKS.get())
                .unlockedBy("has_pumpkiln_bricks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(BlockInit.PUMPKILN_BRICKS.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.PUMPKILN_SWORD.get(), 1)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', BlockInit.PUMPKILN_BRICKS.get())
                .define('B', Items.STICK)
                .unlockedBy("has_pumpkiln_bricks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(BlockInit.PUMPKILN_BRICKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.PUMPKILN_GREAT_SWORD.get(), 1)
                .pattern(" A ")
                .pattern(" A ")
                .pattern("ABA")
                .define('A', BlockInit.PUMPKILN_BRICKS.get())
                .define('B', BlockInit.MAPLE_LOG.get())
                .unlockedBy("has_pumpkiln_bricks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(BlockInit.PUMPKILN_BRICKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.PUMPKILN_SHOVEL.get(), 1)
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', BlockInit.PUMPKILN_BRICKS.get())
                .define('B', Items.STICK)
                .unlockedBy("has_pumpkiln_bricks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(BlockInit.PUMPKILN_BRICKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.PUMPKILN_PICKAXE.get(), 1)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', BlockInit.PUMPKILN_BRICKS.get())
                .define('B', Items.STICK)
                .unlockedBy("has_pumpkiln_bricks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(BlockInit.PUMPKILN_BRICKS.get()).build()))
                .save(pWriter);

       /* ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.PUMPKILN_AXE.get(), 1)
                .pattern("AA ")
                .pattern("AB ")
                .pattern(" B ")
                .define('A', BlockInit.PUMPKILN_BRICKS.get())
                .define('B', Items.STICK)
                .unlockedBy("has_pumpkiln_bricks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(BlockInit.PUMPKILN_BRICKS.get()).build()))
                .save(pWriter); */

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.PUMPKILN_AXE.get(), 1)
                .pattern(" AA")
                .pattern(" BA")
                .pattern(" B ")
                .define('A', BlockInit.PUMPKILN_BRICKS.get())
                .define('B', Items.STICK)
                .unlockedBy("has_pumpkiln_bricks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(BlockInit.PUMPKILN_BRICKS.get()).build()))
                .save(pWriter);

       /* ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.PUMPKILN_HOE.get(), 1)
                .pattern("AA ")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', BlockInit.PUMPKILN_BRICKS.get())
                .define('B', Items.STICK)
                .unlockedBy("has_pumpkiln_bricks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(BlockInit.PUMPKILN_BRICKS.get()).build()))
                .save(pWriter); */

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.PUMPKILN_HOE.get(), 1)
                .pattern(" AA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', BlockInit.PUMPKILN_BRICKS.get())
                .define('B', Items.STICK)
                .unlockedBy("has_pumpkiln_bricks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(BlockInit.PUMPKILN_BRICKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.CORNUCOPIA.get(), 1)
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A', Items.WHEAT)
                .define('B', Items.APPLE)
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Items.WHEAT).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.CORNUCOPIA_CANNON.get(), 1)
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A', Items.WHEAT)
                .define('B', Items.GUNPOWDER)
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Items.WHEAT).build()))
                .save(pWriter);


        oreSmelting(pWriter, Collections.singletonList(Blocks.PUMPKIN), RecipeCategory.MISC, BlockInit.PUMPKILN_BRICKS.get(), 0.25f, 200, "pumpkiln");
        oreBlasting(pWriter, Collections.singletonList(Blocks.PUMPKIN), RecipeCategory.MISC, BlockInit.PUMPKILN_BRICKS.get(), 0.25f, 100, "pumpkiln");
        oreSmelting(pWriter, Collections.singletonList(BlockInit.PUMPKILN_BRICKS.get()), RecipeCategory.MISC, BlockInit.SMOOTH_PUMPKILN_BRICKS.get(), 0.25f, 200, "smooth_pumpkiln");
        oreBlasting(pWriter, Collections.singletonList(BlockInit.PUMPKILN_BRICKS.get()), RecipeCategory.MISC, BlockInit.SMOOTH_PUMPKILN_BRICKS.get(), 0.25f, 100, "smooth_pumpkiln");

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, cornucopia.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}