//MODEL CLASS
package com.example.repo;

public class ModelStudent {
    private Long id; //DECLARING ID,NAME
    private String name;
    public ModelStudent(Long id,String name){ //CONSTRUCTOR - METHOD NAME SAME AS CLASS NAME
        this.id=id;
        this.name=name;
    }
    //GETTER METHODS
    public Long getId(){ return id;}
    public String getName(){return name;}
}
