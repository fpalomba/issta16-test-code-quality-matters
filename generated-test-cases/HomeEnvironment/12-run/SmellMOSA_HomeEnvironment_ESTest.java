/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 23:41:25 GMT 2015
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
import com.eteks.sweethome3d.tools.URLContent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeListenerProxy;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HomeEnvironment_ESTest extends HomeEnvironment_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoWidth(I)V: I8 Branch 20 IF_ICMPEQ L497 - true
   */

  @Test
  public void test00()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
      
      int int0 = homeEnvironment0.getVideoWidth();
      homeEnvironment0.setVideoWidth(320);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSkyColor(I)V: I8 Branch 7 IF_ICMPEQ L251 - true
   */

  @Test
  public void test01()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeTexture homeTexture0 = homeEnvironment0.getSkyTexture();
      HomeEnvironment homeEnvironment1 = new HomeEnvironment(623, (HomeTexture) null, 623, 623, (float) 623);
      homeEnvironment1.setSkyColor(623);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment1.getVideoAspectRatio());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSkyTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 8 IF_ACMPEQ L270 - false
   */

  @Test
  public void test02()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      URL uRL0 = ClassLoader.getSystemResource("m pgl$>P`?{ua44");
      URLContent uRLContent0 = new URLContent((URL) null);
      CatalogTexture catalogTexture0 = new CatalogTexture("m pgl$>P`?{ua44", "m pgl$>P`?{ua44", (Content) uRLContent0, (-660.353F), (-660.353F), "m pgl$>P`?{ua44");
      HomeTexture homeTexture0 = new HomeTexture((TextureImage) catalogTexture0);
      homeEnvironment0.setSkyTexture(homeTexture0);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setGroundColor(I)V: I8 Branch 5 IF_ICMPEQ L213 - true
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setLightColor(I)V: I8 Branch 9 IF_ICMPEQ L289 - true
   */

  @Test
  public void test03()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(84, (HomeTexture) null, 84, (HomeTexture) null, 84, (float) 84);
      homeEnvironment0.setGroundColor(84);
      homeEnvironment0.setLightColor(84);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoWidth()I: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoWidth(I)V: I8 Branch 16 IF_ICMPEQ L409 - true
   */

  @Test
  public void test04()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getPhotoWidth();
      homeEnvironment0.setPhotoWidth(400);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getSubpartSizeUnderLight()F: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoHeight(I)V: I8 Branch 17 IF_ICMPEQ L431 - true
   */

  @Test
  public void test05()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      float float0 = homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.setPhotoHeight(1564);
      homeEnvironment0.setPhotoHeight(1564);
      assertEquals(1564, homeEnvironment0.getPhotoHeight());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoQuality(I)V: I8 Branch 23 IF_ICMPEQ L552 - true
   */

  @Test
  public void test06()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, 0, (HomeTexture) null, 0, (float) 0);
      homeEnvironment0.setVideoQuality(0);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.addPropertyChangeListener(Lcom/eteks/sweethome3d/model/HomeEnvironment$Property;Ljava/beans/PropertyChangeListener;)V: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(84, (HomeTexture) null, 84, (HomeTexture) null, 84, (float) 84);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.SKY_TEXTURE;
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) null);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setCeillingLightColor(I)V: I8 Branch 10 IF_ICMPEQ L308 - true
   */

  @Test
  public void test08()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getCeillingLightColor();
      homeEnvironment0.setCeillingLightColor(13684944);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoFrameRate(I)V: I8 Branch 24 IF_ICMPEQ L574 - true
   */

  @Test
  public void test09()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getVideoFrameRate();
      homeEnvironment0.setVideoFrameRate(25);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I24 Branch 15 IFNE L390 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoHeight(I)V: I8 Branch 17 IF_ICMPEQ L431 - false
   */

  @Test
  public void test10()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setPhotoHeight((-4293));
      homeEnvironment0.setAllLevelsVisible(false);
      assertEquals(-4293, homeEnvironment0.getPhotoHeight());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setWallsAlpha(F)V: I9 Branch 11 IFEQ L328 - false
   */

  @Test
  public void test11()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setWallsAlpha(0.68224245F);
      assertEquals(0.68224245F, homeEnvironment0.getWallsAlpha(), 0.01F);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoWidth(I)V: I8 Branch 20 IF_ICMPEQ L497 - false
   */

  @Test
  public void test12()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(49, (HomeTexture) null, 49, (HomeTexture) null, 49, (float) 49);
      homeEnvironment0.setVideoWidth(49);
      assertEquals(37, homeEnvironment0.getVideoHeight());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoQuality()I: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(47, (HomeTexture) null, 47, (HomeTexture) null, 47, (float) 47);
      int int0 = homeEnvironment0.getPhotoQuality();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
      assertEquals(0, int0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoQuality(I)V: I8 Branch 23 IF_ICMPEQ L552 - false
   */

  @Test
  public void test14()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-3527), (HomeTexture) null, (-3527), (HomeTexture) null, (-3527), (float) (-3527));
      homeEnvironment0.setVideoQuality((-3527));
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.removePropertyChangeListener(Lcom/eteks/sweethome3d/model/HomeEnvironment$Property;Ljava/beans/PropertyChangeListener;)V: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setGroundTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 6 IF_ACMPEQ L232 - true
   */

  @Test
  public void test15()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.DRAWING_MODE;
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("Treebank has ", (PropertyChangeListener) null);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) propertyChangeListenerProxy0);
      HomeTexture homeTexture0 = homeEnvironment0.getSkyTexture();
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 16
  /*
   * 3 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getVideoAspectRatio()Lcom/eteks/sweethome3d/model/AspectRatio;: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.getVideoHeight()I: root-Branch
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I16 Branch 22 IFNONNULL L528 - true
   */

  @Test
  public void test16()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      int int0 = homeEnvironment0.getVideoHeight();
      assertEquals(213, int0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSubpartSizeUnderLight(F)V: I9 Branch 13 IFEQ L369 - true
   */

  @Test
  public void test17()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSubpartSizeUnderLight((float) 0);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setDrawingMode(Lcom/eteks/sweethome3d/model/HomeEnvironment$DrawingMode;)V: I8 Branch 12 IF_ACMPEQ L347 - true
   */

  @Test
  public void test18()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(50, (HomeTexture) null, 50, (HomeTexture) null, 50, (float) 50);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoQuality(I)V: I8 Branch 19 IF_ICMPEQ L475 - true
   */

  @Test
  public void test19()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoQuality(0);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I8 Branch 14 IF_ICMPEQ L388 - true
   */

  @Test
  public void test20()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setAllLevelsVisible(false);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setWallsAlpha(F)V: I9 Branch 11 IFEQ L328 - true
   */

  @Test
  public void test21()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(59, (HomeTexture) null, 59, (HomeTexture) null, 59, (float) 59);
      homeEnvironment0.setWallsAlpha((float) 59);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 22
  /*
   * 5 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getWallsAlpha()F: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setGroundColor(I)V: I8 Branch 5 IF_ICMPEQ L213 - false
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.setSkyColor(I)V: I8 Branch 7 IF_ICMPEQ L251 - false
   * Goal 4. com.eteks.sweethome3d.model.HomeEnvironment.setLightColor(I)V: I8 Branch 9 IF_ICMPEQ L289 - false
   * Goal 5. com.eteks.sweethome3d.model.HomeEnvironment.setSubpartSizeUnderLight(F)V: I9 Branch 13 IFEQ L369 - false
   */

  @Test
  public void test22()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getPhotoHeight();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
      assertEquals(300, int0);
      
      homeEnvironment0.setSubpartSizeUnderLight((float) 300);
      byte[] byteArray0 = new byte[9];
      homeEnvironment0.setLightColor(300);
      float float0 = homeEnvironment0.getWallsAlpha();
      homeEnvironment0.setGroundColor((int) (byte)0);
      homeEnvironment0.setSkyColor((int) (byte)0);
      assertEquals(300, homeEnvironment0.getLightColor());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setDrawingMode(Lcom/eteks/sweethome3d/model/HomeEnvironment$DrawingMode;)V: I8 Branch 12 IF_ACMPEQ L347 - false
   */

  @Test
  public void test23()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(47, (HomeTexture) null, 47, (HomeTexture) null, 47, (float) 47);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      assertEquals(HomeEnvironment.DrawingMode.FILL_AND_OUTLINE, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 24
  /*
   * 4 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getVideoWidth()I: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.getVideoFrameRate()I: root-Branch
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoWidth(I)V: I8 Branch 16 IF_ICMPEQ L409 - false
   * Goal 4. com.eteks.sweethome3d.model.HomeEnvironment.setVideoFrameRate(I)V: I8 Branch 24 IF_ICMPEQ L574 - false
   */

  @Test
  public void test24()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getVideoFrameRate();
      int int1 = homeEnvironment0.getVideoWidth();
      homeEnvironment0.setVideoFrameRate(571);
      homeEnvironment0.setPhotoWidth(25);
      assertEquals(571, homeEnvironment0.getVideoFrameRate());
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getLightColor()I: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getLightColor();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
      assertEquals(13684944, int0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setGroundTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 6 IF_ACMPEQ L232 - false
   */

  @Test
  public void test26()  throws Throwable  {
      MockFile mockFile0 = new MockFile("o3:6$5", "o3:6$5");
      URL uRL0 = mockFile0.toURL();
      URLContent uRLContent0 = new URLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("o3:6$5", "o3:6$5", (Content) uRLContent0, (float) 11, (float) 11, "o3:6$5");
      HomeTexture homeTexture0 = new HomeTexture((TextureImage) catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(11, (HomeTexture) null, 11, 11, (float) 11);
      homeEnvironment0.setGroundTexture(homeTexture0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getVideoCameraPath()Ljava/util/List;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I8 Branch 3 IF_ICMPEQ L195 - true
   */

  @Test
  public void test28()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(49, (HomeTexture) null, 49, (HomeTexture) null, 49, (float) 49);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 18 IF_ACMPEQ L453 - true
   */

  @Test
  public void test29()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 30
  /*
   * 3 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getGroundColor()I: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.isObserverCameraElevationAdjusted()Z: root-Branch
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.getCeillingLightColor()I: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getGroundColor();
      int int1 = homeEnvironment0.getCeillingLightColor();
      boolean boolean0 = homeEnvironment0.isObserverCameraElevationAdjusted();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
      assertTrue(boolean0);
  }

  //Test case number: 31
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I8 Branch 25 IF_ACMPEQ L596 - true
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I26 Branch 26 IFNONNULL L599 - true
   */

  @Test
  public void test31()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      homeEnvironment0.setVideoCameraPath((List<Camera>) linkedList0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getDrawingMode()Lcom/eteks/sweethome3d/model/HomeEnvironment$DrawingMode;: root-Branch
   */

  @Test
  public void test32()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = homeEnvironment0.getDrawingMode();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment_DrawingMode0);
  }

  //Test case number: 33
  /*
   * 3 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I8 Branch 3 IF_ICMPEQ L195 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I24 Branch 4 IFNE L197 - false
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoQuality(I)V: I8 Branch 19 IF_ICMPEQ L475 - false
   */

  @Test
  public void test33()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoQuality(3257);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      assertEquals(3257, homeEnvironment0.getPhotoQuality());
  }

  //Test case number: 34
  /*
   * 3 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getSkyColor()I: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.getSkyTexture()Lcom/eteks/sweethome3d/model/HomeTexture;: root-Branch
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.setSkyTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 8 IF_ACMPEQ L270 - true
   */

  @Test
  public void test34()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getSkyColor();
      HomeTexture homeTexture0 = homeEnvironment0.getSkyTexture();
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setCeillingLightColor(I)V: I8 Branch 10 IF_ICMPEQ L308 - false
   */

  @Test
  public void test35()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(43, (HomeTexture) null, 43, (HomeTexture) null, 43, (float) 43);
      homeEnvironment0.setCeillingLightColor(43);
      assertEquals(43, homeEnvironment0.getCeillingLightColor());
  }

  //Test case number: 36
  /*
   * 4 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.isAllLevelsVisible()Z: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.getGroundTexture()Lcom/eteks/sweethome3d/model/HomeTexture;: root-Branch
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.clone()Lcom/eteks/sweethome3d/model/HomeEnvironment;: root-Branch
   * Goal 4. com.eteks.sweethome3d.model.HomeEnvironment.getVideoQuality()I: root-Branch
   */

  @Test
  public void test36()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      boolean boolean0 = homeEnvironment1.isAllLevelsVisible();
      HomeTexture homeTexture0 = homeEnvironment1.getGroundTexture();
      int int0 = homeEnvironment1.getVideoQuality();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment1.getVideoAspectRatio());
      assertEquals(0, int0);
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 18 IF_ACMPEQ L453 - false
   */

  @Test
  public void test37()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 38
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 21 IF_ACMPEQ L527 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I16 Branch 22 IFNONNULL L528 - false
   */

  @Test
  public void test38()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.FREE_RATIO;
      // Undeclared exception!
      try {
        homeEnvironment0.setVideoAspectRatio(aspectRatio0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported aspect ratio FREE_RATIO
         //
      }
  }

  //Test case number: 39
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 21 IF_ACMPEQ L527 - true
   */

  @Test
  public void test39()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 40
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoAspectRatio()Lcom/eteks/sweethome3d/model/AspectRatio;: root-Branch
   */

  @Test
  public void test40()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, 0, (HomeTexture) null, 0, (float) 0);
      AspectRatio aspectRatio0 = homeEnvironment0.getPhotoAspectRatio();
      assertEquals(AspectRatio.VIEW_3D_RATIO, aspectRatio0);
  }

  //Test case number: 41
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I8 Branch 25 IF_ACMPEQ L596 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I26 Branch 26 IFNONNULL L599 - false
   */

  @Test
  public void test41()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoCameraPath((List<Camera>) null);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 42
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I8 Branch 14 IF_ICMPEQ L388 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I24 Branch 15 IFNE L390 - true
   */

  @Test
  public void test42()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setAllLevelsVisible(true);
      assertTrue(homeEnvironment0.isAllLevelsVisible());
  }
}
