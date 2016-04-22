/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 15:57:49 GMT 2015
 */

package Newzgrabber;

import static org.junit.Assert.*;
import org.junit.Test;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.net.URL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I33 Branch 3 IFEQ L25 - false
   */

  @Test
  public void test0()  throws Throwable  {
      Newzgrabber.verbose = true;
      URL uRL0 = ClassLoader.getSystemResource("commons-math3-3.5-javadoc.jar");
      //  // Unstable assertion: assertNull(uRL0.getRef());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toExternalForm());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getFile());
      //  // Unstable assertion: assertEquals(-1, uRL0.getDefaultPort());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getPath());
      //  // Unstable assertion: assertEquals("", uRL0.getHost());
      //  // Unstable assertion: assertNull(uRL0.getQuery());
      //  // Unstable assertion: assertEquals("jar", uRL0.getProtocol());
      //  // Unstable assertion: assertEquals(-1, uRL0.getPort());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toString());
      //  // Unstable assertion: assertNull(uRL0.getAuthority());
      //  // Unstable assertion: assertNull(uRL0.getUserInfo());
      //  // Unstable assertion: assertNotNull(uRL0);
      
      InputStream inputStream0 = MockURL.openStream(uRL0);
      //  // Unstable assertion: assertNull(uRL0.getRef());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toExternalForm());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getFile());
      //  // Unstable assertion: assertEquals(-1, uRL0.getDefaultPort());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getPath());
      //  // Unstable assertion: assertEquals("", uRL0.getHost());
      //  // Unstable assertion: assertNull(uRL0.getQuery());
      //  // Unstable assertion: assertEquals("jar", uRL0.getProtocol());
      //  // Unstable assertion: assertEquals(-1, uRL0.getPort());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toString());
      //  // Unstable assertion: assertNull(uRL0.getAuthority());
      //  // Unstable assertion: assertNull(uRL0.getUserInfo());
      //  // Unstable assertion: assertNotNull(inputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(inputStream0);
      //  // Unstable assertion: assertNull(uRL0.getRef());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toExternalForm());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getFile());
      //  // Unstable assertion: assertEquals(-1, uRL0.getDefaultPort());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getPath());
      //  // Unstable assertion: assertEquals("", uRL0.getHost());
      //  // Unstable assertion: assertNull(uRL0.getQuery());
      //  // Unstable assertion: assertEquals("jar", uRL0.getProtocol());
      //  // Unstable assertion: assertEquals(-1, uRL0.getPort());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toString());
      //  // Unstable assertion: assertNull(uRL0.getAuthority());
      //  // Unstable assertion: assertNull(uRL0.getUserInfo());
      //  // Unstable assertion: assertNotNull(bufferedCustomInputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      //  // Unstable assertion: assertEquals(0L, base64Decoder0.getLineCount());
      //  // Unstable assertion: assertNull(uRL0.getRef());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toExternalForm());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getFile());
      //  // Unstable assertion: assertEquals(-1, uRL0.getDefaultPort());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getPath());
      //  // Unstable assertion: assertEquals("", uRL0.getHost());
      //  // Unstable assertion: assertNull(uRL0.getQuery());
      //  // Unstable assertion: assertEquals("jar", uRL0.getProtocol());
      //  // Unstable assertion: assertEquals(-1, uRL0.getPort());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toString());
      //  // Unstable assertion: assertNull(uRL0.getAuthority());
      //  // Unstable assertion: assertNull(uRL0.getUserInfo());
      //  // Unstable assertion: assertNotNull(base64Decoder0);
      //  // Unstable assertion: assertFalse(base64Decoder0.ProgressSet);
      //  // Unstable assertion: assertFalse(base64Decoder0.ABORT);
      
      // Undeclared exception!
      try {
        base64Decoder0.decodeStream();
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 13 covered goals:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I74 Branch 6 IFNE L29 - false
   * Goal 2. Newzgrabber.Base64Decoder.decodeStream()V: I209 Branch 15 IF_ICMPGT L49 - true
   * Goal 3. Newzgrabber.Base64Decoder.decodeStream()V: I230 Branch 16 IF_ICMPLT L51 - false
   * Goal 4. Newzgrabber.Base64Decoder.decodeStream()V: I236 Branch 17 IF_ICMPGT L51 - true
   * Goal 5. Newzgrabber.Base64Decoder.decodeStream()V: I236 Branch 17 IF_ICMPGT L51 - false
   * Goal 6. Newzgrabber.Base64Decoder.decodeStream()V: I257 Branch 18 IF_ICMPNE L53 - false
   * Goal 7. Newzgrabber.Base64Decoder.decodeStream()V: I273 Branch 19 IF_ICMPNE L55 - false
   * Goal 8. Newzgrabber.Base64Decoder.decodeStream()V: I287 Branch 20 IFGE L65 - true
   * Goal 9. Newzgrabber.Base64Decoder.decodeStream()V: I287 Branch 20 IFGE L65 - false
   * Goal 10. Newzgrabber.Base64Decoder.decodeStream()V: I303 Branch 21 IF_ICMPNE L68 - false
   * Goal 11. Newzgrabber.Base64Decoder.decodeStream()V: I329 Branch 23 IFNE L74 - true
   * Goal 12. Newzgrabber.Base64Decoder.decodeStream()V: I356 Branch 25 IFEQ L80 - false
   * Goal 13. Newzgrabber.Base64Decoder.decodeStream()V: I513 Branch 29 IFEQ L107 - false
   */

  @Test
  public void test1()  throws Throwable  {
      URL uRL0 = ClassLoader.getSystemResource("commons-math3-3.5-javadoc.jar");
      //  // Unstable assertion: assertEquals(-1, uRL0.getPort());
      //  // Unstable assertion: assertNull(uRL0.getRef());
      //  // Unstable assertion: assertNull(uRL0.getUserInfo());
      //  // Unstable assertion: assertEquals(-1, uRL0.getDefaultPort());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getPath());
      //  // Unstable assertion: assertEquals("", uRL0.getHost());
      //  // Unstable assertion: assertNull(uRL0.getAuthority());
      //  // Unstable assertion: assertEquals("jar", uRL0.getProtocol());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getFile());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toString());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toExternalForm());
      //  // Unstable assertion: assertNull(uRL0.getQuery());
      //  // Unstable assertion: assertNotNull(uRL0);
      
      InputStream inputStream0 = MockURL.openStream(uRL0);
      //  // Unstable assertion: assertEquals(-1, uRL0.getPort());
      //  // Unstable assertion: assertNull(uRL0.getRef());
      //  // Unstable assertion: assertNull(uRL0.getUserInfo());
      //  // Unstable assertion: assertEquals(-1, uRL0.getDefaultPort());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getPath());
      //  // Unstable assertion: assertEquals("", uRL0.getHost());
      //  // Unstable assertion: assertNull(uRL0.getAuthority());
      //  // Unstable assertion: assertEquals("jar", uRL0.getProtocol());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getFile());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toString());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toExternalForm());
      //  // Unstable assertion: assertNull(uRL0.getQuery());
      //  // Unstable assertion: assertNotNull(inputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(inputStream0, (int) (byte)127, false);
      //  // Unstable assertion: assertEquals(-1, uRL0.getPort());
      //  // Unstable assertion: assertNull(uRL0.getRef());
      //  // Unstable assertion: assertNull(uRL0.getUserInfo());
      //  // Unstable assertion: assertEquals(-1, uRL0.getDefaultPort());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getPath());
      //  // Unstable assertion: assertEquals("", uRL0.getHost());
      //  // Unstable assertion: assertNull(uRL0.getAuthority());
      //  // Unstable assertion: assertEquals("jar", uRL0.getProtocol());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getFile());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toString());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toExternalForm());
      //  // Unstable assertion: assertNull(uRL0.getQuery());
      //  // Unstable assertion: assertNotNull(bufferedCustomInputStream0);
      
      MockFile mockFile0 = (MockFile)MockFile.createTempFile("commons-math3-3.5-javadoc.jar", "commons-math3-3.5-javadoc.jar");
      //  // Unstable assertion: assertEquals(0L, mockFile0.length());
      //  // Unstable assertion: assertTrue(mockFile0.exists());
      //  // Unstable assertion: assertEquals(0L, mockFile0.getFreeSpace());
      //  // Unstable assertion: assertEquals(1392409281320L, mockFile0.lastModified());
      //  // Unstable assertion: assertEquals("commons-math3-3.5-javadoc.jar0commons-math3-3.5-javadoc.jar", mockFile0.getName());
      //  // Unstable assertion: assertFalse(mockFile0.isDirectory());
      //  // Unstable assertion: assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T", mockFile0.getParent());
      //  // Unstable assertion: assertTrue(mockFile0.isAbsolute());
      //  // Unstable assertion: assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T/commons-math3-3.5-javadoc.jar0commons-math3-3.5-javadoc.jar", mockFile0.toString());
      //  // Unstable assertion: assertEquals(0L, mockFile0.getUsableSpace());
      //  // Unstable assertion: assertFalse(mockFile0.isHidden());
      //  // Unstable assertion: assertTrue(mockFile0.canWrite());
      //  // Unstable assertion: assertTrue(mockFile0.canRead());
      //  // Unstable assertion: assertTrue(mockFile0.isFile());
      //  // Unstable assertion: assertTrue(mockFile0.canExecute());
      //  // Unstable assertion: assertEquals(0L, mockFile0.getTotalSpace());
      //  // Unstable assertion: assertNotNull(mockFile0);
      
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0, false);
      //  // Unstable assertion: assertEquals(0L, mockFile0.length());
      //  // Unstable assertion: assertTrue(mockFile0.exists());
      //  // Unstable assertion: assertEquals(0L, mockFile0.getFreeSpace());
      //  // Unstable assertion: assertEquals(1392409281320L, mockFile0.lastModified());
      //  // Unstable assertion: assertEquals("commons-math3-3.5-javadoc.jar0commons-math3-3.5-javadoc.jar", mockFile0.getName());
      //  // Unstable assertion: assertFalse(mockFile0.isDirectory());
      //  // Unstable assertion: assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T", mockFile0.getParent());
      //  // Unstable assertion: assertTrue(mockFile0.isAbsolute());
      //  // Unstable assertion: assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T/commons-math3-3.5-javadoc.jar0commons-math3-3.5-javadoc.jar", mockFile0.toString());
      //  // Unstable assertion: assertEquals(0L, mockFile0.getUsableSpace());
      //  // Unstable assertion: assertFalse(mockFile0.isHidden());
      //  // Unstable assertion: assertTrue(mockFile0.canWrite());
      //  // Unstable assertion: assertTrue(mockFile0.canRead());
      //  // Unstable assertion: assertTrue(mockFile0.isFile());
      //  // Unstable assertion: assertTrue(mockFile0.canExecute());
      //  // Unstable assertion: assertEquals(0L, mockFile0.getTotalSpace());
      //  // Unstable assertion: assertNotNull(mockFileOutputStream0);
      
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) mockFileOutputStream0);
      //  // Unstable assertion: assertEquals(0L, mockFile0.length());
      //  // Unstable assertion: assertTrue(mockFile0.exists());
      //  // Unstable assertion: assertEquals(0L, mockFile0.getFreeSpace());
      //  // Unstable assertion: assertEquals(1392409281320L, mockFile0.lastModified());
      //  // Unstable assertion: assertEquals("commons-math3-3.5-javadoc.jar0commons-math3-3.5-javadoc.jar", mockFile0.getName());
      //  // Unstable assertion: assertFalse(mockFile0.isDirectory());
      //  // Unstable assertion: assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T", mockFile0.getParent());
      //  // Unstable assertion: assertTrue(mockFile0.isAbsolute());
      //  // Unstable assertion: assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T/commons-math3-3.5-javadoc.jar0commons-math3-3.5-javadoc.jar", mockFile0.toString());
      //  // Unstable assertion: assertEquals(0L, mockFile0.getUsableSpace());
      //  // Unstable assertion: assertFalse(mockFile0.isHidden());
      //  // Unstable assertion: assertTrue(mockFile0.canWrite());
      //  // Unstable assertion: assertTrue(mockFile0.canRead());
      //  // Unstable assertion: assertTrue(mockFile0.isFile());
      //  // Unstable assertion: assertTrue(mockFile0.canExecute());
      //  // Unstable assertion: assertEquals(0L, mockFile0.getTotalSpace());
      //  // Unstable assertion: assertNotNull(filterOutputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) filterOutputStream0);
      //  // Unstable assertion: assertEquals(0L, base64Decoder0.getLineCount());
      //  // Unstable assertion: assertEquals(0L, mockFile0.length());
      //  // Unstable assertion: assertTrue(mockFile0.exists());
      //  // Unstable assertion: assertEquals(0L, mockFile0.getFreeSpace());
      //  // Unstable assertion: assertEquals(1392409281320L, mockFile0.lastModified());
      //  // Unstable assertion: assertEquals("commons-math3-3.5-javadoc.jar0commons-math3-3.5-javadoc.jar", mockFile0.getName());
      //  // Unstable assertion: assertFalse(mockFile0.isDirectory());
      //  // Unstable assertion: assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T", mockFile0.getParent());
      //  // Unstable assertion: assertTrue(mockFile0.isAbsolute());
      //  // Unstable assertion: assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T/commons-math3-3.5-javadoc.jar0commons-math3-3.5-javadoc.jar", mockFile0.toString());
      //  // Unstable assertion: assertEquals(0L, mockFile0.getUsableSpace());
      //  // Unstable assertion: assertFalse(mockFile0.isHidden());
      //  // Unstable assertion: assertTrue(mockFile0.canWrite());
      //  // Unstable assertion: assertTrue(mockFile0.canRead());
      //  // Unstable assertion: assertTrue(mockFile0.isFile());
      //  // Unstable assertion: assertTrue(mockFile0.canExecute());
      //  // Unstable assertion: assertEquals(0L, mockFile0.getTotalSpace());
      //  // Unstable assertion: assertEquals(-1, uRL0.getPort());
      //  // Unstable assertion: assertNull(uRL0.getRef());
      //  // Unstable assertion: assertNull(uRL0.getUserInfo());
      //  // Unstable assertion: assertEquals(-1, uRL0.getDefaultPort());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getPath());
      //  // Unstable assertion: assertEquals("", uRL0.getHost());
      //  // Unstable assertion: assertNull(uRL0.getAuthority());
      //  // Unstable assertion: assertEquals("jar", uRL0.getProtocol());
      //  // Unstable assertion: assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.getFile());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toString());
      //  // Unstable assertion: assertEquals("jar:file:/Users/fabiopalomba/Desktop/dependencies/SmellDetector.jar!/commons-math3-3.5-javadoc.jar", uRL0.toExternalForm());
      //  // Unstable assertion: assertNull(uRL0.getQuery());
      //  // Unstable assertion: assertNotNull(base64Decoder0);
      //  // Unstable assertion: assertFalse(base64Decoder0.ProgressSet);
      //  // Unstable assertion: assertFalse(base64Decoder0.ABORT);
      
      try {
        base64Decoder0.decodeStream();
       //  fail("Expecting exception: IOException");
       // Unstable assertion
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I10 Branch 1 IFEQ L21 - false
   */

  @Test
  public void test2()  throws Throwable  {
      Newzgrabber.verbose = true;
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, 960);
      assertNotNull(bufferedCustomInputStream0);
      
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) pipedOutputStream0);
      assertEquals(0L, base64Decoder0.getLineCount());
      assertNotNull(base64Decoder0);
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
      
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
  }

  //Test case number: 3
  /*
   * 16 covered goals:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I57 Branch 5 IFNE L28 - true
   * Goal 2. Newzgrabber.Base64Decoder.decodeStream()V: I121 Branch 10 IFNE L35 - true
   * Goal 3. Newzgrabber.Base64Decoder.decodeStream()V: I178 Branch 12 IF_ICMPLT L47 - false
   * Goal 4. Newzgrabber.Base64Decoder.decodeStream()V: I184 Branch 13 IF_ICMPGT L47 - true
   * Goal 5. Newzgrabber.Base64Decoder.decodeStream()V: I184 Branch 13 IF_ICMPGT L47 - false
   * Goal 6. Newzgrabber.Base64Decoder.decodeStream()V: I203 Branch 14 IF_ICMPLT L49 - false
   * Goal 7. Newzgrabber.Base64Decoder.decodeStream()V: I209 Branch 15 IF_ICMPGT L49 - false
   * Goal 8. Newzgrabber.Base64Decoder.decodeStream()V: I322 Branch 22 IFNE L72 - false
   * Goal 9. Newzgrabber.Base64Decoder.decodeStream()V: I329 Branch 23 IFNE L74 - false
   * Goal 10. Newzgrabber.Base64Decoder.decodeStream()V: I351 Branch 24 IFEQ L80 - true
   * Goal 11. Newzgrabber.Base64Decoder.decodeStream()V: I351 Branch 24 IFEQ L80 - false
   * Goal 12. Newzgrabber.Base64Decoder.decodeStream()V: I356 Branch 25 IFEQ L80 - true
   * Goal 13. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 26 LOOKUPSWITCH L88 Case 1 - false
   * Goal 14. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 27 LOOKUPSWITCH L88 Case 2 - false
   * Goal 15. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 28 LOOKUPSWITCH L88 Default-Case - true
   * Goal 16. Newzgrabber.Base64Decoder.decodeStream()V: I513 Branch 29 IFEQ L107 - true
   */

  @Test
  public void test3()  throws Throwable  {
      Newzgrabber.IsBatch = true;
      URL uRL0 = ClassLoader.getSystemResource(".");
      assertEquals("/Users/fabiopalomba/Desktop/dependencies/", uRL0.getFile());
      assertEquals("", uRL0.getAuthority());
      assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/", uRL0.toExternalForm());
      assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/", uRL0.toString());
      assertEquals("file", uRL0.getProtocol());
      assertEquals("/Users/fabiopalomba/Desktop/dependencies/", uRL0.getPath());
      assertEquals("", uRL0.getHost());
      assertEquals(-1, uRL0.getPort());
      assertNull(uRL0.getRef());
      assertNull(uRL0.getUserInfo());
      assertEquals(-1, uRL0.getDefaultPort());
      assertNull(uRL0.getQuery());
      assertNotNull(uRL0);
      
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)MockURL.openStream(uRL0);
      assertEquals("/Users/fabiopalomba/Desktop/dependencies/", uRL0.getFile());
      assertEquals("", uRL0.getAuthority());
      assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/", uRL0.toExternalForm());
      assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/", uRL0.toString());
      assertEquals("file", uRL0.getProtocol());
      assertEquals("/Users/fabiopalomba/Desktop/dependencies/", uRL0.getPath());
      assertEquals("", uRL0.getHost());
      assertEquals(-1, uRL0.getPort());
      assertNull(uRL0.getRef());
      assertNull(uRL0.getUserInfo());
      assertEquals(-1, uRL0.getDefaultPort());
      assertNull(uRL0.getQuery());
      assertEquals(652, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) byteArrayInputStream0, (int) (byte)6);
      assertEquals("/Users/fabiopalomba/Desktop/dependencies/", uRL0.getFile());
      assertEquals("", uRL0.getAuthority());
      assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/", uRL0.toExternalForm());
      assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/", uRL0.toString());
      assertEquals("file", uRL0.getProtocol());
      assertEquals("/Users/fabiopalomba/Desktop/dependencies/", uRL0.getPath());
      assertEquals("", uRL0.getHost());
      assertEquals(-1, uRL0.getPort());
      assertNull(uRL0.getRef());
      assertNull(uRL0.getUserInfo());
      assertEquals(-1, uRL0.getDefaultPort());
      assertNull(uRL0.getQuery());
      assertEquals(652, byteArrayInputStream0.available());
      assertNotNull(bufferedCustomInputStream0);
      
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) pipedOutputStream0);
      assertEquals("/Users/fabiopalomba/Desktop/dependencies/", uRL0.getFile());
      assertEquals("", uRL0.getAuthority());
      assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/", uRL0.toExternalForm());
      assertEquals("file:/Users/fabiopalomba/Desktop/dependencies/", uRL0.toString());
      assertEquals("file", uRL0.getProtocol());
      assertEquals("/Users/fabiopalomba/Desktop/dependencies/", uRL0.getPath());
      assertEquals("", uRL0.getHost());
      assertEquals(-1, uRL0.getPort());
      assertNull(uRL0.getRef());
      assertNull(uRL0.getUserInfo());
      assertEquals(-1, uRL0.getDefaultPort());
      assertNull(uRL0.getQuery());
      assertEquals(652, byteArrayInputStream0.available());
      assertEquals(0L, base64Decoder0.getLineCount());
      assertNotNull(base64Decoder0);
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
      
      try {
        base64Decoder0.decodeStream();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
      }
  }

  //Test case number: 4
  /*
   * 23 covered goals:
   * Goal 1. Newzgrabber.Base64Decoder.<init>(LNewzgrabber/BufferedCustomInputStream;Ljava/io/OutputStream;)V: root-Branch
   * Goal 2. Newzgrabber.Base64Decoder.decodeStream()V: I10 Branch 1 IFEQ L21 - true
   * Goal 3. Newzgrabber.Base64Decoder.decodeStream()V: I26 Branch 2 IFNULL L23 - true
   * Goal 4. Newzgrabber.Base64Decoder.decodeStream()V: I26 Branch 2 IFNULL L23 - false
   * Goal 5. Newzgrabber.Base64Decoder.decodeStream()V: I33 Branch 3 IFEQ L25 - true
   * Goal 6. Newzgrabber.Base64Decoder.decodeStream()V: I46 Branch 4 IFEQ L27 - true
   * Goal 7. Newzgrabber.Base64Decoder.decodeStream()V: I57 Branch 5 IFNE L28 - false
   * Goal 8. Newzgrabber.Base64Decoder.decodeStream()V: I74 Branch 6 IFNE L29 - true
   * Goal 9. Newzgrabber.Base64Decoder.decodeStream()V: I85 Branch 7 IFLE L30 - true
   * Goal 10. Newzgrabber.Base64Decoder.decodeStream()V: I98 Branch 8 IF_ICMPGE L31 - true
   * Goal 11. Newzgrabber.Base64Decoder.decodeStream()V: I98 Branch 8 IF_ICMPGE L31 - false
   * Goal 12. Newzgrabber.Base64Decoder.decodeStream()V: I113 Branch 9 IF_ICMPLE L35 - true
   * Goal 13. Newzgrabber.Base64Decoder.decodeStream()V: I113 Branch 9 IF_ICMPLE L35 - false
   * Goal 14. Newzgrabber.Base64Decoder.decodeStream()V: I121 Branch 10 IFNE L35 - false
   * Goal 15. Newzgrabber.Base64Decoder.decodeStream()V: I164 Branch 11 IF_ICMPGE L44 - true
   * Goal 16. Newzgrabber.Base64Decoder.decodeStream()V: I164 Branch 11 IF_ICMPGE L44 - false
   * Goal 17. Newzgrabber.Base64Decoder.decodeStream()V: I178 Branch 12 IF_ICMPLT L47 - true
   * Goal 18. Newzgrabber.Base64Decoder.decodeStream()V: I203 Branch 14 IF_ICMPLT L49 - true
   * Goal 19. Newzgrabber.Base64Decoder.decodeStream()V: I230 Branch 16 IF_ICMPLT L51 - true
   * Goal 20. Newzgrabber.Base64Decoder.decodeStream()V: I257 Branch 18 IF_ICMPNE L53 - true
   * Goal 21. Newzgrabber.Base64Decoder.decodeStream()V: I273 Branch 19 IF_ICMPNE L55 - true
   * Goal 22. Newzgrabber.Base64Decoder.decodeStream()V: I303 Branch 21 IF_ICMPNE L68 - true
   * Goal 23. Newzgrabber.Base64Decoder.decodeStream()V: I322 Branch 22 IFNE L72 - true
   */

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertEquals(10, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) byteArrayInputStream0, (InputStream) byteArrayInputStream0);
      assertEquals(10, byteArrayInputStream0.available());
      assertNotNull(sequenceInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) sequenceInputStream0, (int) (byte)10);
      assertEquals(10, byteArrayInputStream0.available());
      assertNotNull(bufferedCustomInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      byteArray0[1] = (byte)10;
      byteArray0[9] = (byte)10;
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)10;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) pipedOutputStream0);
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals(10, byteArrayInputStream0.available());
      assertNotNull(base64Decoder0);
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
      assertArrayEquals(new byte[] {(byte)0, (byte)10, (byte)0, (byte)10, (byte)10, (byte)0, (byte)0, (byte)0, (byte)0, (byte)10}, byteArray0);
      
      base64Decoder0.decodeStream();
      assertEquals(4L, base64Decoder0.getLineCount());
      assertEquals(0, byteArrayInputStream0.available());
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
      assertArrayEquals(new byte[] {(byte)0, (byte)10, (byte)0, (byte)10, (byte)10, (byte)0, (byte)0, (byte)0, (byte)0, (byte)10}, byteArray0);
  }
}
