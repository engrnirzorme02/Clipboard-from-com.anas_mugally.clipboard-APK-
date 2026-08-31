package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgpy {
    private final InputStream zza;

    private zzgpy(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzgpy zzb(byte[] bArr) {
        return new zzgpy(new ByteArrayInputStream(bArr));
    }

    public final zzhec zza() throws IOException {
        try {
            return zzhec.zze(this.zza, zzhhr.zza());
        } finally {
            this.zza.close();
        }
    }
}
