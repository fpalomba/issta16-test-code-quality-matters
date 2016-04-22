/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 15:13:52 GMT 2015
 */

package Newzgrabber;

import static org.junit.Assert.*;
import org.junit.Test;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
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
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I98 Branch 8 IF_ICMPGE L31 - false
   */

  @Test
  public void test0()  throws Throwable  {
      InputStream inputStream0 = ClassLoader.getSystemResourceAsStream("ejml-0.23.jar");
      //  // Unstable assertion: assertNotNull(inputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(inputStream0);
      //  // Unstable assertion: assertNotNull(bufferedCustomInputStream0);
      
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      //  // Unstable assertion: assertEquals(0, byteArrayOutputStream0.size());
      //  // Unstable assertion: assertEquals("", byteArrayOutputStream0.toString());
      //  // Unstable assertion: assertNotNull(byteArrayOutputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) byteArrayOutputStream0);
      //  // Unstable assertion: assertEquals(0, byteArrayOutputStream0.size());
      //  // Unstable assertion: assertEquals("", byteArrayOutputStream0.toString());
      //  // Unstable assertion: assertEquals(0L, base64Decoder0.getLineCount());
      //  // Unstable assertion: assertFalse(base64Decoder0.ABORT);
      //  // Unstable assertion: assertFalse(base64Decoder0.ProgressSet);
      //  // Unstable assertion: assertNotNull(base64Decoder0);
      
      base64Decoder0.decodeStream();
      //  // Unstable assertion: assertEquals("\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      //  // Unstable assertion: assertEquals(3, byteArrayOutputStream0.size());
      //  // Unstable assertion: assertEquals(462L, base64Decoder0.getLineCount());
      //  // Unstable assertion: assertFalse(base64Decoder0.ABORT);
      //  // Unstable assertion: assertFalse(base64Decoder0.ProgressSet);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I10 Branch 1 IFEQ L21 - false
   */

  @Test
  public void test1()  throws Throwable  {
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null);
      assertNotNull(bufferedCustomInputStream0);
      
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("=.C_&*hlj-/M^:(|,r", true);
      assertNotNull(mockFileOutputStream0);
      
      Newzgrabber.verbose = true;
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) mockFileOutputStream0);
      assertEquals(0L, base64Decoder0.getLineCount());
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
      assertNotNull(base64Decoder0);
      
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I26 Branch 2 IFNULL L23 - true
   */

  @Test
  public void test2()  throws Throwable  {
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null);
      assertNotNull(bufferedCustomInputStream0);
      
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("After SQ flattening:              ", true);
      assertNotNull(mockFileOutputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) mockFileOutputStream0);
      assertEquals(0L, base64Decoder0.getLineCount());
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
      assertNotNull(base64Decoder0);
      
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
  }

  //Test case number: 3
  /*
   * 50 covered goals:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I10 Branch 1 IFEQ L21 - true
   * Goal 2. Newzgrabber.Base64Decoder.decodeStream()V: I26 Branch 2 IFNULL L23 - false
   * Goal 3. Newzgrabber.Base64Decoder.decodeStream()V: I33 Branch 3 IFEQ L25 - true
   * Goal 4. Newzgrabber.Base64Decoder.decodeStream()V: I46 Branch 4 IFEQ L27 - true
   * Goal 5. Newzgrabber.Base64Decoder.decodeStream()V: I57 Branch 5 IFNE L28 - false
   * Goal 6. Newzgrabber.Base64Decoder.decodeStream()V: I74 Branch 6 IFNE L29 - true
   * Goal 7. Newzgrabber.Base64Decoder.decodeStream()V: I74 Branch 6 IFNE L29 - false
   * Goal 8. Newzgrabber.Base64Decoder.decodeStream()V: I85 Branch 7 IFLE L30 - true
   * Goal 9. Newzgrabber.Base64Decoder.decodeStream()V: I98 Branch 8 IF_ICMPGE L31 - true
   * Goal 10. Newzgrabber.Base64Decoder.decodeStream()V: I113 Branch 9 IF_ICMPLE L35 - true
   * Goal 11. Newzgrabber.Base64Decoder.decodeStream()V: I113 Branch 9 IF_ICMPLE L35 - false
   * Goal 12. Newzgrabber.Base64Decoder.decodeStream()V: I121 Branch 10 IFNE L35 - true
   * Goal 13. Newzgrabber.Base64Decoder.decodeStream()V: I121 Branch 10 IFNE L35 - false
   * Goal 14. Newzgrabber.Base64Decoder.decodeStream()V: I164 Branch 11 IF_ICMPGE L44 - true
   * Goal 15. Newzgrabber.Base64Decoder.decodeStream()V: I164 Branch 11 IF_ICMPGE L44 - false
   * Goal 16. Newzgrabber.Base64Decoder.decodeStream()V: I178 Branch 12 IF_ICMPLT L47 - true
   * Goal 17. Newzgrabber.Base64Decoder.decodeStream()V: I178 Branch 12 IF_ICMPLT L47 - false
   * Goal 18. Newzgrabber.Base64Decoder.decodeStream()V: I184 Branch 13 IF_ICMPGT L47 - true
   * Goal 19. Newzgrabber.Base64Decoder.decodeStream()V: I184 Branch 13 IF_ICMPGT L47 - false
   * Goal 20. Newzgrabber.Base64Decoder.decodeStream()V: I203 Branch 14 IF_ICMPLT L49 - true
   * Goal 21. Newzgrabber.Base64Decoder.decodeStream()V: I203 Branch 14 IF_ICMPLT L49 - false
   * Goal 22. Newzgrabber.Base64Decoder.decodeStream()V: I209 Branch 15 IF_ICMPGT L49 - true
   * Goal 23. Newzgrabber.Base64Decoder.decodeStream()V: I209 Branch 15 IF_ICMPGT L49 - false
   * Goal 24. Newzgrabber.Base64Decoder.decodeStream()V: I230 Branch 16 IF_ICMPLT L51 - true
   * Goal 25. Newzgrabber.Base64Decoder.decodeStream()V: I230 Branch 16 IF_ICMPLT L51 - false
   * Goal 26. Newzgrabber.Base64Decoder.decodeStream()V: I236 Branch 17 IF_ICMPGT L51 - true
   * Goal 27. Newzgrabber.Base64Decoder.decodeStream()V: I236 Branch 17 IF_ICMPGT L51 - false
   * Goal 28. Newzgrabber.Base64Decoder.decodeStream()V: I257 Branch 18 IF_ICMPNE L53 - true
   * Goal 29. Newzgrabber.Base64Decoder.decodeStream()V: I257 Branch 18 IF_ICMPNE L53 - false
   * Goal 30. Newzgrabber.Base64Decoder.decodeStream()V: I273 Branch 19 IF_ICMPNE L55 - true
   * Goal 31. Newzgrabber.Base64Decoder.decodeStream()V: I273 Branch 19 IF_ICMPNE L55 - false
   * Goal 32. Newzgrabber.Base64Decoder.decodeStream()V: I287 Branch 20 IFGE L65 - true
   * Goal 33. Newzgrabber.Base64Decoder.decodeStream()V: I287 Branch 20 IFGE L65 - false
   * Goal 34. Newzgrabber.Base64Decoder.decodeStream()V: I303 Branch 21 IF_ICMPNE L68 - true
   * Goal 35. Newzgrabber.Base64Decoder.decodeStream()V: I303 Branch 21 IF_ICMPNE L68 - false
   * Goal 36. Newzgrabber.Base64Decoder.decodeStream()V: I322 Branch 22 IFNE L72 - true
   * Goal 37. Newzgrabber.Base64Decoder.decodeStream()V: I322 Branch 22 IFNE L72 - false
   * Goal 38. Newzgrabber.Base64Decoder.decodeStream()V: I329 Branch 23 IFNE L74 - true
   * Goal 39. Newzgrabber.Base64Decoder.decodeStream()V: I329 Branch 23 IFNE L74 - false
   * Goal 40. Newzgrabber.Base64Decoder.decodeStream()V: I351 Branch 24 IFEQ L80 - true
   * Goal 41. Newzgrabber.Base64Decoder.decodeStream()V: I351 Branch 24 IFEQ L80 - false
   * Goal 42. Newzgrabber.Base64Decoder.decodeStream()V: I356 Branch 25 IFEQ L80 - true
   * Goal 43. Newzgrabber.Base64Decoder.decodeStream()V: I356 Branch 25 IFEQ L80 - false
   * Goal 44. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 26 LOOKUPSWITCH L88 Case 1 - true
   * Goal 45. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 26 LOOKUPSWITCH L88 Case 1 - false
   * Goal 46. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 27 LOOKUPSWITCH L88 Case 2 - false
   * Goal 47. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 28 LOOKUPSWITCH L88 Default-Case - true
   * Goal 48. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 28 LOOKUPSWITCH L88 Default-Case - false
   * Goal 49. Newzgrabber.Base64Decoder.decodeStream()V: I513 Branch 29 IFEQ L107 - true
   * Goal 50. Newzgrabber.Base64Decoder.decodeStream()V: I513 Branch 29 IFEQ L107 - false
   */

  @Test
  public void test3()  throws Throwable  {
      InputStream inputStream0 = ClassLoader.getSystemResourceAsStream("evosuite-0.1.2-SNAPSHOT.jar");
      assertNotNull(inputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(inputStream0);
      assertNotNull(bufferedCustomInputStream0);
      
      MockFile mockFile0 = (MockFile)MockFile.createTempFile("evosuite-0.1.2-SNAPSHOT.jar", "evosuite-0.1.2-SNAPSHOT.jar");
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.isAbsolute());
      assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T", mockFile0.getParent());
      assertFalse(mockFile0.isDirectory());
      assertEquals("evosuite-0.1.2-SNAPSHOT.jar0evosuite-0.1.2-SNAPSHOT.jar", mockFile0.getName());
      assertTrue(mockFile0.canWrite());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.exists());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.length());
      assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T/evosuite-0.1.2-SNAPSHOT.jar0evosuite-0.1.2-SNAPSHOT.jar", mockFile0.toString());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canRead());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertNotNull(mockFile0);
      
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0, false);
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.isAbsolute());
      assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T", mockFile0.getParent());
      assertFalse(mockFile0.isDirectory());
      assertEquals("evosuite-0.1.2-SNAPSHOT.jar0evosuite-0.1.2-SNAPSHOT.jar", mockFile0.getName());
      assertTrue(mockFile0.canWrite());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.exists());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.length());
      assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T/evosuite-0.1.2-SNAPSHOT.jar0evosuite-0.1.2-SNAPSHOT.jar", mockFile0.toString());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canRead());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertNotNull(mockFileOutputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) mockFileOutputStream0);
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.isAbsolute());
      assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T", mockFile0.getParent());
      assertFalse(mockFile0.isDirectory());
      assertEquals("evosuite-0.1.2-SNAPSHOT.jar0evosuite-0.1.2-SNAPSHOT.jar", mockFile0.getName());
      assertTrue(mockFile0.canWrite());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.exists());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.length());
      assertEquals("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T/evosuite-0.1.2-SNAPSHOT.jar0evosuite-0.1.2-SNAPSHOT.jar", mockFile0.toString());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canRead());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals(0L, base64Decoder0.getLineCount());
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
      assertNotNull(base64Decoder0);
      
      try {
        base64Decoder0.decodeStream();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. Newzgrabber.Base64Decoder.<init>(LNewzgrabber/BufferedCustomInputStream;Ljava/io/OutputStream;)V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null);
      assertNotNull(bufferedCustomInputStream0);
      
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("After SQ flattening:              ", false);
      assertNotNull(mockFileOutputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) mockFileOutputStream0);
      assertEquals(0L, base64Decoder0.getLineCount());
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
      assertNotNull(base64Decoder0);
  }
}
