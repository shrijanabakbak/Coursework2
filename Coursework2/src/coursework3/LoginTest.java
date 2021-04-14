package coursework3;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.junit.jupiter.api.Test;
class LoginTest {
	@Test
	void test() {
		Login ltest =new Login();
		int result=ltest.userLogin("asdas","asdas");
		assertEquals(1,result);
	}


}		