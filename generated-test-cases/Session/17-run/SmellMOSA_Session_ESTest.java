/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 08:58:44 GMT 2015
 */

package net.sourceforge.squirrel_sql.client.session;

import static org.junit.Assert.*;
import org.junit.Test;
import net.sourceforge.squirrel_sql.client.DummyAppPlugin;
import net.sourceforge.squirrel_sql.client.IApplication;
import net.sourceforge.squirrel_sql.client.gui.db.SQLAlias;
import net.sourceforge.squirrel_sql.client.session.Session;
import net.sourceforge.squirrel_sql.fw.id.IIdentifier;
import net.sourceforge.squirrel_sql.fw.id.UidIdentifier;
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
      //  // Unstable assertion: assertNotNull(dummyAppPlugin0);
      //  // Unstable assertion: assertEquals("0.1", dummyAppPlugin0.getVersion());
      //  // Unstable assertion: assertNull(dummyAppPlugin0.getHelpFileName());
      //  // Unstable assertion: assertNull(dummyAppPlugin0.getChangeLogFileName());
      //  // Unstable assertion: assertEquals("", dummyAppPlugin0.getContributors());
      //  // Unstable assertion: assertEquals("Dummy Application Plugin", dummyAppPlugin0.getDescriptiveName());
      //  // Unstable assertion: assertEquals("app", dummyAppPlugin0.getInternalName());
      //  // Unstable assertion: assertNull(dummyAppPlugin0.getLicenceFileName());
      //  // Unstable assertion: assertEquals("Colin Bell", dummyAppPlugin0.getAuthor());
      
      IApplication iApplication0 = dummyAppPlugin0.getApplication();
      //  // Unstable assertion: assertNull(iApplication0);
      //  // Unstable assertion: assertEquals("0.1", dummyAppPlugin0.getVersion());
      //  // Unstable assertion: assertNull(dummyAppPlugin0.getHelpFileName());
      //  // Unstable assertion: assertNull(dummyAppPlugin0.getChangeLogFileName());
      //  // Unstable assertion: assertEquals("", dummyAppPlugin0.getContributors());
      //  // Unstable assertion: assertEquals("Dummy Application Plugin", dummyAppPlugin0.getDescriptiveName());
      //  // Unstable assertion: assertEquals("app", dummyAppPlugin0.getInternalName());
      //  // Unstable assertion: assertNull(dummyAppPlugin0.getLicenceFileName());
      //  // Unstable assertion: assertEquals("Colin Bell", dummyAppPlugin0.getAuthor());
      
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      //  // Unstable assertion: assertNotNull(uidIdentifier0);
      //  // Unstable assertion: assertEquals("-5ac32b9:151b9745c70:-62a8", uidIdentifier0.toString());
      
      SQLDriver sQLDriver0 = new SQLDriver((IIdentifier) uidIdentifier0);
      //  // Unstable assertion: assertNotNull(sQLDriver0);
      //  // Unstable assertion: assertNull(sQLDriver0.getDriverClassName());
      //  // Unstable assertion: assertEquals("", sQLDriver0.getUrl());
      //  // Unstable assertion: assertEquals("", sQLDriver0.getName());
      //  // Unstable assertion: assertEquals("", sQLDriver0.getWebSiteUrl());
      //  // Unstable assertion: assertEquals("", sQLDriver0.toString());
      //  // Unstable assertion: assertNull(sQLDriver0.getJarFileName());
      //  // Unstable assertion: assertFalse(sQLDriver0.isJDBCDriverClassLoaded());
      //  // Unstable assertion: assertEquals("-5ac32b9:151b9745c70:-62a8", uidIdentifier0.toString());
      
      SQLAlias sQLAlias0 = new SQLAlias((IIdentifier) uidIdentifier0);
      //  // Unstable assertion: assertNotNull(sQLAlias0);
      //  // Unstable assertion: assertEquals("", sQLAlias0.getUrl());
      //  // Unstable assertion: assertEquals("", sQLAlias0.getPassword());
      //  // Unstable assertion: assertEquals("", sQLAlias0.getName());
      //  // Unstable assertion: assertFalse(sQLAlias0.isAutoLogon());
      //  // Unstable assertion: assertEquals("", sQLAlias0.getUserName());
      //  // Unstable assertion: assertFalse(sQLAlias0.isConnectAtStartup());
      //  // Unstable assertion: assertFalse(sQLAlias0.getUseDriverProperties());
      //  // Unstable assertion: assertFalse(sQLAlias0.isValid());
      //  // Unstable assertion: assertEquals("", sQLAlias0.toString());
      //  // Unstable assertion: assertEquals("-5ac32b9:151b9745c70:-62a8", uidIdentifier0.toString());
      
      Session session0 = null;
      try {
        session0 = new Session((IApplication) null, (ISQLDriver) sQLDriver0, sQLAlias0, (SQLConnection) null, "", "", (IIdentifier) uidIdentifier0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // null IApplication passed
         //
      }
  }
}
