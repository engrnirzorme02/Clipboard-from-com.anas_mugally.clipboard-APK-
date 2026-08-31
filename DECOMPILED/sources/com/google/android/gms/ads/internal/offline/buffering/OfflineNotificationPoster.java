package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.internal.ads.zzbot;
import com.google.android.gms.internal.ads.zzbsp;
import p388x2.C7403a;

/* JADX INFO: loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* JADX INFO: renamed from: r */
    private final zzbsp f14130r;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f14130r = C3244B.m17191b().m17354j(context, new zzbot());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.AbstractC2892a doWork() {
        try {
            this.f14130r.zzj(BinderC3773b.m18221N0(getApplicationContext()), new C7403a(getInputData().m14503i("uri"), getInputData().m14503i("gws_query_id"), getInputData().m14503i("image_url")));
            return ListenableWorker.AbstractC2892a.m14463c();
        } catch (RemoteException unused) {
            return ListenableWorker.AbstractC2892a.m14461a();
        }
    }
}
