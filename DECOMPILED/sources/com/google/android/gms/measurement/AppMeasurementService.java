package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C4021D5;
import p280k0.AbstractC5909a;
import p283k3.InterfaceC6026I;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements InterfaceC6026I {

    /* JADX INFO: renamed from: a */
    private C4021D5 f15054a;

    /* JADX INFO: renamed from: c */
    private final C4021D5 m18411c() {
        if (this.f15054a == null) {
            this.f15054a = new C4021D5(this);
        }
        return this.f15054a;
    }

    @Override // p283k3.InterfaceC6026I
    /* JADX INFO: renamed from: a */
    public final void mo18408a(Intent intent) {
        AbstractC5909a.m26664b(intent);
    }

    @Override // p283k3.InterfaceC6026I
    /* JADX INFO: renamed from: b */
    public final void mo18409b(JobParameters jobParameters, boolean z7) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return m18411c().m18474d(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m18411c().m18471a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m18411c().m18472b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m18411c();
        C4021D5.m18468i(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        m18411c().m18473c(intent, i7, i8);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m18411c();
        C4021D5.m18469j(intent);
        return true;
    }

    @Override // p283k3.InterfaceC6026I
    public final boolean zza(int i7) {
        return stopSelfResult(i7);
    }
}
