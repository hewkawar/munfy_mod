package net.munfy.fabricmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.munfy.fabricmod.MunfyMod;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item I_BAHT = registerItem("i_baht",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item II_BAHT = registerItem("ii_bath",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item V_BAHT = registerItem("V_bath",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item X_BAHT = registerItem("x_bath",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item XX_BAHT = registerItem("xx_bath",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item L_BAHT = registerItem("l_bath",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item C_BAHT = registerItem("c_bath",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MunfyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MunfyMod.LOGGER.debug("Registering Mod Item for" + MunfyMod.MOD_ID);
    }
}
