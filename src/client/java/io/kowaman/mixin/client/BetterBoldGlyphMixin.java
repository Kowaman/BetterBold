package io.kowaman.mixin.client;

import net.minecraft.client.font.Glyph;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Glyph.class)
public interface BetterBoldGlyphMixin {
	@Inject(method = "getBoldOffset", at = @At("RETURN"), cancellable = true)
	default void injectedBetterBold(CallbackInfoReturnable<Float> cir) {
		cir.setReturnValue(0.5F);
	}
}
