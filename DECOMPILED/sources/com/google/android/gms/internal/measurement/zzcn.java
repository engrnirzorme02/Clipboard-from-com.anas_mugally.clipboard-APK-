package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcn extends Handler {
    public zzcn() {
        Looper.getMainLooper();
    }

    public zzcn(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
