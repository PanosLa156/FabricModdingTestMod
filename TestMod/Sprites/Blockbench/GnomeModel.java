// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Gnome extends EntityModel<Entity> {
	private final ModelPart Gnome;
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Hands;
	private final ModelPart rhand;
	private final ModelPart lhand;
	private final ModelPart stuff;
	public Gnome(ModelPart root) {
		this.Gnome = root.getChild("Gnome");
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Hands = root.getChild("Hands");
		this.rhand = root.getChild("rhand");
		this.lhand = root.getChild("lhand");
		this.stuff = root.getChild("stuff");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Gnome = modelPartData.addChild("Gnome", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData Head = Gnome.addChild("Head", ModelPartBuilder.create().uv(0, 34).cuboid(-3.0F, -5.0F, -6.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F))
		.uv(26, 39).cuboid(-2.5F, -8.886F, -5.482F, 5.0F, 4.0F, 5.0F, new Dilation(0.0F))
		.uv(40, 20).cuboid(-2.0F, -12.67F, -5.07F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(44, 22).cuboid(-1.0F, -16.67F, -4.07F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

		ModelPartData Body = Gnome.addChild("Body", ModelPartBuilder.create().uv(0, 16).cuboid(-5.0F, -12.0F, -4.0F, 10.0F, 12.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-6.06F, -7.01F, -3.96F, 12.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Hands = Gnome.addChild("Hands", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData rhand = Hands.addChild("rhand", ModelPartBuilder.create().uv(29, 5).cuboid(-6.0F, -2.0F, -9.0F, 4.0F, 4.0F, 11.0F, new Dilation(0.0F))
		.uv(0, 46).cuboid(-5.0F, -10.0F, -8.0F, 2.0F, 18.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, 0.0F));

		ModelPartData lhand = Hands.addChild("lhand", ModelPartBuilder.create().uv(21, 23).cuboid(2.0F, -9.0F, -9.0F, 4.0F, 4.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData stuff = Hands.addChild("stuff", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Gnome.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}