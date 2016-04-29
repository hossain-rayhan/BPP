package com.appiscool.bpp;

import com.appiscool.bpp.model.FinalPattern;
import com.appiscool.bpp.model.ProfileSettings;

/**
 * Created by Mukla dot C on 1/30/2016.
 */
public class ProfileBuilder {

    ProfileSettings profileSettings;

    public ProfileSettings getProfileSettings(FinalPattern pattern){
        profileSettings = new ProfileSettings();



        return profileSettings;
    }
}
