/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 21:24:50 GMT 2015
 */

package freemind.controller;

import static org.junit.Assert.*;
import org.junit.Test;
import freemind.controller.Controller;
import freemind.main.FreeMindMain;
import freemind.preferences.FreemindPropertyListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.WindowEvent;
import java.util.Collection;
import javax.swing.JColorChooser;
import javax.swing.JProgressBar;
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
   * 1 covered goal:
   * Goal 1. freemind.controller.Controller$CloseAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
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

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. freemind.controller.Controller$DisposeOnClose.componentHidden(Ljava/awt/event/ComponentEvent;)V: root-Branch
   * Goal 2. freemind.controller.Controller$DisposeOnClose.<init>()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      assertNotNull(controller_DisposeOnClose0);
      
      JProgressBar jProgressBar0 = new JProgressBar();
      assertFalse(jProgressBar0.isPreferredSizeSet());
      assertTrue(jProgressBar0.isEnabled());
      assertTrue(jProgressBar0.isFontSet());
      assertFalse(jProgressBar0.isFocusTraversalPolicySet());
      assertFalse(jProgressBar0.isMaximumSizeSet());
      assertFalse(jProgressBar0.isDisplayable());
      assertTrue(jProgressBar0.isForegroundSet());
      assertFalse(jProgressBar0.getIgnoreRepaint());
      assertFalse(jProgressBar0.isShowing());
      assertFalse(jProgressBar0.isLightweight());
      assertTrue(jProgressBar0.isBackgroundSet());
      assertFalse(jProgressBar0.isCursorSet());
      assertEquals(0, jProgressBar0.getComponentCount());
      assertTrue(jProgressBar0.getFocusTraversalKeysEnabled());
      assertFalse(jProgressBar0.isValid());
      assertFalse(jProgressBar0.isFocusCycleRoot());
      assertEquals(0, jProgressBar0.countComponents());
      assertFalse(jProgressBar0.isFocusTraversalPolicyProvider());
      assertFalse(jProgressBar0.isMinimumSizeSet());
      assertNotNull(jProgressBar0);
      
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) jProgressBar0, 663, (long) 663, 663, 663, 663, 663, 663, 663, false, 663, 663, 663);
      assertEquals(663, mouseWheelEvent0.getScrollAmount());
      assertEquals(663, mouseWheelEvent0.getWheelRotation());
      assertEquals(439569, mouseWheelEvent0.getUnitsToScroll());
      assertTrue(mouseWheelEvent0.isMetaDown());
      assertFalse(mouseWheelEvent0.isAltDown());
      assertEquals(23, mouseWheelEvent0.getModifiers());
      assertEquals(663, mouseWheelEvent0.getY());
      assertEquals(663, mouseWheelEvent0.getXOnScreen());
      assertEquals(663, mouseWheelEvent0.getClickCount());
      assertEquals(663, mouseWheelEvent0.getX());
      assertFalse(mouseWheelEvent0.isPopupTrigger());
      assertEquals(0, mouseWheelEvent0.getButton());
      assertFalse(mouseWheelEvent0.isConsumed());
      assertTrue(mouseWheelEvent0.isControlDown());
      assertEquals(663, mouseWheelEvent0.getScrollType());
      assertEquals(663L, mouseWheelEvent0.getWhen());
      assertEquals(663, mouseWheelEvent0.getID());
      assertFalse(mouseWheelEvent0.isAltGraphDown());
      assertEquals(663, mouseWheelEvent0.getYOnScreen());
      assertTrue(mouseWheelEvent0.isShiftDown());
      assertFalse(jProgressBar0.isPreferredSizeSet());
      assertTrue(jProgressBar0.isEnabled());
      assertTrue(jProgressBar0.isFontSet());
      assertFalse(jProgressBar0.isFocusTraversalPolicySet());
      assertFalse(jProgressBar0.isMaximumSizeSet());
      assertFalse(jProgressBar0.isDisplayable());
      assertTrue(jProgressBar0.isForegroundSet());
      assertFalse(jProgressBar0.getIgnoreRepaint());
      assertFalse(jProgressBar0.isShowing());
      assertFalse(jProgressBar0.isLightweight());
      assertTrue(jProgressBar0.isBackgroundSet());
      assertFalse(jProgressBar0.isCursorSet());
      assertEquals(0, jProgressBar0.getComponentCount());
      assertTrue(jProgressBar0.getFocusTraversalKeysEnabled());
      assertFalse(jProgressBar0.isValid());
      assertFalse(jProgressBar0.isFocusCycleRoot());
      assertEquals(0, jProgressBar0.countComponents());
      assertFalse(jProgressBar0.isFocusTraversalPolicyProvider());
      assertFalse(jProgressBar0.isMinimumSizeSet());
      assertNotNull(mouseWheelEvent0);
      
      // Undeclared exception!
      try {
        controller_DisposeOnClose0.componentHidden((ComponentEvent) mouseWheelEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.JProgressBar cannot be cast to java.awt.Window
         //
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. freemind.controller.Controller.showCommonJColorChooserDialog(Ljava/awt/Component;Ljava/lang/String;Ljava/awt/Color;)Ljava/awt/Color;: root-Branch
   * Goal 2. freemind.controller.Controller$ColorTracker.<init>(Ljavax/swing/JColorChooser;)V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      Color color0 = Color.cyan;
      assertEquals(255, color0.getGreen());
      assertEquals(255, color0.getBlue());
      assertEquals(255, color0.getAlpha());
      assertEquals(-16711681, color0.getRGB());
      assertEquals(1, color0.getTransparency());
      assertEquals(0, color0.getRed());
      assertNotNull(color0);
      
      try {
        Color color1 = Controller.showCommonJColorChooserDialog((Component) null, "oading lassifier from ", color0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * Goal 1. freemind.controller.Controller$ShowSelectedAttributesAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   * Goal 2. freemind.controller.Controller$ShowAllAttributesAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   * Goal 3. freemind.controller.Controller$HideAllAttributesAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   * Goal 4. freemind.controller.Controller.<init>(Lfreemind/main/FreeMindMain;)V: I134 Branch 55 IFNONNULL L219 - false
   */

  @Test
  public void test4()  throws Throwable  {
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

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. freemind.controller.Controller.removePropertyChangeListener(Lfreemind/preferences/FreemindPropertyListener;)V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      Controller.removePropertyChangeListener((FreemindPropertyListener) null);
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
   * 2 covered goals:
   * Goal 1. freemind.controller.Controller.addPropertyChangeListener(Lfreemind/preferences/FreemindPropertyListener;)V: root-Branch
   * Goal 2. freemind.controller.Controller.addPropertyChangeListenerAndPropagate(Lfreemind/preferences/FreemindPropertyListener;)V: I21 Branch 130 IFEQ L1770 - true
   */

  @Test
  public void test7()  throws Throwable  {
      Controller.addPropertyChangeListenerAndPropagate((FreemindPropertyListener) null);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. freemind.controller.Controller.getCommonJColorChooser()Ljavax/swing/JColorChooser;: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      JColorChooser jColorChooser0 = Controller.getCommonJColorChooser();
      assertFalse(jColorChooser0.isPreferredSizeSet());
      assertTrue(jColorChooser0.isEnabled());
      assertFalse(jColorChooser0.isFocusTraversalPolicySet());
      assertFalse(jColorChooser0.isShowing());
      assertFalse(jColorChooser0.isLightweight());
      assertEquals(2, jColorChooser0.countComponents());
      assertFalse(jColorChooser0.isFocusCycleRoot());
      assertFalse(jColorChooser0.isMinimumSizeSet());
      assertFalse(jColorChooser0.getIgnoreRepaint());
      assertFalse(jColorChooser0.isDisplayable());
      assertTrue(jColorChooser0.isForegroundSet());
      assertFalse(jColorChooser0.isCursorSet());
      assertFalse(jColorChooser0.isFocusTraversalPolicyProvider());
      assertTrue(jColorChooser0.isBackgroundSet());
      assertFalse(jColorChooser0.isValid());
      assertTrue(jColorChooser0.isFontSet());
      assertTrue(jColorChooser0.getFocusTraversalKeysEnabled());
      assertFalse(jColorChooser0.isMaximumSizeSet());
      assertEquals(2, jColorChooser0.getComponentCount());
      assertNotNull(jColorChooser0);
  }
}
