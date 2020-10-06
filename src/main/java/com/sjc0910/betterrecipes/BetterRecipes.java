package com.sjc0910.betterrecipes;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Utils.MOD_ID)
public class BetterRecipes {
    private static final Logger LOGGER = LogManager.getLogger();
    public BetterRecipes() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        LOGGER.info("BetterRecipes: REGISTERING ITEMS");
    }
}
