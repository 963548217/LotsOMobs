// Date: 05.04.2014 20:03:39
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.lom.lotsomobsmodels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelIchtyosaurus extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape7;
    ModelRenderer Shape6;
    ModelRenderer Shape5;
    ModelRenderer Shape9;
    ModelRenderer Shape8;
    ModelRenderer Shape11;
    ModelRenderer Shape10;
    ModelRenderer Shape12;
  
  public ModelIchtyosaurus()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 2, 3, 8);
      Shape1.setRotationPoint(-1F, 19F, -15F);
      Shape1.setTextureSize(256, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 43, 0);
      Shape2.addBox(0F, 0F, 0F, 6, 6, 6);
      Shape2.setRotationPoint(-3F, 16F, -7F);
      Shape2.setTextureSize(256, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 80, 0);
      Shape3.addBox(0F, 0F, 0F, 8, 7, 12);
      Shape3.setRotationPoint(-4F, 15F, -1F);
      Shape3.setTextureSize(256, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 127, 0);
      Shape4.addBox(0F, 0F, 0F, 5, 5, 3);
      Shape4.setRotationPoint(-2.5F, 15.5F, 11F);
      Shape4.setTextureSize(256, 128);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 152, 13);
      Shape7.addBox(0F, 0F, 0F, 1, 4, 2);
      Shape7.setRotationPoint(-0.5F, 18F, 19F);
      Shape7.setTextureSize(256, 128);
      Shape7.mirror = true;
      setRotation(Shape7, 2.472381F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 151, 0);
      Shape6.addBox(0F, 0F, 0F, 4, 4, 5);
      Shape6.setRotationPoint(-2F, 16F, 14F);
      Shape6.setTextureSize(256, 128);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 160, 13);
      Shape5.addBox(0F, 0F, 0F, 1, 4, 2);
      Shape5.setRotationPoint(-0.5F, 20F, 17F);
      Shape5.setTextureSize(256, 128);
      Shape5.mirror = true;
      setRotation(Shape5, 0.669215F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 15, 27);
      Shape9.addBox(0F, 0F, 0F, 2, 5, 1);
      Shape9.setRotationPoint(-3F, 21F, 0F);
      Shape9.setTextureSize(256, 128);
      Shape9.mirror = true;
      setRotation(Shape9, 0.37179F, -1.59868F, -0.669215F);
      Shape8 = new ModelRenderer(this, 0, 27);
      Shape8.addBox(0F, 0F, 0F, 2, 5, 1);
      Shape8.setRotationPoint(4F, 21F, 0F);
      Shape8.setTextureSize(256, 128);
      Shape8.mirror = true;
      setRotation(Shape8, -0.3717861F, -1.59868F, -0.669215F);
      Shape11 = new ModelRenderer(this, 15, 37);
      Shape11.addBox(0F, 0F, 0F, 2, 3, 1);
      Shape11.setRotationPoint(-3F, 22F, 9F);
      Shape11.setTextureSize(256, 128);
      Shape11.mirror = true;
      setRotation(Shape11, 0.5205053F, -0.9294653F, -0.1487144F);
      Shape10 = new ModelRenderer(this, 0, 37);
      Shape10.addBox(0F, 0F, 0F, 2, 3, 1);
      Shape10.setRotationPoint(2F, 22F, 10F);
      Shape10.setTextureSize(256, 128);
      Shape10.mirror = true;
      setRotation(Shape10, 0.7807508F, 0.5948578F, 0.1487144F);
      Shape12 = new ModelRenderer(this, 0, 16);
      Shape12.addBox(0F, 0F, 0F, 1, 3, 4);
      Shape12.setRotationPoint(-0.5F, 15F, 3F);
      Shape12.setTextureSize(256, 128);
      Shape12.mirror = true;
      setRotation(Shape12, 0.5205006F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape7.render(f5);
    Shape6.render(f5);
    Shape5.render(f5);
    Shape9.render(f5);
    Shape8.render(f5);
    Shape11.render(f5);
    Shape10.render(f5);
    Shape12.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
