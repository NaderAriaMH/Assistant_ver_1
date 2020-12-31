package com.nader.aria.base.utils;

import java.util.HashMap;
import java.util.Map;

public class Parameter {

    private final Map<String,Object> params;

    public Parameter(){
        this.params = new HashMap<>();
    }

    public final Map<String,Object> getParams(){
       return params;
    }

    public final Parameter add(String key,Object value){
        getParams().put(key,value);
        return this;
    }

    public final Object get(String key){
        if( params.containsKey(key) ){
            return params.get(key);
        }
        throw new NullPointerException("Can not find Object by key = "+key);
    }



}
