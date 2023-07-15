package com.Apothic0n.PersistentWorlds.mixin;

import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.worldselection.SelectWorldScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SelectWorldScreen.class)
public class SelectWorldScreenMixin {
    @Shadow public Button deleteButton;

    @Inject(at = @At("TAIL"), method = "updateButtonStatus")
    public void perworld_updateButtonStatus(boolean p_276122_, boolean p_276113_, CallbackInfo cb) {
        deleteButton.active = false;
    }
}
