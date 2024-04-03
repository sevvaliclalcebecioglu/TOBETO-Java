package com.tobeto.kitap.satis.services.abstracts;

import com.tobeto.kitap.satis.services.dtos.requests.AddPublisherRequest;
import com.tobeto.kitap.satis.services.dtos.requests.AddUserRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdatePublisherRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateUserRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;

import java.util.List;

public interface UserService {
    AddUserResponse add(AddUserRequest request);
    UpdateUserResponse update(UpdateUserRequest request);
    DeleteUserResponse delete(int id);
    List<ListUserResponse> getAll();
    GetUserResponse getById(int id);
}
