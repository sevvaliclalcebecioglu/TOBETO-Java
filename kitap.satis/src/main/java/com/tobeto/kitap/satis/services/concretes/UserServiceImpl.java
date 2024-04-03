package com.tobeto.kitap.satis.services.concretes;

import com.tobeto.kitap.satis.services.abstracts.UserService;
import com.tobeto.kitap.satis.services.dtos.requests.AddUserRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateUserRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public AddUserResponse add(AddUserRequest request) {
        return null;
    }

    @Override
    public UpdateUserResponse update(UpdateUserRequest request) {
        return null;
    }

    @Override
    public DeleteUserResponse delete(int id) {
        return null;
    }

    @Override
    public List<ListUserResponse> getAll() {
        return null;
    }

    @Override
    public GetUserResponse getById(int id) {
        return null;
    }
}
