/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 15:43:54 GMT 2015
 */

package Newzgrabber;

import static org.junit.Assert.*;
import org.junit.Test;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I46 Branch 4 IFEQ L27 - false
   */

  @Test
  public void test0()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(437);
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      assertNotNull(byteArrayOutputStream0);
      
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)classLoader0.getResourceAsStream(".");
      assertEquals(652, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) byteArrayInputStream0, 437, false);
      assertEquals(652, byteArrayInputStream0.available());
      assertNotNull(bufferedCustomInputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) byteArrayOutputStream0);
      assertEquals(652, byteArrayInputStream0.available());
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
      assertNotNull(base64Decoder0);
      
      base64Decoder0.ABORT = true;
      assertEquals(652, byteArrayInputStream0.available());
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      assertTrue(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
      
      base64Decoder0.decodeStream();
      assertEquals(215, byteArrayInputStream0.available());
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      assertTrue(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I329 Branch 23 IFNE L74 - true
   * Goal 2. Newzgrabber.Base64Decoder.decodeStream()V: I356 Branch 25 IFEQ L80 - false
   * Goal 3. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 26 LOOKUPSWITCH L88 Case 1 - true
   * Goal 4. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 28 LOOKUPSWITCH L88 Default-Case - false
   * Goal 5. Newzgrabber.Base64Decoder.decodeStream()V: I513 Branch 29 IFEQ L107 - false
   */

  @Test
  public void test1()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(435);
      //  // Unstable assertion: assertEquals("", byteArrayOutputStream0.toString());
      //  // Unstable assertion: assertEquals(0, byteArrayOutputStream0.size());
      //  // Unstable assertion: assertNotNull(byteArrayOutputStream0);
      
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      //  // Unstable assertion: assertNotNull(classLoader0);
      
      InputStream inputStream0 = classLoader0.getResourceAsStream("evosuite-0.1.2-SNAPSHOT.jar");
      //  // Unstable assertion: assertNotNull(inputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(inputStream0, 435);
      //  // Unstable assertion: assertNotNull(bufferedCustomInputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) byteArrayOutputStream0);
      //  // Unstable assertion: assertEquals("", byteArrayOutputStream0.toString());
      //  // Unstable assertion: assertEquals(0, byteArrayOutputStream0.size());
      //  // Unstable assertion: assertEquals(0L, base64Decoder0.getLineCount());
      //  // Unstable assertion: assertFalse(base64Decoder0.ProgressSet);
      //  // Unstable assertion: assertFalse(base64Decoder0.ABORT);
      //  // Unstable assertion: assertNotNull(base64Decoder0);
      
      base64Decoder0.decodeStream();
      //  // Unstable assertion: assertEquals(7, byteArrayOutputStream0.size());
      //  // Unstable assertion: assertEquals("\uFFFDf\uFFFD\r\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      //  // Unstable assertion: assertEquals(351L, base64Decoder0.getLineCount());
      //  // Unstable assertion: assertFalse(base64Decoder0.ProgressSet);
      //  // Unstable assertion: assertFalse(base64Decoder0.ABORT);
  }

  //Test case number: 2
  /*
   * 39 covered goals:
   * Goal 1. Newzgrabber.Base64Decoder.<init>(LNewzgrabber/BufferedCustomInputStream;Ljava/io/OutputStream;)V: root-Branch
   * Goal 2. Newzgrabber.Base64Decoder.decodeStream()V: I10 Branch 1 IFEQ L21 - false
   * Goal 3. Newzgrabber.Base64Decoder.decodeStream()V: I26 Branch 2 IFNULL L23 - true
   * Goal 4. Newzgrabber.Base64Decoder.decodeStream()V: I26 Branch 2 IFNULL L23 - false
   * Goal 5. Newzgrabber.Base64Decoder.decodeStream()V: I33 Branch 3 IFEQ L25 - false
   * Goal 6. Newzgrabber.Base64Decoder.decodeStream()V: I46 Branch 4 IFEQ L27 - true
   * Goal 7. Newzgrabber.Base64Decoder.decodeStream()V: I57 Branch 5 IFNE L28 - false
   * Goal 8. Newzgrabber.Base64Decoder.decodeStream()V: I74 Branch 6 IFNE L29 - true
   * Goal 9. Newzgrabber.Base64Decoder.decodeStream()V: I74 Branch 6 IFNE L29 - false
   * Goal 10. Newzgrabber.Base64Decoder.decodeStream()V: I85 Branch 7 IFLE L30 - true
   * Goal 11. Newzgrabber.Base64Decoder.decodeStream()V: I98 Branch 8 IF_ICMPGE L31 - true
   * Goal 12. Newzgrabber.Base64Decoder.decodeStream()V: I113 Branch 9 IF_ICMPLE L35 - false
   * Goal 13. Newzgrabber.Base64Decoder.decodeStream()V: I121 Branch 10 IFNE L35 - true
   * Goal 14. Newzgrabber.Base64Decoder.decodeStream()V: I121 Branch 10 IFNE L35 - false
   * Goal 15. Newzgrabber.Base64Decoder.decodeStream()V: I164 Branch 11 IF_ICMPGE L44 - true
   * Goal 16. Newzgrabber.Base64Decoder.decodeStream()V: I164 Branch 11 IF_ICMPGE L44 - false
   * Goal 17. Newzgrabber.Base64Decoder.decodeStream()V: I178 Branch 12 IF_ICMPLT L47 - true
   * Goal 18. Newzgrabber.Base64Decoder.decodeStream()V: I178 Branch 12 IF_ICMPLT L47 - false
   * Goal 19. Newzgrabber.Base64Decoder.decodeStream()V: I184 Branch 13 IF_ICMPGT L47 - true
   * Goal 20. Newzgrabber.Base64Decoder.decodeStream()V: I184 Branch 13 IF_ICMPGT L47 - false
   * Goal 21. Newzgrabber.Base64Decoder.decodeStream()V: I203 Branch 14 IF_ICMPLT L49 - true
   * Goal 22. Newzgrabber.Base64Decoder.decodeStream()V: I203 Branch 14 IF_ICMPLT L49 - false
   * Goal 23. Newzgrabber.Base64Decoder.decodeStream()V: I209 Branch 15 IF_ICMPGT L49 - false
   * Goal 24. Newzgrabber.Base64Decoder.decodeStream()V: I230 Branch 16 IF_ICMPLT L51 - true
   * Goal 25. Newzgrabber.Base64Decoder.decodeStream()V: I230 Branch 16 IF_ICMPLT L51 - false
   * Goal 26. Newzgrabber.Base64Decoder.decodeStream()V: I236 Branch 17 IF_ICMPGT L51 - false
   * Goal 27. Newzgrabber.Base64Decoder.decodeStream()V: I257 Branch 18 IF_ICMPNE L53 - true
   * Goal 28. Newzgrabber.Base64Decoder.decodeStream()V: I273 Branch 19 IF_ICMPNE L55 - true
   * Goal 29. Newzgrabber.Base64Decoder.decodeStream()V: I303 Branch 21 IF_ICMPNE L68 - true
   * Goal 30. Newzgrabber.Base64Decoder.decodeStream()V: I322 Branch 22 IFNE L72 - true
   * Goal 31. Newzgrabber.Base64Decoder.decodeStream()V: I322 Branch 22 IFNE L72 - false
   * Goal 32. Newzgrabber.Base64Decoder.decodeStream()V: I329 Branch 23 IFNE L74 - false
   * Goal 33. Newzgrabber.Base64Decoder.decodeStream()V: I351 Branch 24 IFEQ L80 - true
   * Goal 34. Newzgrabber.Base64Decoder.decodeStream()V: I351 Branch 24 IFEQ L80 - false
   * Goal 35. Newzgrabber.Base64Decoder.decodeStream()V: I356 Branch 25 IFEQ L80 - true
   * Goal 36. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 26 LOOKUPSWITCH L88 Case 1 - false
   * Goal 37. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 27 LOOKUPSWITCH L88 Case 2 - false
   * Goal 38. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 28 LOOKUPSWITCH L88 Default-Case - true
   * Goal 39. Newzgrabber.Base64Decoder.decodeStream()V: I513 Branch 29 IFEQ L107 - true
   */

  @Test
  public void test2()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(439);
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertNotNull(byteArrayOutputStream0);
      
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)classLoader0.getResourceAsStream(".");
      assertEquals(652, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) byteArrayInputStream0, false);
      assertEquals(652, byteArrayInputStream0.available());
      assertNotNull(bufferedCustomInputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) byteArrayOutputStream0);
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(652, byteArrayInputStream0.available());
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
      assertNotNull(base64Decoder0);
      
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      assertEquals(25L, base64Decoder0.getLineCount());
      assertEquals(9, byteArrayOutputStream0.size());
      assertEquals("\b\uFFFD\u001E\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD,", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayInputStream0.available());
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
  }
}
