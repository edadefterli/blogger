
package com.patika.blogger;
 
import com.patika.blogger.model.Gender;
import com.patika.blogger.model.User;
import com.patika.blogger.repository.ExpenseTypeRepository;
import com.patika.blogger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner{
    
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ExpenseTypeRepository expenseTypeRepository;
    
    @Override
    public void run(String... args) throws Exception {
        
        User newUser = new User(2, "Kürşat", "Ufuk", "k@gmail.com", Gender.MALE,null , null);
        userRepository.save(newUser);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //ExpenseType newExpenseType = new ExpenseType(1,"test2",EnableFlag.NO);
        //expenseTypeRepository.save(newExpenseType);
        //this part will filled about new default objects

    }
    
}
