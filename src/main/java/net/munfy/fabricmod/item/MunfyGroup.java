package net.munfy.fabricmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.munfy.fabricmod.MunfyMod;

public class MunfyGroup {
    public static final ItemGroup Munfy = FabricItemGroupBuilder.build(
            new Identifier(MunfyMod.MOD_ID, "munfy"), () -> new ItemStack(MunfyItems.MUNFY));
}
