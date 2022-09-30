package net.munfy.fabricmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.munfy.fabricmod.MunfyMod;

public class MunfyItems {

    public static final Item MUNFY = registerItem("munfy",
            new Item(new FabricItemSettings()));

    public static final Item CHIPSET = registerItem("chipset",
            new Item(new FabricItemSettings().group(MunfyGroup.Munfy)));
    public static final Item ALLOW_KEY = registerItem("allow_key",
            new Item(new FabricItemSettings().group(MunfyGroup.Munfy)));
    public static final Item NETWORK_KEY = registerItem("network_key",
            new Item(new FabricItemSettings().group(MunfyGroup.Munfy)));
    public static final Item SECURITY_KEY = registerItem("security_key",
            new Item(new FabricItemSettings().group(MunfyGroup.Munfy)));
    public static final Item MAINBOARD = registerItem("mainboard",
            new Item(new FabricItemSettings().group(MunfyGroup.Munfy)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MunfyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MunfyMod.LOGGER.debug("Registering Mod Item for" + MunfyMod.MOD_ID);
    }
}
