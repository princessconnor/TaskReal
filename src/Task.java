/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class Task {
    private String name;
private String description; 

   public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }
 //returns name of person
    public String getName() {
        return name;
    }
//used to set name
    public void setName(String name) {
        this.name = name;
    }
//returns description of job
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
       public boolean validate()
    {
        if(name==null||description==null||name.equals("")||description.equals(""))
        return false;
        else 
            return true;
    }
    // displays info
    @Override
    public String toString() {
        return "Task{" + "name=" + name + ", description=" + description + '}';
    }
}
