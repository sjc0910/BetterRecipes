package com.sjc0910.betterrecipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BRItemGroup extends ItemGroup {
    public BRItemGroup() {
        super("Better Recipes");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.BRIcon.get());
    }
}
