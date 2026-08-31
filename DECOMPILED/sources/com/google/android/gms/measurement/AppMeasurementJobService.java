package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C4021D5;
import p283k3.InterfaceC6026I;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC6026I {

    /* JADX INFO: renamed from: a */
    private C4021D5 f15052a;

    /* JADX INFO: renamed from: c */
    private final C4021D5 m18407c() {
        if (this.f15052a == null) {
            this.f15052a = new C4021D5(this);
        }
        return this.f15052a;
    }

    @Override // p283k3.InterfaceC6026I
    /* JADX INFO: renamed from: a */
    public final void mo18408a(Intent intent) {
    }

    @Override // p283k3.InterfaceC6026I
    /* JADX INFO: renamed from: b */
    public final void mo18409b(JobParameters jobParameters, boolean z7) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m18407c().m18471a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m18407c().m18472b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m18407c();
        C4021D5.m18468i(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        m18407c().m18475e(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m18407c();
        C4021D5.m18469j(intent);
        return true;
    }

    @Override // p283k3.InterfaceC6026I
    public final boolean zza(int i7) {
        throw new UnsupportedOperationException();
    }
}
