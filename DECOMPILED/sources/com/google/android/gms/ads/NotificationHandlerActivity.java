package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.internal.ads.zzbot;
import com.google.android.gms.internal.ads.zzbsp;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbsp zzbspVarM17354j = C3244B.m17191b().m17354j(this, new zzbot());
            if (zzbspVarM17354j == null) {
                AbstractC7599p.m33328c("OfflineUtils is null");
            } else {
                zzbspVarM17354j.zze(getIntent());
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33328c("RemoteException calling handleNotificationIntent: ".concat(e7.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}
