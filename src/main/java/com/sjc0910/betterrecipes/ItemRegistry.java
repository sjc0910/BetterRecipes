package com.sjc0910.betterrecipes;

import com.sjc0910.betterrecipes.materials.*;
import com.sjc0910.betterrecipes.foods.*;
import com.sjc0910.betterrecipes.tools.*;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_ingot", ObsidianIngot::new);
    public static final RegistryObject<Item> obsidianApple = ITEMS.register("obsidian_apple", ObsidianApple::new);
    public static final RegistryObject<Item> obsidianSword = ITEMS.register("obsidian_sword", ObsidianSword::new);
    public static final RegistryObject<Item> obsidianPickaxe = ITEMS.register("obsidian_pickaxe", ObsidianPickaxe::new);
    public static final RegistryObject<Item> diamondStick = ITEMS.register("diamond_stick", DiamondStick::new);
    public static final RegistryObject<Item> BRIcon = ITEMS.register("icon_of_better_recipes", BRIcon::new);
}
