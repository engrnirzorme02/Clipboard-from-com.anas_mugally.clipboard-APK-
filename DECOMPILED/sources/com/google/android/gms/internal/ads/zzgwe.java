package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgwe {
    int[] zza;
    private final int zzb;

    public zzgwe(byte[] bArr, int i7) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgwc.zzd(bArr);
        this.zzb = i7;
    }

    abstract int[] zza(int[] iArr, int i7);

    abstract int zzb();

    public final byte[] zzc(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zzb()) {
            int iZzb = zzb();
            StringBuilder sb = new StringBuilder(String.valueOf(iZzb).length() + 36);
            sb.append("The nonce length (in bytes) must be ");
            sb.append(iZzb);
            throw new GeneralSecurityException(sb.toString());
        }
        int iRemaining = byteBuffer.remaining();
        int i7 = iRemaining / 64;
        for (int i8 = 0; i8 < i7 + 1; i8++) {
            ByteBuffer byteBufferZzd = zzd(bArr, this.zzb + i8);
            if (i8 == i7) {
                zzhfh.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, iRemaining % 64);
            } else {
                zzhfh.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, 64);
            }
        }
        return byteBufferAllocate.array();
    }

    final ByteBuffer zzd(byte[] bArr, int i7) {
        int[] iArrZza = zza(zzgwc.zzd(bArr), i7);
        int[] iArr = (int[]) iArrZza.clone();
        zzgwc.zzb(iArr);
        for (int i8 = 0; i8 < 16; i8++) {
            iArrZza[i8] = iArrZza[i8] + iArr[i8];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }
}
