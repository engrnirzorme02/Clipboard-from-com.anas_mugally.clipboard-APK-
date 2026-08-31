package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfvu {
    private final ExecutorService zza;

    public zzfvu(ExecutorService executorService) {
        this.zza = executorService;
    }

    public final zzfvl zza(File file, zzhjs zzhjsVar, Function function) {
        return new zzfvt(file, this.zza, new zzfvr(zzhjsVar), function);
    }

    public final zzfvl zzb(File file, byte[] bArr, Function function) {
        return new zzfvt(file, this.zza, new zzfvn(bArr), function);
    }
}
