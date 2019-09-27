import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from
 * SimplePicture and allows the student to add functionality to
 * the Picture class.
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture
{
  ///////////////////// constructors //////////////////////////////////

  /**
   * Constructor that takes no arguments
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor
     */
    super();
  }

  /**
   * Constructor that takes a file name and creates the picture
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }

  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }

  /**
   * Constructor that takes a picture and creates a
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }

  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }

  ////////////////////// methods ///////////////////////////////////////

  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() +
      " height " + getHeight()
      + " width " + getWidth();
    return output;

  }

  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }

  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }

  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setGreen(255 - pixelObj.getGreen());
        pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
  }

  public void grayscale()
  {
    Pixel[][] pixels = this.getPixels2D();
    int avg;
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        avg = (int)( (double)( pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue() ) / 3.0 );
        pixelObj.setRed(avg);
        pixelObj.setGreen(avg);
        pixelObj.setBlue(avg);
      }
    }
  }

  public void fixUnderwater()
  {
    Pixel[][] pixels = this.getPixels2D();
    int blue;
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        blue = pixelObj.getBlue();
        if ( blue >= 170 ) {
            blue += 20;
            if ( blue > 255 ) {
                blue = 255;
            }
        }
        pixelObj.setBlue(blue);
      }
    }
  }

  /** Method that mirrors the picture around a
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }

  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel upPixel = null;
    Pixel downPixel = null;
    int length = pixels.length;
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < length / 2; row++)
      {
        upPixel = pixels[row][col];
        downPixel = pixels[length - 1 - row][col];
        downPixel.setColor(upPixel.getColor());
      }
    }
  }

  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel upPixel = null;
    Pixel downPixel = null;
    int length = pixels.length;
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < length / 2; row++)
      {
        upPixel = pixels[row][col];
        downPixel = pixels[length - 1 - row][col];
        upPixel.setColor(downPixel.getColor());
      }
    }
  }
/*
  public void mirrorDiagonal()
  {
      Pixel[][] pixels = this.getPixels2D();
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int width = pixels[0].length;
      for (int row = 0; row < pixels.length; row++)
      {
        for (int col = 0; col < width / 2; col++)
        {
          leftPixel = pixels[row][col];
          rightPixel = pixels[col][row];
          rightPixel.setColor(leftPixel.getColor());
        }
      }
  }
*/
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();

    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
          count++;
        leftPixel = pixels[row][col];
        rightPixel = pixels[row]
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }

  public void mirrorArms()
  {
      int mirrorPoint = 200;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    // loop through the rows
    for (int col = 100; col < 300; col++)
    {
      // loop from 13 to just before the mirror point
      for (int row = 156; row < mirrorPoint; row++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[mirrorPoint - row + mirrorPoint]
                         [col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  public void mirrorGull()
  {
      int startPoint = 230;
    int endPoint = 345;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    // loop through the rows
    for (int row = startPoint; row < endPoint; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = startPoint; col < endPoint; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row]
                         [endPoint - col + endPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic,
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow;
         fromRow < fromPixels.length &&
         toRow < toPixels.length;
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol;
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }

  public void copy(Picture fromPic, int startRow, int endRow, int startCol, int endCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow;
         fromRow < fromPixels.length &&
         toRow < endRow;
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol;
           fromCol < fromPixels[0].length &&
           toCol < endCol;
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    this.copy(flower2,50,100,0,200);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }

  public void myCollage()
  {
      Picture flower1 = new Picture("flower1.jpg");
      Picture flower1NoBlue = new Picture("flower1.jpg");
      flower1NoBlue.zeroBlue();
      Picture flower1Mirrored = new Picture("flower1.jpg");
      flower1Mirrored.mirrorHorizontal();
      this.copy(flower1,20,100,0,100);
      this.copy(flower1NoBlue,100,200,0,100);
      this.copy(flower1Mirrored,200,300,0,100);
      this.write("mycollage.jpg");
  }


  /** Method to show large changes in color
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel lowerPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color lowerColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0;
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        lowerPixel = pixels[row+1][col];
        lowerColor = lowerPixel.getColor();
        if (leftPixel.colorDistance(rightColor) >
            edgeDist || leftPixel.colorDistance(lowerColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  /*
  PMR:
  During making of this edgeDetection function, I encountered several errors.
  Because the directory structure of this folder, I couldn's use my IDE.
  So I used Atom text editor with no real-time error report.
  I first declared upper and lower Pixel, which I later realized was useless, because upperPixel is the same with leftPixel.
  But I declared upperColor and used lowerColor for comparison. So an undeclared error popped up.
  After correcting, an out-of-bound runtime error occured. So I changed the row loop to loop until pixels.length-1.
  Generally, it needs more care.
  */

  public void edgeDetection2(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel lowerPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color lowerColor = null;
    double horizontalGreyscale, verticalGreyscale;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0;
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        lowerPixel = pixels[row+1][col];
        lowerColor = lowerPixel.getColor();
        horizontalGreyscale = (leftPixel.getRed() + leftPixel.getGreen() + leftPixel.getBlue()) / 3.0 - (rightPixel.getRed() + rightPixel.getGreen() + rightPixel.getBlue()) / 3.0;
        verticalGreyscale = (leftPixel.getRed() + leftPixel.getGreen() + leftPixel.getBlue()) / 3.0 - (lowerPixel.getRed() + lowerPixel.getGreen() + lowerPixel.getBlue()) / 3.0;
        if (horizontalGreyscale > (double)edgeDist || verticalGreyscale > (double)edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }

  /* Main method for testing - each class in Java can have a main
   * method
   */
  public static void main(String[] args)
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

} // this } is the end of class Picture, put all new methods before this
