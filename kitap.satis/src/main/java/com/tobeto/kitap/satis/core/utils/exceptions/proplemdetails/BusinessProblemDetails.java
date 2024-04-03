package com.tobeto.kitap.satis.core.utils.exceptions.proplemdetails;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessProblemDetails extends ProblemDetails
{
    public BusinessProblemDetails(String detail) {
        setDetail(detail);
        setTitle("Business Rule Validation");
        setType("BusinessException");
    }
}
