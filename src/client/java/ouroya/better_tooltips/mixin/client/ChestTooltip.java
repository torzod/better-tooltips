package ouroya.better_tooltips.mixin.client;

import net.minecraft.block.ChestBlock;/*
import net.minecraft.client.item.TooltipContext;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SuspiciousStewItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.BlockView;

import java.util.List;

import org.jetbrains.annotations.Nullable;*/
import org.spongepowered.asm.mixin.Mixin;/*
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;*/

@Mixin(ChestBlock.class)
public class ChestTooltip {
    /*@Override

    public void appendTooltip(ItemStack stack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        NbtCompound nbtCompound = BlockItem.getBlockEntityNbt(stack);
        if (nbtCompound != null) {
            if (nbtCompound.contains("LootTable", NbtElement.STRING_TYPE)) {
                tooltip.add(Text.literal("???????"));
            }
            if (nbtCompound.contains("Items", NbtElement.LIST_TYPE)) {
                DefaultedList<ItemStack> defaultedList = DefaultedList.ofSize(27, ItemStack.EMPTY);
                Inventories.readNbt(nbtCompound, defaultedList);
                int i = 0;
                int j = 0;
                for (ItemStack itemStack : defaultedList) {
                    if (itemStack.isEmpty())
                        continue;
                    ++j;
                    if (i > 4)
                        continue;
                    ++i;
                    MutableText mutableText = itemStack.getName().copy();
                    mutableText.append(" x").append(String.valueOf(itemStack.getCount()));
                    tooltip.add(mutableText);
                }
                if (j - i > 0) {
                    tooltip.add(Text.translatable("container.shulkerBox.more", j - i).formatted(Formatting.ITALIC));
                }
            }
        }
    }*/
}
