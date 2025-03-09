
package net.mcreator.oasiscore.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.oasiscore.entity.MemoriaSoyjakEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class MemoriaSoyjakRenderer extends HumanoidMobRenderer<MemoriaSoyjakEntity, HumanoidModel<MemoriaSoyjakEntity>> {
	public MemoriaSoyjakRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	protected void scale(MemoriaSoyjakEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.8f, 0.8f, 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(MemoriaSoyjakEntity entity) {
		return ResourceLocation.parse("oasiscore:textures/entities/steve-planetminecraft-com-17960672.png");
	}
}
