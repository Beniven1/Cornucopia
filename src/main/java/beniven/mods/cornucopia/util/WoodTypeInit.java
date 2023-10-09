package beniven.mods.cornucopia.util;
import beniven.mods.cornucopia.cornucopia;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class WoodTypeInit {
    public static final WoodType MAPLE = WoodType.register(new WoodType(cornucopia.MODID + ":maple", BlockSetType.OAK));
}