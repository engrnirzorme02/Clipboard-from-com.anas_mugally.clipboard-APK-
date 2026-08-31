package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzat;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.Objects;
import p403z1.AbstractC7574p;

/* JADX INFO: renamed from: com.android.billingclient.api.G */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC3159G implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C3160H f13419a;

    /* synthetic */ ServiceConnectionC3159G(C3160H c3160h, AbstractC7574p abstractC7574p) {
        Objects.requireNonNull(c3160h);
        this.f13419a = c3160h;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzc.zzm("BillingClientTesting", "Billing Override Service connected.");
        C3160H c3160h = this.f13419a;
        c3160h.f13422M = zzat.zzc(iBinder);
        c3160h.f13421L = 2;
        c3160h.m16741I0(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzc.zzn("BillingClientTesting", "Billing Override Service disconnected.");
        C3160H c3160h = this.f13419a;
        c3160h.f13422M = null;
        c3160h.f13421L = 0;
    }
}
