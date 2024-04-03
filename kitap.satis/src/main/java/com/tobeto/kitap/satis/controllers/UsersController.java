package com.tobeto.kitap.satis.controllers;

import com.tobeto.kitap.satis.services.abstracts.UserService;
import com.tobeto.kitap.satis.services.dtos.requests.AddUserRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateUserRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController
{
    private UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public AddUserResponse add(@RequestBody AddUserRequest request){
        return userService.add(request);
    }

    @PutMapping
    public UpdateUserResponse update(@RequestBody UpdateUserRequest request){
        return userService.update(request);
    }

    @DeleteMapping
    public DeleteUserResponse delete(@RequestParam int id){
        return userService.delete(id);
    }

    @GetMapping
    public List<ListUserResponse> getAll(){
        return userService.getAll();
    }

    @GetMapping(value = "/{id}")
    public GetUserResponse getById(@PathVariable int id){
        return userService.getById(id);
    }

}
