package io.github.mirajih.wafflemod.init;

import io.github.mirajih.wafflemod.WaffleMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class ModItemGroup extends ItemGroup {

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(WaffleMod.MODID, () -> new ItemStack(ModItems.BLUE_WAFFLE));

    private final Supplier<ItemStack> iconSupplier;

    public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
        super(name);
        this.iconSupplier = iconSupplier;
    }

    @Override
    public ItemStack createIcon() {
        return iconSupplier.get();
    }
}
