package com.worpdress.salaboy.smartprocessdiscovery.client;

import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.StretchImgButton;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.layout.HLayout;

public class Menu extends HLayout {

	private StretchImgButton crudQuestionsButton = new IButton("Crud Questions");
	private IButton createQuestionaryButton = new IButton("Create Questionary");
	private IButton addResultButton = new IButton("Add Result");

	public Menu() {
		
		setMembersMargin(10);
		createQuestionaryButton.setWidth(150);
		
		addMember(crudQuestionsButton);
		addMember(createQuestionaryButton);
		addMember(addResultButton);

		crudQuestionsButton.addClickHandler( new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				changeMainPanel(new CrudQuestions());
				
			}
		});

		createQuestionaryButton.addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				changeMainPanel(new CuestionaryPanel());
			}
		});

		addResultButton.addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				changeMainPanel(new ResultPanel());
			}
		});
	}
	
	private void changeMainPanel(Widget widget) {
		RootLayoutPanel.get().clear();
		RootLayoutPanel.get().add(widget);
	}
}