package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.internal.ads.zzbot;
import com.google.android.gms.internal.ads.zzbsp;

/* JADX INFO: loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* JADX INFO: renamed from: r */
    private final zzbsp f14131r;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f14131r = C3244B.m17191b().m17354j(context, new zzbot());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.AbstractC2892a doWork() {
        try {
            this.f14131r.zzg();
            return ListenableWorker.AbstractC2892a.m14463c();
        } catch (RemoteException unused) {
            return ListenableWorker.AbstractC2892a.m14461a();
        }
    }
}
