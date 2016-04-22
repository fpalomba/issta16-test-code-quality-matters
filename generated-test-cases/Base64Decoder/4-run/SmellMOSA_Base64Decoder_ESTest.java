/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 15:06:48 GMT 2015
 */

package Newzgrabber;

import static org.junit.Assert.*;
import org.junit.Test;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.LineNumberInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
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
   * 1 covered goal:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I121 Branch 10 IFNE L35 - true
   */

  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)0, (int) (byte)10);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)10, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(10, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) byteArrayInputStream0, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)10, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(10, byteArrayInputStream0.available());
      assertNotNull(bufferedCustomInputStream0);
      
      PrintStream printStream0 = DebugGraphics.logStream();
      assertNotNull(printStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) printStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)10, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals(10, byteArrayInputStream0.available());
      assertNotNull(base64Decoder0);
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
      
      base64Decoder0.decodeStream();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)10, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(1L, base64Decoder0.getLineCount());
      assertEquals(0, byteArrayInputStream0.available());
      assertFalse(base64Decoder0.ABORT);
      assertFalse(base64Decoder0.ProgressSet);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I10 Branch 1 IFEQ L21 - false
   */

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)0, (int) (byte)0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(0, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      
      LineNumberInputStream lineNumberInputStream0 = new LineNumberInputStream((InputStream) byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(0, lineNumberInputStream0.getLineNumber());
      assertEquals(0, byteArrayInputStream0.available());
      assertNotNull(lineNumberInputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) lineNumberInputStream0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(0, lineNumberInputStream0.getLineNumber());
      assertEquals(0, byteArrayInputStream0.available());
      assertNotNull(bufferedCustomInputStream0);
      
      Newzgrabber.verbose = true;
      MockFile mockFile0 = new MockFile(".oYgGy?A5");
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(".oYgGy?A5", mockFile0.getName());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.exists());
      assertFalse(mockFile0.isDirectory());
      assertFalse(mockFile0.canWrite());
      assertFalse(mockFile0.canExecute());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(0L, mockFile0.lastModified());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.isHidden());
      assertFalse(mockFile0.canRead());
      assertEquals(".oYgGy?A5", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertNull(mockFile0.getParent());
      assertNotNull(mockFile0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertTrue(mockFile0.exists());
      assertEquals(".oYgGy?A5", mockFile0.getName());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.canExecute());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.isHidden());
      assertEquals(".oYgGy?A5", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertNull(mockFile0.getParent());
      assertNotNull(mockPrintStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) mockPrintStream0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(0, lineNumberInputStream0.getLineNumber());
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertTrue(mockFile0.exists());
      assertEquals(".oYgGy?A5", mockFile0.getName());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.canExecute());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.isHidden());
      assertEquals(".oYgGy?A5", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertNull(mockFile0.getParent());
      assertNotNull(base64Decoder0);
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
      
      base64Decoder0.decodeStream();
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(0, lineNumberInputStream0.getLineNumber());
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertTrue(mockFile0.exists());
      assertEquals(".oYgGy?A5", mockFile0.getName());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.canExecute());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.isHidden());
      assertEquals(".oYgGy?A5", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertNull(mockFile0.getParent());
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I98 Branch 8 IF_ICMPGE L31 - false
   */

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)0, (int) (byte)10);
      assertArrayEquals(new byte[] {(byte)0, (byte)10, (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      
      LineNumberInputStream lineNumberInputStream0 = new LineNumberInputStream((InputStream) byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)10, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, lineNumberInputStream0.getLineNumber());
      assertEquals(4, byteArrayInputStream0.available());
      assertNotNull(lineNumberInputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) lineNumberInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)10, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, lineNumberInputStream0.getLineNumber());
      assertEquals(4, byteArrayInputStream0.available());
      assertNotNull(bufferedCustomInputStream0);
      
      int int0 = byteArrayInputStream0.read();
      assertArrayEquals(new byte[] {(byte)0, (byte)10, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, int0);
      assertEquals(3, byteArrayInputStream0.available());
      
      MockFile mockFile0 = new MockFile("`)p}DTXhv\"2.J");
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.canExecute());
      assertNull(mockFile0.getParent());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals("`)p}DTXhv\"2.J", mockFile0.toString());
      assertFalse(mockFile0.canRead());
      assertFalse(mockFile0.exists());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals(0L, mockFile0.lastModified());
      assertTrue(mockFile0.isFile());
      assertFalse(mockFile0.canWrite());
      assertEquals("`)p}DTXhv\"2.J", mockFile0.getName());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.isDirectory());
      assertNotNull(mockFile0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      assertEquals(0L, mockFile0.length());
      assertTrue(mockFile0.exists());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertNull(mockFile0.getParent());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals("`)p}DTXhv\"2.J", mockFile0.toString());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertEquals("`)p}DTXhv\"2.J", mockFile0.getName());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.isDirectory());
      assertNotNull(mockPrintStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) mockPrintStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)10, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, lineNumberInputStream0.getLineNumber());
      assertEquals(0L, mockFile0.length());
      assertTrue(mockFile0.exists());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertNull(mockFile0.getParent());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals("`)p}DTXhv\"2.J", mockFile0.toString());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertEquals("`)p}DTXhv\"2.J", mockFile0.getName());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.isDirectory());
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals(3, byteArrayInputStream0.available());
      assertNotNull(base64Decoder0);
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
      
      base64Decoder0.decodeStream();
      assertArrayEquals(new byte[] {(byte)0, (byte)10, (byte)0, (byte)0}, byteArray0);
      assertEquals(1, lineNumberInputStream0.getLineNumber());
      assertEquals(0L, mockFile0.length());
      assertTrue(mockFile0.exists());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertNull(mockFile0.getParent());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals("`)p}DTXhv\"2.J", mockFile0.toString());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertEquals("`)p}DTXhv\"2.J", mockFile0.getName());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.isDirectory());
      assertEquals(1L, base64Decoder0.getLineCount());
      assertEquals(0, byteArrayInputStream0.available());
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. Newzgrabber.Base64Decoder.decodeStream()V: I57 Branch 5 IFNE L28 - true
   * Goal 2. Newzgrabber.Base64Decoder.decodeStream()V: I113 Branch 9 IF_ICMPLE L35 - true
   */

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)10;
      Newzgrabber.IsBatch = true;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)0, (int) (byte)10);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)10, (byte)0}, byteArray0);
      assertEquals(4, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      
      LineNumberInputStream lineNumberInputStream0 = new LineNumberInputStream((InputStream) byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)10, (byte)0}, byteArray0);
      assertEquals(0, lineNumberInputStream0.getLineNumber());
      assertEquals(4, byteArrayInputStream0.available());
      assertNotNull(lineNumberInputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) lineNumberInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)10, (byte)0}, byteArray0);
      assertEquals(0, lineNumberInputStream0.getLineNumber());
      assertEquals(4, byteArrayInputStream0.available());
      assertNotNull(bufferedCustomInputStream0);
      
      int int0 = byteArrayInputStream0.read();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)10, (byte)0}, byteArray0);
      assertEquals(0, int0);
      assertEquals(3, byteArrayInputStream0.available());
      
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((int) (byte)10);
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertNotNull(byteArrayOutputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) byteArrayOutputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)10, (byte)0}, byteArray0);
      assertEquals(0, lineNumberInputStream0.getLineNumber());
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals(3, byteArrayInputStream0.available());
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertNotNull(base64Decoder0);
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
      
      base64Decoder0.decodeStream();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)10, (byte)0}, byteArray0);
      assertEquals(1, lineNumberInputStream0.getLineNumber());
      assertEquals(0L, base64Decoder0.getLineCount());
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
  }

  //Test case number: 4
  /*
   * 27 covered goals:
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
   * Goal 11. Newzgrabber.Base64Decoder.decodeStream()V: I113 Branch 9 IF_ICMPLE L35 - false
   * Goal 12. Newzgrabber.Base64Decoder.decodeStream()V: I121 Branch 10 IFNE L35 - false
   * Goal 13. Newzgrabber.Base64Decoder.decodeStream()V: I164 Branch 11 IF_ICMPGE L44 - true
   * Goal 14. Newzgrabber.Base64Decoder.decodeStream()V: I164 Branch 11 IF_ICMPGE L44 - false
   * Goal 15. Newzgrabber.Base64Decoder.decodeStream()V: I178 Branch 12 IF_ICMPLT L47 - true
   * Goal 16. Newzgrabber.Base64Decoder.decodeStream()V: I178 Branch 12 IF_ICMPLT L47 - false
   * Goal 17. Newzgrabber.Base64Decoder.decodeStream()V: I184 Branch 13 IF_ICMPGT L47 - true
   * Goal 18. Newzgrabber.Base64Decoder.decodeStream()V: I203 Branch 14 IF_ICMPLT L49 - true
   * Goal 19. Newzgrabber.Base64Decoder.decodeStream()V: I203 Branch 14 IF_ICMPLT L49 - false
   * Goal 20. Newzgrabber.Base64Decoder.decodeStream()V: I209 Branch 15 IF_ICMPGT L49 - true
   * Goal 21. Newzgrabber.Base64Decoder.decodeStream()V: I230 Branch 16 IF_ICMPLT L51 - true
   * Goal 22. Newzgrabber.Base64Decoder.decodeStream()V: I230 Branch 16 IF_ICMPLT L51 - false
   * Goal 23. Newzgrabber.Base64Decoder.decodeStream()V: I236 Branch 17 IF_ICMPGT L51 - true
   * Goal 24. Newzgrabber.Base64Decoder.decodeStream()V: I257 Branch 18 IF_ICMPNE L53 - true
   * Goal 25. Newzgrabber.Base64Decoder.decodeStream()V: I273 Branch 19 IF_ICMPNE L55 - true
   * Goal 26. Newzgrabber.Base64Decoder.decodeStream()V: I303 Branch 21 IF_ICMPNE L68 - true
   * Goal 27. Newzgrabber.Base64Decoder.decodeStream()V: I322 Branch 22 IFNE L72 - true
   */

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[4] = (byte) (-89);
      byteArray0[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte) (-89), (byte)10, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(10, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte) (-89), (byte)10, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(10, byteArrayInputStream0.available());
      assertNotNull(bufferedCustomInputStream0);
      
      int int0 = byteArrayInputStream0.read();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte) (-89), (byte)10, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, int0);
      assertEquals(9, byteArrayInputStream0.available());
      
      MockFile mockFile0 = new MockFile("P$!,4");
      assertEquals("P$!,4", mockFile0.getName());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertFalse(mockFile0.exists());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.canRead());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertFalse(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertFalse(mockFile0.isHidden());
      assertEquals("P$!,4", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals(0L, mockFile0.lastModified());
      assertFalse(mockFile0.canWrite());
      assertNull(mockFile0.getParent());
      assertNotNull(mockFile0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      assertEquals("P$!,4", mockFile0.getName());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.exists());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.isFile());
      assertFalse(mockFile0.isHidden());
      assertEquals("P$!,4", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertTrue(mockFile0.canExecute());
      assertNull(mockFile0.getParent());
      assertNotNull(mockPrintStream0);
      
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) mockPrintStream0);
      assertEquals("P$!,4", mockFile0.getName());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.exists());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.isFile());
      assertFalse(mockFile0.isHidden());
      assertEquals("P$!,4", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertTrue(mockFile0.canExecute());
      assertNull(mockFile0.getParent());
      assertNotNull(bufferedOutputStream0);
      
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) bufferedOutputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte) (-89), (byte)10, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(9, byteArrayInputStream0.available());
      assertEquals("P$!,4", mockFile0.getName());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.exists());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.isFile());
      assertFalse(mockFile0.isHidden());
      assertEquals("P$!,4", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertTrue(mockFile0.canExecute());
      assertNull(mockFile0.getParent());
      assertEquals(0L, base64Decoder0.getLineCount());
      assertNotNull(base64Decoder0);
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
      
      base64Decoder0.decodeStream();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte) (-89), (byte)10, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals("P$!,4", mockFile0.getName());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.exists());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.isFile());
      assertFalse(mockFile0.isHidden());
      assertEquals("P$!,4", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertTrue(mockFile0.canExecute());
      assertNull(mockFile0.getParent());
      assertEquals(1L, base64Decoder0.getLineCount());
      assertFalse(base64Decoder0.ProgressSet);
      assertFalse(base64Decoder0.ABORT);
  }
}