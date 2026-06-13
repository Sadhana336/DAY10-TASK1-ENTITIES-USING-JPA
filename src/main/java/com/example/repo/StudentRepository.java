//A repository is used to act as a middle layer between your
//->application logic (service/controller) and data storage (database or in-memory list).
//All CRUD logic stays in one place:
//save()
//findAll()
//findById()
//delete()
//So if data logic changes, you modify only repository.
//👉 Only repository changes, not controller/service.
//Think of it like this:
//
//Controller = customer
//Repository = shopkeeper
//Database = warehouse
//
//Customer never goes to warehouse directly — shopkeeper handles it
package com.example.repo;
import java.util.ArrayList;
import java.util.List;
public class StudentRepository {
    private final List<ModelStudent> students = new ArrayList<>();
//    👉 “Store student data in one central place”
    public List<ModelStudent> findAll(){

        return students;//returns whole list
    }
    public void save(ModelStudent s){
        students.add(s);

        //function to save,not to return whole list
    }

}
