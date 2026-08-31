package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.internal.ads.zzbot;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            C3244B.m17191b().m17354j(this, new zzbot()).zze(intent);
        } catch (RemoteException e7) {
            AbstractC7599p.m33328c("RemoteException calling handleNotificationIntent: ".concat(e7.toString()));
        }
    }
}
