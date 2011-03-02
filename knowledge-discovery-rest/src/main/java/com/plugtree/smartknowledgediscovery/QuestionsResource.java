package com.plugtree.smartknowledgediscovery;

import java.net.URI;
import java.util.Collection;
import java.util.Iterator;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.plugtree.smartknowledgediscovery.util.QuestionRequest;
import com.plugtree.smartprocessdiscovery.dao.GenericDao;
import com.plugtree.smartprocessdiscovery.model.questionaire.Question;

 
@Path("/question")
public class QuestionsResource {
    
	private GenericDao<Question> questionService;
	
	@POST
    @Consumes("application/xml")    
    @Path("/add")
    public void addQuestion(QuestionRequest questionRequest) {
			
		for (Question question : questionRequest.getQuestions()) {
			questionService.save(question);
		}
		
		System.out.println("Size question list: " + questionService.listAll().size());
    }
	
	@POST
    @Consumes("application/xml")    
    @Path("/remove")
    public Response removeQuestion(QuestionRequest questionReq){
        
		Question question = null;
		Iterator it =  questionReq.getQuestions().iterator();
		
		while(it.hasNext()){
			question = (Question) it.next();
			questionService.remove(question);
			
		}
		
		
		return Response.created(URI.create("/" + (question.getId() - 1))).build();
    }
	
	@POST
    @Consumes("application/xml")    
    @Path("/update")
    public Response updateQuestion(QuestionRequest questionReq){
        
		Question question = null;
		Iterator it =  questionReq.getQuestions().iterator();
		
		while(it.hasNext()){
			question = (Question) it.next();
			questionService.update(question);
			
		}
		
		
		return Response.created(URI.create("/" + (question.getId() - 1))).build();
    }
	
	
	//TODO:  Use JAXB to parse XML or JSON instead of XML.  
	//TODO: Modify to support real questions and SmartGwt.
		
    public void setQuestionService(GenericDao<Question> questionService) {
        this.questionService = questionService;
    }

    public GenericDao<Question> getQuestionService() {
        return questionService;
    }
}