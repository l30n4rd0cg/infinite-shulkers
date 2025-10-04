package net.leonardocg.infiniteshulkers.mixin;

import net.minecraft.item.BlockItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockItem.class)
public class BlockItemMixin {
	@Inject(at = @At("HEAD"), method = "canBeNested", cancellable = true)
	private void init(CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
    }
}