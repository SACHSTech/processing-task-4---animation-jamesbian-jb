import processing.core.PApplet;

public class Sketch extends PApplet {

  public float circleY = 50;
  public float circleX = 50;
  int darker1 = 305;
  int darker2 = 518;
  int darker3 = 650;

  /*
   * Colours used:
   * Sky Blue: (140, 237, 250)
   * Sunset: (253, 151, 20)
   * Night: (0, 0, 0)
   */

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    int darkconvert1 = 11 * darker1 / 24;
    int darkconvert2 = 11 * darker2 / 24;
    int darkconvert3 = 11 * darker3 / 24;
    boolean moon = false;

    if (moon == false) {
      if ((darkconvert1 > 37) && (darkconvert2 > 145) && (darkconvert3 > 189)) {
        darker1 = darker1 - 1;
        darker2 = darker2 - 1;
        darker3 = darker3 - 1;
      }

      background(darkconvert1, darkconvert2, darkconvert3);
      fill(249, 240, 100);
      ellipse(circleX - 100, circleY + 250, 50, 50);

      if (circleY + 200 > 50) {
        circleY = circleY - 1;
      }

      if (circleY + 200 == 75) {
        circleY = circleY - 0;
      }

      if (circleX > 430) {
        circleY = circleY + 2;

        if ((450 > circleX) && (circleX > 380)) {
          if (darkconvert1 < 253) {
            darker1 = darker1 + 10;
          }
          if (darkconvert3 > 20) {
            darker3 = darker3 - 10;
          }
          if (darkconvert2 > 151) {
            darker2 = darker2 + 10;
          }
        }

        if ((circleX > 450) && (circleX < 480)) {
          if (darkconvert1 < 253) {
            darker1 = darker1 + 8;
          }
          if (darkconvert2 > 151) {
            darker2 = darker2 + 4;
          }
          if (darkconvert3 > 20) {
            darker3 = darker3 - 2;
          }
        }
      }
      if (circleX > 600) {
        darker1 = darker1 - 10;
        darker2 = darker2 - 10;
        darker3 = darker3 - 10;
      }
      circleX = circleX + 1;

      if (circleX > height + 175) {
        circleX = 0;
        circleY = 100;
        moon = true;
      fill(darkconvert1, darkconvert2, darkconvert3);
      stroke(darkconvert1, darkconvert2, darkconvert3);
      ellipse(circleX - 90, circleY + 250, 35, 35);
      if (circleY + 200 > 50) {
        circleY = circleY - 1;
      }

      if (circleY + 200 == 75) {
        circleY = circleY - 0;
      }

      if (circleX > 430) {
        circleY = circleY + 2;
        if (circleY + 200 > 50) {
          circleY = circleY - 1;
        }

        if (circleY + 200 == 75) {
          circleY = circleY - 0;
        }

        if (circleX > 430) {
          circleY = circleY + 2;
          }
        }
      }
    }
  }
}
