package com.appiscool.bpp;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

import com.appiscool.bpp.helper.PatternHelper;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MonitoringModuleIntentService extends IntentService {

    private static final String ACTION_BUILD_PATTERN = "com.appiscool.bpp.action.BUILD_PATTERN";

    // TODO: Rename parameters
    private PatternHelper patternHelper;
    Context context;

    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startBuildingPattern(Context ctx) {
        Intent intent = new Intent(ctx, MonitoringModuleIntentService.class);
        intent.setAction(ACTION_BUILD_PATTERN);
        ctx.startService(intent);
    }

    public MonitoringModuleIntentService() {
        super("MonitoringModuleIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_BUILD_PATTERN.equals(action)) {
                handleBuildingPattern();
            }
        }
    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private void handleBuildingPattern() {
        patternHelper = new PatternHelper(this);
        patternHelper.generatePattern();
    }

}
