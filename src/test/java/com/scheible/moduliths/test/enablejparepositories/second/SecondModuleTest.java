package com.scheible.moduliths.test.enablejparepositories.second;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.moduliths.test.ModuleTest;
import org.moduliths.test.ModuleTest.BootstrapMode;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ModuleTest(mode = BootstrapMode.DIRECT_DEPENDENCIES)
public class SecondModuleTest {
	
	@Test
	public void testContext() {		
	}
}
