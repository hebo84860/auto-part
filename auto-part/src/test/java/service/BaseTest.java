package service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:/spring/applicationContext-base.xml",
        "classpath:/spring/springmvc-servlet.xml",
})
public class BaseTest extends AbstractJUnit4SpringContextTests {
}
