package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzhgi extends FilterInputStream {
    private int zza;

    zzhgi(InputStream inputStream, int i7) {
        super(inputStream);
        this.zza = i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.zza <= 0) {
            return -1;
        }
        int i7 = super.read();
        if (i7 >= 0) {
            this.zza--;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) {
        int iSkip = (int) super.skip(Math.min(j7, this.zza));
        if (iSkip >= 0) {
            this.zza -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = this.zza;
        if (i9 <= 0) {
            return -1;
        }
        int i10 = super.read(bArr, i7, Math.min(i8, i9));
        if (i10 >= 0) {
            this.zza -= i10;
        }
        return i10;
    }
}
