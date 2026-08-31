package com.anas_mugally.clipboard.broadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.widget.Toast;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.AbstractC3081u;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.C3149w;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.service.MyAccessibilityService;
import com.anas_mugally.clipboard.service.PrimaryBubbleService;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1617O;

/* JADX INFO: loaded from: classes.dex */
public final class ShowOrHidePrimaryBubbleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final C3050a f12594a = new C3050a(null);

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.broadcastReceiver.ShowOrHidePrimaryBubbleReceiver$a */
    public static final class C3050a {
        public /* synthetic */ C3050a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m15139a(Context context, boolean z7) {
            AbstractC6118n.m27187e(context, "context");
            MyApplication myApplicationM15105a = MyApplication.f12496a.m15105a();
            boolean z8 = false;
            if (myApplicationM15105a != null && AbstractC3081u.m15315b(myApplicationM15105a)) {
                z8 = true;
            }
            MyAccessibilityService myAccessibilityServiceM15245a = MyAccessibilityService.f12639O.m15245a();
            if (!z8 || myAccessibilityServiceM15245a == null) {
                if (z7) {
                    PrimaryBubbleService.f12704a.m15279c(context);
                    return;
                } else {
                    PrimaryBubbleService.f12704a.m15280d(context);
                    return;
                }
            }
            if (z7) {
                myAccessibilityServiceM15245a.m15223F();
            } else {
                myAccessibilityServiceM15245a.m15237r();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m15140b(Context context) {
            AbstractC6118n.m27187e(context, "context");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BOOT_COMPLETED");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.MY_PACKAGE_REPLACED");
            context.getApplicationContext().registerReceiver(new ShowOrHidePrimaryBubbleReceiver(), intentFilter);
        }

        private C3050a() {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        if (context == null || intent == null || (action = intent.getAction()) == null || !AbstractC1617O.m6652f("android.intent.action.BOOT_COMPLETED", "android.intent.action.USER_PRESENT", "android.intent.action.MY_PACKAGE_REPLACED", "com.anas_mugally.clipboard.OPEN_APP_ACTION", "com.anas_mugally.clipboard.SHOW_HIDE_PRIMARY_BUBBLE_ACTION", "com.anas_mugally.clipboard.SHOW_HIDE_WITH_VALUE_PRIMARY_BUBBLE_ACTION").contains(action)) {
            return;
        }
        if (intent.getBooleanExtra(C3149w.f13206f.m16727a(), false)) {
            Toast.makeText(context, R.string.show_hide_bubble, 1).show();
            MyAccessibilityService myAccessibilityServiceM15245a = MyAccessibilityService.f12639O.m15245a();
            if (myAccessibilityServiceM15245a != null) {
                myAccessibilityServiceM15245a.m15225L();
            }
        }
        if (AbstractC3041D.m15080e(context)) {
            if (AbstractC6118n.m27183a(action, "com.anas_mugally.clipboard.SHOW_HIDE_PRIMARY_BUBBLE_ACTION")) {
                C3034A.f12453a.m15030d(context);
                return;
            }
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("SHARED_NAME", 0);
        C3034A c3034a = C3034A.f12453a;
        boolean booleanExtra = sharedPreferences.getBoolean(c3034a.m15014A(), true);
        if (booleanExtra || !(AbstractC6118n.m27183a(action, "android.intent.action.BOOT_COMPLETED") || AbstractC6118n.m27183a(action, "android.intent.action.USER_PRESENT") || AbstractC6118n.m27183a(action, "android.intent.action.MY_PACKAGE_REPLACED"))) {
            switch (action.hashCode()) {
                case -1641953649:
                    if (!action.equals("com.anas_mugally.clipboard.SHOW_HIDE_PRIMARY_BUBBLE_ACTION")) {
                        return;
                    }
                    booleanExtra = !booleanExtra;
                    sharedPreferences.edit().putBoolean(c3034a.m15014A(), booleanExtra).apply();
                    break;
                case -1088771966:
                    if (!action.equals("com.anas_mugally.clipboard.SHOW_HIDE_WITH_VALUE_PRIMARY_BUBBLE_ACTION")) {
                        return;
                    }
                    booleanExtra = intent.getBooleanExtra("state", true);
                    sharedPreferences.edit().putBoolean(c3034a.m15014A(), booleanExtra).apply();
                    break;
                case -801843993:
                    if (!action.equals("com.anas_mugally.clipboard.OPEN_APP_ACTION")) {
                        return;
                    }
                    break;
                case 798292259:
                    if (!action.equals("android.intent.action.BOOT_COMPLETED")) {
                        return;
                    }
                    break;
                case 823795052:
                    if (!action.equals("android.intent.action.USER_PRESENT")) {
                        return;
                    }
                    break;
                case 1737074039:
                    if (!action.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            f12594a.m15139a(context, booleanExtra);
        }
    }
}
