package com.abc.io.parse;

import com.abc.io.exception.UnsupportedMediaTypeException;

public enum SupportedMediaType {
    XML("application/xml"),
    CSV("text/csv");

    String mediaType;

    SupportedMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public static SupportedMediaType fromValue(String value){
        for(SupportedMediaType s : SupportedMediaType.values()){
            if(value.equals(s.mediaType)){
                return s;
            }
        }
        throw new UnsupportedMediaTypeException("Unsupported MediaType... ");
    }
}
