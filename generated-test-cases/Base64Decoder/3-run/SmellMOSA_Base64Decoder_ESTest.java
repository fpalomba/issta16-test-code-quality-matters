/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 15:04:35 GMT 2015
 */

package Newzgrabber;

import static org.junit.Assert.*;
import org.junit.Test;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringBufferInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 10 covered goals:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I209 Branch 15 IF_ICMPGT L49 - true
   * Goal 2. Newzgrabber.Base64Decoder.decodeStream()V: I236 Branch 17 IF_ICMPGT L51 - true
   * Goal 3. Newzgrabber.Base64Decoder.decodeStream()V: I257 Branch 18 IF_ICMPNE L53 - false
   * Goal 4. Newzgrabber.Base64Decoder.decodeStream()V: I273 Branch 19 IF_ICMPNE L55 - false
   * Goal 5. Newzgrabber.Base64Decoder.decodeStream()V: I287 Branch 20 IFGE L65 - true
   * Goal 6. Newzgrabber.Base64Decoder.decodeStream()V: I287 Branch 20 IFGE L65 - false
   * Goal 7. Newzgrabber.Base64Decoder.decodeStream()V: I303 Branch 21 IF_ICMPNE L68 - false
   * Goal 8. Newzgrabber.Base64Decoder.decodeStream()V: I329 Branch 23 IFNE L74 - true
   * Goal 9. Newzgrabber.Base64Decoder.decodeStream()V: I356 Branch 25 IFEQ L80 - false
   * Goal 10. Newzgrabber.Base64Decoder.decodeStream()V: I513 Branch 29 IFEQ L107 - false
   */

  @Test
  public void test0()  throws Throwable  {
      InputStream inputStream0 = ClassLoader.getSystemResourceAsStream("stanford-corenlp-3.5.0.jar");
      //  // Unstable assertion: assertNotNull(inputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(inputStream0, false);
      //  // Unstable assertion: assertNotNull(bufferedCustomInputStream0);
      
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
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
      //  // Unstable assertion: assertEquals(3, byteArrayOutputStream0.size());
      //  // Unstable assertion: assertEquals("\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      //  // Unstable assertion: assertEquals(345L, base64Decoder0.getLineCount());
      //  // Unstable assertion: assertFalse(base64Decoder0.ABORT);
      //  // Unstable assertion: assertFalse(base64Decoder0.ProgressSet);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I98 Branch 8 IF_ICMPGE L31 - false
   * Goal 2. Newzgrabber.Base64Decoder.decodeStream()V: I113 Branch 9 IF_ICMPLE L35 - true
   */

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)10;
      byteArray0[2] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertEquals(3, byteArrayInputStream0.available());
      assertArrayEquals(new byte[] {(byte)10, (byte)0, (byte)10}, byteArray0);
      assertNotNull(byteArrayInputStream0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream("u?dE5*c");
      assertNotNull(mockPrintStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) byteArrayInputStream0);
      assertEquals(3, byteArrayInputStream0.available());
      assertArrayEquals(new byte[] {(byte)10, (byte)0, (byte)10}, byteArray0);
      assertNotNull(bufferedCustomInputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) mockPrintStream0);
      assertEquals(3, byteArrayInputStream0.available());
      assertEquals(0L, base64Decoder0.getLineCount());
      assertArrayEquals(new byte[] {(byte)10, (byte)0, (byte)10}, byteArray0);
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
      assertNotNull(base64Decoder0);
      
      base64Decoder0.decodeStream();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(2L, base64Decoder0.getLineCount());
      assertArrayEquals(new byte[] {(byte)10, (byte)0, (byte)10}, byteArray0);
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
  }

  //Test case number: 2
  /*
   * 36 covered goals:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I26 Branch 2 IFNULL L23 - false
   * Goal 2. Newzgrabber.Base64Decoder.decodeStream()V: I33 Branch 3 IFEQ L25 - true
   * Goal 3. Newzgrabber.Base64Decoder.decodeStream()V: I46 Branch 4 IFEQ L27 - true
   * Goal 4. Newzgrabber.Base64Decoder.decodeStream()V: I57 Branch 5 IFNE L28 - false
   * Goal 5. Newzgrabber.Base64Decoder.decodeStream()V: I74 Branch 6 IFNE L29 - true
   * Goal 6. Newzgrabber.Base64Decoder.decodeStream()V: I74 Branch 6 IFNE L29 - false
   * Goal 7. Newzgrabber.Base64Decoder.decodeStream()V: I85 Branch 7 IFLE L30 - true
   * Goal 8. Newzgrabber.Base64Decoder.decodeStream()V: I98 Branch 8 IF_ICMPGE L31 - true
   * Goal 9. Newzgrabber.Base64Decoder.decodeStream()V: I113 Branch 9 IF_ICMPLE L35 - false
   * Goal 10. Newzgrabber.Base64Decoder.decodeStream()V: I121 Branch 10 IFNE L35 - true
   * Goal 11. Newzgrabber.Base64Decoder.decodeStream()V: I121 Branch 10 IFNE L35 - false
   * Goal 12. Newzgrabber.Base64Decoder.decodeStream()V: I164 Branch 11 IF_ICMPGE L44 - true
   * Goal 13. Newzgrabber.Base64Decoder.decodeStream()V: I164 Branch 11 IF_ICMPGE L44 - false
   * Goal 14. Newzgrabber.Base64Decoder.decodeStream()V: I178 Branch 12 IF_ICMPLT L47 - true
   * Goal 15. Newzgrabber.Base64Decoder.decodeStream()V: I178 Branch 12 IF_ICMPLT L47 - false
   * Goal 16. Newzgrabber.Base64Decoder.decodeStream()V: I184 Branch 13 IF_ICMPGT L47 - true
   * Goal 17. Newzgrabber.Base64Decoder.decodeStream()V: I184 Branch 13 IF_ICMPGT L47 - false
   * Goal 18. Newzgrabber.Base64Decoder.decodeStream()V: I203 Branch 14 IF_ICMPLT L49 - true
   * Goal 19. Newzgrabber.Base64Decoder.decodeStream()V: I203 Branch 14 IF_ICMPLT L49 - false
   * Goal 20. Newzgrabber.Base64Decoder.decodeStream()V: I209 Branch 15 IF_ICMPGT L49 - false
   * Goal 21. Newzgrabber.Base64Decoder.decodeStream()V: I230 Branch 16 IF_ICMPLT L51 - true
   * Goal 22. Newzgrabber.Base64Decoder.decodeStream()V: I230 Branch 16 IF_ICMPLT L51 - false
   * Goal 23. Newzgrabber.Base64Decoder.decodeStream()V: I236 Branch 17 IF_ICMPGT L51 - false
   * Goal 24. Newzgrabber.Base64Decoder.decodeStream()V: I257 Branch 18 IF_ICMPNE L53 - true
   * Goal 25. Newzgrabber.Base64Decoder.decodeStream()V: I273 Branch 19 IF_ICMPNE L55 - true
   * Goal 26. Newzgrabber.Base64Decoder.decodeStream()V: I303 Branch 21 IF_ICMPNE L68 - true
   * Goal 27. Newzgrabber.Base64Decoder.decodeStream()V: I322 Branch 22 IFNE L72 - true
   * Goal 28. Newzgrabber.Base64Decoder.decodeStream()V: I322 Branch 22 IFNE L72 - false
   * Goal 29. Newzgrabber.Base64Decoder.decodeStream()V: I329 Branch 23 IFNE L74 - false
   * Goal 30. Newzgrabber.Base64Decoder.decodeStream()V: I351 Branch 24 IFEQ L80 - true
   * Goal 31. Newzgrabber.Base64Decoder.decodeStream()V: I351 Branch 24 IFEQ L80 - false
   * Goal 32. Newzgrabber.Base64Decoder.decodeStream()V: I356 Branch 25 IFEQ L80 - true
   * Goal 33. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 26 LOOKUPSWITCH L88 Case 1 - false
   * Goal 34. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 27 LOOKUPSWITCH L88 Case 2 - false
   * Goal 35. Newzgrabber.Base64Decoder.decodeStream()V: I443 Branch 28 LOOKUPSWITCH L88 Default-Case - true
   * Goal 36. Newzgrabber.Base64Decoder.decodeStream()V: I513 Branch 29 IFEQ L107 - true
   */

  @Test
  public void test2()  throws Throwable  {
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)ClassLoader.getSystemResourceAsStream("");
      assertEquals(652, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) byteArrayInputStream0, false);
      assertEquals(652, byteArrayInputStream0.available());
      assertNotNull(bufferedCustomInputStream0);
      
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertNotNull(byteArrayOutputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) byteArrayOutputStream0);
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals(652, byteArrayInputStream0.available());
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
      assertNotNull(base64Decoder0);
      
      base64Decoder0.decodeStream();
      assertEquals(25L, base64Decoder0.getLineCount());
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(9, byteArrayOutputStream0.size());
      assertEquals("\b\uFFFD\u001E\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD,", byteArrayOutputStream0.toString());
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. Newzgrabber.Base64Decoder.<init>(LNewzgrabber/BufferedCustomInputStream;Ljava/io/OutputStream;)V: root-Branch
   * Goal 2. Newzgrabber.Base64Decoder.decodeStream()V: I10 Branch 1 IFEQ L21 - true
   * Goal 3. Newzgrabber.Base64Decoder.decodeStream()V: I26 Branch 2 IFNULL L23 - true
   */

  @Test
  public void test3()  throws Throwable  {
      StringBufferInputStream stringBufferInputStream0 = new StringBufferInputStream("4Q");
      assertEquals(2, stringBufferInputStream0.available());
      assertNotNull(stringBufferInputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) stringBufferInputStream0);
      assertEquals(2, stringBufferInputStream0.available());
      assertNotNull(bufferedCustomInputStream0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream("4Q");
      assertNotNull(mockPrintStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) mockPrintStream0);
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals(2, stringBufferInputStream0.available());
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
      assertNotNull(base64Decoder0);
      
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals(0, stringBufferInputStream0.available());
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
  }
}
