package net.tarine.ibbchianti.client.frame;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

import net.tarine.ibbchianti.client.LocaleConstants;
import net.tarine.ibbchianti.client.UriBuilder;
import net.tarine.ibbchianti.shared.AppConstants;

public class ErrorClosedFrame extends FramePanel {
	
	private LocaleConstants constants = GWT.create(LocaleConstants.class);
	
	private VerticalPanel cp = null; // Content panel
		
	public ErrorClosedFrame(UriBuilder params) {
		super();
		cp = new VerticalPanel();
		this.add(cp);
		draw();
	}
	
	private void draw() {
		//TITLE
		setTitle(constants.errorClosedTitle());
		
		cp.add(new HTML("<p>"+constants.errorClosedInfo()+"<br />"+
				constants.errorClosedAsk()+"</p>"));
		cp.add(new HTML("<p>&nbsp;</p>"));
	
		cp.add(new HTML("<h3><a href='"+AppConstants.EVENT_URL+"'><i class='fa fa-hand-o-left'></i> <b>Italian Burning Boots</b></a></h3>"));
	}
	
}
