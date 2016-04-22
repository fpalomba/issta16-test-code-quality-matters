/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 14 00:23:32 GMT 2015
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
import java.beans.PropertyChangeListener;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 21 IF_ACMPEQ L527 - true
   */

  @Test
  public void test00()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSkyTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 8 IF_ACMPEQ L270 - false
   */

  @Test
  public void test01()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      CatalogTexture catalogTexture0 = new CatalogTexture("<4wI&'+[`M~2ta}", (Content) null, 0.0F, 0.0F);
      HomeTexture homeTexture0 = new HomeTexture((TextureImage) catalogTexture0);
      homeEnvironment0.setSkyTexture(homeTexture0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setCeillingLightColor(I)V: I8 Branch 10 IF_ICMPEQ L308 - true
   */

  @Test
  public void test02()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setCeillingLightColor(13684944);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoFrameRate(I)V: I8 Branch 24 IF_ICMPEQ L574 - true
   */

  @Test
  public void test03()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoFrameRate(2693);
      homeEnvironment0.setVideoFrameRate(2693);
      assertEquals(2693, homeEnvironment0.getVideoFrameRate());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I24 Branch 4 IFNE L197 - true
   */

  @Test
  public void test04()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getSubpartSizeUnderLight()F: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setVideoWidth(I)V: I8 Branch 20 IF_ICMPEQ L497 - true
   */

  @Test
  public void test05()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getVideoWidth();
      float float0 = homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.setVideoWidth(320);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setGroundColor(I)V: I8 Branch 5 IF_ICMPEQ L213 - true
   */

  @Test
  public void test06()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, 0, (HomeTexture) null, 0, (float) 0);
      homeEnvironment0.setGroundColor(0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setLightColor(I)V: I8 Branch 9 IF_ICMPEQ L289 - true
   */

  @Test
  public void test07()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeTexture homeTexture0 = homeEnvironment0.getGroundTexture();
      HomeEnvironment homeEnvironment1 = new HomeEnvironment(48, (HomeTexture) null, 48, 48, (float) 48);
      homeEnvironment1.setLightColor(48);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment1.getPhotoAspectRatio());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSubpartSizeUnderLight(F)V: I9 Branch 13 IFEQ L369 - true
   */

  @Test
  public void test08()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSubpartSizeUnderLight(0.0F);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoWidth(I)V: I8 Branch 16 IF_ICMPEQ L409 - true
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setVideoQuality(I)V: I8 Branch 23 IF_ICMPEQ L552 - true
   */

  @Test
  public void test09()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoQuality(0);
      int int0 = homeEnvironment0.getPhotoQuality();
      homeEnvironment0.setPhotoWidth(0);
      homeEnvironment0.setPhotoWidth(0);
      assertEquals(0, homeEnvironment0.getPhotoWidth());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I16 Branch 22 IFNONNULL L528 - false
   */

  @Test
  public void test10()  throws Throwable  {
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

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setGroundTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 6 IF_ACMPEQ L232 - false
   */

  @Test
  public void test11()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      CatalogTexture catalogTexture0 = new CatalogTexture("QP < (CC $- __=N1 $+f__=l2 ?$-- /^ $]|CM$/=lnum ?$++ /^[$]|CC$/=rnuw& <1 i_=l1 <-__=r2 !< (__ < (__ < __))", "QP < (CC $- __=N1 $+f__=l2 ?$-- /^ $]|CM$/=lnum ?$++ /^[$]|CC$/=rnuw& <1 i_=l1 <-__=r2 !< (__ < (__ < __))", (Content) null, (float) 1527, (float) 1527, "QP < (CC $- __=N1 $+f__=l2 ?$-- /^ $]|CM$/=lnum ?$++ /^[$]|CC$/=rnuw& <1 i_=l1 <-__=r2 !< (__ < (__ < __))");
      HomeTexture homeTexture0 = new HomeTexture((TextureImage) catalogTexture0);
      homeEnvironment0.setGroundTexture(homeTexture0);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoHeight(I)V: I8 Branch 17 IF_ICMPEQ L431 - true
   */

  @Test
  public void test12()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getPhotoHeight();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
      assertEquals(300, int0);
      
      homeEnvironment0.setPhotoHeight(300);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.isAllLevelsVisible()Z: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      boolean boolean0 = homeEnvironment0.isAllLevelsVisible();
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 21 IF_ACMPEQ L527 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setVideoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I16 Branch 22 IFNONNULL L528 - true
   */

  @Test
  public void test14()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      assertEquals(213, homeEnvironment0.getVideoHeight());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getWallsAlpha()F: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      float float0 = homeEnvironment0.getWallsAlpha();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
      assertEquals(0.0F, float0, 0.01F);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSubpartSizeUnderLight(F)V: I9 Branch 13 IFEQ L369 - false
   */

  @Test
  public void test16()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSubpartSizeUnderLight((-0.50614613F));
      assertEquals((-0.50614613F), homeEnvironment0.getSubpartSizeUnderLight(), 0.01F);
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I8 Branch 3 IF_ICMPEQ L195 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I24 Branch 4 IFNE L197 - false
   */

  @Test
  public void test17()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 18
  /*
   * 4 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.isObserverCameraElevationAdjusted()Z: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setWallsAlpha(F)V: I9 Branch 11 IFEQ L328 - true
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I8 Branch 14 IF_ICMPEQ L388 - true
   * Goal 4. com.eteks.sweethome3d.model.HomeEnvironment.setVideoFrameRate(I)V: I8 Branch 24 IF_ICMPEQ L574 - false
   */

  @Test
  public void test18()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoFrameRate(3749);
      boolean boolean0 = homeEnvironment0.isObserverCameraElevationAdjusted();
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setWallsAlpha((float) 0);
      assertEquals(3749, homeEnvironment0.getVideoFrameRate());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoWidth(I)V: I8 Branch 20 IF_ICMPEQ L497 - false
   */

  @Test
  public void test19()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoWidth((-1765));
      assertEquals(-1765, homeEnvironment0.getVideoWidth());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getVideoCameraPath()Ljava/util/List;: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSkyColor(I)V: I8 Branch 7 IF_ICMPEQ L251 - true
   */

  @Test
  public void test21()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getPhotoHeight();
      HomeEnvironment homeEnvironment1 = new HomeEnvironment(300, (HomeTexture) null, 300, (HomeTexture) null, 300, (float) 300);
      homeEnvironment1.setSkyColor(300);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment1.getVideoAspectRatio());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoQuality(I)V: I8 Branch 19 IF_ICMPEQ L475 - true
   */

  @Test
  public void test22()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getPhotoQuality();
      homeEnvironment0.setPhotoQuality(0);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoAspectRatio()Lcom/eteks/sweethome3d/model/AspectRatio;: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = homeEnvironment0.getPhotoAspectRatio();
      assertEquals(AspectRatio.VIEW_3D_RATIO, aspectRatio0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setWallsAlpha(F)V: I9 Branch 11 IFEQ L328 - false
   */

  @Test
  public void test24()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setWallsAlpha((-1965.01F));
      assertEquals((-1965.01F), homeEnvironment0.getWallsAlpha(), 0.01F);
  }

  //Test case number: 25
  /*
   * 12 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getSkyTexture()Lcom/eteks/sweethome3d/model/HomeTexture;: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.getVideoQuality()I: root-Branch
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.getLightColor()I: root-Branch
   * Goal 4. com.eteks.sweethome3d.model.HomeEnvironment.removePropertyChangeListener(Lcom/eteks/sweethome3d/model/HomeEnvironment$Property;Ljava/beans/PropertyChangeListener;)V: root-Branch
   * Goal 5. com.eteks.sweethome3d.model.HomeEnvironment.getVideoFrameRate()I: root-Branch
   * Goal 6. com.eteks.sweethome3d.model.HomeEnvironment.addPropertyChangeListener(Lcom/eteks/sweethome3d/model/HomeEnvironment$Property;Ljava/beans/PropertyChangeListener;)V: root-Branch
   * Goal 7. com.eteks.sweethome3d.model.HomeEnvironment.setObserverCameraElevationAdjusted(Z)V: I8 Branch 3 IF_ICMPEQ L195 - true
   * Goal 8. com.eteks.sweethome3d.model.HomeEnvironment.setSkyTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 8 IF_ACMPEQ L270 - true
   * Goal 9. com.eteks.sweethome3d.model.HomeEnvironment.setLightColor(I)V: I8 Branch 9 IF_ICMPEQ L289 - false
   * Goal 10. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I24 Branch 15 IFNE L390 - false
   * Goal 11. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I8 Branch 25 IF_ACMPEQ L596 - true
   * Goal 12. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I26 Branch 26 IFNONNULL L599 - true
   */

  @Test
  public void test25()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("FILL", (Content) null, (float) 113, (float) 113, true);
      HomeTexture homeTexture0 = new HomeTexture((TextureImage) catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(113, homeTexture0, 275, 275, (float) 275);
      HomeTexture homeTexture1 = homeEnvironment0.getSkyTexture();
      int int0 = homeEnvironment0.getGroundColor();
      homeEnvironment0.setLightColor(113);
      int int1 = homeEnvironment0.getVideoQuality();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.ALL_LEVELS_VISIBLE;
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) null);
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) null);
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      homeEnvironment0.setAllLevelsVisible(false);
      int int2 = homeEnvironment0.getVideoFrameRate();
      int int3 = homeEnvironment0.getLightColor();
      homeEnvironment0.setVideoCameraPath((List<Camera>) linkedList0);
      assertEquals(113, homeEnvironment0.getLightColor());
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setDrawingMode(Lcom/eteks/sweethome3d/model/HomeEnvironment$DrawingMode;)V: I8 Branch 12 IF_ACMPEQ L347 - false
   */

  @Test
  public void test26()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      assertEquals(HomeEnvironment.DrawingMode.FILL_AND_OUTLINE, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 27
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I8 Branch 25 IF_ACMPEQ L596 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setVideoCameraPath(Ljava/util/List;)V: I26 Branch 26 IFNONNULL L599 - false
   */

  @Test
  public void test27()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoCameraPath((List<Camera>) null);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getVideoAspectRatio());
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setDrawingMode(Lcom/eteks/sweethome3d/model/HomeEnvironment$DrawingMode;)V: I8 Branch 12 IF_ACMPEQ L347 - true
   */

  @Test
  public void test28()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
  }

  //Test case number: 29
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I8 Branch 14 IF_ICMPEQ L388 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setAllLevelsVisible(Z)V: I24 Branch 15 IFNE L390 - true
   */

  @Test
  public void test29()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setAllLevelsVisible(true);
      assertTrue(homeEnvironment0.isAllLevelsVisible());
  }

  //Test case number: 30
  /*
   * 2 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setSkyColor(I)V: I8 Branch 7 IF_ICMPEQ L251 - false
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 18 IF_ACMPEQ L453 - true
   */

  @Test
  public void test30()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSkyColor(17);
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      assertEquals(17, homeEnvironment0.getSkyColor());
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getGroundColor()I: root-Branch
   */

  @Test
  public void test31()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getGroundColor();
      assertEquals(HomeEnvironment.DrawingMode.FILL, homeEnvironment0.getDrawingMode());
      assertEquals(11053224, int0);
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoQuality(I)V: I8 Branch 19 IF_ICMPEQ L475 - false
   */

  @Test
  public void test32()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoQuality(261);
      assertEquals(261, homeEnvironment0.getPhotoQuality());
  }

  //Test case number: 33
  /*
   * 16 covered goals:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.getDrawingMode()Lcom/eteks/sweethome3d/model/HomeEnvironment$DrawingMode;: root-Branch
   * Goal 2. com.eteks.sweethome3d.model.HomeEnvironment.getVideoAspectRatio()Lcom/eteks/sweethome3d/model/AspectRatio;: root-Branch
   * Goal 3. com.eteks.sweethome3d.model.HomeEnvironment.getSkyColor()I: root-Branch
   * Goal 4. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoQuality()I: root-Branch
   * Goal 5. com.eteks.sweethome3d.model.HomeEnvironment.getGroundTexture()Lcom/eteks/sweethome3d/model/HomeTexture;: root-Branch
   * Goal 6. com.eteks.sweethome3d.model.HomeEnvironment.clone()Lcom/eteks/sweethome3d/model/HomeEnvironment;: root-Branch
   * Goal 7. com.eteks.sweethome3d.model.HomeEnvironment.getCeillingLightColor()I: root-Branch
   * Goal 8. com.eteks.sweethome3d.model.HomeEnvironment.getVideoWidth()I: root-Branch
   * Goal 9. com.eteks.sweethome3d.model.HomeEnvironment.getVideoHeight()I: root-Branch
   * Goal 10. com.eteks.sweethome3d.model.HomeEnvironment.getPhotoWidth()I: root-Branch
   * Goal 11. com.eteks.sweethome3d.model.HomeEnvironment.setGroundColor(I)V: I8 Branch 5 IF_ICMPEQ L213 - false
   * Goal 12. com.eteks.sweethome3d.model.HomeEnvironment.setGroundTexture(Lcom/eteks/sweethome3d/model/HomeTexture;)V: I8 Branch 6 IF_ACMPEQ L232 - true
   * Goal 13. com.eteks.sweethome3d.model.HomeEnvironment.setCeillingLightColor(I)V: I8 Branch 10 IF_ICMPEQ L308 - false
   * Goal 14. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoWidth(I)V: I8 Branch 16 IF_ICMPEQ L409 - false
   * Goal 15. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoHeight(I)V: I8 Branch 17 IF_ICMPEQ L431 - false
   * Goal 16. com.eteks.sweethome3d.model.HomeEnvironment.setPhotoAspectRatio(Lcom/eteks/sweethome3d/model/AspectRatio;)V: I8 Branch 18 IF_ACMPEQ L453 - false
   */

  @Test
  public void test33()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeTexture homeTexture0 = homeEnvironment0.getGroundTexture();
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      int int0 = homeEnvironment0.getSkyColor();
      homeEnvironment0.setGroundColor(13427964);
      int int1 = homeEnvironment0.getVideoHeight();
      int int2 = homeEnvironment0.getPhotoQuality();
      int int3 = homeEnvironment0.getCeillingLightColor();
      homeEnvironment0.setPhotoHeight(13427964);
      homeEnvironment0.setPhotoWidth(13684944);
      homeEnvironment0.setCeillingLightColor(13427964);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = homeEnvironment0.getDrawingMode();
      int int4 = homeEnvironment1.getPhotoWidth();
      assertEquals(13427964, homeEnvironment0.getPhotoHeight());
      assertEquals(13684944, int4);
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. com.eteks.sweethome3d.model.HomeEnvironment.setVideoQuality(I)V: I8 Branch 23 IF_ICMPEQ L552 - false
   */

  @Test
  public void test34()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoQuality((-1765));
      assertEquals(-1765, homeEnvironment0.getVideoQuality());
  }
}
