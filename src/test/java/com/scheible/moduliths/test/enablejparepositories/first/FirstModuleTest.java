package com.scheible.moduliths.test.enablejparepositories.first;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.moduliths.test.ModuleTest;
import org.moduliths.test.ModuleTest.BootstrapMode;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ModuleTest(mode = BootstrapMode.STANDALONE) // breaks as soon as there is a @ModuleTest annotation
public class FirstModuleTest {
	
	@Test
	public void testContext() {		
	}
}
