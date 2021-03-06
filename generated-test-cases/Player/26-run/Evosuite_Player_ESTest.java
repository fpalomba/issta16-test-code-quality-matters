/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 11:38:06 GMT 2015
 */

package state;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. state.Player.unpack(Ljava/io/DataInputStream;)Z: I12 Branch 7 IF_ICMPEQ L307 - false
   */

  @Test
  public void test00()  throws Throwable  {
      Player player0 = new Player((-904), "c[2tp4", "useTok", (-904));
      byte[] byteArray0 = new byte[2];
      player0.unpack(byteArray0);
      assertEquals("c[2tp4", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(-904, player0.getPictureId());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isJoinOK(Lstate/Player;Z)Z: I11 Branch 4 IFEQ L263 - true
   */

  @Test
  public void test01()  throws Throwable  {
      Player player0 = new Player(10, "FA>yfMJnG6/g_", ":-d,XkE", 10);
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("FA>yfMJnG6/g_", player0.getIP());
      assertEquals(10, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isDead()Z: I7 Branch 3 IFNE L191 - true
   */

  @Test
  public void test02()  throws Throwable  {
      Player player0 = new Player(10, "FA>yfMJnG6/g_", ":-d,XkE", 10);
      boolean boolean0 = player0.isDead();
      assertEquals(1, player0.getStrength());
      assertEquals(10, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(boolean0);
      assertEquals("FA>yfMJnG6/g_", player0.getIP());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. state.Player.gangStrength()I: I21 Branch 2 IFEQ L171 - true
   * Goal 2. state.Player.gangStrength()I: I21 Branch 2 IFEQ L171 - false
   */

  @Test
  public void test03()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.gangStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, int0);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. state.Player.reset(Z)V: I48 Branch 1 IFEQ L127 - false
   */

  @Test
  public void test04()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(true);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. state.Player.reset(Z)V: I48 Branch 1 IFEQ L127 - true
   */

  @Test
  public void test05()  throws Throwable  {
      Player player0 = new Player(2825, "", 2620);
      player0.reset(false);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(2620, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getZ()F: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getZ();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getX()F: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      Player player0 = new Player(10, "FA>yfMJnG6/g_", ":-d,XkE", 10);
      float float0 = player0.getX();
      assertEquals(1, player0.getStrength());
      assertEquals("FA>yfMJnG6/g_", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10, player0.getPictureId());
      assertEquals(10.0F, float0, 0.01F);
      assertFalse(player0.isDead());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. state.Player.<init>(ILjava/lang/String;Ljava/lang/String;II)V: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      Player player0 = new Player(1, "c[2tp4", "c[2tp4", 0, 6);
      assertEquals(6, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isConnected()Z: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      Player player0 = new Player(10, "VpQgz@bl3r)7)PF", 10);
      boolean boolean0 = player0.isConnected();
      assertEquals(10, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(boolean0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setConnected(Z)V: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      Player player0 = new Player(10, "VpQgz@bl3r)7)PF", 10);
      player0.setConnected(true);
      assertEquals(10, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. state.Player.setJoinOK(Lstate/Player;Z)V: root-Branch
   * Goal 2. state.Player$JoinInfo.<init>(Lstate/Player;Z)V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      try {
        player0.setJoinOK((Player) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getStrength()I: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      Player player0 = new Player((-904), "c[2tp4", "useTok", (-904));
      int int0 = player0.getStrength();
      assertFalse(player0.isDead());
      assertEquals("c[2tp4", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, int0);
      assertEquals(-904, player0.getPictureId());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getIP()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      Player player0 = new Player(10, "VpQgz@bl3r)7)PF", 10);
      String string0 = player0.getIP();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10, player0.getPictureId());
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setMoney(F)V: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      Player player0 = new Player(10, "FA>yfMJnG6/g_", ":-d,XkE", 10);
      player0.setMoney((-1523.842F));
      assertEquals((-1523.842F), player0.getMoney(), 0.01F);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getName()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.getName();
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. state.Player.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      Player player0 = new Player((-904), "c[2tp4", "useTok", (-904));
      String string0 = player0.toString();
      assertEquals(-904, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals("c[2tp4", player0.getIP());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  //Test case number: 17
  /*
   * 4 covered goals:
   * Goal 1. state.Player.pack()[B: root-Branch
   * Goal 2. state.Player.pack(Ljava/io/DataOutputStream;)V: root-Branch
   * Goal 3. state.Player.unpack([B)V: root-Branch
   * Goal 4. state.Player.unpack(Ljava/io/DataInputStream;)Z: I12 Branch 7 IF_ICMPEQ L307 - true
   */

  @Test
  public void test17()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = player0.pack();
      player0.unpack(byteArray0);
      assertFalse(player0.isDead());
      assertEquals(-1, player0.getId());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 18
  /*
   * 4 covered goals:
   * Goal 1. state.Player.setDead()V: root-Branch
   * Goal 2. state.Player.setDead(JZ)V: root-Branch
   * Goal 3. state.Player.setDead(J)V: root-Branch
   * Goal 4. state.Player.isDead()Z: I7 Branch 3 IFNE L191 - false
   */

  @Test
  public void test18()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead();
      boolean boolean0 = player0.isDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getY()F: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      Player player0 = new Player(2825, "", 2620);
      float float0 = player0.getY();
      assertFalse(player0.isDead());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(2620, player0.getPictureId());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. state.Player.type()I: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.type();
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(5, int0);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setX(F)V: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      Player player0 = new Player((-904), "c[2tp4", "useTok", (-904));
      player0.setX((float) 6);
      assertEquals(6.0F, player0.getX(), 0.01F);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getTimeOfDeath()J: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      Player player0 = new Player(10, "FA>yfMJnG6/g_", ":-d,XkE", 10);
      long long0 = player0.getTimeOfDeath();
      assertEquals(1, player0.getStrength());
      assertEquals("FA>yfMJnG6/g_", player0.getIP());
      assertFalse(player0.isDead());
      assertEquals(10, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setZ(F)V: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      Player player0 = new Player();
      player0.setZ((float) 2);
      assertEquals(2.0F, player0.getZ(), 0.01F);
  }

  //Test case number: 24
  /*
   * 2 covered goals:
   * Goal 1. state.Player.setY(F)V: root-Branch
   * Goal 2. state.Player.<init>(ILjava/lang/String;Ljava/lang/String;I)V: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      Player player0 = new Player((-904), "c[2tp4", "useTok", (-904));
      player0.setY((-2625.328F));
      assertEquals((-2625.328F), player0.getY(), 0.01F);
  }

  //Test case number: 25
  /*
   * 2 covered goals:
   * Goal 1. state.Player.getPictureId()I: root-Branch
   * Goal 2. state.Player.<init>()V: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getPictureId();
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 26
  /*
   * 3 covered goals:
   * Goal 1. state.Player.getMoney()F: root-Branch
   * Goal 2. state.Player.<init>(I)V: root-Branch
   * Goal 3. state.Player.<init>(ILjava/lang/String;I)V: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      Player player0 = new Player(2825, "", 2620);
      float float0 = player0.getMoney();
      assertEquals(2620, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }
}
