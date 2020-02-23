package com.timmyg.interviewcourse.fourth_lesson.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Button;
import android.widget.RemoteViews;
import android.widget.Toast;

import com.timmyg.interviewcourse.R;

/**
 * Implementation of App Widget functionality.
 */
public class MyWidget extends AppWidgetProvider {

    public static String ACTION_WIDGET_RECEIVER = "ActionReceiverWidget";

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {
        // Construct the RemoteViews object
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.my_widget);
        Intent messageIntent = new Intent(context, MyWidget.class);
        messageIntent.setAction(ACTION_WIDGET_RECEIVER);
        messageIntent.putExtra("msg", "Hello from widget");

        PendingIntent pendingIntent = PendingIntent.getBroadcast(context,0, messageIntent, 0);

        views.setOnClickPendingIntent(R.id.btn_widget, pendingIntent);

        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        final String action = intent.getAction();

        if (ACTION_WIDGET_RECEIVER.equals(action)){
            String msg = "null";

            try {
                msg = intent.getStringExtra("msg");
            } catch (NullPointerException e){
                Log.e("Error", "msg = null");
            }

            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        }

        super.onReceive(context, intent);
    }
}

