package GAME2048;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class DrawUtils {
	public DrawUtils() {

	}
//chieu rong
	public static int getMessageWidth(String message, Font font, Graphics2D g) {
		g.setFont(font);
		Rectangle2D bounds = g.getFontMetrics().getStringBounds(message, g);
		return (int) bounds.getWidth();
	}
	//chieu dai
	public static int getMessageHeight(String message, Font font, Graphics2D g) {
		g.setFont(font);
		if(message.length()==0) return 0;
		TextLayout textLayout = new TextLayout(message, font, g.getFontRenderContext());
		return (int) textLayout.getBounds().getHeight();
	}
}
