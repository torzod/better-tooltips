package ouroya.better_tooltips.mixin.client;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.SuspiciousStewItem;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SuspiciousStewItem.class)
public class SuspiciousStewTooltip {
	@Redirect(method = "appendTooltip", at = @At(value = "INVOKE", target = "net/minecraft/client/item/TooltipContext.isCreative ()Z"))
	private boolean alwaysTrue(TooltipContext context) {
		return true;
	}
}
