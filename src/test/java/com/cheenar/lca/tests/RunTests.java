package com.cheenar.lca.tests;

/**
 * Created by cheen on 4/17/2016.
 */
public class RunTests
{

    public static void print(String line)
    {
        System.out.println("[Livecoding] " + line);
    }

    public static void main(String[] args)
    {
        print("TestLogin...");
        //TestLogin.main(args);

        print("TestUserData...");
        //TestUserData.main(args);

        print("TestOtherUserData...");
        //TestOtherUserData.main(args);

        print("TestCategories");
        //TestCategories.main(args);

        print("TestCategory");
        //TestCategory.main(args);

        print("TestVideoLatest");
        //TestVideoLatest.main(args);

        print("TestVideos");
        //this test case also has filter usage
        //TestVideos.main(args);

        print("TestLanguages");
        //TestLanguages.main(args);

        print("TestLanguage");
        //TestLanguage.main(args);

        print("TestLivestreams");
        //TestLivestreams.main(args);

        print("TestLivestream");
        //TestLivestream.main(args);

        print("TestVideo");
        //TestVideo.main(args);

        print("TestVideosList");
        TestVideosList.main(args);
    }

}
