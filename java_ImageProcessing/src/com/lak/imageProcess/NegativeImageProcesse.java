package com.lak.imageProcess;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
        ~~~  Algorithm ~~~~
    Step 1
        - Get the RGB value of the pixel using the getRGB() method.

    Step 2
        - Calculate new RGB values as follows:

        R = 255 – R
        G = 255 – G
        B = 255 – B

    Step 3
        - Replace the values of R, G, and B of the pixel with the values of R, G, and B calculated in the previous step.

    Step 4
        - Repeat Steps 1 to 3 for each pixel of the image.

 */
public class NegativeImageProcesse {

        public static void main(String args[])throws IOException
        {
            BufferedImage image = null;
            File file = null;
            try
            {
                file = new  File("download.jpg");
                image = ImageIO.read(file);
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
            int width = image.getWidth();
            int height = image.getHeight();
            for (int y = 0; y < height; y++)
            {
                for (int x = 0; x < width; x++)
                {
                    int p = image.getRGB(x,y);
                    int a = (p>>24) & 0xff;
                    int r = (p>>16) & 0xff;
                    int g = (p>>8) & 0xff;
                    int b = p & 0xff;
                    r = 255 - r;
                    g = 255 - g;
                    b = 255 - b;
                    p = (a<<24) | (r<<16) | (g<<8) | b;
                    image.setRGB(x, y, p);
                }
            }
            try
            {
                file = new File("negative.jpg");
                ImageIO.write(image, "jpg", file);
                System.out.println("Successfully converted a colored image into a negative image");
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        }
}


