/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 08:47:02 GMT 2015
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
   * Goal 1. state.Player.setDead()V: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getTimeOfDeath()J: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      Player player0 = new Player();
      long long0 = player0.getTimeOfDeath();
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getStrength()I: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getStrength();
      assertEquals(1, int0);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setY(F)V: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      Player player0 = new Player((-5));
      player0.setY((float) (-5));
      assertEquals((-5.0F), player0.getY(), 0.01F);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setMoney(F)V: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      Player player0 = new Player(0);
      player0.setMoney((float) 0);
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getIP()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.getIP();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. state.Player.unpack(Ljava/io/DataInputStream;)Z: I12 Branch 7 IF_ICMPEQ L307 - true
   */

  @Test
  public void test06()  throws Throwable  {
      Player player0 = new Player(1501, ";_n4=Wfb1O<", 1501);
      byte[] byteArray0 = player0.pack();
      player0.unpack(byteArray0);
      assertEquals(-35, player0.getId());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setX(F)V: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      Player player0 = new Player(9);
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX((float) 9);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isJoinOK(Lstate/Player;Z)Z: I48 Branch 6 IF_ICMPNE L267 - false
   */

  @Test
  public void test08()  throws Throwable  {
      Player player0 = new Player();
      player0.setJoinOK(player0, false);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertTrue(boolean0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. state.Player.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      Player player0 = new Player((-23), "/^(S|PP|VP)/ < (/^(S|PP|VP)/ $++ (CC=start $+ (RB|ADVP $+ /^(S|PP|VP)/) [ (< and $+ (RB=end < yet)) |   (< and $+ (RB=end < so)) |   (< and $+ (ADVP=end < (RB|IN < so))) ] ))", (-23));
      String string0 = player0.toString();
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(-23, player0.getPictureId());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. state.Player.reset(Z)V: I48 Branch 1 IFEQ L127 - false
   */

  @Test
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(true);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getX()F: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getX();
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, float0, 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setZ(F)V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      Player player0 = new Player();
      player0.setZ(0.0F);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getZ(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getName()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      Player player0 = new Player((-19), "layer.unpack(): *** WARNING *** [EOF] data was incomplete: ", "layer.unpack(): *** WARNING *** [EOF] data was incomplete: ", (-19), (-19));
      String string0 = player0.getName();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(-19, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(-19, player0.getStrength());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getPictureId()I: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getPictureId();
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setConnected(Z)V: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      Player player0 = new Player();
      player0.setConnected(true);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
  }

  //Test case number: 16
  /*
   * 3 covered goals:
   * Goal 1. state.Player.isJoinOK(Lstate/Player;Z)Z: I11 Branch 4 IFEQ L263 - false
   * Goal 2. state.Player.isJoinOK(Lstate/Player;Z)Z: I41 Branch 5 IFLE L267 - false
   * Goal 3. state.Player.isJoinOK(Lstate/Player;Z)Z: I48 Branch 6 IF_ICMPNE L267 - true
   */

  @Test
  public void test16()  throws Throwable  {
      Player player0 = new Player(2028, "5oA%IWhu6Wa", "5oA%IWhu6Wa", 2028, 2028);
      player0.setJoinOK(player0, false);
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertEquals(2028, player0.getPictureId());
      assertEquals(2028, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(boolean0);
      assertFalse(player0.isDead());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isConnected()Z: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isConnected();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertTrue(boolean0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isDead()Z: I7 Branch 3 IFNE L191 - true
   */

  @Test
  public void test18()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isDead();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(boolean0);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getY()F: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getY();
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. state.Player.reset(Z)V: I48 Branch 1 IFEQ L127 - true
   */

  @Test
  public void test20()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(false);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 21
  /*
   * 3 covered goals:
   * Goal 1. state.Player.<init>(ILjava/lang/String;Ljava/lang/String;I)V: root-Branch
   * Goal 2. state.Player.<init>(ILjava/lang/String;I)V: root-Branch
   * Goal 3. state.Player.<init>(ILjava/lang/String;Ljava/lang/String;II)V: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      Player player0 = new Player(0, "v[98RN^`", "v[98RN^`", 0, 0);
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getStrength());
  }

  //Test case number: 22
  /*
   * 2 covered goals:
   * Goal 1. state.Player.unpack([B)V: root-Branch
   * Goal 2. state.Player.unpack(Ljava/io/DataInputStream;)Z: I12 Branch 7 IF_ICMPEQ L307 - false
   */

  @Test
  public void test22()  throws Throwable  {
      Player player0 = new Player(113);
      byte[] byteArray0 = new byte[3];
      player0.unpack(byteArray0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. state.Player.type()I: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.type();
      assertEquals(1, player0.getStrength());
      assertEquals(5, int0);
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  //Test case number: 24
  /*
   * 2 covered goals:
   * Goal 1. state.Player.gangStrength()I: I21 Branch 2 IFEQ L171 - true
   * Goal 2. state.Player.gangStrength()I: I21 Branch 2 IFEQ L171 - false
   */

  @Test
  public void test24()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.gangStrength();
      assertEquals(0, player0.getPictureId());
      assertEquals(1, int0);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  //Test case number: 25
  /*
   * 3 covered goals:
   * Goal 1. state.Player.setDead(JZ)V: root-Branch
   * Goal 2. state.Player.setDead(J)V: root-Branch
   * Goal 3. state.Player.isDead()Z: I7 Branch 3 IFNE L191 - false
   */

  @Test
  public void test25()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead((long) (-49));
      boolean boolean0 = player0.isDead();
      assertEquals((-49L), player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getMoney()F: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getMoney();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 27
  /*
   * 2 covered goals:
   * Goal 1. state.Player.pack()[B: root-Branch
   * Goal 2. state.Player.pack(Ljava/io/DataOutputStream;)V: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = player0.pack();
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isJoinOK(Lstate/Player;Z)Z: I11 Branch 4 IFEQ L263 - true
   */

  @Test
  public void test28()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 29
  /*
   * 3 covered goals:
   * Goal 1. state.Player.<init>()V: root-Branch
   * Goal 2. state.Player.<init>(I)V: root-Branch
   * Goal 3. state.Player.getZ()F: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getZ();
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, float0, 0.01F);
  }
}
