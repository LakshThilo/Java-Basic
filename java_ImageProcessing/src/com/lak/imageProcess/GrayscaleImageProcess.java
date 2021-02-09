package com.lak.imageProcess;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

/**
    Algorithm
        Step 1
            - Get the RGB value of the pixel using the getRGB() method.

        Step 2
            - Find the average of RGB with formula, average = (R + G + B) / 3

        Step 3
            - Replace the R, G and B values of the pixel with the average calculated in the previous step.

        Step 4
            - Repeat Step 1 to Step 3 for each pixel of the image.

 */
public class GrayscaleImageProcess {

    public static void main(String[] args) {

        BufferedImage image = null;
        File file = null;

        try{
            file = new File("download.jpg");
            image = ImageIO.read(file);

        }catch (IOException e){
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
                int avg = (r+g+b)/3;
                p = (a<<24) | (avg<<16) | (avg<<8) | avg;
                image.setRGB(x, y, p);
            }
        }
        try
        {
            file = new File("greyscale.png");
            ImageIO.write(image, "png", file);
            System.out.println("Successfully converted a colored image into a grayscale image");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}