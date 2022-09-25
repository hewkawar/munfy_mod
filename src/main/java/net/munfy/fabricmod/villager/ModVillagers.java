package net.munfy.fabricmod.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.munfy.fabricmod.MunfyMod;
import net.munfy.fabricmod.block.ModBlock;
import net.munfy.fabricmod.item.MoneyItems;
import net.munfy.fabricmod.item.MunfyItems;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
    public static final PointOfInterestType MONEY_POI = registerPOI("money_poi", ModBlock.ROUTER);
    public static final VillagerProfession MONEY_MASTER = registerProfession("moneymaster",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(MunfyMod.MOD_ID, "money_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(MunfyMod.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(MunfyMod.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(MunfyMod.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerVillagers() {
        MunfyMod.LOGGER.debug("Registering Villagers for " + MunfyMod.MOD_ID);
    }

    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(MONEY_MASTER,1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COAL, 1),
                            new ItemStack(MoneyItems.I_BAHT, 1),
                            500, 0, 0.02f
                    )));
                });

    }
}
