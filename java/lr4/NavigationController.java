package lr4;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Home
 */
@Named(value="navigationController")
@RequestScoped
public class NavigationController implements java.io.Serializable
{

    public NavigationController() {
    }
    public String aboutPage(){
    return "about";
    }
    public String testPage(){
    return "testpage";
    }
    public String index(){
    return "index";
    }
}
