package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgpz {
    private final OutputStream zza;

    private zzgpz(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgpz zzb(OutputStream outputStream) {
        return new zzgpz(outputStream);
    }

    public final void zza(zzhec zzhecVar) throws IOException {
        try {
            zzhecVar.zzaO(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
