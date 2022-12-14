package net.munfy.fabricmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.munfy.fabricmod.MunfyMod;
import net.minecraft.util.registry.Registry;

public class MoneyItems {

    public static final Item MONEY = registerItem("money",
            new Item(new FabricItemSettings()));
    public static final Item I_BAHT = registerItem("i_baht",
            new Item(new FabricItemSettings().group(MoneyGroup.Money)));
    public static final Item II_BAHT = registerItem("ii_baht",
            new Item(new FabricItemSettings().group(MoneyGroup.Money)));
    public static final Item V_BAHT = registerItem("v_baht",
            new Item(new FabricItemSettings().group(MoneyGroup.Money)));
    public static final Item X_BAHT = registerItem("x_baht",
            new Item(new FabricItemSettings().group(MoneyGroup.Money)));
    public static final Item XX_BAHT = registerItem("xx_baht",
            new Item(new FabricItemSettings().group(MoneyGroup.Money)));
    public static final Item L_BAHT = registerItem("l_baht",
            new Item(new FabricItemSettings().group(MoneyGroup.Money)));
    public static final Item C_BAHT = registerItem("c_baht",
            new Item(new FabricItemSettings().group(MoneyGroup.Money)));
    public static final Item E_WALLET = registerItem("e_wallet",
            new Item(new FabricItemSettings().group(MoneyGroup.Money)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MunfyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MunfyMod.LOGGER.debug("Registering Mod Item for" + MunfyMod.MOD_ID);
    }
}
