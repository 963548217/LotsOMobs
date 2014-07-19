// Date: 22.06.2014 22:14:11
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.lom.lotsomobsmodels;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.lom.lotsomobsentity.EntityGazelle;

public class ModelGazelle extends ModelBase
{
  //fields
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Body;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Leg5;
    ModelRenderer Leg6;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer Snout;
    ModelRenderer Ear1;
    ModelRenderer Ear2;
    ModelRenderer Horn3;
    ModelRenderer Horn4;
    ModelRenderer Horn1;
    ModelRenderer Horn2;
    ModelRenderer Tail;
    
    //Sitting
    ModelRenderer Leg11;
    ModelRenderer Leg21;
    ModelRenderer Body1;
    ModelRenderer Leg31;
    ModelRenderer Leg41;
    ModelRenderer Leg51;
    ModelRenderer Leg61;
    ModelRenderer Neck1;
    ModelRenderer Head1;
    ModelRenderer Snout1;
    ModelRenderer Ear11;
    ModelRenderer Ear21;
    ModelRenderer Horn31;
    ModelRenderer Horn41;
    ModelRenderer Horn11;
    ModelRenderer Horn21;
    ModelRenderer Tail1;
  
  public ModelGazelle()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Leg1 = new ModelRenderer(this, 53, 0);
      Leg1.addBox(-1F, 0F, -1F, 2, 13, 2);
      Leg1.setRotationPoint(2F, 11F, -6F);
      Leg1.setTextureSize(128, 128);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 40, 0);
      Leg2.addBox(-1F, 0F, -1F, 2, 13, 2);
      Leg2.setRotationPoint(-2F, 11F, -6F);
      Leg2.setTextureSize(128, 128);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 102, 0);
      Body.addBox(-6F, -10F, -7F, 6, 17, 7);
      Body.setRotationPoint(3F, 6F, 3F);
      Body.setTextureSize(128, 128);
      Body.mirror = true;
      setRotation(Body, 1.570796F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 85, 0);
      Leg3.addBox(-1F, -1F, -1F, 3, 7, 4);
      Leg3.setRotationPoint(2F, 9F, 7F);
      Leg3.setTextureSize(128, 128);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 66, 0);
      Leg4.addBox(-2F, -1F, -1F, 3, 7, 4);
      Leg4.setRotationPoint(-2F, 9F, 7F);
      Leg4.setTextureSize(128, 128);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
      Leg5 = new ModelRenderer(this, 88, 13);
      Leg5.addBox(-1F, 0F, 0F, 2, 10, 2);
      Leg5.setRotationPoint(2F, 14F, 9F);
      Leg5.setTextureSize(128, 128);
      Leg5.mirror = true;
      setRotation(Leg5, 0F, 0F, 0F);
      Leg6 = new ModelRenderer(this, 69, 13);
      Leg6.addBox(-1F, 0F, 0F, 2, 10, 2);
      Leg6.setRotationPoint(-2F, 14F, 9F);
      Leg6.setTextureSize(128, 128);
      Leg6.mirror = true;
      setRotation(Leg6, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 13, 0);
      Neck.addBox(-1.5F, -2F, 0F, 3, 4, 8);
      Neck.setRotationPoint(0F, 8F, -5F);
      Neck.setTextureSize(128, 128);
      Neck.mirror = true;
      setRotation(Neck, 2.528144F, 0F, 0F);
      Head = new ModelRenderer(this, 14, 41);
      Head.addBox(-2F, -3F, -4F, 4, 4, 5);
      Head.setRotationPoint(0F, 3F, -10F);
      Head.setTextureSize(128, 128);
      Head.mirror = true;
      setRotation(Head, 0.5235988F, 0F, 0F);
      Snout = new ModelRenderer(this, 16, 52);
      Snout.addBox(-1.5F, -2F, -8F, 3, 3, 4);
      Snout.setRotationPoint(0F, 3F, -10F);
      Snout.setTextureSize(128, 128);
      Snout.mirror = true;
      setRotation(Snout, 0.5235988F, 0F, 0F);
      Ear1 = new ModelRenderer(this, 0, 39);
      Ear1.addBox(-4F, -1F, 0F, 4, 2, 1);
      Ear1.setRotationPoint(-1.5F, 2F, -10F);
      Ear1.setTextureSize(128, 128);
      Ear1.mirror = true;
      setRotation(Ear1, 1.117011F, 1.117011F, 0.2617994F);
      Ear2 = new ModelRenderer(this, 35, 39);
      Ear2.addBox(0F, -1F, 0F, 4, 2, 1);
      Ear2.setRotationPoint(1.5F, 2F, -10F);
      Ear2.setTextureSize(128, 128);
      Ear2.mirror = true;
      setRotation(Ear2, 1.117011F, -1.117011F, -0.2617994F);
      Horn3 = new ModelRenderer(this, 14, 33);
      Horn3.addBox(-2F, 1F, 2F, 1, 5, 1);
      Horn3.setRotationPoint(0F, 3F, -10F);
      Horn3.setTextureSize(128, 128);
      Horn3.mirror = true;
      setRotation(Horn3, 2.094395F, 0F, 0F);
      Horn4 = new ModelRenderer(this, 12, 24);
      Horn4.addBox(-2.5F, 6F, 1.5F, 1, 6, 1);
      Horn4.setRotationPoint(0F, 3F, -10F);
      Horn4.setTextureSize(128, 128);
      Horn4.mirror = true;
      setRotation(Horn4, 2.094395F, 0F, 0F);
      Horn1 = new ModelRenderer(this, 27, 33);
      Horn1.addBox(1F, 1F, 2F, 1, 5, 1);
      Horn1.setRotationPoint(0F, 3F, -10F);
      Horn1.setTextureSize(128, 128);
      Horn1.mirror = true;
      setRotation(Horn1, 2.094395F, 0F, 0F);
      Horn2 = new ModelRenderer(this, 31, 24);
      Horn2.addBox(1.5F, 6F, 1.5F, 1, 6, 1);
      Horn2.setRotationPoint(0F, 3F, -10F);
      Horn2.setTextureSize(128, 128);
      Horn2.mirror = true;
      setRotation(Horn2, 2.094395F, 0F, 0F);
      Tail = new ModelRenderer(this, 0, 0);
      Tail.addBox(-1F, 0F, 0F, 2, 5, 1);
      Tail.setRotationPoint(0F, 7F, 9F);
      Tail.setTextureSize(128, 128);
      Tail.mirror = true;
      setRotation(Tail, 0.8726646F, 0F, 0F);
      
      //Sitting
      Leg11 = new ModelRenderer(this, 53, 0);
      Leg11.addBox(-1F, 0F, -1F, 2, 13, 2);
      Leg11.setRotationPoint(2F, 20F, -7F);
      Leg11.setTextureSize(128, 128);
      Leg11.mirror = true;
      setRotation(Leg11, 1.264073F, 0F, 0F);
      Leg21 = new ModelRenderer(this, 40, 0);
      Leg21.addBox(-1F, 0F, -1F, 2, 13, 2);
      Leg21.setRotationPoint(-2F, 20F, -7F);
      Leg21.setTextureSize(128, 128);
      Leg21.mirror = true;
      setRotation(Leg21, 1.264072F, 0F, 0F);
      Body1 = new ModelRenderer(this, 102, 0);
      Body1.addBox(-6F, -10F, -7F, 6, 17, 7);
      Body1.setRotationPoint(3F, 14F, 3F);
      Body1.setTextureSize(128, 128);
      Body1.mirror = true;
      setRotation(Body1, 1.570796F, 0F, 0F);
      Leg31 = new ModelRenderer(this, 85, 0);
      Leg31.addBox(-1F, -1F, -1F, 3, 7, 4);
      Leg31.setRotationPoint(2F, 19F, 10F);
      Leg31.setTextureSize(128, 128);
      Leg31.mirror = true;
      setRotation(Leg31, -1.041001F, 0F, 0F);
      Leg41 = new ModelRenderer(this, 66, 0);
      Leg41.addBox(-2F, -1F, -1F, 3, 7, 4);
      Leg41.setRotationPoint(-2F, 19F, 10F);
      Leg41.setTextureSize(128, 128);
      Leg41.mirror = true;
      setRotation(Leg41, -1.041002F, 0F, 0F);
      Leg51 = new ModelRenderer(this, 88, 13);
      Leg51.addBox(-1F, 0F, 0F, 2, 10, 2);
      Leg51.setRotationPoint(2F, 22F, 6F);
      Leg51.setTextureSize(128, 128);
      Leg51.mirror = true;
      setRotation(Leg51, -1.487144F, 0F, 0F);
      Leg61 = new ModelRenderer(this, 69, 13);
      Leg61.addBox(-1F, 0F, 0F, 2, 10, 2);
      Leg61.setRotationPoint(-2F, 22F, 6F);
      Leg61.setTextureSize(128, 128);
      Leg61.mirror = true;
      setRotation(Leg61, -1.487143F, 0F, 0F);
      Neck1 = new ModelRenderer(this, 13, 0);
      Neck1.addBox(-1.5F, -2F, 0F, 3, 4, 8);
      Neck1.setRotationPoint(0F, 16F, -5F);
      Neck1.setTextureSize(128, 128);
      Neck1.mirror = true;
      setRotation(Neck1, 2.528144F, 0F, 0F);
      Head1 = new ModelRenderer(this, 14, 41);
      Head1.addBox(-2F, -3F, -4F, 4, 4, 5);
      Head1.setRotationPoint(0F, 11F, -10F);
      Head1.setTextureSize(128, 128);
      Head1.mirror = true;
      setRotation(Head1, 0.5235988F, 0F, 0F);
      Snout1 = new ModelRenderer(this, 16, 52);
      Snout1.addBox(-1.5F, -2F, -8F, 3, 3, 4);
      Snout1.setRotationPoint(0F, 11F, -10F);
      Snout1.setTextureSize(128, 128);
      Snout1.mirror = true;
      setRotation(Snout1, 0.5235988F, 0F, 0F);
      Ear11 = new ModelRenderer(this, 0, 39);
      Ear11.addBox(-4F, -1F, 0F, 4, 2, 1);
      Ear11.setRotationPoint(-1.5F, 10F, -10F);
      Ear11.setTextureSize(128, 128);
      Ear11.mirror = true;
      setRotation(Ear11, 1.117011F, 1.117011F, 0.2617994F);
      Ear21 = new ModelRenderer(this, 35, 39);
      Ear21.addBox(0F, -1F, 0F, 4, 2, 1);
      Ear21.setRotationPoint(1.5F, 10F, -10F);
      Ear21.setTextureSize(128, 128);
      Ear21.mirror = true;
      setRotation(Ear21, 1.117011F, -1.117011F, -0.2617994F);
      Horn31 = new ModelRenderer(this, 14, 33);
      Horn31.addBox(-2F, 1F, 2F, 1, 5, 1);
      Horn31.setRotationPoint(0F, 11F, -10F);
      Horn31.setTextureSize(128, 128);
      Horn31.mirror = true;
      setRotation(Horn31, 2.094395F, 0F, 0F);
      Horn41 = new ModelRenderer(this, 12, 24);
      Horn41.addBox(-2.5F, 6F, 1.5F, 1, 6, 1);
      Horn41.setRotationPoint(0F, 11F, -10F);
      Horn41.setTextureSize(128, 128);
      Horn41.mirror = true;
      setRotation(Horn41, 2.094395F, 0F, 0F);
      Horn11 = new ModelRenderer(this, 27, 33);
      Horn11.addBox(1F, 1F, 2F, 1, 5, 1);
      Horn11.setRotationPoint(0F, 11F, -10F);
      Horn11.setTextureSize(128, 128);
      Horn11.mirror = true;
      setRotation(Horn11, 2.094395F, 0F, 0F);
      Horn21 = new ModelRenderer(this, 31, 24);
      Horn21.addBox(1.5F, 6F, 1.5F, 1, 6, 1);
      Horn21.setRotationPoint(0F, 11F, -10F);
      Horn21.setTextureSize(128, 128);
      Horn21.mirror = true;
      setRotation(Horn21, 2.094395F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 0, 0);
      Tail1.addBox(-1F, 0F, 0F, 2, 5, 1);
      Tail1.setRotationPoint(0F, 15F, 9F);
      Tail1.setTextureSize(128, 128);
      Tail1.mirror = true;
      setRotation(Tail1, 0.8726646F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    EntityGazelle gazelle = (EntityGazelle)entity;
    if(gazelle.isSitting())
    {
    	if(this.isChild)
    	{
            float var8 = 2.0F;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 5.0F * f5, 2.0F * f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
            GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
            Leg11.render(f5);
            Leg21.render(f5);
            Body1.render(f5);
            Leg31.render(f5);
            Leg41.render(f5);
            Leg51.render(f5);
            Leg61.render(f5);
            Neck1.render(f5);
            Head1.render(f5);
            Snout1.render(f5);
            Ear11.render(f5);
            Ear21.render(f5);
            Horn31.render(f5);
            Horn41.render(f5);
            Horn11.render(f5);
            Horn21.render(f5);
            Tail1.render(f5);
            GL11.glPopMatrix();
    	}
    	else
    	{
        Leg11.render(f5);
        Leg21.render(f5);
        Body1.render(f5);
        Leg31.render(f5);
        Leg41.render(f5);
        Leg51.render(f5);
        Leg61.render(f5);
        Neck1.render(f5);
        Head1.render(f5);
        Snout1.render(f5);
        Ear11.render(f5);
        Ear21.render(f5);
        Horn31.render(f5);
        Horn41.render(f5);
        Horn11.render(f5);
        Horn21.render(f5);
        Tail1.render(f5);
    	}
    }
    else
    {
    	if(this.isChild)
    	{
            float var8 = 2.0F;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 5.0F * f5, 2.0F * f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
            GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
        	Leg1.render(f5);
        	Leg2.render(f5);
        	Body.render(f5);
        	Leg3.render(f5);
        	Leg4.render(f5);
        	Leg5.render(f5);
        	Leg6.render(f5);
        	Neck.render(f5);
        	Head.render(f5);
        	Snout.render(f5);
        	Ear1.render(f5);
        	Ear2.render(f5);
        	Horn3.render(f5);
        	Horn4.render(f5);
        	Horn1.render(f5);
        	Horn2.render(f5);
        	Tail.render(f5);
            GL11.glPopMatrix();
    	}
    	else
    	{
    	Leg1.render(f5);
    	Leg2.render(f5);
    	Body.render(f5);
    	Leg3.render(f5);
    	Leg4.render(f5);
    	Leg5.render(f5);
    	Leg6.render(f5);
    	Neck.render(f5);
    	Head.render(f5);
    	Snout.render(f5);
    	Ear1.render(f5);
    	Ear2.render(f5);
    	Horn3.render(f5);
    	Horn4.render(f5);
    	Horn1.render(f5);
    	Horn2.render(f5);
    	Tail.render(f5);
    	}
    }
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
