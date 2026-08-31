package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbj {
    public static Looper zza(Looper looper) {
        return looper != null ? looper : zzb();
    }

    public static Looper zzb() {
        AbstractC3718s.m18087p(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
