package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqf {
    private final int zza;
    private final List zzb;
    private final int zzc;
    private final InputStream zzd;

    public zzaqf(int i7, List list, int i8, InputStream inputStream) {
        this.zza = i7;
        this.zzb = list;
        this.zzc = i8;
        this.zzd = inputStream;
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return Collections.unmodifiableList(this.zzb);
    }

    public final int zzc() {
        return this.zzc;
    }

    public final InputStream zzd() {
        InputStream inputStream = this.zzd;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }
}
