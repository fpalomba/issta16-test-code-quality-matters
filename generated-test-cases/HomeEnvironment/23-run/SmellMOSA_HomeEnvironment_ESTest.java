/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 14 00:17:27 GMT 2015
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
import com.eteks.sweethome3d.tools.TemporaryURLContent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeListenerProxy;
import java.net.URL;
import java.util.ArrayList;
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
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I24 Branch 15 IFNE L390 - false
   */

  @Test
  public void test00()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setAllLevelsVisible(false);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSkyTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 8 IF_ACMPEQ L270 - false
   */

  @Test
  public void test01()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      URL uRL0 = MockURL.getHttpExample();
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("WALLS_ALPHA", "WALLS_ALPHA", (Content) temporaryURLContent0, 0.0F, 0.0F, "WALLS_ALPHA", false);
      HomeTexture homeTexture0 = new HomeTexture((TextureImage) catalogTexture0);
      homeEnvironment0.setSkyTexture(homeTexture0);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setCeillingLightColor(I)V: I8 Branch 10 IF_ICMPEQ L308 - true
   */

  @Test
  public void test02()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getLightColor();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
      assertEquals(13684944, int0);
      
      homeEnvironment0.setCeillingLightColor(13684944);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.addPropertyChangeListener(Lcom/eteks/sweethome3d/model/HomeEnvironment$Property;Ljava/beans/PropertyChangeListener;)V: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setLightColor(I)V: I8 Branch 9 IF_ICMPEQ L289 - false
   */

  @Test
  public void test03()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_FRAME_RATE;
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) null);
      homeEnvironment0.setLightColor((-2562));
      assertEquals(-2562, homeEnvironment0.getLightColor());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoWidth(I)V: I8 Branch 20 IF_ICMPEQ L497 - true
   */

  @Test
  public void test04()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoWidth((-3833));
      homeEnvironment0.setVideoWidth((-3833));
      assertEquals(-3833, homeEnvironment0.getVideoWidth());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I24 Branch 4 IFNE L197 - true
   */

  @Test
  public void test05()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      boolean boolean0 = homeEnvironment0.isObserverCameraElevationAdjusted();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
      assertTrue(boolean0);
      
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setGroundTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 6 IF_ACMPEQ L232 - true
   */

  @Test
  public void test06()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeTexture homeTexture0 = homeEnvironment0.getSkyTexture();
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.isAllLevelsVisible()Z: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      boolean boolean0 = homeEnvironment0.isAllLevelsVisible();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setWallsAlpha(F)V: I9 Branch 11 IFEQ L328 - false
   */

  @Test
  public void test08()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setWallsAlpha((float) 218);
      assertEquals(218.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getDrawingMode()Lcom/eteks/sweethome3d/model/HomeEnvironment$DrawingMode;: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setCeillingLightColor(I)V: I8 Branch 10 IF_ICMPEQ L308 - false
   */

  @Test
  public void test09()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = homeEnvironment0.getDrawingMode();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment_DrawingMode0);
      
      homeEnvironment0.setCeillingLightColor(0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setGroundColor(I)V: I8 Branch 5 IF_ICMPEQ L213 - false
   */

  @Test
  public void test10()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-277), (HomeTexture) null, (-277), (HomeTexture) null, (-277), (float) (-277));
      homeEnvironment0.setGroundColor((-15));
      assertEquals(-15, homeEnvironment0.getGroundColor());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoWidth(I)V: I8 Branch 16 IF_ICMPEQ L409 - true
   */

  @Test
  public void test11()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getPhotoWidth();
      homeEnvironment0.setPhotoWidth(400);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getVideoAspectRatio()Lcom/eteks/sweethome3d/model/AspectRatio;: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.getVideoWidth()I: root-Branch
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.getVideoHeight()I: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getVideoHeight();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
      assertEquals(240, int0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getGroundColor()I: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getGroundColor();
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
      assertEquals(11053224, int0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoQuality(I)V: I8 Branch 19 IF_ICMPEQ L475 - true
   */

  @Test
  public void test14()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoQuality(0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSubpartSizeUnderLight(F)V: I9 Branch 13 IFEQ L369 - true
   */

  @Test
  public void test15()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSubpartSizeUnderLight((float) 0L);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setWallsAlpha(F)V: I9 Branch 11 IFEQ L328 - true
   */

  @Test
  public void test16()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setWallsAlpha((float) 0);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSkyColor(I)V: I8 Branch 7 IF_ICMPEQ L251 - true
   */

  @Test
  public void test17()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(1060, (HomeTexture) null, 1060, (HomeTexture) null, 1060, (float) 1060);
      homeEnvironment0.setSkyColor(1060);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 18
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I8 Branch 3 IF_ICMPEQ L195 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I24 Branch 4 IFNE L197 - false
   */

  @Test
  public void test18()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSkyColor(I)V: I8 Branch 7 IF_ICMPEQ L251 - false
   */

  @Test
  public void test19()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSkyColor(218);
      assertEquals(218, homeEnvironment0.getSkyColor());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I16 Branch 22 IFNONNULL L528 - false
   */

  @Test
  public void test20()  throws Throwable  {
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

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setDrawingMode(Lcom/eteks/sweethome3d/model/HomeEnvironment$DrawingMode;)V: I8 Branch 12 IF_ACMPEQ L347 - false
   */

  @Test
  public void test21()  throws Throwable  {
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      assertEquals(HomeEnvironment.DrawingMode.FILL_AND_OUTLINE, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 22
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I8 Branch 25 IF_ACMPEQ L596 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I26 Branch 26 IFNONNULL L599 - false
   */

  @Test
  public void test22()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoCameraPath((List<Camera>) null);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getVideoCameraPath()Ljava/util/List;: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I8 Branch 3 IF_ICMPEQ L195 - true
   */

  @Test
  public void test24()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 25
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoAspectRatio()Lcom/eteks/sweethome3d/model/AspectRatio;: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 21 IF_ACMPEQ L527 - true
   */

  @Test
  public void test25()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(3776, (HomeTexture) null, 3776, (HomeTexture) null, 3776, (float) 3776);
      AspectRatio aspectRatio0 = homeEnvironment0.getPhotoAspectRatio();
      assertEquals(AspectRatio.VIEW_3D_RATIO, aspectRatio0);
      
      AspectRatio aspectRatio1 = AspectRatio.RATIO_4_3;
      homeEnvironment0.setVideoAspectRatio(aspectRatio1);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoQuality(I)V: I8 Branch 23 IF_ICMPEQ L552 - false
   */

  @Test
  public void test26()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(5, (HomeTexture) null, 5, (HomeTexture) null, 5, (float) 5);
      homeEnvironment0.setVideoQuality(5);
      assertEquals(5, homeEnvironment0.getVideoQuality());
  }

  //Test case number: 27
  /*
   * 3 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setGroundTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 6 IF_ACMPEQ L232 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I8 Branch 14 IF_ICMPEQ L388 - false
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I24 Branch 15 IFNE L390 - true
   */

  @Test
  public void test27()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("R", (Content) null, (float) 220, (float) 220, false);
      HomeTexture homeTexture0 = new HomeTexture((TextureImage) catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(220, homeTexture0, 220, 220, (float) 220);
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      assertTrue(homeEnvironment0.isAllLevelsVisible());
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoFrameRate(I)V: I8 Branch 24 IF_ICMPEQ L574 - true
   */

  @Test
  public void test28()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoFrameRate(25);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoQuality(I)V: I8 Branch 23 IF_ICMPEQ L552 - true
   */

  @Test
  public void test29()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, 0, (HomeTexture) null, 0, (float) 0);
      homeEnvironment0.setVideoQuality(0);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.removePropertyChangeListener(Lcom/eteks/sweethome3d/model/HomeEnvironment$Property;Ljava/beans/PropertyChangeListener;)V: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.SKY_COLOR;
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("K=_", (PropertyChangeListener) null);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) propertyChangeListenerProxy0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setGroundColor(I)V: I8 Branch 5 IF_ICMPEQ L213 - true
   */

  @Test
  public void test31()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-468), (HomeTexture) null, (-468), (HomeTexture) null, (-468), (float) (-468));
      homeEnvironment0.setGroundColor((-468));
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 32
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getVideoFrameRate()I: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoHeight(I)V: I8 Branch 17 IF_ICMPEQ L431 - true
   */

  @Test
  public void test32()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getVideoFrameRate();
      homeEnvironment0.setPhotoHeight(530);
      homeEnvironment0.setPhotoHeight(530);
      assertEquals(530, homeEnvironment0.getPhotoHeight());
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoHeight()I: root-Branch
   */

  @Test
  public void test33()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getPhotoHeight();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
      assertEquals(300, int0);
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getSkyColor()I: root-Branch
   */

  @Test
  public void test34()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getSkyColor();
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
      assertEquals(13427964, int0);
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setLightColor(I)V: I8 Branch 9 IF_ICMPEQ L289 - true
   */

  @Test
  public void test35()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-252), (HomeTexture) null, (-252), (HomeTexture) null, (-252), (float) (-252));
      homeEnvironment0.setLightColor((-252));
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 36
  /*
   * 6 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoWidth(I)V: I8 Branch 16 IF_ICMPEQ L409 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 18 IF_ACMPEQ L453 - true
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 21 IF_ACMPEQ L527 - false
   * Goal 4. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I16 Branch 22 IFNONNULL L528 - true
   * Goal 5. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I8 Branch 25 IF_ACMPEQ L596 - true
   * Goal 6. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I26 Branch 26 IFNONNULL L599 - true
   */

  @Test
  public void test36()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      ArrayList<Camera> arrayList0 = new ArrayList<Camera>();
      homeEnvironment0.setVideoCameraPath((List<Camera>) arrayList0);
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      AspectRatio aspectRatio1 = AspectRatio.SQUARE_RATIO;
      homeEnvironment0.setVideoAspectRatio(aspectRatio1);
      homeEnvironment0.setPhotoWidth(24);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setDrawingMode(Lcom/eteks/sweethome3d/model/HomeEnvironment$DrawingMode;)V: I8 Branch 12 IF_ACMPEQ L347 - true
   */

  @Test
  public void test37()  throws Throwable  {
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 38
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoWidth(I)V: I8 Branch 20 IF_ICMPEQ L497 - false
   */

  @Test
  public void test38()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, 0, (HomeTexture) null, 0, (float) 0);
      homeEnvironment0.setVideoWidth(0);
      assertEquals(0, homeEnvironment0.getVideoWidth());
  }

  //Test case number: 39
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSubpartSizeUnderLight(F)V: I9 Branch 13 IFEQ L369 - false
   */

  @Test
  public void test39()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSubpartSizeUnderLight((float) 669L);
      assertEquals(669.0F, homeEnvironment0.getSubpartSizeUnderLight(), 0.01F);
  }

  //Test case number: 40
  /*
   * 14 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getWallsAlpha()F: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.getSkyTexture()Lcom/eteks/sweethome3d/model/HomeTexture;: root-Branch
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoQuality()I: root-Branch
   * Goal 4. com.eteks.sweethome3d.model.HomeEnvironment.getGroundTexture()Lcom/eteks/sweethome3d/model/HomeTexture;: root-Branch
   * Goal 5. com.eteks.sweethome3d.model.HomeEnvironment.clone()Lcom/eteks/sweethome3d/model/HomeEnvironment;: root-Branch
   * Goal 6. com.eteks.sweethome3d.model.HomeEnvironment.getCeillingLightColor()I: root-Branch
   * Goal 7. com.eteks.sweethome3d.model.HomeEnvironment.getVideoQuality()I: root-Branch
   * Goal 8. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoWidth()I: root-Branch
   * Goal 9. com.eteks.sweethome3d.model.HomeEnvironment.setSkyTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 8 IF_ACMPEQ L270 - true
   * Goal 10. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I8 Branch 14 IF_ICMPEQ L388 - true
   * Goal 11. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoHeight(I)V: I8 Branch 17 IF_ICMPEQ L431 - false
   * Goal 12. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 18 IF_ACMPEQ L453 - false
   * Goal 13. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoQuality(I)V: I8 Branch 19 IF_ICMPEQ L475 - false
   * Goal 14. com.eteks.sweethome3d.model.HomeEnvironment.setVideoFrameRate(I)V: I8 Branch 24 IF_ICMPEQ L574 - false
   */

  @Test
  public void test40()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getCeillingLightColor();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      int int1 = homeEnvironment0.getPhotoQuality();
      HomeTexture homeTexture0 = homeEnvironment1.getSkyTexture();
      homeEnvironment0.setAllLevelsVisible(false);
      HomeTexture homeTexture1 = homeEnvironment1.getGroundTexture();
      homeEnvironment1.setVideoFrameRate(0);
      homeEnvironment1.setPhotoHeight(0);
      int int2 = homeEnvironment0.getPhotoWidth();
      float float0 = homeEnvironment0.getWallsAlpha();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment1.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      int int3 = homeEnvironment1.getVideoQuality();
      homeEnvironment0.setPhotoQuality(13684944);
      assertEquals(13684944, homeEnvironment0.getPhotoQuality());
  }

  //Test case number: 41
  /*
   * 4 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getSubpartSizeUnderLight()F: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.<init>(ILcom/eteks/sweethome3d/model/HomeTexture;ILcom/eteks/sweethome3d/model/HomeTexture;IF)V: root-Branch
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.<init>(ILcom/eteks/sweethome3d/model/HomeTexture;IIF)V: root-Branch
   * Goal 4. com.eteks.sweethome3d.model.HomeEnvironment.<init>()V: root-Branch
   */

  @Test
  public void test41()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      float float0 = homeEnvironment0.getSubpartSizeUnderLight();
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
      assertEquals(0.0F, float0, 0.01F);
  }
}
