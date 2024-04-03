package com.tobeto.kitap.satis.services.concretes;

import com.tobeto.kitap.satis.services.abstracts.PublisherService;
import com.tobeto.kitap.satis.services.dtos.requests.AddPublisherRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdatePublisherRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PublisherServiceImpl implements PublisherService {
    @Override
    public AddPublisherResponse add(AddPublisherRequest request) {
        return null;
    }

    @Override
    public UpdatePublisherResponse update(UpdatePublisherRequest request) {
        return null;
    }

    @Override
    public DeletePublisherResponse delete(int id) {
        return null;
    }

    @Override
    public List<ListPublisherResponse> getAll() {
        return null;
    }

    @Override
    public GetPublisherResponse getById(int id) {
        return null;
    }
}
