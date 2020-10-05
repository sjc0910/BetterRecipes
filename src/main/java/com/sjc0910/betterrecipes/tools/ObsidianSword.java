package com.sjc0910.betterrecipes.tools;

import net.minecraft.item.ItemGroup;
import com.sjc0910.betterrecipes.ModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class ObsidianSword extends SwordItem {
    public ObsidianSword() {
        super(ModItemTier.OBSIDIAN, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT));
    }
}
