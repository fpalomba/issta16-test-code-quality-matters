/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 19:52:49 GMT 2015
 */

package net.sourceforge.schemaspy.model;

import static org.junit.Assert.*;
import org.junit.Test;
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
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isRestrictDelete()Z: I15 Branch 6 IF_ICMPNE L191 - false
   */

  @Test
  public void test00()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "ADVP=advp <1 (RB < /^(?i:now)$/) <2 (SBAR=sar <1 (IN < /^(?i:that)$/))", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.<init>(Lnet/sourceforge/schemaspy/model/TableColumn;Lnet/sourceforge/schemaspy/model/TableColumn;)V: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
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

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isNullOnDelete()Z: I8 Branch 7 IF_ICMPNE L201 - true
   */

  @Test
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "ADVP=advp <1 (RB < /^?i:now)$/) < (SBAR=sbar <1 (IN < /^(?i:th:t)$/))", (-295), (-295));
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      assertEquals(-295, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 13 TABLESWITCH L222 Case 0 - true
   */

  @Test
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Test cannot check for cycles in tree format (classes not available)", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 9 TABLESWITCH L205 Case 1 - true
   */

  @Test
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on )elee:\n Foreign key to parent set to NULL when parent deleted", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 11 TABLESWITCH L205 Case 3 - true
   */

  @Test
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on )elee:\n Foreign key to parent set to NULL when parent deleted", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getChildColumns()Ljava/util/List;: root-Branch
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.compareTo(Lnet/sourceforge/schemaspy/model/ForeignKeyConstraint;)I: I26 Branch 25 IFNE L302 - false
   */

  @Test
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "ADA| C | CATALOG_NAME | CHARACTER_SET_CATALOG | CHARACTER_SET_NAME| CHARACTER_SET_SCHEMA | CLASS_ORIGIN | COBOL | COLLATION_CATALOG| COLLATION_NAME | COLLATION_SCHEMA | COLUMN_NAME | COMMAND_FUNCTION | COMMITTED| CONDITION_NUMBER | CONNECTION_NAME | CONSTRAINT_CATALOG | CONSTRAINT_NAME| CONSTRAINT_SCHEMA | CURSOR_NAME| DATA | DATETIME_INTERVAL_CODE | DATETIME_INTERVAL_PRECISION | DYNAMIC_FUNCTION| FORTRAN| LENGTH| MESSAGE_LENGTH | MESSAGE_OCTET_LENGTH | MESSAGE_TEXT | MORE | MUMPS| NAME | NULLABLE | NUMBER| PASCAL | PLI| REPEATABLE | RETURNED_LENGTH | RETURNED_OCTET_LENGTH | RETURNED_SQLSTATE| ROW_COUNT| SCALE | SCHEMA_NAME | SERIALIZABLE | SERVER_NAME | SUBCLASS_ORIGIN| TABLE_NAME | TYPE| UNCOMMITTED | UNNAMED| ABSOLUTE | ACTION | ADD | ALL | ALLOCATE | ALTER | AND| ANY | ARE | AS | ASC| ASSERTION | AT | AUTHORIZATION | AVG| BEGIN | BETWEEN | BIT | BIT_LENGTH | BOTH | BY| CASCADE | CASCADED | CASE v CAST | CATALOG | CHAR | CHARACTER | CHAR_LENGTH| CHARACTER_LENGTH | CHECK | CLOSE | COALESCE | COLLATE | COLLATION| COLUMN | COMMIT | CONNECT | CONNECTION | CONSTRAINT| CONSTRAINTS | CONTINUE| CONVERT | CORRESPONDING | COUNT | CREATE | CROSS | CURRENT| CURRENT_DATE | CURRENT_TIME | CURRENT_TIMESTAMP | CURRENT_USER | CURSOR| DATE | DAY | DEALLOCATE | DEC | DECIMAL | DECLARE | DEFAULT | DEFERRABLE| DEFERRED | DELETE | DESC | DESCRIBE | DESCRIPTOR | DIAGNOSTICS| DISCONNECT | DISTINCT | DOMAIN | DOUBLE | DROP| ELSE | END | END-EXEC | ESCAPE | EXCEPT | EXCEPTION| EXEC | EXECUTE | EXISTS| EXTERNAL | EXTRACT| FALSE | FETCH | FIRST | FLOAT | FOR | FOREIGN | FOUND | FROM | FULL| GET | GLOBAL | GO | GOTO | GRANT | GROUP| HAVING | HOUR| IDENTITY | IMMEDIATE | IN | INDICATOR | INITIALLY | INNER | INPUT| INSENSITIVE | INSERT | INT | INTEGER | INTERSECT | INTERVAL | INTO | IS| ISOLATION| JOIN| KEY| LANGUAGE | LAST | LEADING | LEFT | LEVEL | LIKE | LOCAL | LOWER| MATCH | MAX | MIN | MINUTE | MODULE | MONTH| NAME | NATIONAL | NATURAL | NCHAR | NEXT | NO | NOT | NULL| NULLIF | NUMERIC| OCTET_LENGTH | OF | ON | ONLY | OPEN | OPTION | OR| ORDER | OUTER| OUTPUT | OVERLAPS| PAD | PARTIAL | POSITION | PRECISION | PREPARE | PRESERVE | PRIMAzY| PRIOR | PRIVILEGES | PROCEDURE | PUBLIC| READ | REAL | REFERENCES | RELATIVE | RESTRICT | REVOKE | RIGHT| ROLLBACK | ROWS| SCHEMA | SCROLL | SECOND | SECTION | SELECT | SESSION | SESSION_USER | SET| SIZE | SMALLINT | SOME | SPACE | SQL | SQLCODE | SQLERROR | SQLSTATE| SUBSTRING | SUM | SYSTEM_USER| TABLE | TEMPORARY | THEN | TIME | TIMESTAMP | TIMEZONE_HOUR | TIMEZONE_MINUTE| TO | TRAILING | TRANSACTION | TRANSLATE | TRANSLATION | TRIM | TRUE| UNION | UNIQUE | UNKNOWN | UPDATE | UPPER | USAGE | USER | USING| VALUE | VALUES | VARCHAR | VARYING | VIEW| WHEN | WHENEVER | WHERE | WITH | WORK | WRITE| YEAR| ZONE", 13, 13);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "ADA| C | CATALOG_NAME | CHARACTER_SET_CATALOG | CHARACTER_SET_NAME| CHARACTER_SET_SCHEMA | CLASS_ORIGIN | COBOL | COLLATION_CATALOG| COLLATION_NAME | COLLATION_SCHEMA | COLUMN_NAME | COMMAND_FUNCTION | COMMITTED| CONDITION_NUMBER | CONNECTION_NAME | CONSTRAINT_CATALOG | CONSTRAINT_NAME| CONSTRAINT_SCHEMA | CURSOR_NAME| DATA | DATETIME_INTERVAL_CODE | DATETIME_INTERVAL_PRECISION | DYNAMIC_FUNCTION| FORTRAN| LENGTH| MESSAGE_LENGTH | MESSAGE_OCTET_LENGTH | MESSAGE_TEXT | MORE | MUMPS| NAME | NULLABLE | NUMBER| PASCAL | PLI| REPEATABLE | RETURNED_LENGTH | RETURNED_OCTET_LENGTH | RETURNED_SQLSTATE| ROW_COUNT| SCALE | SCHEMA_NAME | SERIALIZABLE | SERVER_NAME | SUBCLASS_ORIGIN| TABLE_NAME | TYPE| UNCOMMITTED | UNNAMED| ABSOLUTE | ACTION | ADD | ALL | ALLOCATE | ALTER | AND| ANY | ARE | AS | ASC| ASSERTION | AT | AUTHORIZATION | AVG| BEGIN | BETWEEN | BIT | BIT_LENGTH | BOTH | BY| CASCADE | CASCADED | CASE v CAST | CATALOG | CHAR | CHARACTER | CHAR_LENGTH| CHARACTER_LENGTH | CHECK | CLOSE | COALESCE | COLLATE | COLLATION| COLUMN | COMMIT | CONNECT | CONNECTION | CONSTRAINT| CONSTRAINTS | CONTINUE| CONVERT | CORRESPONDING | COUNT | CREATE | CROSS | CURRENT| CURRENT_DATE | CURRENT_TIME | CURRENT_TIMESTAMP | CURRENT_USER | CURSOR| DATE | DAY | DEALLOCATE | DEC | DECIMAL | DECLARE | DEFAULT | DEFERRABLE| DEFERRED | DELETE | DESC | DESCRIBE | DESCRIPTOR | DIAGNOSTICS| DISCONNECT | DISTINCT | DOMAIN | DOUBLE | DROP| ELSE | END | END-EXEC | ESCAPE | EXCEPT | EXCEPTION| EXEC | EXECUTE | EXISTS| EXTERNAL | EXTRACT| FALSE | FETCH | FIRST | FLOAT | FOR | FOREIGN | FOUND | FROM | FULL| GET | GLOBAL | GO | GOTO | GRANT | GROUP| HAVING | HOUR| IDENTITY | IMMEDIATE | IN | INDICATOR | INITIALLY | INNER | INPUT| INSENSITIVE | INSERT | INT | INTEGER | INTERSECT | INTERVAL | INTO | IS| ISOLATION| JOIN| KEY| LANGUAGE | LAST | LEADING | LEFT | LEVEL | LIKE | LOCAL | LOWER| MATCH | MAX | MIN | MINUTE | MODULE | MONTH| NAME | NATIONAL | NATURAL | NCHAR | NEXT | NO | NOT | NULL| NULLIF | NUMERIC| OCTET_LENGTH | OF | ON | ONLY | OPEN | OPTION | OR| ORDER | OUTER| OUTPUT | OVERLAPS| PAD | PARTIAL | POSITION | PRECISION | PREPARE | PRESERVE | PRIMAzY| PRIOR | PRIVILEGES | PROCEDURE | PUBLIC| READ | REAL | REFERENCES | RELATIVE | RESTRICT | REVOKE | RIGHT| ROLLBACK | ROWS| SCHEMA | SCROLL | SECOND | SECTION | SELECT | SESSION | SESSION_USER | SET| SIZE | SMALLINT | SOME | SPACE | SQL | SQLCODE | SQLERROR | SQLSTATE| SUBSTRING | SUM | SYSTEM_USER| TABLE | TEMPORARY | THEN | TIME | TIMESTAMP | TIMEZONE_HOUR | TIMEZONE_MINUTE| TO | TRAILING | TRANSACTION | TRANSLATE | TRANSLATION | TRIM | TRUE| UNION | UNIQUE | UNKNOWN | UPDATE | UPPER | USAGE | USER | USING| VALUE | VALUES | VARCHAR | VARYING | VIEW| WHEN | WHENEVER | WHERE | WITH | WORK | WRITE| YEAR| ZONE", 13, 13);
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

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 22 TABLESWITCH L239 Default-Case - true
   */

  @Test
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "ADVP=advp <1 (RB < /^(?i:now)$/) <2 (SBAR=sar <1 (IN < /^(?i:that)$/+)", (-312), (-312));
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(-312, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 19 TABLESWITCH L239 Case 1 - true
   */

  @Test
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "ADVP=advp <1 (RB < /^(?i:now)$/) <2 (SBAR=sar <1 (IN < /^(?i:that)$/))", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.<init>(Lnet/sourceforge/schemaspy/model/TableColumn;Lnet/sourceforge/schemaspy/model/TableColumn;II)V: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 4544, 4544);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 12 TABLESWITCH L205 Default-Case - true
   */

  @Test
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on )elee:\n Foreign key to parent set to NULL when parent deleted", 4, 4);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(4, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isRestrictDelete()Z: I8 Branch 5 IF_ICMPEQ L191 - false
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isRestrictDelete()Z: I15 Branch 6 IF_ICMPNE L191 - true
   */

  @Test
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "ADVP=advp <1 (RB < /^(?i:now)$/) <2 (SAR=sar <1 (IN < /^(?i:that)$/))", 2527, 2527);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean0);
      assertEquals(2527, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getName()Ljava/lang/String;: root-Branch
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.compareTo(Lnet/sourceforge/schemaspy/model/ForeignKeyConstraint;)I: I7 Branch 24 IF_ACMPNE L298 - true
   * Goal 3. net.sourceforge.schemaspy.model.ForeignKeyConstraint.compareTo(Lnet/sourceforge/schemaspy/model/ForeignKeyConstraint;)I: I26 Branch 25 IFNE L302 - true
   */

  @Test
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, " via ", (-19), (-19));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "  Evaluating: ", (-19), (-19));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals(86, int0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 15 TABLESWITCH L222 Case 2 - true
   */

  @Test
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Test cannot check for cycles in tree format (classes not available)", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isCascadeOnDelete()Z: I7 Branch 4 IFNE L181 - true
   */

  @Test
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Optimal so far is:  batch size: ", 9, 9);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      assertEquals(9, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 16 TABLESWITCH L222 Case 3 - true
   */

  @Test
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on )elee:\n Foreign key to parent set to NULL when parent deleted", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isRestrictDelete()Z: I8 Branch 5 IF_ICMPEQ L191 - true
   */

  @Test
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "ADVP=advp <1 (RB < /^(?i:now)$/) <2 (SBAR=sar <1 (IN < /^(?i:that)$/+)", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 20 TABLESWITCH L239 Case 2 - true
   */

  @Test
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "ADA| C | CATALOG_NAME | CHARACTER_SET_CATALOG | CHARACTER_SET_NAME| CHARACTER_SET_SCHEMA | CLASS_ORIGIN | COBOL | COLLATION_CATALOG| COLLATION_NAME | COLLATION_SCHEMA | COLUMN_NAME | COMMAND_FUNCTION | COMMITTED| CONDITION_NUMBER | CONNECTION_NAME | CONSTRAINT_CATALOG | CONSTRAINT_NAME| CONSTRAINT_SCHEMA | CURSOR_NAME| DATA | DATETIME_INTERVAL_CODE | DATETIME_INTERVAL_PRECISION | DYNAMIC_FUNCTION| FORTRAN| LENGTH| MESSAGE_LENGTH | MESSAGE_OCTET_LENGTH | MESSAGE_TEXT | MORE | MUMPS| NAME | NULLABLE | NUMBER| PASCAL | PLI| REPEATABLE | RETURNED_LENGTH | RETURNED_OCTET_LENGTH | RETURNED_SQLSTATE| ROW_COUNT| SCALE | SCHEMA_NAME | SERIALIZABLE | SERVER_NAME | SUBCLASS_ORIGIN| TABLE_NAME | TYPE| UNCOMMITTED | UNNAMED| ABSOLUTE | ACTION | ADD | ALL | ALLOCATE | ALTER | AND| ANY | ARE | AS | ASC| ASSERTION | AT | AUTHORIZATION | AVG| BEGIN | BETWEEN | BIT | BIT_LENGTH | BOTH | BY| CASCADE | CASCADED | CASE | CAST | CATALOG | CHAR | CHARACTER | CHAR_LENGTH| CHARACTER_LENGTH | CHECK | CLOSE | COALESCE | COLLATE | COLLATION| COLUMN | COMMIT | CONNECT | CONNECTION | CONSTRAINT| CONSTRAINTS | CONTINUE| CONVERT | CORRESPONDING | COUNT | CREATE | CROSS | CURRENT| CURRENT_DATE | CURRENT_TIME | CURRENT_TIMESTAMP | CURRENT_USER | CURSOR| DATE | DAY | DEALLOCATE | DEC | DECIMAL | DECLARE | DEFAULT | DEFERRABLE| DEFERRED | DELETE | DESC | DESCRIBE | DESCRIPTOR | DIAGNOSTICS| DISCONNECT | DISTINCT | DOMAIN | DOUBLE | DROP| ELSE | END | END-EXEC | ESCAPE | EXCEPT | EXCEPTION| EXEC | EXECUTE | EXISTS| EXTERNAL | EXTRACT| FALSE | FETCH | FIRST | FLOAT | FOR | FOREIGN | FOUND | FROM | FULL| GET | GLOBAL | GO | GOTO | GRANT | GROUP| HAVING | HOUR| IDENTITY | IMMEDIATE | IN | INDICATOR | INITIALLY | INNER | INPUT| INSENSITIVE | INSERT | INT | INTEGER | INTERSECT | INTERVAL | INTO | IS| ISOLATION| JOIN| KEY| LANGUAGE | LAST | LEADING | LEFT | LEVEL | LIKE | LOCAL | LOWER| MATCH | MAX | MIN | MINUTE | MODULE | MOTH| NAMES | NATIONAL | NATURAL | NCHAR | NEXT | NO | NOT | NULL| NULLIF | NUMERIC| OCTET_LENGTH | OF | ON | ONLY | OPEN | OPTION | OR| ORDER | OUTER| OUTPUT | OVERLAPS| PAD | PARTIAL | POSITION | PRECISION | PREPARE | PRESERVE | PRIMARY| PRIOR | PRIVILEGES | PROCEDURE | PUBLIC| READ | REAL | REFERENCES | RELATIVE | RESTRICT | REVOKE | RIGHT| ROLLBACK | ROWS| SCHEMA | SCROLL | SECOND | SECTION | SELECT | SESSION | SESSION_USER | SET| SIZE | SMALLINT | SOME | SPACE | SQL | SQLCODE | SQLERROR | SQLSTATE| SUBSTRING | SUM | SYSTEM_USER| TABLE | TEMPORARY | THEN | TIME | TIMESTAMP | TIMEZONE_HOUR | TIMEZONE_MINUTE| TO | TRxILING | TRANSACTION | TR NSLATE | TRANSLATION | TRIM | TRUE| UNION | UNIQUE | UNKNOWN | UPDATE | UPPER | USAGE | USER | USING| VALUE | VALUES | VARCHAR | VARYING | VIEW| WHEN | WHENEVER | WHERE | WITH | WORK | WRITE| YEAR| ZONE", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("N", string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.toString(Ljava/util/List;)Ljava/lang/String;: I8 Branch 29 IF_ICMPNE L325 - false
   */

  @Test
  public void test18()  throws Throwable  {
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

  //Test case number: 19
  /*
   * 3 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getParentTable()Lnet/sourceforge/schemaspy/model/Table;: root-Branch
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getChildTable()Lnet/sourceforge/schemaspy/model/Table;: root-Branch
   * Goal 3. net.sourceforge.schemaspy.model.ForeignKeyConstraint.addChildColumn(Lnet/sourceforge/schemaspy/model/TableColumn;)V: I6 Branch 3 IFNULL L113 - true
   */

  @Test
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "RestEict Selete:\n Parent cannot be delete: if childreneist", 9, 9);
      Table table0 = foreignKeyConstraint0.getChildTable();
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      Table table1 = foreignKeyConstraint0.getParentTable();
      assertNull(table1);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.toString(Ljava/util/List;)Ljava/lang/String;: I8 Branch 29 IF_ICMPNE L325 - true
   */

  @Test
  public void test20()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertEquals("[]", string0);
  }

  //Test case number: 21
  /*
   * 2 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 18 TABLESWITCH L239 Case 0 - true
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 21 TABLESWITCH L239 Case 3 - false
   */

  @Test
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on )elTe:\n Foreign key to paren1 set to NULL when parent deleted", 5002, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isNullOnDelete()Z: I8 Branch 7 IF_ICMPNE L201 - false
   */

  @Test
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Optimal so far is:  batch size: ", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getParentColumns()Ljava/util/List;: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on )elee:\n Foreign key to parent set to NULL when parent deleted", 3, 3);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      assertEquals(0, list0.size());
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isImplied()Z: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on )elee:\n Foreign key to parent set to NULL when parent deleted", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getUpdateRule()I: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Optimal so far is:  batch size: ", 18, 18);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(18, int0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isReal()Z: I8 Branch 23 IF_ACMPNE L286 - false
   */

  @Test
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ".6L\"5", (-283), (-283));
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.addParentColumn(Lnet/sourceforge/schemaspy/model/TableColumn;)V: I6 Branch 2 IFNULL L101 - true
   */

  @Test
  public void test27()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (byte) (-109), (byte) (-109));
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      assertFalse(foreignKeyConstraint0.isRestrictDelete());
  }

  //Test case number: 28
  /*
   * 5 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 18 TABLESWITCH L239 Case 0 - false
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 19 TABLESWITCH L239 Case 1 - false
   * Goal 3. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 20 TABLESWITCH L239 Case 2 - false
   * Goal 4. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 21 TABLESWITCH L239 Case 3 - true
   * Goal 5. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 22 TABLESWITCH L239 Default-Case - false
   */

  @Test
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "ADA| C | CATALOG_NAME | CHARACTER_SET_CATALOG | CHARACTER_SET_NAME| CHARACTER_SET_SCHEMA | CLASS_ORIGIN | COBOL | COLLATION_CATALOG| COLLATION_NAME | COLLATION_SCHEMA | COLUMN_NAME | COMMAND_FUNCTION | COMMITTED| CONDITION_NUMBER | CONNECTION_NAME | CONSTRAINT_CATALOG | CONSTRAINT_NAME| CONSTRAINT_SCHEMA | CURSOR_NAME| DATA | DATETIME_INTERVAL_CODE | DATETIME_INTERVAL_PRECISION | DYNAMIC_FUNCTION| FORTRAN| LENGTH| MESSAGE_LENGTH | MESSAGE_OCTET_LENGTH | MESSAGE_TEXT | MORE | MUMPS| NAME | NULLABLE | NUMBER| PASCAL | PLI| REPEATABLE | RETURNED_LENGTH | RETURNED_OCTET_LENGTH | RETURNED_SQLSTATE| ROW_COUNT| SCALE | SCHEMA_NAME | SERIALIZABLE | SERVER_NAME | SUBCLASS_ORIGIN| TABLE_NAME | TYPE| UNCOMMITTED | UNNAMED| ABSOLUTE | ACTION | ADD | ALL | ALLOCATE | ALTER | AND| ANY | ARE | AS | ASC| ASSERTION | AT | AUTHORIZATION | AVG| BEGIN | BETWEEN | BIT | BIT_LENGTH | BOTH | BY| CASCADE | CASCADED | CASE | CAST | CATALOG | CHAR | CHARACTER | CHAR_LENGTH| CHARACTER_LENGTH | CHECK | CLOSE | COALESCE | COLLATE | COLLATION| COLUMN | COMMIT | CONNECT | CONNECTION | CONSTRAINT| CONSTRAINTS | CONTINUE| CONVERT | CORRESPONDING | COUNT | CREATE | CROSS | CURRENT| CURRENT_DATE | CURRENT_TIME | CURRENT_TIMESTAMP | CURRENT_USER | CURSOR| DATE | DAY | DEALLOCATE | DEC | DECIMAL | DECLARE | DEFAULT | DEFERRABLE| DEFERRED | DELETE | DESC | DESCRIBE | DESCRIPTOR | DIAGNOSTICS| DISCONNECT | DISTINCT | DOMAIN | DOUBLE | DROP| ELSE | END | END-EXEC | ESCAPE | EXCEPT | EXCEPTION| EXEC | EXECUTE | EXISTS| EXTERNAL | EXTRACT| FALSE | FETCH | FIRST | FLOAT | FOR | FOREIGN | FOUND | FROM | FULL| GET | GLOBAL | GO | GOTO | GRANT | GROUP| HAVING | HOUR| IDENTITY | IMMEDIATE | IN | INDICATOR | INITIALLY | INNER | INPUT| INSENSITIVE | INSERT | INT | INTEGER | INTERSECT | INTERVAL | INTO | IS| ISOLATION| JOIN| KEY| ANGUAGE | LAST | LEADING | LEFT | LEVEL | LIKE | LOCAL | LOWER| MATCH | MAX | MIN | MINUTE | MODULE | MONTH| NAMES | NATIONAL | NATURAL | NCHAR | NEXT | NO | NOT | NULL| NULLIF | NUMERIC| OCTET_LENGTH | OF | ON | ONLY | OPEN | OPTION | OR| ORDER | OUTER| OUTPUT | OVERLAPS| PAD | PARTIAL | POSITION | PRECISION | PREPARE | PRESERVE | PRIMARY| PRIOR | PRIVILEGES | PROCEDURE | PUBLIC| READ | REAL | REFERENCES | RELATIVE | RESTRICT | REVOKE | RIGHT| ROLLBACK | ROWS| SCHEMA | SCROLL | SECOND | SECTION | SELECT | SESSION | SESSION_USER | SET| SIZE | SMALLINT | SOME | SPACE | SQL | SQLCODE | SQLERROR | SQLSTATE| SUBSTRING | SUM | SYSTEM_USER| TABLE | TEMPORARY | THEN | TIME | TIMESTAMP | TIMEZONE_HOUR | TIMEZONE_MINUTE| TO | TRAILING | TRANSACTION | TRANSLATE | TRANSLATION | TRM | TRUE| UNION | UNIQUE | UNKNOWN | UPDATE | UPPER | USAGE | USER | USING| VALUE | VALUES | VARCHAR | VARYING | VIEW| WHEN | WHENEVER | WHERE | WITH | WORK | WRITE| YEAR| ZONE", (-315), 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
  }

  //Test case number: 29
  /*
   * 2 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 8 TABLESWITCH L205 Case 0 - false
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 10 TABLESWITCH L205 Case 2 - true
   */

  @Test
  public void test29()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "ADVP=advp <1 (RB < /^(?i:now)$/) <2 (SBAR=sar <1 (IN < /^(?i:that)$/))", (-295), 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Null on delete", string0);
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.isCascadeOnDelete()Z: I7 Branch 4 IFNE L181 - false
   */

  @Test
  public void test30()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on )elee:\n Foreign key to parent set to NULL when parent deleted", 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.compareTo(Lnet/sourceforge/schemaspy/model/ForeignKeyConstraint;)I: I7 Branch 24 IF_ACMPNE L298 - false
   */

  @Test
  public void test31()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, " via ", (-12), (-12));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(0, int0);
  }

  //Test case number: 32
  /*
   * 2 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 14 TABLESWITCH L222 Case 1 - true
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 17 TABLESWITCH L222 Default-Case - false
   */

  @Test
  public void test32()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Test cannot check for cycles in tree format (classes not available)", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
  }

  //Test case number: 33
  /*
   * 5 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 13 TABLESWITCH L222 Case 0 - false
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 14 TABLESWITCH L222 Case 1 - false
   * Goal 3. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 15 TABLESWITCH L222 Case 2 - false
   * Goal 4. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 16 TABLESWITCH L222 Case 3 - false
   * Goal 5. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 17 TABLESWITCH L222 Default-Case - true
   */

  @Test
  public void test33()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on )elee:\n Foreign kjy to parent set to NULL when parent deleted", 5, 5);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(5, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 34
  /*
   * 7 covered goals:
   * Goal 1. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRule()I: root-Branch
   * Goal 2. net.sourceforge.schemaspy.model.ForeignKeyConstraint.<init>(Lnet/sourceforge/schemaspy/model/Table;Ljava/lang/String;II)V: I29 Branch 1 IFEQ L57 - true
   * Goal 3. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 8 TABLESWITCH L205 Case 0 - true
   * Goal 4. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 9 TABLESWITCH L205 Case 1 - false
   * Goal 5. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 10 TABLESWITCH L205 Case 2 - false
   * Goal 6. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 11 TABLESWITCH L205 Case 3 - false
   * Goal 7. net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 12 TABLESWITCH L205 Default-Case - false
   */

  @Test
  public void test34()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on )elee:\n Foreign key to parent set to NULL when parent deleted", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
  }
}
