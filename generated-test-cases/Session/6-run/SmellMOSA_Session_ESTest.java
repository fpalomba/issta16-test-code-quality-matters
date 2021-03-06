/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 08:33:32 GMT 2015
 */

package net.sourceforge.squirrel_sql.client.session;

import static org.junit.Assert.*;
import org.junit.Test;
import net.sourceforge.squirrel_sql.client.IApplication;
import net.sourceforge.squirrel_sql.client.gui.db.SQLAlias;
import net.sourceforge.squirrel_sql.client.session.Session;
import net.sourceforge.squirrel_sql.fw.id.IIdentifier;
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
      SQLDriver sQLDriver0 = new SQLDriver();
      assertNotNull(sQLDriver0);
      assertNull(sQLDriver0.toString());
      assertNull(sQLDriver0.getUrl());
      assertNull(sQLDriver0.getJarFileName());
      assertFalse(sQLDriver0.isJDBCDriverClassLoaded());
      assertNull(sQLDriver0.getName());
      assertNull(sQLDriver0.getWebSiteUrl());
      assertNull(sQLDriver0.getDriverClassName());
      
      SQLAlias sQLAlias0 = new SQLAlias();
      assertNotNull(sQLAlias0);
      assertNull(sQLAlias0.getUserName());
      assertNull(sQLAlias0.getPassword());
      assertNull(sQLAlias0.getUrl());
      assertNull(sQLAlias0.toString());
      assertNull(sQLAlias0.getName());
      assertFalse(sQLAlias0.isValid());
      assertFalse(sQLAlias0.isConnectAtStartup());
      assertFalse(sQLAlias0.isAutoLogon());
      assertFalse(sQLAlias0.getUseDriverProperties());
      
      IIdentifier iIdentifier0 = sQLAlias0.getDriverIdentifier();
      assertNull(iIdentifier0);
      assertNull(sQLAlias0.getUserName());
      assertNull(sQLAlias0.getPassword());
      assertNull(sQLAlias0.getUrl());
      assertNull(sQLAlias0.toString());
      assertNull(sQLAlias0.getName());
      assertFalse(sQLAlias0.isValid());
      assertFalse(sQLAlias0.isConnectAtStartup());
      assertFalse(sQLAlias0.isAutoLogon());
      assertFalse(sQLAlias0.getUseDriverProperties());
      
      Session session0 = null;
      try {
        session0 = new Session((IApplication) null, (ISQLDriver) sQLDriver0, sQLAlias0, (SQLConnection) null, "-Ap", "-Ap", (IIdentifier) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null IApplication passed
         //
      }
  }
}
