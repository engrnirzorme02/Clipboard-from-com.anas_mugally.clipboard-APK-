package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.AbstractC4955F;
import com.google.firebase.messaging.C5000m;
import java.util.concurrent.ExecutionException;
import p163V2.AbstractC1731b;
import p163V2.C1730a;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC1731b {
    /* JADX INFO: renamed from: f */
    private static Intent m22195f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // p163V2.AbstractC1731b
    /* JADX INFO: renamed from: b */
    protected int mo7356b(Context context, C1730a c1730a) {
        try {
            return ((Integer) Tasks.await(new C5000m(context).m22539g(c1730a.m7351T()))).intValue();
        } catch (InterruptedException | ExecutionException e7) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e7);
            return 500;
        }
    }

    @Override // p163V2.AbstractC1731b
    /* JADX INFO: renamed from: c */
    protected void mo7357c(Context context, Bundle bundle) {
        Intent intentM22195f = m22195f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (AbstractC4955F.m22267D(intentM22195f)) {
            AbstractC4955F.m22290v(intentM22195f);
        }
    }
}
