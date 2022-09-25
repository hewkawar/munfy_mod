package net.munfy.fabricmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.munfy.fabricmod.MunfyMod;
import net.munfy.fabricmod.item.MunfyGroup;
import net.munfy.fabricmod.block.custom.Router;


public class ModBlock {
    public static final Block ROUTER = registerBlock("router",
            new Router(FabricBlockSettings.of(Material.METAL)
                    .strength(4f).requiresTool().nonOpaque()), MunfyGroup.Munfy);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(MunfyMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(MunfyMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlock() {
        MunfyMod.LOGGER.debug("Registering ModBlock for " + MunfyMod.MOD_ID);
    }

}
