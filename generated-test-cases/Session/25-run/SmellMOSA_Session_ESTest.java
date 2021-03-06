/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 09:17:01 GMT 2015
 */

package net.sourceforge.squirrel_sql.client.session;

import static org.junit.Assert.*;
import org.junit.Test;
import net.sourceforge.squirrel_sql.client.IApplication;
import net.sourceforge.squirrel_sql.client.gui.db.SQLAlias;
import net.sourceforge.squirrel_sql.client.session.Session;
import net.sourceforge.squirrel_sql.fw.id.IIdentifier;
import net.sourceforge.squirrel_sql.fw.id.IntegerIdentifier;
import net.sourceforge.squirrel_sql.fw.sql.ISQLDriver;
import net.sourceforge.squirrel_sql.fw.sql.SQLConnection;
import net.sourceforge.squirrel_sql.fw.sql.SQLDriver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Session_ESTest extends Session_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. net.sourceforge.squirrel_sql.client.session.Session.<init>(Lnet/sourceforge/squirrel_sql/client/IApplication;Lnet/sourceforge/squirrel_sql/fw/sql/ISQLDriver;Lnet/sourceforge/squirrel_sql/client/gui/db/SQLAlias;Lnet/sourceforge/squirrel_sql/fw/sql/SQLConnection;Ljava/lang/String;Ljava/lang/String;Lnet/sourceforge/squirrel_sql/fw/id/IIdentifier;)V: I78 Branch 3 IFNONNULL L178 - false
   */

  @Test
  public void test0()  throws Throwable  {
      IntegerIdentifier integerIdentifier0 = new IntegerIdentifier(123);
      assertNotNull(integerIdentifier0);
      assertEquals("123", integerIdentifier0.toString());
      
      SQLDriver sQLDriver0 = new SQLDriver((IIdentifier) integerIdentifier0);
      assertNotNull(sQLDriver0);
      assertFalse(sQLDriver0.isJDBCDriverClassLoaded());
      assertEquals("", sQLDriver0.getWebSiteUrl());
      assertEquals("", sQLDriver0.getUrl());
      assertEquals("", sQLDriver0.getName());
      assertNull(sQLDriver0.getJarFileName());
      assertEquals("", sQLDriver0.toString());
      assertNull(sQLDriver0.getDriverClassName());
      assertEquals("123", integerIdentifier0.toString());
      
      SQLAlias sQLAlias0 = new SQLAlias();
      assertNotNull(sQLAlias0);
      assertFalse(sQLAlias0.isAutoLogon());
      assertNull(sQLAlias0.getName());
      assertNull(sQLAlias0.getPassword());
      assertNull(sQLAlias0.getUrl());
      assertFalse(sQLAlias0.getUseDriverProperties());
      assertFalse(sQLAlias0.isValid());
      assertNull(sQLAlias0.toString());
      assertFalse(sQLAlias0.isConnectAtStartup());
      assertNull(sQLAlias0.getUserName());
      
      Session session0 = null;
      try {
        session0 = new Session((IApplication) null, (ISQLDriver) sQLDriver0, sQLAlias0, (SQLConnection) null, "$MLq{hQUEZp", "$MLq{hQUEZp", (IIdentifier) integerIdentifier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null IApplication passed
         //
      }
  }
}
