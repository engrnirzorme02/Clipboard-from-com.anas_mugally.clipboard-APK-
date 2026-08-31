package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class zzcby implements zzhpj {
    private final ByteBuffer zza;

    zzcby(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zzhpj
    public final int zza(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhpj
    public final long zzb() {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzhpj
    public final long zzc() {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zzhpj
    public final void zzd(long j7) {
        this.zza.position((int) j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhpj
    public final ByteBuffer zze(long j7, long j8) {
        ByteBuffer byteBuffer = this.zza;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j7);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit((int) j8);
        byteBuffer.position(iPosition);
        return byteBufferSlice;
    }
}
