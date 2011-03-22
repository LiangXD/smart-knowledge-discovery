package com.plugtree.smartknowledgediscovery.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CategoryPanel extends VerticalPanel {

    private Button addButton = new Button("Add");

    public CategoryPanel() {

        CategoryTable categoryTable = new CategoryTable();
        add(categoryTable);
        add(addButton);

        addButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                //TODO: 
                QuestionDialog questionDialog = new QuestionDialog(null);
                questionDialog.show();
            }
        });

        addStyle();
    }
    private void addStyle() {
        addButton.addStyleName("button");
    }
}