package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import p280k0.AbstractC5909a;
import p283k3.C6043n;
import p283k3.InterfaceC6042m;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementReceiver extends AbstractC5909a implements InterfaceC6042m {

    /* JADX INFO: renamed from: c */
    private C6043n f15053c;

    @Override // p283k3.InterfaceC6042m
    /* JADX INFO: renamed from: a */
    public void mo18410a(Context context, Intent intent) {
        AbstractC5909a.m26665c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f15053c == null) {
            this.f15053c = new C6043n(this);
        }
        this.f15053c.m27049a(context, intent);
    }
}
