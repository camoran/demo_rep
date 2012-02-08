/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.HelloService;

/**
 *
 * @author Raymond
 */
public class HelloController extends SimpleFormController {

    private HelloService helloService;

    public HelloController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Name.class);
        setCommandName("name");
        setSuccessView("HelloView");
        setFormView("formView");
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    protected ModelAndView onSubmit(Object command) throws Exception {
        Name name = (Name) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("helloMessage", helloService.sayHello(name.getValue()));
        return mv;
    }
}
