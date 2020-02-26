package com.doublervideo.api.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/users")

public class UsersController {

    @Autowired
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    EntityManager em = this.em;

    @GetMapping
    public List<User> getAllUsers() {
        return this.usersService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getOneUser(@PathVariable int id) {
        User user = usersService.getOneUser(id).orElseThrow(IllegalArgumentException::new);
        return user;
    }

    @PostMapping
    public User addOneUser(@RequestBody User newUser) {
//        if (newUser.getEmail() == null || newUser.getPassword() == null) {
//            throw new IllegalArgumentException("Not all fields are valid.");
//        }
        return usersService.addOneUser(newUser);
    }

    @PatchMapping("/{id}")
    public User updateOneUser(@RequestBody User updatedUser) {
        User user = usersService.getOneUser(updatedUser.getId()).orElseThrow(IllegalArgumentException::new);
        return usersService.updateOneUser(updatedUser);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public String removeOneUser(@PathVariable int id) {
        User user = usersService.getOneUser(id).orElseThrow(IllegalArgumentException::new);

        Query q1 = em.createNativeQuery("delete from users_videos where user_id = ?");
        q1.setParameter(1, id);
        em.joinTransaction();
        q1.executeUpdate();

        return usersService.removeOneUser(id);
    }
}
