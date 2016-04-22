/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 20:54:26 GMT 2015
 */

package net.sourceforge.schemaspy.model;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.stanford.nlp.util.HashIndex;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ForeignKeyConstraint_ESTest extends ForeignKeyConstraint_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.toString(Ljava/util/List;)Ljava/lang/String;: I8 Branch 29 IF_ICMPNE L325 - false
   */

  @Test
  public void test00()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      boolean boolean0 = linkedList0.add((TableColumn) null);
      // Undeclared exception!
      try {
        String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.toString(Ljava/util/List;)Ljava/lang/String;: I8 Branch 29 IF_ICMPNE L325 - true
   */

  @Test
  public void test01()  throws Throwable  {
      HashIndex<TableColumn> hashIndex0 = new HashIndex<TableColumn>();
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>((Collection<? extends TableColumn>) hashIndex0);
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertEquals("[]", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.compareTo(Lnet/sourceforge/schemaspy/model/ForeignKeyConstraint;)I: I26 Branch 25 IFNE L302 - true
   */

  @Test
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "nfU&=", 5, 5);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 5, (-217));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals(5, int0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.compareTo(Lnet/sourceforge/schemaspy/model/ForeignKeyConstraint;)I: I7 Branch 24 IF_ACMPNE L298 - false
   */

  @Test
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^i", (-1414), 1);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(0, int0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isReal()Z: I8 Branch 23 IF_ACMPNE L286 - false
   */

  @Test
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "n$k'=", 7371, 7371);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 22 TABLESWITCH L239 Default-Case - true
   */

  @Test
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "nfU&=", 5, 5);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(5, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 21 TABLESWITCH L239 Case 3 - true
   */

  @Test
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Adding foreign key constraint '", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 20 TABLESWITCH L239 Case 2 - true
   */

  @Test
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^w", (-1426), 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("N", string0);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 18 TABLESWITCH L239 Case 0 - false
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 19 TABLESWITCH L239 Case 1 - true
   */

  @Test
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^i", (-1414), 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 18 TABLESWITCH L239 Case 0 - true
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 19 TABLESWITCH L239 Case 1 - false
   * Goal 3. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 20 TABLESWITCH L239 Case 2 - false
   * Goal 4. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 21 TABLESWITCH L239 Case 3 - false
   * Goal 5. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 22 TABLESWITCH L239 Default-Case - false
   */

  @Test
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^w", (-1391), 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 17 TABLESWITCH L222 Default-Case - true
   */

  @Test
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "nfU&=", 5, 5);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(5, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 16 TABLESWITCH L222 Case 3 - true
   */

  @Test
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Adding foreign key constraint '", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 15 TABLESWITCH L222 Case 2 - true
   */

  @Test
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^w", (-1426), 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 13 TABLESWITCH L222 Case 0 - false
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 14 TABLESWITCH L222 Case 1 - true
   */

  @Test
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^i", (-1414), 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
  }

  //Test case number: 14
  /*
   * 5 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 13 TABLESWITCH L222 Case 0 - true
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 14 TABLESWITCH L222 Case 1 - false
   * Goal 3. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 15 TABLESWITCH L222 Case 2 - false
   * Goal 4. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 16 TABLESWITCH L222 Case 3 - false
   * Goal 5. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 17 TABLESWITCH L222 Default-Case - false
   */

  @Test
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 12 TABLESWITCH L205 Default-Case - true
   */

  @Test
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "n$k'=", 7371, 7371);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(7371, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 11 TABLESWITCH L205 Case 3 - true
   */

  @Test
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Adding foreign key constraint '", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 10 TABLESWITCH L205 Case 2 - true
   */

  @Test
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Adding foreign key constraint '", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Null on delete", string0);
  }

  //Test case number: 18
  /*
   * 2 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 8 TABLESWITCH L205 Case 0 - false
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 9 TABLESWITCH L205 Case 1 - true
   */

  @Test
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^i", (-1414), 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
  }

  //Test case number: 19
  /*
   * 5 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 8 TABLESWITCH L205 Case 0 - true
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 9 TABLESWITCH L205 Case 1 - false
   * Goal 3. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 10 TABLESWITCH L205 Case 2 - false
   * Goal 4. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 11 TABLESWITCH L205 Case 3 - false
   * Goal 5. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 12 TABLESWITCH L205 Default-Case - false
   */

  @Test
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^w", (-1391), 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isNullOnDelete()Z: I8 Branch 7 IF_ICMPNE L201 - false
   */

  @Test
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Adding foreign key constraint '", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isNullOnDelete()Z: I8 Branch 7 IF_ICMPNE L201 - true
   */

  @Test
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^i", (-1414), 1);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", foreignKeyConstraint0.getDeleteRuleDescription());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isRestrictDelete()Z: I15 Branch 6 IF_ICMPNE L191 - true
   */

  @Test
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^w", (-1391), 0);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean0);
      assertEquals("C", foreignKeyConstraint0.getDeleteRuleAlias());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isRestrictDelete()Z: I8 Branch 5 IF_ICMPEQ L191 - true
   */

  @Test
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Adding foreign key constraint '", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isCascadeOnDelete()Z: I7 Branch 4 IFNE L181 - false
   */

  @Test
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isCascadeOnDelete()Z: I7 Branch 4 IFNE L181 - true
   */

  @Test
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "nfU&=", 5, 5);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      assertEquals(5, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.addChildColumn(Lnet/sourceforge/schemaspy/model/TableColumn;)V: I6 Branch 3 IFNULL L113 - true
   */

  @Test
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^w", (-1421), 8);
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      assertFalse(foreignKeyConstraint0.isImplied());
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.addParentColumn(Lnet/sourceforge/schemaspy/model/TableColumn;)V: I6 Branch 2 IFNULL L101 - true
   */

  @Test
  public void test27()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 0);
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      assertEquals("", foreignKeyConstraint0.getName());
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getUpdateRule()I: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "U2)c.D}Zp6P1b=DUt", (-648), 277);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals((-648), int0);
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isImplied()Z: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^i", (-1414), 1);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
  }

  //Test case number: 30
  /*
   * 3 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRule()I: root-Branch
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isRestrictDelete()Z: I8 Branch 5 IF_ICMPEQ L191 - false
   * Goal 3. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isRestrictDelete()Z: I15 Branch 6 IF_ICMPNE L191 - false
   */

  @Test
  public void test30()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^i", (-1414), 1);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getChildTable()Lnet/sourceforge/schemaspy/model/Table;: root-Branch
   */

  @Test
  public void test31()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^i", (-1414), 1);
      Table table0 = foreignKeyConstraint0.getChildTable();
      assertNull(table0);
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getParentColumns()Ljava/util/List;: root-Branch
   */

  @Test
  public void test32()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^i", (-1414), 1);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      assertTrue(list0.isEmpty());
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.<init>(Lnet/sourceforge/schemaspy/model/TableColumn;Lnet/sourceforge/schemaspy/model/TableColumn;)V: root-Branch
   */

  @Test
  public void test33()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getParentTable()Lnet/sourceforge/schemaspy/model/Table;: root-Branch
   */

  @Test
  public void test34()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^i", (-1414), 1);
      Table table0 = foreignKeyConstraint0.getParentTable();
      assertNull(table0);
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.<init>(Lnet/sourceforge/schemaspy/model/TableColumn;Lnet/sourceforge/schemaspy/model/TableColumn;II)V: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 1248, 1248);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 36
  /*
   * 5 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getChildColumns()Ljava/util/List;: root-Branch
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getName()Ljava/lang/String;: root-Branch
   * Goal 3. net.sourceforge.schemaspy.model.ForeignKeyConstraint.<init>(Lnet/sourceforge/schemaspy/model/Table;Ljava/lang/String;II)V: I29 Branch 1 IFEQ L57 - true
   * Goal 4. net.sourceforge.schemaspy.model.ForeignKeyConstraint.compareTo(Lnet/sourceforge/schemaspy/model/ForeignKeyConstraint;)I: I7 Branch 24 IF_ACMPNE L298 - true
   * Goal 5. net.sourceforge.schemaspy.model.ForeignKeyConstraint.compareTo(Lnet/sourceforge/schemaspy/model/ForeignKeyConstraint;)I: I26 Branch 25 IFNE L302 - false
   */

  @Test
  public void test36()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Y^w", (-1426), 2);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Y^w", 0, 0);
      // Undeclared exception!
      try {
        int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }
}
