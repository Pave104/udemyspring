package com.example.udemyspring;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {
@GetMapping
public ResponseEntity<User> findAll(){

    User u=new User(1l,"John Kenedy","jon@email","9889-9877","senha");
     return ResponseEntity.ok().body(u);


}

}
