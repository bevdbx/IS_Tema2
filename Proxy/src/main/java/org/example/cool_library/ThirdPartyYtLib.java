package org.example.cool_library;

import java.util.HashMap;

public interface ThirdPartyYtLib {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
