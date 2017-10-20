package org.certificatic.managedbean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="helloBean")
@SessionScoped
public class HelloWorldManagedBean implements Serializable{

    private static final long serialVersionUID = -6913972022251814607L;

    private String name = "Ethien Salinas!!";

    public String getName() {
        return name;
    }

    public void setS1(String name) {
        this.name = name;
    }  
}
