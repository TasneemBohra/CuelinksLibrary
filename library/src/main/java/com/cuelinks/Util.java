package com.cuelinks;

import android.util.Patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

/**
 * Created by tasneem on 11/4/16.
 */
public class Util {
    /**
     * Extract Url from text and replace with affiliated text
     * @param text
     * @param pubId
     * @return
     */
    public static String extractLinks(String text, String pubId) {
        //if (BuildConfig.DEBUG) {
            List<String> links = new ArrayList<>();
            Matcher m = Patterns.WEB_URL.matcher(text);
            while (m.find()) {
                String url = m.group();
                links.add(url);
                text = text.replace(url, "https://linksredirect.com/?pub_id=" + pubId + "&url=" + url);
            }
        //}
        return text;
    }
}
