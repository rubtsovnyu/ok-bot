package model.outbound.subscription;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.Gson;

import serializer.Serializer;

public class Subscription {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return Serializer.getInstance().toJson(this);
    }
}
