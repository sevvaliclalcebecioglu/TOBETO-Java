package com.tobeto.kitap.satis.services.abstracts;

import com.tobeto.kitap.satis.services.dtos.requests.AddAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.requests.AddPublisherRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdatePublisherRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;

import java.util.List;

public interface PublisherService
{
    AddPublisherResponse add(AddPublisherRequest request);
    UpdatePublisherResponse update(UpdatePublisherRequest request);
    DeletePublisherResponse delete(int id);
    List<ListPublisherResponse> getAll();
    GetPublisherResponse getById(int id);
}
