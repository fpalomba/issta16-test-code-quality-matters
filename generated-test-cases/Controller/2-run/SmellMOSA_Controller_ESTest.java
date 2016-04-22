/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 21:19:39 GMT 2015
 */

package freemind.controller;

import static org.junit.Assert.*;
import org.junit.Test;
import freemind.controller.Controller;
import freemind.main.FreeMindMain;
import freemind.modes.schememode.SchemeMode;
import freemind.preferences.FreemindPropertyListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.util.Collection;
import javax.swing.JColorChooser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. freemind.controller.Controller.getPropertyChangeListeners()Ljava/util/Collection;: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      Collection collection0 = Controller.getPropertyChangeListeners();
      assertNotNull(collection0);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. freemind.controller.Controller$ShowSelectedAttributesAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   * Goal 2. freemind.controller.Controller$ShowAllAttributesAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   * Goal 3. freemind.controller.Controller$HideAllAttributesAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   * Goal 4. freemind.controller.Controller.<init>(Lfreemind/main/FreeMindMain;)V: I134 Branch 55 IFNONNULL L219 - false
   */

  @Test
  public void test1()  throws Throwable  {
      Controller controller0 = null;
      try {
        controller0 = new Controller((FreeMindMain) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. freemind.controller.Controller.showCommonJColorChooserDialog(Ljava/awt/Component;Ljava/lang/String;Ljava/awt/Color;)Ljava/awt/Color;: root-Branch
   * Goal 2. freemind.controller.Controller$ColorTracker.<init>(Ljavax/swing/JColorChooser;)V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      Color color0 = Color.CYAN;
      assertNotNull(color0);
      assertEquals(1, color0.getTransparency());
      assertEquals(255, color0.getGreen());
      assertEquals(255, color0.getBlue());
      assertEquals(-16711681, color0.getRGB());
      assertEquals(255, color0.getAlpha());
      assertEquals(0, color0.getRed());
      
      try {
        Color color1 = Controller.showCommonJColorChooserDialog((Component) null, "ENT_REF", color0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. freemind.controller.Controller$DisposeOnClose.componentHidden(Ljava/awt/event/ComponentEvent;)V: root-Branch
   * Goal 2. freemind.controller.Controller$DisposeOnClose.<init>()V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      assertNotNull(controller_DisposeOnClose0);
      
      // Undeclared exception!
      try {
        controller_DisposeOnClose0.componentHidden((ComponentEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. freemind.controller.Controller.removePropertyChangeListener(Lfreemind/preferences/FreemindPropertyListener;)V: root-Branch
   * Goal 2. freemind.controller.Controller.addPropertyChangeListener(Lfreemind/preferences/FreemindPropertyListener;)V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      Controller.addPropertyChangeListener((FreemindPropertyListener) null);
      Controller.removePropertyChangeListener((FreemindPropertyListener) null);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. freemind.controller.Controller$CloseAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      SchemeMode schemeMode0 = new SchemeMode();
      assertNotNull(schemeMode0);
      assertEquals("Scheme", schemeMode0.toString());
      
      Controller controller0 = schemeMode0.getController();
      assertNull(controller0);
      assertEquals("Scheme", schemeMode0.toString());
      
      Controller.CloseAction controller_CloseAction0 = null;
      try {
        controller_CloseAction0 = new Controller.CloseAction((Controller) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. freemind.controller.Controller$Closer.<init>()V: root-Branch
   * Goal 2. freemind.controller.Controller$Closer.windowClosing(Ljava/awt/event/WindowEvent;)V: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      Controller.Closer controller_Closer0 = new Controller.Closer();
      assertNotNull(controller_Closer0);
      
      // Undeclared exception!
      try {
        controller_Closer0.windowClosing((WindowEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. freemind.controller.Controller.getCommonJColorChooser()Ljavax/swing/JColorChooser;: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      JColorChooser jColorChooser0 = Controller.getCommonJColorChooser();
      assertNotNull(jColorChooser0);
      assertTrue(jColorChooser0.getFocusTraversalKeysEnabled());
      assertFalse(jColorChooser0.isCursorSet());
      assertFalse(jColorChooser0.isMinimumSizeSet());
      assertFalse(jColorChooser0.getIgnoreRepaint());
      assertFalse(jColorChooser0.isLightweight());
      assertTrue(jColorChooser0.isBackgroundSet());
      assertTrue(jColorChooser0.isEnabled());
      assertFalse(jColorChooser0.isPreferredSizeSet());
      assertTrue(jColorChooser0.isFontSet());
      assertFalse(jColorChooser0.isMaximumSizeSet());
      assertEquals(2, jColorChooser0.getComponentCount());
      assertFalse(jColorChooser0.isShowing());
      assertFalse(jColorChooser0.isValid());
      assertEquals(2, jColorChooser0.countComponents());
      assertFalse(jColorChooser0.isFocusCycleRoot());
      assertFalse(jColorChooser0.isFocusTraversalPolicyProvider());
      assertFalse(jColorChooser0.isDisplayable());
      assertTrue(jColorChooser0.isForegroundSet());
      assertFalse(jColorChooser0.isFocusTraversalPolicySet());
  }
}
