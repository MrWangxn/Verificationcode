package ii.cc;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.junit.Test;

//单元，集成，系统，用户验收
public class Jpeg {
		
		@Test
		public void Te() throws FileNotFoundException, IOException {//Code类测试
			Code c = new Code();
			BufferedImage sc = c.getImage();
			Code.output(sc,new FileOutputStream("d://a.jpg"));
			System.out.println(c.getText());
			
		}
}
