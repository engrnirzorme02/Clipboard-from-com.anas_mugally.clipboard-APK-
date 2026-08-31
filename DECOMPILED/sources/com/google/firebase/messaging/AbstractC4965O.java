package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.privacysandbox.ads.adservices.measurement.ExecutorC2688k;
import com.google.android.gms.common.util.AbstractC3760o;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: renamed from: com.google.firebase.messaging.O */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC4965O {
    /* JADX INFO: renamed from: b */
    private static SharedPreferences m22385b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX INFO: renamed from: c */
    static boolean m22386c(Context context) {
        return m22385b(context).getBoolean("proxy_notification_initialized", false);
    }

    /* JADX INFO: renamed from: d */
    static boolean m22387d(SharedPreferences sharedPreferences, boolean z7) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z7;
    }

    /* JADX INFO: renamed from: e */
    static void m22388e(Context context, boolean z7) {
        SharedPreferences.Editor editorEdit = m22385b(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z7);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: f */
    static void m22389f(final Context context, C4951B c4951b, final boolean z7) {
        if (AbstractC3760o.m18201i() && !m22387d(m22385b(context), z7)) {
            c4951b.m22255j(z7).addOnSuccessListener(new ExecutorC2688k(), new OnSuccessListener() { // from class: com.google.firebase.messaging.N
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    AbstractC4965O.m22390g(context, z7);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: g */
    public static void m22390g(Context context, boolean z7) {
        SharedPreferences.Editor editorEdit = m22385b(context).edit();
        editorEdit.putBoolean("proxy_retention", z7);
        editorEdit.apply();
    }
}
