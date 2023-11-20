//package day8_JUnitTesting;
//
//import static org.junit.Assert.assertTrue;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.TemporaryFolder;
//
//public class RulesDemo {
//
//	@Rule
//	public TemporaryFolder folder = new TemporaryFolder();
//
//	@Test
//	public void testRule() throws IOException {
//		File cf = folder.newFolder("new folder");
//		File crf = folder.newFile("new file");
//		assertTrue(crf.exists());
//	}
//}
