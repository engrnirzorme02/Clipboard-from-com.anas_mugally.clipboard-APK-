package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrh {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzcf.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(ByteBuffer byteBuffer, long j7, int i7, int i8, boolean z7) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z7 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j7);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i7);
        byteBuffer.putInt(0);
        byteBuffer.put(zzgni.zza(i8));
    }

    public final void zza(zzhg zzhgVar, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i7;
        ByteBuffer byteBuffer2 = zzhgVar.zzc;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - zzhgVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = zzhgVar.zzc;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i8 = iLimit - iPosition;
        int i9 = (i8 + 255) / 255;
        int i10 = i9 + 27 + i8;
        if (this.zzd == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i10 += length + 44;
        } else {
            length = 0;
        }
        if (this.zzc.capacity() < i10) {
            this.zzc = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer4 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i7 = 22;
                zzc(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(zzgni.zza(length2));
                byteBuffer.put(bArr);
                int i11 = length2 + 28;
                byteBuffer.putInt(22, zzeo.zzH(byteBuffer.array(), byteBuffer.arrayOffset(), i11, 0));
                byteBuffer.position(i11);
            } else {
                byteBuffer = byteBuffer4;
                i7 = 22;
                byteBuffer.put(zza);
            }
            byteBuffer.put(zzb);
        } else {
            byteBuffer = byteBuffer4;
            i7 = 22;
        }
        int iZzc = this.zze + zzadr.zzc(byteBuffer3);
        this.zze = iZzc;
        int i12 = i7;
        ByteBuffer byteBuffer5 = byteBuffer;
        zzc(byteBuffer5, iZzc, this.zzd, i9, false);
        for (int i13 = 0; i13 < i9; i13++) {
            if (i8 >= 255) {
                byteBuffer5.put((byte) -1);
                i8 -= 255;
            } else {
                byteBuffer5.put((byte) i8);
                i8 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.zzd == 2) {
            byteBuffer5.putInt(length + 66, zzeo.zzH(byteBuffer5.array(), byteBuffer5.arrayOffset() + length + 44, byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i12, zzeo.zzH(byteBuffer5.array(), byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer5;
        zzhgVar.zza();
        zzhgVar.zzj(this.zzc.remaining());
        zzhgVar.zzc.put(this.zzc);
        zzhgVar.zzl();
    }

    public final void zzb() {
        this.zzc = zzcf.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
