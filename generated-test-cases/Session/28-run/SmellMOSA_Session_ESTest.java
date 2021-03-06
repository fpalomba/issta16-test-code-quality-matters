/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 09:23:56 GMT 2015
 */

package net.sourceforge.squirrel_sql.client.session;

import static org.junit.Assert.*;
import org.junit.Test;
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
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      //  // Unstable assertion: assertEquals("-7cf8d939:151b98b6b98:-6595", uidIdentifier0.toString());
      //  // Unstable assertion: assertNotNull(uidIdentifier0);
      
      SQLDriver sQLDriver0 = new SQLDriver((IIdentifier) uidIdentifier0);
      //  // Unstable assertion: assertEquals("-7cf8d939:151b98b6b98:-6595", uidIdentifier0.toString());
      //  // Unstable assertion: assertEquals("", sQLDriver0.getUrl());
      //  // Unstable assertion: assertEquals("", sQLDriver0.getWebSiteUrl());
      //  // Unstable assertion: assertNull(sQLDriver0.getDriverClassName());
      //  // Unstable assertion: assertEquals("", sQLDriver0.toString());
      //  // Unstable assertion: assertEquals("", sQLDriver0.getName());
      //  // Unstable assertion: assertNull(sQLDriver0.getJarFileName());
      //  // Unstable assertion: assertFalse(sQLDriver0.isJDBCDriverClassLoaded());
      //  // Unstable assertion: assertNotNull(sQLDriver0);
      
      SQLAlias sQLAlias0 = new SQLAlias();
      //  // Unstable assertion: assertFalse(sQLAlias0.isConnectAtStartup());
      //  // Unstable assertion: assertFalse(sQLAlias0.getUseDriverProperties());
      //  // Unstable assertion: assertFalse(sQLAlias0.isAutoLogon());
      //  // Unstable assertion: assertNull(sQLAlias0.getUserName());
      //  // Unstable assertion: assertNull(sQLAlias0.getName());
      //  // Unstable assertion: assertNull(sQLAlias0.toString());
      //  // Unstable assertion: assertNull(sQLAlias0.getPassword());
      //  // Unstable assertion: assertFalse(sQLAlias0.isValid());
      //  // Unstable assertion: assertNull(sQLAlias0.getUrl());
      //  // Unstable assertion: assertNotNull(sQLAlias0);
      
      Session session0 = null;
      try {
        session0 = new Session((IApplication) null, (ISQLDriver) sQLDriver0, sQLAlias0, (SQLConnection) null, "Attemping to open file '", "Attemping to open file '", (IIdentifier) uidIdentifier0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // null IApplication passed
         //
      }
  }
}
