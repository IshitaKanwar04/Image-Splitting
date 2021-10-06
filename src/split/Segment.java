package split;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Segment {
	
	public static void main(String args[])
	{
		int x,y,w,h,scale=100,num=0;
		try {
			BufferedImage test = ImageIO.read(new File("H:/hp/eclipse/programs/images (1).jpg"));
			
			w = test.getWidth()/scale;
			h = test. getHeight()/scale;
			
			for(y=0;y<h;y++) {
				for(x=0;x<w;x++) {
				
			BufferedImage output = test.getSubimage(x*scale,y*scale,scale,scale);
			File SaveOutput = new File("H:/hp/eclipse/programs/src/Images/sample"+num+".jpg");
			num++;
			
			ImageIO.write(output, "jpg", SaveOutput);
			}
			}
			System.out.println("Done");
		}
		catch(IOException e){
			
			e.printStackTrace();
			
		}
	}
}

