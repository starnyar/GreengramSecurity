package com.green.greengram.security.oauth2;

import java.util.Map;

public class KakaoOAuth2UserInfo extends OAuth2UserInfo{

    public KakaoOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
        return attributes.get("id").toString();
    }

    @Override
    public String getName() {
        Map<String, Object> properties = (Map<String, Object>) attributes.get("properties");
        return properties == null ? null : properties.get("nickname").toString();
    }

    @Override
    public String getEmail() {
        return attributes.get("account_email").toString();
    }

    @Override
    public String getProfilePicUrl() {
        Map<String, Object> properties = (Map<String, Object>) attributes.get("properties");
        return properties == null ? null : properties.get("thumbnail_image").toString();
    }
}
