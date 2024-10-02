/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lr4;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

/**
 *
 * @author Home
 */
@Named
@SessionScoped
public class AnswerController implements java.io.Serializable {
    private String ans;

    public AnswerController() {
        ans=null;
    }
    
    public void newMsg(){
        FacesMessage ansText;
        if(getAns().equalsIgnoreCase(">=")||getAns().equalsIgnoreCase("<=")){
        ansText=new FacesMessage(FacesMessage.SEVERITY_INFO,"Yes, NULL>=0 ¯\\_(ツ)_/¯",null);
        }else
            ansText=new FacesMessage(FacesMessage.SEVERITY_ERROR,"PSS, You can look for answer in link below :D",null);
        FacesContext.getCurrentInstance().addMessage("testForm:ans", ansText);
    }
    
    public void setAns(String ans){
    this.ans=ans;
    }
    
    public String getAns(){
    return ans;
    }
}
