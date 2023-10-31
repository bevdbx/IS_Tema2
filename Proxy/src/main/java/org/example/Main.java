package org.example;

import org.example.cool_library.ThirdPartyYtClass;
import org.example.downloader.YtDownloader;
import org.example.proxy.YtCacheProxy;

public class Main {
    public static void main(String[] args) {
        YtDownloader naiveDownloader = new YtDownloader(new ThirdPartyYtClass());
        YtDownloader smartDownloader = new YtDownloader(new YtCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YtDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}