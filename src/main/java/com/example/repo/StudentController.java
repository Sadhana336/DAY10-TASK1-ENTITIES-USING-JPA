//MODEL CLASS->REPOSITORY-->SERVICE-->CONTROLLER
//package com.example.repo;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//without repository
//@RestController
//@RequestMapping("/students") //base url
//public class StudentController {
//    private List<ModelStudent> students = new ArrayList<>();
//    @GetMapping
//    public List<ModelStudent> getStudents(){
//        return students;
//    }
//    @PostMapping
//    public void addStudent(@RequestBody Student s){ // @RequestBody-getting data from frontend
//        students.add(s);//adding into list
//    }
//}
//with repo
package com.example.repo;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/students") //base url
public class StudentController {
    private final StudentRepository repo = new StudentRepository();
    @GetMapping
    public List<ModelStudent> getStudents(){
        return repo.findAll();
    }
    @PostMapping
    public ModelStudent addStudent(@RequestBody ModelStudent s){
        repo.save(s);
        return s;
    }
}
