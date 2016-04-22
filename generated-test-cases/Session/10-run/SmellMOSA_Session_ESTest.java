/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 08:42:40 GMT 2015
 */

package net.sourceforge.squirrel_sql.client.session;

import static org.junit.Assert.*;
import org.junit.Test;
import net.sourceforge.squirrel_sql.client.DummyAppPlugin;
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
      DummyAppPlugin dummyAppPlugin0 = new DummyAppPlugin();
      assertEquals("", dummyAppPlugin0.getContributors());
      assertEquals("Dummy Application Plugin", dummyAppPlugin0.getDescriptiveName());
      assertEquals("0.1", dummyAppPlugin0.getVersion());
      assertEquals("app", dummyAppPlugin0.getInternalName());
      assertEquals("Colin Bell", dummyAppPlugin0.getAuthor());
      assertNull(dummyAppPlugin0.getLicenceFileName());
      assertNull(dummyAppPlugin0.getChangeLogFileName());
      assertNull(dummyAppPlugin0.getHelpFileName());
      assertNotNull(dummyAppPlugin0);
      
      IApplication iApplication0 = dummyAppPlugin0.getApplication();
      assertEquals("", dummyAppPlugin0.getContributors());
      assertEquals("Dummy Application Plugin", dummyAppPlugin0.getDescriptiveName());
      assertEquals("0.1", dummyAppPlugin0.getVersion());
      assertEquals("app", dummyAppPlugin0.getInternalName());
      assertEquals("Colin Bell", dummyAppPlugin0.getAuthor());
      assertNull(dummyAppPlugin0.getLicenceFileName());
      assertNull(dummyAppPlugin0.getChangeLogFileName());
      assertNull(dummyAppPlugin0.getHelpFileName());
      assertNull(iApplication0);
      
      SQLDriver sQLDriver0 = new SQLDriver();
      assertNull(sQLDriver0.getJarFileName());
      assertNull(sQLDriver0.toString());
      assertNull(sQLDriver0.getName());
      assertNull(sQLDriver0.getWebSiteUrl());
      assertNull(sQLDriver0.getUrl());
      assertNull(sQLDriver0.getDriverClassName());
      assertFalse(sQLDriver0.isJDBCDriverClassLoaded());
      assertNotNull(sQLDriver0);
      
      IntegerIdentifier integerIdentifier0 = new IntegerIdentifier(0);
      assertEquals("0", integerIdentifier0.toString());
      assertNotNull(integerIdentifier0);
      
      Session session0 = null;
      try {
        session0 = new Session((IApplication) null, (ISQLDriver) sQLDriver0, (SQLAlias) null, (SQLConnection) null, "DmU1apB", "DmU1apB", (IIdentifier) integerIdentifier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null IApplication passed
         //
      }
  }
}
