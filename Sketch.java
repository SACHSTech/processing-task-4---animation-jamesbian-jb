
//import javax.net.ssl.SSLPeerUnverifiedException;
import processing.core.PApplet;

public class Sketch extends PApplet {

  float brightY = 500;
  float brightX = -100;
  float sunSpeedX = 1;
  float sunSpeedY = 1;

  float darkY = 500;
  float darkX = -100;
  float moonspeedX = 1;
  float moonspeedY = 1;

  float red = 138;
  float green = 192;
  float blue = 230;

  float red2 = 138;
  float green2 = 192;
  float blue2 = 230;
  float counter = 1;

  /*
   * Palette:
   * Morning: (138, 192, 230)
   * Sunset: (253, 140, 20)
   * Night: (10, 10, 10)
   */

  public void settings() {
    size(400, 400);
  }

  public void draw() {

    if (counter % 2 == 1) {
      brightX = brightX + sunSpeedX;
      double placeholder;
      placeholder = (0.0025 * (Math.pow(brightX, 2)) + -(brightX) + 150);
      brightY = (float) placeholder;
      background(red, green, blue);

      if ((brightX >= 10) && (brightX < 200)) {
        if (red > 50) {
          red = red - 1;
        }
        if (green > 140) {
          green = green - 1;
        }
        if (blue < 250) {
          blue = blue + 1;
        }
      }

      if ((brightX >= 300) && (brightX < 350)) {
        if (red < 253) {
          red = red + 4;
        }
        if (green < 140) {
          green = green - 6;
        }
        if (blue > 20) {
          blue = blue - 5;
        }
      }

      if (brightX >= 425) {
        if (red >= 10) {
          red = red - 10;
        }
        if (green >= 10) {
          green = green - 10;
        }
        if (blue >= 10) {
          blue = blue - 10;
        }
      }
      // reset
      if (brightX == 500) {
        counter++;
        brightX = -75;
        brightY = 500;
      }
    }

    if (counter % 2 == 0) {

      darkX = darkX + moonspeedX;
      double coordshift2;
      coordshift2 = (0.0025 * (Math.pow(darkX, 2)) + -(darkX) + 150);
      darkY = (float) coordshift2;

      if (darkX <= 400) {
        red2 = 10;
        green2 = 10;
        blue2 = 10;

      }
      background(red2, green2, blue2);

      if (darkX > 400) {
        if (red2 < 140) {
          red2 = red2 + 20;
        }
        if (green2 < 237) {
          green2 = green2 + 20;
        }
        if (blue2 < 250) {
          blue2 = blue2 + 20;
        }
      }

      if (darkX == 500) {
        counter--;
        darkX = -75;
        darkY = 500;
        red = red2;
        green = green2;
        blue = blue2;

      }
    }
    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse(darkX, darkY, 50, 50);
    noStroke();
    fill(red2, green2, blue2);
    ellipse(darkX + 10, darkY, 35, 35);

    stroke(249, 240, 100);
    fill(249, 240, 100);
    ellipse(brightX, brightY, 50, 50);

    fill(131, 101, 57);
    stroke(100);
    rect(0, 300, 400, 300);
  }
}
