package beniven.mods.cornucopia.datagen;
import beniven.mods.cornucopia.cornucopia;
import beniven.mods.cornucopia.items.ItemInit;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

import java.util.function.Consumer;

public class AdvancementProviderInit implements ForgeAdvancementProvider.AdvancementGenerator {
    @Override
    public void generate(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement rootAdvancement = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ItemInit.CAN.get()),
                        Component.literal("Can"), Component.literal("I 'can't make jokes anymore"),
                        new ResourceLocation(cornucopia.MODID, "textures/item/can.png"), FrameType.TASK,
                        true, true, false))
                .addCriterion("has_can", InventoryChangeTrigger.TriggerInstance.hasItems(ItemInit.CAN.get()))
                .save(saver, new ResourceLocation(cornucopia.MODID, "cornucopia"), existingFileHelper);


        Advancement metalDetector = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ItemInit.CANNED_PUMPKIN.get()),
                        Component.literal("Canned"), Component.literal("I'd make a bad joke here but idk if I 'can'"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rootAdvancement)
                .addCriterion("has_canned_pumpkin", InventoryChangeTrigger.TriggerInstance.hasItems(ItemInit.CANNED_PUMPKIN.get()))
                .save(saver, new ResourceLocation(cornucopia.MODID, "canned_pumpkin"), existingFileHelper);



    }
}