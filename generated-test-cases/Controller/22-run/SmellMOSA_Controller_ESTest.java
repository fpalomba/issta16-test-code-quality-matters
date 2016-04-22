/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 22:11:52 GMT 2015
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
import java.util.Collection;
import javax.help.JHelpFavoritesNavigator;
import javax.help.NavigatorView;
import javax.swing.Icon;
import javax.swing.JColorChooser;
import javax.swing.JRadioButton;
import javax.swing.colorchooser.DefaultColorSelectionModel;
import javax.swing.plaf.synth.SynthTreeUI;
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
   * 1 covered goal:
   * Goal 1. freemind.controller.Controller$Closer.<init>()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      Controller.Closer controller_Closer0 = new Controller.Closer();
      assertNotNull(controller_Closer0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. freemind.controller.Controller$DisposeOnClose.componentHidden(Ljava/awt/event/ComponentEvent;)V: root-Branch
   * Goal 2. freemind.controller.Controller$DisposeOnClose.<init>()V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      JHelpFavoritesNavigator jHelpFavoritesNavigator0 = new JHelpFavoritesNavigator((NavigatorView) null);
      assertFalse(jHelpFavoritesNavigator0.isDisplayable());
      assertFalse(jHelpFavoritesNavigator0.getIgnoreRepaint());
      assertFalse(jHelpFavoritesNavigator0.isFocusTraversalPolicySet());
      assertTrue(jHelpFavoritesNavigator0.isEnabled());
      assertFalse(jHelpFavoritesNavigator0.isMaximumSizeSet());
      assertFalse(jHelpFavoritesNavigator0.isShowing());
      assertFalse(jHelpFavoritesNavigator0.isPreferredSizeSet());
      assertFalse(jHelpFavoritesNavigator0.isCursorSet());
      assertFalse(jHelpFavoritesNavigator0.isLightweight());
      assertFalse(jHelpFavoritesNavigator0.isFontSet());
      assertEquals(0, jHelpFavoritesNavigator0.getComponentCount());
      assertFalse(jHelpFavoritesNavigator0.isFocusTraversalPolicyProvider());
      assertFalse(jHelpFavoritesNavigator0.isBackgroundSet());
      assertTrue(jHelpFavoritesNavigator0.getFocusTraversalKeysEnabled());
      assertFalse(jHelpFavoritesNavigator0.isForegroundSet());
      assertEquals(0, jHelpFavoritesNavigator0.countComponents());
      assertFalse(jHelpFavoritesNavigator0.isMinimumSizeSet());
      assertFalse(jHelpFavoritesNavigator0.isValid());
      assertFalse(jHelpFavoritesNavigator0.isFocusCycleRoot());
      assertNotNull(jHelpFavoritesNavigator0);
      
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) jHelpFavoritesNavigator0, (-1024), (long) (-1024), (-1024), (-1024), (-1024), (-1024), (-1024), (-1024), false, (-1024), (-1024), (-1024), (double) (-1024));
      assertEquals(-1024, mouseWheelEvent0.getScrollAmount());
      assertEquals(1048576, mouseWheelEvent0.getUnitsToScroll());
      assertEquals(-1024, mouseWheelEvent0.getWheelRotation());
      assertFalse(mouseWheelEvent0.isConsumed());
      assertEquals(-1024, mouseWheelEvent0.getYOnScreen());
      assertEquals(0, mouseWheelEvent0.getButton());
      assertFalse(mouseWheelEvent0.isMetaDown());
      assertEquals(-1024, mouseWheelEvent0.getID());
      assertEquals((-1024L), mouseWheelEvent0.getWhen());
      assertEquals(-1024, mouseWheelEvent0.getX());
      assertEquals(-1024, mouseWheelEvent0.getXOnScreen());
      assertFalse(mouseWheelEvent0.isShiftDown());
      assertEquals(-2147483648, mouseWheelEvent0.getModifiers());
      assertFalse(mouseWheelEvent0.isPopupTrigger());
      assertEquals(-1024, mouseWheelEvent0.getScrollType());
      assertEquals(-1024, mouseWheelEvent0.getY());
      assertFalse(mouseWheelEvent0.isControlDown());
      assertFalse(mouseWheelEvent0.isAltGraphDown());
      assertEquals(-1024, mouseWheelEvent0.getClickCount());
      assertFalse(mouseWheelEvent0.isAltDown());
      assertFalse(jHelpFavoritesNavigator0.isDisplayable());
      assertFalse(jHelpFavoritesNavigator0.getIgnoreRepaint());
      assertFalse(jHelpFavoritesNavigator0.isFocusTraversalPolicySet());
      assertTrue(jHelpFavoritesNavigator0.isEnabled());
      assertFalse(jHelpFavoritesNavigator0.isMaximumSizeSet());
      assertFalse(jHelpFavoritesNavigator0.isShowing());
      assertFalse(jHelpFavoritesNavigator0.isPreferredSizeSet());
      assertFalse(jHelpFavoritesNavigator0.isCursorSet());
      assertFalse(jHelpFavoritesNavigator0.isLightweight());
      assertFalse(jHelpFavoritesNavigator0.isFontSet());
      assertEquals(0, jHelpFavoritesNavigator0.getComponentCount());
      assertFalse(jHelpFavoritesNavigator0.isFocusTraversalPolicyProvider());
      assertFalse(jHelpFavoritesNavigator0.isBackgroundSet());
      assertTrue(jHelpFavoritesNavigator0.getFocusTraversalKeysEnabled());
      assertFalse(jHelpFavoritesNavigator0.isForegroundSet());
      assertEquals(0, jHelpFavoritesNavigator0.countComponents());
      assertFalse(jHelpFavoritesNavigator0.isMinimumSizeSet());
      assertFalse(jHelpFavoritesNavigator0.isValid());
      assertFalse(jHelpFavoritesNavigator0.isFocusCycleRoot());
      assertNotNull(mouseWheelEvent0);
      
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      assertNotNull(controller_DisposeOnClose0);
      
      // Undeclared exception!
      try {
        controller_DisposeOnClose0.componentHidden((ComponentEvent) mouseWheelEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.help.JHelpFavoritesNavigator cannot be cast to java.awt.Window
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. freemind.controller.Controller.removePropertyChangeListener(Lfreemind/preferences/FreemindPropertyListener;)V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      Controller.removePropertyChangeListener((FreemindPropertyListener) null);
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * Goal 1. freemind.controller.Controller$ShowSelectedAttributesAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   * Goal 2. freemind.controller.Controller$ShowAllAttributesAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   * Goal 3. freemind.controller.Controller$HideAllAttributesAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   * Goal 4. freemind.controller.Controller.<init>(Lfreemind/main/FreeMindMain;)V: I134 Branch 55 IFNONNULL L219 - false
   */

  @Test
  public void test5()  throws Throwable  {
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

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. freemind.controller.Controller.showCommonJColorChooserDialog(Ljava/awt/Component;Ljava/lang/String;Ljava/awt/Color;)Ljava/awt/Color;: root-Branch
   * Goal 2. freemind.controller.Controller$ColorTracker.<init>(Ljavax/swing/JColorChooser;)V: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      SynthTreeUI synthTreeUI0 = new SynthTreeUI();
      assertNotNull(synthTreeUI0);
      
      Icon icon0 = synthTreeUI0.getExpandedIcon();
      assertNotNull(icon0);
      
      JRadioButton jRadioButton0 = new JRadioButton(icon0);
      assertFalse(jRadioButton0.isShowing());
      assertEquals(0, jRadioButton0.countComponents());
      assertFalse(jRadioButton0.isMaximumSizeSet());
      assertFalse(jRadioButton0.isPreferredSizeSet());
      assertTrue(jRadioButton0.isFontSet());
      assertFalse(jRadioButton0.isLightweight());
      assertFalse(jRadioButton0.isDisplayable());
      assertTrue(jRadioButton0.isForegroundSet());
      assertFalse(jRadioButton0.isFocusTraversalPolicySet());
      assertFalse(jRadioButton0.getIgnoreRepaint());
      assertTrue(jRadioButton0.getFocusTraversalKeysEnabled());
      assertFalse(jRadioButton0.isCursorSet());
      assertTrue(jRadioButton0.isBackgroundSet());
      assertFalse(jRadioButton0.isFocusTraversalPolicyProvider());
      assertTrue(jRadioButton0.isEnabled());
      assertEquals(0, jRadioButton0.getComponentCount());
      assertFalse(jRadioButton0.isMinimumSizeSet());
      assertFalse(jRadioButton0.isFocusCycleRoot());
      assertFalse(jRadioButton0.isValid());
      assertNotNull(jRadioButton0);
      
      DefaultColorSelectionModel defaultColorSelectionModel0 = new DefaultColorSelectionModel();
      assertNotNull(defaultColorSelectionModel0);
      
      Color color0 = defaultColorSelectionModel0.getSelectedColor();
      assertEquals(255, color0.getAlpha());
      assertEquals(255, color0.getRed());
      assertEquals(255, color0.getBlue());
      assertEquals(255, color0.getGreen());
      assertEquals(-1, color0.getRGB());
      assertEquals(1, color0.getTransparency());
      assertNotNull(color0);
      
      try {
        Color color1 = Controller.showCommonJColorChooserDialog((Component) jRadioButton0, "Hsa%wC8x", color0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
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
      assertFalse(jColorChooser0.getIgnoreRepaint());
      assertTrue(jColorChooser0.getFocusTraversalKeysEnabled());
      assertFalse(jColorChooser0.isDisplayable());
      assertFalse(jColorChooser0.isMaximumSizeSet());
      assertFalse(jColorChooser0.isFocusTraversalPolicySet());
      assertFalse(jColorChooser0.isPreferredSizeSet());
      assertFalse(jColorChooser0.isLightweight());
      assertFalse(jColorChooser0.isCursorSet());
      assertTrue(jColorChooser0.isBackgroundSet());
      assertFalse(jColorChooser0.isShowing());
      assertTrue(jColorChooser0.isFontSet());
      assertEquals(2, jColorChooser0.countComponents());
      assertFalse(jColorChooser0.isValid());
      assertEquals(2, jColorChooser0.getComponentCount());
      assertTrue(jColorChooser0.isForegroundSet());
      assertTrue(jColorChooser0.isEnabled());
      assertFalse(jColorChooser0.isFocusCycleRoot());
      assertFalse(jColorChooser0.isMinimumSizeSet());
      assertFalse(jColorChooser0.isFocusTraversalPolicyProvider());
      assertNotNull(jColorChooser0);
  }
}
