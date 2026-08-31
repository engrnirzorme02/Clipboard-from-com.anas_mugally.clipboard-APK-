package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzug {
    private static final AtomicLong zza = new AtomicLong();

    public zzug(long j7, zzge zzgeVar, Uri uri, Map map, long j8, long j9, long j10) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }

    public zzug(long j7, zzge zzgeVar, long j8) {
        Uri uri = zzgeVar.zza;
    }
}
