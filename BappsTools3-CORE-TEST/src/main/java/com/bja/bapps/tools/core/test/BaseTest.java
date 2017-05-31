package com.bja.bapps.tools.core.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bja.bappsTools3.dao.BappsDao;



//@ContextConfiguration(locations = {"classpath:/application-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/contextSpring.xml"})
public class BaseTest {

	
}
