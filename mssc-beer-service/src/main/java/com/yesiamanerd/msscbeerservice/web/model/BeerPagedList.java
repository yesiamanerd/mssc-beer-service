package com.yesiamanerd.msscbeerservice.web.model;

import org.springframework.data.domain.PageImpl;

public class BeerPagedList extends PageImpl<BeerDto> {
    public BeerPagedList(java.util.List<BeerDto> content, org.springframework.data.domain.Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(java.util.List<BeerDto> content) {
        super(content);
    }
}
