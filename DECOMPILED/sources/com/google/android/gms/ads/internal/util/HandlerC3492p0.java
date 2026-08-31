package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzfro;
import p380w2.C7351t;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC3492p0 extends zzfro {
    public HandlerC3492p0(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e7) {
            C7351t.m32354l().zzg(e7, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    protected final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            C7351t.m32349g();
            C3431F0.m17426q(C7351t.m32354l().zzp(), th);
            throw th;
        }
    }
}
