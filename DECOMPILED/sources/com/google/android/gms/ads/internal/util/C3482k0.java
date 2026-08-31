package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbci;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3482k0 {

    /* JADX INFO: renamed from: d */
    private boolean f14258d;

    /* JADX INFO: renamed from: e */
    private Context f14259e;

    /* JADX INFO: renamed from: c */
    private boolean f14257c = false;

    /* JADX INFO: renamed from: b */
    private final Map f14256b = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    private final BroadcastReceiver f14255a = new C3480j0(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final synchronized void m17533d(Context context, Intent intent) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.f14256b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((BroadcastReceiver) arrayList.get(i7)).onReceive(context, intent);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m17530a(Context context) {
        try {
            if (this.f14257c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f14259e = applicationContext;
            if (applicationContext == null) {
                this.f14259e = context;
            }
            zzbci.zza(this.f14259e);
            this.f14258d = ((Boolean) C3250D.m17200c().zzd(zzbci.zzem)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlO)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f14259e.registerReceiver(this.f14255a, intentFilter);
            } else {
                this.f14259e.registerReceiver(this.f14255a, intentFilter, 4);
            }
            this.f14257c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m17531b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f14258d) {
            this.f14256b.put(broadcastReceiver, intentFilter);
            return;
        }
        zzbci.zza(context);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlO)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m17532c(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f14258d) {
            this.f14256b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
