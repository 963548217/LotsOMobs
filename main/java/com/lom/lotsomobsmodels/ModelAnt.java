// Date: 12.12.2012 18:50:38
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.lom.lotsomobsmodels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;


@SideOnly(Side.CLIENT)
public class ModelAnt extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Leg3;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg5;
    ModelRenderer Leg6;
    ModelRenderer Leg4;
    ModelRenderer Head;
    ModelRenderer Hari2;
    ModelRenderer Hari1;
  
    
    
    public ModelAnt()
    {
        this(0.0F);
    }
    
    
  public ModelAnt(float par1)
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 4, 4, 11);
      Body.setRotationPoint(-2F, 17F, -4F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 20, 0);
      Leg3.addBox(0F, 0F, 0F, 1, 8, 1);
      Leg3.setRotationPoint(1F, 19F, -3F);
      Leg3.setTextureSize(64, 32);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, -0.9294653F);
      Leg1 = new ModelRenderer(this, 20, 0);
      Leg1.addBox(0F, 0F, 0F, 1, 8, 1);
      Leg1.setRotationPoint(1F, 19F, 5F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, -0.9294653F);
      Leg2 = new ModelRenderer(this, 20, 0);
      Leg2.addBox(0F, 0F, 0F, 1, 8, 1);
      Leg2.setRotationPoint(1F, 19F, 1F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, -0.9294653F);
      Leg5 = new ModelRenderer(this, 20, 0);
      Leg5.addBox(0F, 0F, 0F, 1, 8, 1);
      Leg5.setRotationPoint(-1F, 18F, 1F);
      Leg5.setTextureSize(64, 32);
      Leg5.mirror = true;
      setRotation(Leg5, 0F, 0F, 0.9294576F);
      Leg6 = new ModelRenderer(this, 20, 0);
      Leg6.addBox(0F, 0F, 0F, 1, 8, 1);
      Leg6.setRotationPoint(-1F, 18F, -3F);
      Leg6.setTextureSize(64, 32);
      Leg6.mirror = true;
      setRotation(Leg6, 0F, 0F, 0.9120043F);
      Leg4 = new ModelRenderer(this, 20, 0);
      Leg4.addBox(0F, 0F, 0F, 1, 8, 1);
      Leg4.setRotationPoint(-1F, 18F, 5F);
      Leg4.setTextureSize(64, 32);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0.9294576F);
      Head = new ModelRenderer(this, 33, 0);
      Head.addBox(0F, 0F, 0F, 6, 3, 3);
      Head.setRotationPoint(-3F, 15F, -6F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Hari2 = new ModelRenderer(this, 0, 0);
      Hari2.addBox(0F, 0F, 0F, 1, 2, 1);
      Hari2.setRotationPoint(1F, 13F, -5F);
      Hari2.setTextureSize(64, 32);
      Hari2.mirror = true;
      setRotation(Hari2, 0F, 0F, 0F);
      Hari1 = new ModelRenderer(this, 0, 0);
      Hari1.addBox(0F, 0F, 0F, 1, 2, 1);
      Hari1.setRotationPoint(-2F, 13F, -5F);
      Hari1.setTextureSize(64, 32);
      Hari1.mirror = true;
      setRotation(Hari1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    Leg3.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg5.render(f5);
    Leg6.render(f5);
    Leg4.render(f5);
    Head.render(f5);
    Hari2.render(f5);
    Hari1.render(f5);
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
