/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 08:42:17 GMT 2015
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
   * 2 covered goals:
   * Goal 1. state.Player.setJoinOK(Lstate/Player;Z)V: root-Branch
   * Goal 2. state.Player$JoinInfo.<init>(Lstate/Player;Z)V: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      Player player0 = new Player();
      player0.setJoinOK(player0, true);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getMoney()F: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getMoney();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getPictureId()I: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getPictureId();
      assertEquals(0, int0);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getName()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.getName();
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setMoney(F)V: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      Player player0 = new Player();
      player0.setMoney(2301.4287F);
      assertEquals(2301.4287F, player0.getMoney(), 0.01F);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getZ()F: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getZ();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. state.Player.type()I: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.type();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(5, int0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isDead()Z: I7 Branch 3 IFNE L191 - true
   */

  @Test
  public void test07()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isDead();
      assertEquals(1, player0.getStrength());
      assertFalse(boolean0);
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isJoinOK(Lstate/Player;Z)Z: I11 Branch 4 IFEQ L263 - true
   */

  @Test
  public void test08()  throws Throwable  {
      Player player0 = new Player(0, "PlayXr.unpack():*** WARNING *** datatis not of proper type!", "PlayXr.unpack():*** WARNING *** datatis not of proper type!", 0);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getStrength()I: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getStrength();
      assertEquals(0, player0.getPictureId());
      assertEquals(1, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setZ(F)V: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      player0.setZ(614.9F);
      assertEquals(614.9F, player0.getZ(), 0.01F);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. state.Player.reset(Z)V: I48 Branch 1 IFEQ L127 - false
   */

  @Test
  public void test11()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(true);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getIP()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.getIP();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setDead()V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isConnected()Z: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isConnected();
      assertTrue(boolean0);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. state.Player.reset(Z)V: I48 Branch 1 IFEQ L127 - true
   */

  @Test
  public void test15()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(false);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setConnected(Z)V: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      Player player0 = new Player();
      player0.setConnected(true);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * Goal 1. state.Player.gangStrength()I: I21 Branch 2 IFEQ L171 - true
   * Goal 2. state.Player.gangStrength()I: I21 Branch 2 IFEQ L171 - false
   */

  @Test
  public void test17()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.gangStrength();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, int0);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 18
  /*
   * 3 covered goals:
   * Goal 1. state.Player.pack()[B: root-Branch
   * Goal 2. state.Player.pack(Ljava/io/DataOutputStream;)V: root-Branch
   * Goal 3. state.Player.unpack(Ljava/io/DataInputStream;)Z: I12 Branch 7 IF_ICMPEQ L307 - true
   */

  @Test
  public void test18()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = player0.pack();
      player0.unpack(byteArray0);
      assertEquals(1, player0.getStrength());
      assertEquals(-1, player0.getId());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setX(F)V: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      Player player0 = new Player();
      player0.setX((-872.0F));
      assertEquals((-872.0F), player0.getX(), 0.01F);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. state.Player.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.toString();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getTimeOfDeath()J: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      Player player0 = new Player();
      long long0 = player0.getTimeOfDeath();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getX()F: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getX();
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, float0, 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getY()F: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getY();
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  //Test case number: 24
  /*
   * 3 covered goals:
   * Goal 1. state.Player.setDead(JZ)V: root-Branch
   * Goal 2. state.Player.setDead(J)V: root-Branch
   * Goal 3. state.Player.isDead()Z: I7 Branch 3 IFNE L191 - false
   */

  @Test
  public void test24()  throws Throwable  {
      Player player0 = new Player(0, "PlayXr.unpack():*** WARNING *** datatis not of proper type!", "PlayXr.unpack():*** WARNING *** datatis not of proper type!", 0, 0);
      assertFalse(player0.isDead());
      
      player0.setDead((long) 0);
      boolean boolean0 = player0.isDead();
      assertTrue(boolean0);
  }

  //Test case number: 25
  /*
   * 2 covered goals:
   * Goal 1. state.Player.setY(F)V: root-Branch
   * Goal 2. state.Player.<init>()V: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      Player player0 = new Player();
      player0.setY(2323.6912F);
      assertEquals(2323.6912F, player0.getY(), 0.01F);
  }

  //Test case number: 26
  /*
   * 6 covered goals:
   * Goal 1. state.Player.<init>(ILjava/lang/String;Ljava/lang/String;I)V: root-Branch
   * Goal 2. state.Player.unpack([B)V: root-Branch
   * Goal 3. state.Player.<init>(I)V: root-Branch
   * Goal 4. state.Player.<init>(ILjava/lang/String;I)V: root-Branch
   * Goal 5. state.Player.<init>(ILjava/lang/String;Ljava/lang/String;II)V: root-Branch
   * Goal 6. state.Player.unpack(Ljava/io/DataInputStream;)Z: I12 Branch 7 IF_ICMPEQ L307 - false
   */

  @Test
  public void test26()  throws Throwable  {
      Player player0 = new Player(1918, "HO8;.%*huXPE<", "HO8;.%*huXPE<", 1918, 1918);
      byte[] byteArray0 = new byte[4];
      player0.unpack(byteArray0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1918, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(1918, player0.getStrength());
  }
}
