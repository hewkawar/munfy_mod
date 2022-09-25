package net.munfy.fabricmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.munfy.fabricmod.MunfyMod;

public class MoneyGroup {
    public static final ItemGroup Money = FabricItemGroupBuilder.build(
            new Identifier(MunfyMod.MOD_ID, "money"), () -> new ItemStack(MoneyItems.MONEY));
}
