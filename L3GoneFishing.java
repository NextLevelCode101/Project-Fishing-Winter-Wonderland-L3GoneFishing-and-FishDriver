import javax.swing.*;
import java.awt.*;

public class L3GoneFishing extends JPanel {
	public void paintComponent(Graphics g) {
		
        g.setColor(new Color(255, 165, 0)); // Orange
        g.fillRect(0, 0, 2000, 1045); // Background
        
        Color sunColor = new Color(255, 215, 0); // Gold
        g.setColor(sunColor);
        g.fillOval(510, 0, 900, 900);//Sun
        
        g.setColor(new Color(65, 105, 225)); // Ocean Blue
        g.fillRect(0, 610, 2000, 400);//Ocean
        
        g.setColor(new Color(252,208,70)); // SAND
        g.fillRect(1700, 610, 300, 400);//sand

        g.setColor(Color.BLACK); // White

        g.fillRect(815, 130, 35, 370);//SAIL LINE
        
        //Tree
        Color Brown = new Color(101, 67, 33);
        g.setColor(Brown);
        g.fillRect(1830, 260, 50, 350);
        Color leafGreen = new Color (0, 102, 0);
        g.setColor(leafGreen); // Green color for leaves
        g.fillOval(1750, 170, 120, 120); // Draw leafy top
        g.fillOval(1800, 100, 120, 120);
        g.fillOval(1850, 170, 120, 120);
        
        //FISH 1
        
     // Body: Light blue with dark blue spots
        g.setColor(new Color(173, 216, 230)); // Light blue
        g.fillOval(200, 800, 100, 50); // Body

        // Draw fish eye
        g.setColor(Color.WHITE); // White
        g.fillOval(210, 815, 20, 15); // Eye
        g.setColor(Color.BLACK); // Black
        g.fillOval(213, 818, 10, 10); // Pupil

        // Fin
        g.setColor(new Color(173, 216, 230)); // Light blue
        int[] finX = {300, 320, 320}; // X coordinates of triangle vertices
        int[] finY = {825, 805, 845}; // Y coordinates of triangle vertices
        g.fillPolygon(finX, finY, 3); // Fin

        // Gills
        g.setColor(Color.BLACK); // Black
        g.drawLine(235, 815, 245, 835); // First gill
        g.drawLine(255, 815, 265, 835); // Second gill
        g.drawLine(275, 815, 285, 835); // Third gill

      //FISH 2
        
     // Body: Light blue with dark blue spots
        g.setColor(new Color(144, 238, 144)); // Light blue
        g.fillOval(700, 800, 100, 50); // Body

        // Draw fish eye
        g.setColor(Color.WHITE); // White
        g.fillOval(710, 815, 20, 15); // Eye
        g.setColor(Color.BLACK); // Black
        g.fillOval(713, 818, 10, 10); // Pupil

        // Fin
        g.setColor(new Color(144, 238, 144)); // Light blue
        int[] fin1X = {800, 820, 820}; // X coordinates of triangle vertices
        int[] fin2Y = {825, 805, 845}; // Y coordinates of triangle vertices
        g.fillPolygon(fin1X, fin2Y, 3); // Fin

        // Gills
        g.setColor(Color.BLACK); // Black
        g.drawLine(735, 815, 745, 835); // First gill
        g.drawLine(755, 815, 765, 835); // Second gill
        g.drawLine(775, 815, 785, 835); // Third gill
        
      //FISH 3

     // Body: Light blue with dark blue spots
     g.setColor(new Color(255, 182, 193)); // Light blue
     g.fillOval(1200 + 500 - 300 - 200, 800, 100, 50); // Body, adjusted x-coordinate

     // Draw fish eye
     g.setColor(Color.WHITE); // White
     g.fillOval(1210 + 500 - 300 - 200, 815, 20, 15); // Eye, adjusted x-coordinate
     g.setColor(Color.BLACK); // Black
     g.fillOval(1213 + 500 - 300 - 200, 818, 10, 10); // Pupil, adjusted x-coordinate

     // Fin
     g.setColor(new Color(255, 182, 193)); // Light blue
     int[] fin3X = {1300 + 500 - 300 - 200, 1320 + 500 - 300 - 200, 1320 + 500 - 300 - 200}; // X coordinates of triangle vertices, adjusted
     int[] fin3Y = {825, 805, 845}; // Y coordinates of triangle vertices
     g.fillPolygon(fin3X, fin3Y, 3); // Fin

     // Gills
     g.setColor(Color.BLACK); // Black
     g.drawLine(1235 + 500 - 300 - 200, 815, 1245 + 500 - 300 - 200, 835); // First gill, adjusted x-coordinate
     g.drawLine(1255 + 500 - 300 - 200, 815, 1265 + 500 - 300 - 200, 835); // Second gill, adjusted x-coordinate
     g.drawLine(1275 + 500 - 300 - 200, 815, 1285 + 500 - 300 - 200, 835); // Third gill, adjusted x-coordinate


        
     	// FISH 4
	  // Body: Light blue with dark blue spots
	     g.setColor(new Color(255, 255, 153)); // Light blue
	     g.fillOval(200 + 100, 800 - 200 + 15, 100, 50); // Body, adjusted Y coordinate

	     // Draw fish eye
	     g.setColor(Color.WHITE); // White
	     g.fillOval(210 + 100, 815 - 200 + 15, 20, 15); // Eye, adjusted Y coordinate

	     g.setColor(Color.BLACK); // Black
	     g.fillOval(213 + 100, 818 - 200 + 15, 10, 10); // Pupil, adjusted Y coordinate

	     // Fin
	     g.setColor(new Color(255, 255, 153)); // Light blue
	     int[] fin4X = { 300 + 100, 320 + 100, 320 + 100 }; // X coordinates of triangle vertices
	     int[] fin4Y = { 825 - 200 + 15, 805 - 200 + 15, 845 - 200 + 15 }; // Y coordinates of triangle vertices, adjusted
	     g.fillPolygon(fin4X, fin4Y, 3); // Fin

	     // Gills
	     g.setColor(Color.BLACK); // Black
	     g.drawLine(235 + 100, 815 - 200 + 15, 245 + 100, 835 - 200 + 15); // First gill, adjusted Y coordinate
	     g.drawLine(255 + 100, 815 - 200 + 15, 265 + 100, 835 - 200 + 15); // Second gill, adjusted Y coordinate
	     g.drawLine(275 + 100, 815 - 200 + 15, 285 + 100, 835 - 200 + 15); // Third gill, adjusted Y coordinate

     	
     
        g.setColor(new Color(210, 180, 140)); // Caramel brown (skin color)

        // Draw head
        g.fillRect(600, 350, 50, 50);

        // Draw body
        g.setColor(Color.BLUE); // Brown hair color
        g.fillRect(600, 400, 50, 50);

        // Draw arms
        g.setColor(Color.BLACK); // Brown hair color
        g.fillRect(560, 400, 40, 12); // Left arm

        // Draw legs
        g.setColor(Color.BLACK); // Brown hair color
        g.fillRect(600, 450, 20, 50); // Left leg
        g.fillRect(630, 450, 20, 50); // Right leg
        
        g.setColor(new Color(102, 51, 0)); // Brown hair color
        g.fillRect(600, 340, 50, 10); // Hair
        
        g.setColor(Color.white); // white eye color
        g.fillRect(600, 360, 18, 18);
        
        g.setColor(Color.BLACK); // white eye color
        g.fillRect(603, 365, 8, 8);// black eye color
        
        //PERSON 2
        
        g.setColor(new Color(255, 218, 185)); // Light skin color (beige or peach)

     // Draw head
     g.fillRect(1750, 460, 50, 50); // Adjusted y coordinate

     // Draw body
     g.setColor(new Color(139, 69, 19)); // Medium brown
     g.fillRect(1750, 510, 50, 50); // Adjusted y coordinate

     // Draw arms
     g.setColor(Color.BLACK); // Brown hair color
     g.fillRect(1710, 510, 40, 12); // Adjusted y coordinate for the left arm

     // Draw legs
     g.setColor(Color.BLACK); // Brown hair color
     g.fillRect(1750, 560, 20, 50); // Adjusted y coordinate for the left leg
     g.fillRect(1780, 560, 20, 50); // Adjusted y coordinate for the right leg

     g.setColor(Color.BLACK); // Brown hair color
     g.fillRect(1750, 450, 50, 10); // Adjusted y coordinate for the hair

     g.setColor(Color.white); // white eye color
     g.fillRect(1750, 470, 18, 18); // Adjusted y coordinate

     g.setColor(Color.BLACK); // white eye color
     g.fillRect(1753, 475, 8, 8); // Adjusted y coordinate

        
        g.setColor(new Color(139, 69, 19)); // Brown
        g.fillArc(550, 350, 600, 300, 180, 180); // Smaller boat

        int[] sailX = {850, 850, 1150}; // Adjusted sail position
        int[] sailY = {130, 430, 430}; // Adjusted sail position and size
        g.setColor(Color.white); // White
        g.fillPolygon(sailX, sailY, 3); // Smaller sail

     // Draw rod body
        g.setColor(new Color(139, 69, 19)); // Brown

        g.fillRect(560, 360, 10, 100); // Modified x-coordinate

        // Draw reel
        g.setColor(Color.BLACK);
        g.fillOval(555, 350, 20, 20); // Modified x-coordinate

        // Draw line
        g.setColor(Color.BLACK);
        g.drawLine(565, 360, 315, 620); // Modified x-coordinate

        int hookX = 315 - 6 / 2; // Adjusted x-coordinate to center the hook horizontally
        int hookY = 620 - 0; // Adjusted y-coordinate to position the hook slightly lower

        // Draw hook
        g.setColor(Color.GRAY);
        g.fillRect(hookX, hookY, 6, 20); // Draw the hook rectangle
        g.fillOval(hookX - 3, hookY - 10, 12, 12);
        
        
        
	}

}
