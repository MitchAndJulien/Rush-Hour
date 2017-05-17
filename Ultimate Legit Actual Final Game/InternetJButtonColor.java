import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 * This is from StackOverflow for the color of the "road" of the game
 * @author julienzhu
 *
 */
public class InternetJButtonColor {

	/**
	 * A new specialized button for the road spaces of the game
	 * @author julienzhu
	 *
	 */
    class MyButton extends JButton {

    	/**
    	 * Color of button when hover over button
    	 */
        private Color hoverBackgroundColor;
        
        /**
         * Color of press when press button
         */
        private Color pressedBackgroundColor;

        /**
         * Constructor for special button
         * @param text Text for inside the button. In all cases the road should have no text inside
         */
        public MyButton(String text) {
            super(text);
            super.setContentAreaFilled(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (getModel().isPressed()) {
                g.setColor(pressedBackgroundColor);
            } else if (getModel().isRollover()) {
                g.setColor(hoverBackgroundColor);
            } else {
                g.setColor(Color.lightGray);
            }
            g.fillRect(0, 0, getWidth(), getHeight());
            super.paintComponent(g);
        }

        @Override
        public void setContentAreaFilled(boolean b) {
        }

        /**
         * Getter for the color of the hover button color
         * @return The color of the hover button color
         */
        public Color getHoverBackgroundColor() {
            return hoverBackgroundColor;
        }

        /**
         * Setter for the color of the hover button color
         * @param hoverBackgroundColor The color desired
         */
        public void setHoverBackgroundColor(Color hoverBackgroundColor) {
            this.hoverBackgroundColor = hoverBackgroundColor;
        }

        /**
         * Getter for the color of the press button color
         * @return The color of the press button color
         */
        public Color getPressedBackgroundColor() {
            return pressedBackgroundColor;
        }

        /**
         * Setter for the color of the press button color
         * @param pressedBackgroundColor The color desired
         */
        public void setPressedBackgroundColor(Color pressedBackgroundColor) {
            this.pressedBackgroundColor = pressedBackgroundColor;
        }
    }

    /**
     * Sets the colors of the button
     * @param btnSave The button to be changed
     */
    protected void setColorWheel(MyButton btnSave) {
        btnSave.setBorder(BorderFactory.createRaisedBevelBorder());
        btnSave.setHoverBackgroundColor(Color.lightGray);
        btnSave.setPressedBackgroundColor(Color.lightGray);
    }

}
