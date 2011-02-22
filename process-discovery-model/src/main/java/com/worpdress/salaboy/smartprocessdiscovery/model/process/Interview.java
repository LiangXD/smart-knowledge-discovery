package com.worpdress.salaboy.smartprocessdiscovery.model.process;

import java.util.Date;

import com.worpdress.salaboy.smartprocessdiscovery.model.questionaire.AnsweredQuestionnaire;

/**
 * Created by IntelliJ IDEA.
 * User: salaboy
 * Date: 2/4/11
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Interview {
    private Long id;
    private String description;
    private AnsweredQuestionnaire questionnaire;
    private Person person;
    private Date startDate;
    private Date endDate;
    private Date dueDate;

    public Interview() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AnsweredQuestionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(AnsweredQuestionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
