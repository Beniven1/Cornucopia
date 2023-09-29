package beniven.mods.cornucopia.items;

import beniven.mods.cornucopia.cornucopia;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, cornucopia.MODID);

    public static final RegistryObject<Item> CAN = ITEMS.register("can",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CANNED_PUMPKIN = ITEMS.register("canned_pumpkin",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}