package com.amitesh.accessibilityapp;

import android.accessibilityservice.AccessibilityService;
import android.app.Service;
import android.view.accessibility.AccessibilityEvent;

public class MyAccessibilityService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        System.out.println("Event = " + event.toString());

    }

    @Override
    public void onInterrupt() {

    }
}
