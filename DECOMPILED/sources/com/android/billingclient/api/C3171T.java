package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import p403z1.InterfaceC7566h;
import p403z1.InterfaceC7568j;
import p403z1.InterfaceC7571m;
import p403z1.InterfaceC7578t;

/* JADX INFO: renamed from: com.android.billingclient.api.T */
/* JADX INFO: loaded from: classes.dex */
final class C3171T {

    /* JADX INFO: renamed from: a */
    private final Context f13484a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC7566h f13485b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC3162J f13486c;

    /* JADX INFO: renamed from: d */
    private final C3170S f13487d = new C3170S(this, true);

    /* JADX INFO: renamed from: e */
    private final C3170S f13488e = new C3170S(this, false);

    /* JADX INFO: renamed from: f */
    private boolean f13489f;

    C3171T(Context context, InterfaceC7566h interfaceC7566h, InterfaceC7578t interfaceC7578t, InterfaceC7571m interfaceC7571m, InterfaceC7568j interfaceC7568j, InterfaceC3162J interfaceC3162J) {
        this.f13484a = context;
        this.f13485b = interfaceC7566h;
        this.f13486c = interfaceC3162J;
    }

    /* JADX INFO: renamed from: a */
    static /* bridge */ /* synthetic */ InterfaceC7571m m16796a(C3171T c3171t) {
        c3171t.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    static /* bridge */ /* synthetic */ InterfaceC7568j m16799e(C3171T c3171t) {
        c3171t.getClass();
        return null;
    }

    /* JADX INFO: renamed from: d */
    final InterfaceC7566h m16800d() {
        return this.f13485b;
    }

    /* JADX INFO: renamed from: f */
    final void m16801f(boolean z7) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f13489f = z7;
        C3170S c3170s = this.f13488e;
        Context context = this.f13484a;
        c3170s.m16794a(context, intentFilter2);
        if (this.f13489f) {
            this.f13487d.m16795b(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f13487d.m16794a(context, intentFilter);
        }
    }
}
