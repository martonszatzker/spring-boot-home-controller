package com.tzkinformatics.measapp.api.base;

import lombok.Data;
import java.util.List;

@Data
public class PagingResponse<E> {

    private long totalCount;
    private List<E> result;

    public PagingResponse() {
    }

    public PagingResponse(long totalCount, List<E> result) {
        this.totalCount = totalCount;
        this.result = result;
    }

    public PagingResponse(List<E> result) {
        this.result = result;
    }
}


