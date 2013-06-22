package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 1; i <= 200; i++)
    {
      adjustPen();
      Tortoise.move(i);
      Tortoise.turn(360 / 5);
      Tortoise.turn(1);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    int penWidth = 1;
    penWidth++;
    if (4 < penWidth)
    {
      penWidth = 1;
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Colors.Blues.SteelBlue);
    ColorWheel.addColor(Colors.Purples.Orchid);
    ColorWheel.addColor(Colors.Blues.SlateBlue);
    ColorWheel.addColor(Colors.Blues.Teal);
    ColorWheel.addColor(Colors.Purples.Indigo);
  }
}
