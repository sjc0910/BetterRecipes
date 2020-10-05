package com.sjc0910.betterrecipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class BRItemGroup extends ItemGroup {
    public BRItemGroup() {
        super("better_recipes");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.BRIcon.get());
    }
}
