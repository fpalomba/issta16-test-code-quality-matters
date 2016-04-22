/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 22:22:24 GMT 2015
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
import java.util.Collection;
import javax.help.plaf.basic.BasicHelpUI;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSpinner;
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
   * Goal 1. freemind.controller.Controller$DisposeOnClose.componentHidden(Ljava/awt/event/ComponentEvent;)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
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
   * 1 covered goal:
   * Goal 1. freemind.controller.Controller.addPropertyChangeListener(Lfreemind/preferences/FreemindPropertyListener;)V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      Controller.addPropertyChangeListener((FreemindPropertyListener) null);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. freemind.controller.Controller$CloseAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
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
   * Goal 1. freemind.controller.Controller.showCommonJColorChooserDialog(Ljava/awt/Component;Ljava/lang/String;Ljava/awt/Color;)Ljava/awt/Color;: root-Branch
   * Goal 2. freemind.controller.Controller$ColorTracker.<init>(Ljavax/swing/JColorChooser;)V: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      Class<JSpinner> class0 = JSpinner.class;
      ImageIcon imageIcon0 = BasicHelpUI.getIcon(class0, "");
      assertNull(imageIcon0);
      
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem((Icon) null);
      assertTrue(jRadioButtonMenuItem0.isForegroundSet());
      assertEquals(0, jRadioButtonMenuItem0.getComponentCount());
      assertEquals(0, jRadioButtonMenuItem0.countComponents());
      assertTrue(jRadioButtonMenuItem0.isFontSet());
      assertTrue(jRadioButtonMenuItem0.isBackgroundSet());
      assertFalse(jRadioButtonMenuItem0.isShowing());
      assertFalse(jRadioButtonMenuItem0.isPreferredSizeSet());
      assertFalse(jRadioButtonMenuItem0.isCursorSet());
      assertFalse(jRadioButtonMenuItem0.isFocusTraversalPolicySet());
      assertFalse(jRadioButtonMenuItem0.isLightweight());
      assertFalse(jRadioButtonMenuItem0.getIgnoreRepaint());
      assertFalse(jRadioButtonMenuItem0.isDisplayable());
      assertTrue(jRadioButtonMenuItem0.isEnabled());
      assertTrue(jRadioButtonMenuItem0.getFocusTraversalKeysEnabled());
      assertFalse(jRadioButtonMenuItem0.isMaximumSizeSet());
      assertFalse(jRadioButtonMenuItem0.isFocusCycleRoot());
      assertFalse(jRadioButtonMenuItem0.isFocusTraversalPolicyProvider());
      assertFalse(jRadioButtonMenuItem0.isMinimumSizeSet());
      assertFalse(jRadioButtonMenuItem0.isValid());
      assertNotNull(jRadioButtonMenuItem0);
      
      Color color0 = Color.GRAY;
      assertEquals(128, color0.getGreen());
      assertEquals(-8355712, color0.getRGB());
      assertEquals(1, color0.getTransparency());
      assertEquals(128, color0.getRed());
      assertEquals(128, color0.getBlue());
      assertEquals(255, color0.getAlpha());
      assertNotNull(color0);
      
      try {
        Color color1 = Controller.showCommonJColorChooserDialog((Component) jRadioButtonMenuItem0, "", color0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
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
      assertFalse(jColorChooser0.getIgnoreRepaint());
      assertTrue(jColorChooser0.isBackgroundSet());
      assertFalse(jColorChooser0.isCursorSet());
      assertFalse(jColorChooser0.isMinimumSizeSet());
      assertFalse(jColorChooser0.isLightweight());
      assertFalse(jColorChooser0.isFocusTraversalPolicySet());
      assertTrue(jColorChooser0.isForegroundSet());
      assertFalse(jColorChooser0.isDisplayable());
      assertTrue(jColorChooser0.isFontSet());
      assertFalse(jColorChooser0.isValid());
      assertFalse(jColorChooser0.isFocusTraversalPolicyProvider());
      assertEquals(2, jColorChooser0.countComponents());
      assertFalse(jColorChooser0.isShowing());
      assertFalse(jColorChooser0.isFocusCycleRoot());
      assertTrue(jColorChooser0.isEnabled());
      assertFalse(jColorChooser0.isMaximumSizeSet());
      assertFalse(jColorChooser0.isPreferredSizeSet());
      assertEquals(2, jColorChooser0.getComponentCount());
      assertTrue(jColorChooser0.getFocusTraversalKeysEnabled());
      assertNotNull(jColorChooser0);
  }

  //Test case number: 8
  /*
   * 4 covered goals:
   * Goal 1. freemind.controller.Controller$ShowSelectedAttributesAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   * Goal 2. freemind.controller.Controller$ShowAllAttributesAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   * Goal 3. freemind.controller.Controller$HideAllAttributesAction.<init>(Lfreemind/controller/Controller;)V: root-Branch
   * Goal 4. freemind.controller.Controller.<init>(Lfreemind/main/FreeMindMain;)V: I134 Branch 55 IFNONNULL L219 - false
   */

  @Test
  public void test8()  throws Throwable  {
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
}
