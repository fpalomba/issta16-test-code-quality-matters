/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 14 03:32:00 GMT 2015
 */

package com.eteks.sweethome3d.model;

import static org.junit.Assert.*;
import org.junit.Test;
import com.eteks.sweethome3d.model.AspectRatio;
import com.eteks.sweethome3d.model.Camera;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.HomeEnvironment;
import com.eteks.sweethome3d.model.HomeTexture;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HomeEnvironment_ESTest extends HomeEnvironment_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I8 Branch 25 IF_ACMPEQ L596 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I26 Branch 26 IFNONNULL L599 - false
   */

  @Test
  public void test00()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoCameraPath((List<Camera>) null);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I8 Branch 25 IF_ACMPEQ L596 - true
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I26 Branch 26 IFNONNULL L599 - true
   */

  @Test
  public void test01()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      homeEnvironment0.setVideoCameraPath((List<Camera>) linkedList0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoFrameRate(I)V: I8 Branch 24 IF_ICMPEQ L574 - false
   */

  @Test
  public void test02()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoFrameRate(1928);
      assertEquals(1928, homeEnvironment0.getVideoFrameRate());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoFrameRate(I)V: I8 Branch 24 IF_ICMPEQ L574 - true
   */

  @Test
  public void test03()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoFrameRate(25);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoQuality(I)V: I8 Branch 23 IF_ICMPEQ L552 - false
   */

  @Test
  public void test04()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoQuality(4343);
      assertEquals(4343, homeEnvironment0.getVideoQuality());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoQuality(I)V: I8 Branch 23 IF_ICMPEQ L552 - true
   */

  @Test
  public void test05()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoQuality(0);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I16 Branch 22 IFNONNULL L528 - false
   */

  @Test
  public void test06()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      // Undeclared exception!
      try {
        homeEnvironment0.setVideoAspectRatio(aspectRatio0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported aspect ratio VIEW_3D_RATIO
         //
      }
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 21 IF_ACMPEQ L527 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I16 Branch 22 IFNONNULL L528 - true
   */

  @Test
  public void test07()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      assertEquals(AspectRatio.RATIO_16_9, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 21 IF_ACMPEQ L527 - true
   */

  @Test
  public void test08()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = homeEnvironment0.getVideoAspectRatio();
      assertEquals(AspectRatio.RATIO_4_3, aspectRatio0);
      
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoWidth(I)V: I8 Branch 20 IF_ICMPEQ L497 - false
   */

  @Test
  public void test09()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1990), (HomeTexture) null, (-1990), (HomeTexture) null, (-1990), (-0.3288132F));
      homeEnvironment0.setVideoWidth((-1990));
      assertEquals(-1990, homeEnvironment0.getVideoWidth());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoWidth(I)V: I8 Branch 20 IF_ICMPEQ L497 - true
   */

  @Test
  public void test10()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoWidth(320);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoQuality(I)V: I8 Branch 19 IF_ICMPEQ L475 - false
   */

  @Test
  public void test11()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1990), (HomeTexture) null, (-1990), (HomeTexture) null, (-1990), (-0.3288132F));
      homeEnvironment0.setPhotoQuality((-1990));
      assertEquals(-1990, homeEnvironment0.getPhotoQuality());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoQuality(I)V: I8 Branch 19 IF_ICMPEQ L475 - true
   */

  @Test
  public void test12()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoQuality(0);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 18 IF_ACMPEQ L453 - false
   */

  @Test
  public void test13()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = homeEnvironment0.getVideoAspectRatio();
      assertEquals(AspectRatio.RATIO_4_3, aspectRatio0);
      
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 18 IF_ACMPEQ L453 - true
   */

  @Test
  public void test14()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoHeight(I)V: I8 Branch 17 IF_ICMPEQ L431 - true
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoHeight(I)V: I8 Branch 17 IF_ICMPEQ L431 - false
   */

  @Test
  public void test15()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoHeight(0);
      homeEnvironment0.setPhotoHeight(0);
      assertEquals(0, homeEnvironment0.getPhotoHeight());
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoWidth(I)V: I8 Branch 16 IF_ICMPEQ L409 - true
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoWidth(I)V: I8 Branch 16 IF_ICMPEQ L409 - false
   */

  @Test
  public void test16()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoWidth(15);
      homeEnvironment0.setPhotoWidth(15);
      assertEquals(15, homeEnvironment0.getPhotoWidth());
  }

  //Test case number: 17
  /*
   * 3 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I8 Branch 14 IF_ICMPEQ L388 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I24 Branch 15 IFNE L390 - true
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I24 Branch 15 IFNE L390 - false
   */

  @Test
  public void test17()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setAllLevelsVisible(false);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I8 Branch 14 IF_ICMPEQ L388 - true
   */

  @Test
  public void test18()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setAllLevelsVisible(false);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSubpartSizeUnderLight(F)V: I9 Branch 13 IFEQ L369 - false
   */

  @Test
  public void test19()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSubpartSizeUnderLight(458.48236F);
      assertEquals(458.48236F, homeEnvironment0.getSubpartSizeUnderLight(), 0.01F);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSubpartSizeUnderLight(F)V: I9 Branch 13 IFEQ L369 - true
   */

  @Test
  public void test20()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSubpartSizeUnderLight((float) 0);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setDrawingMode(Lcom/eteks/sweethome3d/model/HomeEnvironment$DrawingMode;)V: I8 Branch 12 IF_ACMPEQ L347 - false
   */

  @Test
  public void test21()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      assertEquals(HomeEnvironment.DrawingMode.OUTLINE, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setDrawingMode(Lcom/eteks/sweethome3d/model/HomeEnvironment$DrawingMode;)V: I8 Branch 12 IF_ACMPEQ L347 - true
   */

  @Test
  public void test22()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setWallsAlpha(F)V: I9 Branch 11 IFEQ L328 - false
   */

  @Test
  public void test23()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1990), (HomeTexture) null, (-1990), (HomeTexture) null, (-1990), (-0.3288132F));
      homeEnvironment0.setWallsAlpha((float) (-1990));
      assertEquals((-1990.0F), homeEnvironment0.getWallsAlpha(), 0.01F);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setWallsAlpha(F)V: I9 Branch 11 IFEQ L328 - true
   */

  @Test
  public void test24()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setWallsAlpha(0.0F);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 25
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setCeillingLightColor(I)V: I8 Branch 10 IF_ICMPEQ L308 - true
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setCeillingLightColor(I)V: I8 Branch 10 IF_ICMPEQ L308 - false
   */

  @Test
  public void test25()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setCeillingLightColor(7);
      homeEnvironment0.setCeillingLightColor(7);
      assertEquals(7, homeEnvironment0.getCeillingLightColor());
  }

  //Test case number: 26
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setLightColor(I)V: I8 Branch 9 IF_ICMPEQ L289 - true
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setLightColor(I)V: I8 Branch 9 IF_ICMPEQ L289 - false
   */

  @Test
  public void test26()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setLightColor(0);
      homeEnvironment0.setLightColor(0);
      assertEquals(0, homeEnvironment0.getLightColor());
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSkyTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 8 IF_ACMPEQ L270 - false
   */

  @Test
  public void test27()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      URL uRL0 = MockURL.getHttpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture(" [", " [", (Content) resourceURLContent0, (float) 566, (float) 25, " [", true);
      HomeTexture homeTexture0 = new HomeTexture((TextureImage) catalogTexture0);
      homeEnvironment0.setSkyTexture(homeTexture0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSkyTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 8 IF_ACMPEQ L270 - true
   */

  @Test
  public void test28()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1990), (HomeTexture) null, (-1990), (HomeTexture) null, (-1990), (-0.3288132F));
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSkyColor(I)V: I8 Branch 7 IF_ICMPEQ L251 - false
   */

  @Test
  public void test29()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSkyColor((-1990));
      assertEquals(-1990, homeEnvironment0.getSkyColor());
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSkyColor(I)V: I8 Branch 7 IF_ICMPEQ L251 - true
   */

  @Test
  public void test30()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-836), (HomeTexture) null, (-836), (HomeTexture) null, (-836), (float) (-836));
      homeEnvironment0.setSkyColor((-836));
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setGroundTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 6 IF_ACMPEQ L232 - false
   */

  @Test
  public void test31()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      CatalogTexture catalogTexture0 = new CatalogTexture("", (Content) null, 458.48236F, 458.48236F);
      HomeTexture homeTexture0 = new HomeTexture((TextureImage) catalogTexture0);
      homeEnvironment0.setGroundTexture(homeTexture0);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setGroundTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 6 IF_ACMPEQ L232 - true
   */

  @Test
  public void test32()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 33
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setGroundColor(I)V: I8 Branch 5 IF_ICMPEQ L213 - true
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setGroundColor(I)V: I8 Branch 5 IF_ICMPEQ L213 - false
   */

  @Test
  public void test33()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setGroundColor(28);
      homeEnvironment0.setGroundColor(28);
      assertEquals(28, homeEnvironment0.getGroundColor());
  }

  //Test case number: 34
  /*
   * 3 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I8 Branch 3 IF_ICMPEQ L195 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I24 Branch 4 IFNE L197 - true
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I24 Branch 4 IFNE L197 - false
   */

  @Test
  public void test34()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I8 Branch 3 IF_ICMPEQ L195 - true
   */

  @Test
  public void test35()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.addPropertyChangeListener(Lcom/eteks/sweethome3d/model/HomeEnvironment$Property;Ljava/beans/PropertyChangeListener;)V: root-Branch
   */

  @Test
  public void test36()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.SUBPART_SIZE_UNDER_LIGHT;
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) null);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getVideoFrameRate()I: root-Branch
   */

  @Test
  public void test37()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getVideoFrameRate();
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
      assertEquals(25, int0);
  }

  //Test case number: 38
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.removePropertyChangeListener(Lcom/eteks/sweethome3d/model/HomeEnvironment$Property;Ljava/beans/PropertyChangeListener;)V: root-Branch
   */

  @Test
  public void test38()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.LIGHT_COLOR;
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) null);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 39
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getLightColor()I: root-Branch
   */

  @Test
  public void test39()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getLightColor();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
      assertEquals(13684944, int0);
  }

  //Test case number: 40
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getVideoCameraPath()Ljava/util/List;: root-Branch
   */

  @Test
  public void test40()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 41
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoWidth()I: root-Branch
   */

  @Test
  public void test41()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1990), (HomeTexture) null, (-1990), (HomeTexture) null, (-1990), (-0.3288132F));
      int int0 = homeEnvironment0.getPhotoWidth();
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
      assertEquals(400, int0);
  }

  //Test case number: 42
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getVideoQuality()I: root-Branch
   */

  @Test
  public void test42()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getVideoQuality();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
      assertEquals(0, int0);
  }

  //Test case number: 43
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoHeight()I: root-Branch
   */

  @Test
  public void test43()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1990), (HomeTexture) null, (-1990), (HomeTexture) null, (-1990), (-0.3288132F));
      int int0 = homeEnvironment0.getPhotoHeight();
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
      assertEquals(300, int0);
  }

  //Test case number: 44
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoAspectRatio()Lcom/eteks/sweethome3d/model/AspectRatio;: root-Branch
   */

  @Test
  public void test44()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = homeEnvironment0.getPhotoAspectRatio();
      assertEquals(AspectRatio.VIEW_3D_RATIO, aspectRatio0);
  }

  //Test case number: 45
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getCeillingLightColor()I: root-Branch
   */

  @Test
  public void test45()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1990), (HomeTexture) null, (-1990), (HomeTexture) null, (-1990), (-0.3288132F));
      int int0 = homeEnvironment0.getCeillingLightColor();
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
      assertEquals(13684944, int0);
  }

  //Test case number: 46
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.clone()Lcom/eteks/sweethome3d/model/HomeEnvironment;: root-Branch
   */

  @Test
  public void test46()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 47
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getGroundTexture()Lcom/eteks/sweethome3d/model/HomeTexture;: root-Branch
   */

  @Test
  public void test47()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1990), (HomeTexture) null, (-1990), (HomeTexture) null, (-1990), (-0.3288132F));
      HomeTexture homeTexture0 = homeEnvironment0.getGroundTexture();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 48
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoQuality()I: root-Branch
   */

  @Test
  public void test48()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getPhotoQuality();
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
      assertEquals(0, int0);
  }

  //Test case number: 49
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getSubpartSizeUnderLight()F: root-Branch
   */

  @Test
  public void test49()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      float float0 = homeEnvironment0.getSubpartSizeUnderLight();
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
      assertEquals(0.0F, float0, 0.01F);
  }

  //Test case number: 50
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.isObserverCameraElevationAdjusted()Z: root-Branch
   */

  @Test
  public void test50()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      boolean boolean0 = homeEnvironment0.isObserverCameraElevationAdjusted();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
      assertTrue(boolean0);
  }

  //Test case number: 51
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getGroundColor()I: root-Branch
   */

  @Test
  public void test51()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1990), (HomeTexture) null, (-1990), (HomeTexture) null, (-1990), (-0.3288132F));
      int int0 = homeEnvironment0.getGroundColor();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
      assertEquals((-1990), int0);
  }

  //Test case number: 52
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getSkyTexture()Lcom/eteks/sweethome3d/model/HomeTexture;: root-Branch
   */

  @Test
  public void test52()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeTexture homeTexture0 = homeEnvironment0.getSkyTexture();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 53
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getSkyColor()I: root-Branch
   */

  @Test
  public void test53()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getSkyColor();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
      assertEquals(13427964, int0);
  }

  //Test case number: 54
  /*
   * 3 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getVideoAspectRatio()Lcom/eteks/sweethome3d/model/AspectRatio;: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.getVideoWidth()I: root-Branch
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.getVideoHeight()I: root-Branch
   */

  @Test
  public void test54()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getVideoHeight();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
      assertEquals(240, int0);
  }

  //Test case number: 55
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.isAllLevelsVisible()Z: root-Branch
   */

  @Test
  public void test55()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1990), (HomeTexture) null, (-1990), (HomeTexture) null, (-1990), (-0.3288132F));
      boolean boolean0 = homeEnvironment0.isAllLevelsVisible();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 56
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getWallsAlpha()F: root-Branch
   */

  @Test
  public void test56()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      float float0 = homeEnvironment0.getWallsAlpha();
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
      assertEquals(0.0F, float0, 0.01F);
  }

  //Test case number: 57
  /*
   * 4 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getDrawingMode()Lcom/eteks/sweethome3d/model/HomeEnvironment$DrawingMode;: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.<init>(ILcom/eteks/sweethome3d/model/HomeTexture;ILcom/eteks/sweethome3d/model/HomeTexture;IF)V: root-Branch
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.<init>(ILcom/eteks/sweethome3d/model/HomeTexture;IIF)V: root-Branch
   * Goal 4. com.eteks.sweethome3d.model.HomeEnvironment.<init>()V: root-Branch
   */

  @Test
  public void test57()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = homeEnvironment0.getDrawingMode();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment_DrawingMode0);
  }
}