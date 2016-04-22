/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 17:15:34 GMT 2015
 */

package org.jcvi.jillion.core.util;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.stanford.nlp.io.ExtensionFileFilter;
import edu.stanford.nlp.io.RegExFileFilter;
import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.jcvi.jillion.core.util.FileIterator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FileIterator_ESTest extends FileIterator_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.util.FileIterator$FileIteratorBuilder.build()Lorg/jcvi/jillion/core/util/FileIterator;: I15 Branch 2 IFEQ L412 - true
   */

  @Test
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.jcvi.jillion.core.util.FileIterator$NullFileFilter.accept(Ljava/io/File;)Z: root-Branch
   * Goal 2. org.jcvi.jillion.core.util.FileIterator$FileIteratorBuilder.build()Lorg/jcvi/jillion/core/util/FileIterator;: I7 Branch 1 IFEQ L411 - false
   * Goal 3. org.jcvi.jillion.core.util.FileIterator$FileIteratorBuilder.build()Lorg/jcvi/jillion/core/util/FileIterator;: I15 Branch 2 IFEQ L412 - false
   */

  @Test
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      assertTrue(fileIterator0.hasNext());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.util.FileIterator.<init>(Ljava/io/File;Ljava/io/FileFilter;)V: I65 Branch 7 IFNONNULL L132 - false
   */

  @Test
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) mockFile0);
      // Undeclared exception!
      try {
        FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.createFileIterator(mockFile0, (FileFilter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // fileFilter can not be null
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.util.FileIterator.<init>(Ljava/io/File;Ljava/io/FileFilter;)V: I10 Branch 5 IFNONNULL L126 - false
   */

  @Test
  public void test03()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder((File) null);
      // Undeclared exception!
      try {
        FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.util.FileIterator.hasNext()Z: I7 Branch 10 IFNULL L181 - true
   * Goal 2. org.jcvi.jillion.core.util.FileIterator.next()Ljava/io/File;: I7 Branch 11 IFNE L186 - false
   */

  @Test
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder((File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      // Undeclared exception!
      try {
        MockFile mockFile1 = (MockFile)fileIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more files
         //
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.util.FileIterator$NonHiddenFileFilter.accept(Ljava/io/File;)Z: I7 Branch 18 IFNE L114 - true
   */

  @Test
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) mockFile0);
      MockFile mockFile1 = (MockFile)MockFile.createTempFile(".wB{!", "");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * Goal 1. org.jcvi.jillion.core.util.FileIterator$BreadthFirstFileIterator.createDirectoryIterator()Ljava/util/Queue;: root-Branch
   * Goal 2. org.jcvi.jillion.core.util.FileIterator$BreadthFirstFileIterator.<init>(Ljava/io/File;Ljava/io/FileFilter;)V: root-Branch
   * Goal 3. org.jcvi.jillion.core.util.FileIterator$BreadthFirstFileIterator.createNewInstance(Ljava/io/File;Ljava/io/FileFilter;)Ljava/util/Iterator;: root-Branch
   * Goal 4. org.jcvi.jillion.core.util.FileIterator$BreadthFirstFileIteratorBuilder.createFileIterator(Ljava/io/File;Ljava/io/FileFilter;)Lorg/jcvi/jillion/core/util/FileIterator;: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertFalse(fileIterator0.hasNext());
  }

  //Test case number: 7
  /*
   * 6 covered goals:
   * Goal 1. org.jcvi.jillion.core.util.FileIterator$DepthFirstFileIterator.createNewInstance(Ljava/io/File;Ljava/io/FileFilter;)Ljava/util/Iterator;: root-Branch
   * Goal 2. org.jcvi.jillion.core.util.FileIterator$NonDirectoryFileFilter.accept(Ljava/io/File;)Z: I7 Branch 17 IFNE L108 - false
   * Goal 3. org.jcvi.jillion.core.util.FileIterator$NonHiddenFileFilter.accept(Ljava/io/File;)Z: I7 Branch 18 IFNE L114 - false
   * Goal 4. org.jcvi.jillion.core.util.FileIterator.getFilesFor(Ljava/io/File;)Ljava/util/Iterator;: I13 Branch 8 IFNONNULL L152 - false
   * Goal 5. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator.getSubdirectoriesFor(Ljava/io/File;)Ljava/util/List;: I12 Branch 12 IFNONNULL L253 - false
   * Goal 6. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator.getNextFile()Ljava/io/File;: I11 Branch 13 IFNONNULL L270 - true
   */

  @Test
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      MockFile mockFile1 = (MockFile)MockFile.createTempFile("B{!", "");
      fileIterator0.setUpInitialState(mockFile1);
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.util.FileIterator.remove()V: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder((File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      // Undeclared exception!
      try {
        fileIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // can not remove
         //
      }
  }

  //Test case number: 9
  /*
   * 36 covered goals:
   * Goal 1. org.jcvi.jillion.core.util.FileIterator$NonRecursiveFileIterator.createNewInstance(Ljava/io/File;Ljava/io/FileFilter;)Ljava/util/Iterator;: root-Branch
   * Goal 2. org.jcvi.jillion.core.util.FileIterator$NonRecursiveFileIterator.<init>(Ljava/io/File;Ljava/io/FileFilter;)V: root-Branch
   * Goal 3. org.jcvi.jillion.core.util.FileIterator$DepthFirstFileIterator.<init>(Ljava/io/File;Ljava/io/FileFilter;)V: root-Branch
   * Goal 4. org.jcvi.jillion.core.util.FileIterator$DepthFirstFileIterator.createDirectoryIterator()Ljava/util/Queue;: root-Branch
   * Goal 5. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator$DirectoryFileFilter.accept(Ljava/io/File;)Z: root-Branch
   * Goal 6. org.jcvi.jillion.core.util.FileIterator.createNonRecursiveFileIteratorBuilder(Ljava/io/File;)Lorg/jcvi/jillion/core/util/FileIterator$FileIteratorBuilder;: root-Branch
   * Goal 7. org.jcvi.jillion.core.util.FileIterator.setUpInitialState(Ljava/io/File;)V: root-Branch
   * Goal 8. org.jcvi.jillion.core.util.FileIterator.updateFileIterator(Ljava/io/File;)V: root-Branch
   * Goal 9. org.jcvi.jillion.core.util.FileIterator.iterator()Ljava/util/Iterator;: root-Branch
   * Goal 10. org.jcvi.jillion.core.util.FileIterator.createBreadthFirstFileIteratorBuilder(Ljava/io/File;)Lorg/jcvi/jillion/core/util/FileIterator$FileIteratorBuilder;: root-Branch
   * Goal 11. org.jcvi.jillion.core.util.FileIterator$BreadthFirstFileIteratorBuilder.<init>(Ljava/io/File;)V: root-Branch
   * Goal 12. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator.<init>(Ljava/io/File;Ljava/io/FileFilter;)V: root-Branch
   * Goal 13. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator.getNextFromSubDir()Ljava/io/File;: root-Branch
   * Goal 14. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator.setUpInitialState(Ljava/io/File;)V: root-Branch
   * Goal 15. org.jcvi.jillion.core.util.FileIterator$NonRecursiveFileIteratorBuilder.<init>(Ljava/io/File;)V: root-Branch
   * Goal 16. org.jcvi.jillion.core.util.FileIterator$NonRecursiveFileIteratorBuilder.createFileIterator(Ljava/io/File;Ljava/io/FileFilter;)Lorg/jcvi/jillion/core/util/FileIterator;: root-Branch
   * Goal 17. org.jcvi.jillion.core.util.FileIterator$FileIteratorBuilder.fileFilter(Ljava/io/FileFilter;)Lorg/jcvi/jillion/core/util/FileIterator$FileIteratorBuilder;: root-Branch
   * Goal 18. org.jcvi.jillion.core.util.FileIterator$FileNameComparator.compare(Ljava/io/File;Ljava/io/File;)I: root-Branch
   * Goal 19. org.jcvi.jillion.core.util.FileIterator$NonDirectoryFileFilter.accept(Ljava/io/File;)Z: I7 Branch 17 IFNE L108 - true
   * Goal 20. org.jcvi.jillion.core.util.FileIterator.<init>(Ljava/io/File;Ljava/io/FileFilter;)V: I38 Branch 6 IFNE L129 - true
   * Goal 21. org.jcvi.jillion.core.util.FileIterator.<init>(Ljava/io/File;Ljava/io/FileFilter;)V: I65 Branch 7 IFNONNULL L132 - true
   * Goal 22. org.jcvi.jillion.core.util.FileIterator.getFilesFor(Ljava/io/File;)Ljava/util/Iterator;: I13 Branch 8 IFNONNULL L152 - true
   * Goal 23. org.jcvi.jillion.core.util.FileIterator.getNextFile()Ljava/io/File;: I8 Branch 9 IFEQ L172 - true
   * Goal 24. org.jcvi.jillion.core.util.FileIterator.getNextFile()Ljava/io/File;: I8 Branch 9 IFEQ L172 - false
   * Goal 25. org.jcvi.jillion.core.util.FileIterator.hasNext()Z: I7 Branch 10 IFNULL L181 - false
   * Goal 26. org.jcvi.jillion.core.util.FileIterator.next()Ljava/io/File;: I7 Branch 11 IFNE L186 - true
   * Goal 27. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator.getSubdirectoriesFor(Ljava/io/File;)Ljava/util/List;: I12 Branch 12 IFNONNULL L253 - true
   * Goal 28. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator.getNextFile()Ljava/io/File;: I11 Branch 13 IFNONNULL L270 - false
   * Goal 29. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator.getNextFile()Ljava/io/File;: I17 Branch 14 IFEQ L270 - true
   * Goal 30. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator.getNextFile()Ljava/io/File;: I17 Branch 14 IFEQ L270 - false
   * Goal 31. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator.hasMoreSubDirs()Z: I8 Branch 15 IFLE L277 - true
   * Goal 32. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator.hasMoreSubDirs()Z: I8 Branch 15 IFLE L277 - false
   * Goal 33. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator.hasMoreSubDirs()Z: I20 Branch 16 IFNE L277 - true
   * Goal 34. org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator.hasMoreSubDirs()Z: I20 Branch 16 IFNE L277 - false
   * Goal 35. org.jcvi.jillion.core.util.FileIterator$FileIteratorBuilder.build()Lorg/jcvi/jillion/core/util/FileIterator;: I41 Branch 3 IFEQ L418 - true
   * Goal 36. org.jcvi.jillion.core.util.FileIterator$FileIteratorBuilder.build()Lorg/jcvi/jillion/core/util/FileIterator;: I74 Branch 4 IFNULL L426 - false
   */

  @Test
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder((File) mockFile0);
      ExtensionFileFilter extensionFileFilter0 = new ExtensionFileFilter("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.fileFilter((FileFilter) extensionFileFilter0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.createFileIterator(mockFile0, extensionFileFilter0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createDepthFirstFileIteratorBuilder((File) mockFile0);
      Iterator<File> iterator0 = fileIterator1.iterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = FileIterator.createBreadthFirstFileIteratorBuilder((File) mockFile0);
      Pattern pattern0 = Pattern.compile("");
      RegExFileFilter regExFileFilter0 = new RegExFileFilter(pattern0);
      MockFile mockFile1 = (MockFile)fileIterator1.next();
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder2.createFileIterator(mockFile1, regExFileFilter0);
      assertNotSame(fileIterator1, fileIterator2);
  }

  //Test case number: 10
  /*
   * 11 covered goals:
   * Goal 1. org.jcvi.jillion.core.util.FileIterator$DepthFirstFileIteratorBuilder.<init>(Ljava/io/File;)V: root-Branch
   * Goal 2. org.jcvi.jillion.core.util.FileIterator$DepthFirstFileIteratorBuilder.createFileIterator(Ljava/io/File;Ljava/io/FileFilter;)Lorg/jcvi/jillion/core/util/FileIterator;: root-Branch
   * Goal 3. org.jcvi.jillion.core.util.FileIterator.createDepthFirstFileIteratorBuilder(Ljava/io/File;)Lorg/jcvi/jillion/core/util/FileIterator$FileIteratorBuilder;: root-Branch
   * Goal 4. org.jcvi.jillion.core.util.FileIterator$FileIteratorBuilder.includeHiddenFiles(Z)Lorg/jcvi/jillion/core/util/FileIterator$FileIteratorBuilder;: root-Branch
   * Goal 5. org.jcvi.jillion.core.util.FileIterator$FileIteratorBuilder.<init>(Ljava/io/File;)V: root-Branch
   * Goal 6. org.jcvi.jillion.core.util.FileIterator$FileIteratorBuilder.includeDirectories(Z)Lorg/jcvi/jillion/core/util/FileIterator$FileIteratorBuilder;: root-Branch
   * Goal 7. org.jcvi.jillion.core.util.FileIterator.<init>(Ljava/io/File;Ljava/io/FileFilter;)V: I10 Branch 5 IFNONNULL L126 - true
   * Goal 8. org.jcvi.jillion.core.util.FileIterator.<init>(Ljava/io/File;Ljava/io/FileFilter;)V: I38 Branch 6 IFNE L129 - false
   * Goal 9. org.jcvi.jillion.core.util.FileIterator$FileIteratorBuilder.build()Lorg/jcvi/jillion/core/util/FileIterator;: I7 Branch 1 IFEQ L411 - true
   * Goal 10. org.jcvi.jillion.core.util.FileIterator$FileIteratorBuilder.build()Lorg/jcvi/jillion/core/util/FileIterator;: I41 Branch 3 IFEQ L418 - false
   * Goal 11. org.jcvi.jillion.core.util.FileIterator$FileIteratorBuilder.build()Lorg/jcvi/jillion/core/util/FileIterator;: I74 Branch 4 IFNULL L426 - true
   */

  @Test
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("[b", "[b");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      // Undeclared exception!
      try {
        FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // rootDir must be a directory
         //
      }
  }
}
