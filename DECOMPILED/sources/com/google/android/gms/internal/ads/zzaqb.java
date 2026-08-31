package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqb extends FilterInputStream {
    private final long zza;
    private long zzb;

    zzaqb(InputStream inputStream, long j7) {
        super(inputStream);
        this.zza = j7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i7 = super.read();
        if (i7 != -1) {
            this.zzb++;
        }
        return i7;
    }

    final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = super.read(bArr, i7, i8);
        if (i9 != -1) {
            this.zzb += (long) i9;
        }
        return i9;
    }
}
