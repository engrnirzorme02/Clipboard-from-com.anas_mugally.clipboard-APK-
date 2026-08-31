package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzsc extends Handler {
    final /* synthetic */ zzse zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzsc(zzse zzseVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zzseVar);
        this.zza = zzseVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzh(message);
    }
}
