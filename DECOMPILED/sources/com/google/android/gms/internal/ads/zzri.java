package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzri extends zzcg {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zzri() {
        byte[] bArr = zzeo.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final void zzs(boolean z7) {
        int i7;
        int length;
        int i8 = this.zzk;
        int length2 = this.zzi.length;
        if (i8 != length2) {
            if (!z7) {
                return;
            } else {
                z7 = true;
            }
        }
        if (this.zzh == 0) {
            if (z7) {
                zzu(i8, 3);
                length = i8;
            } else {
                zzghc.zzh(i8 >= (length2 >> 1));
                length = this.zzi.length >> 1;
                zzu(length, 0);
            }
            i7 = length;
        } else {
            int i9 = length2 >> 1;
            int i10 = i8 - i9;
            if (z7) {
                int iZzt = zzt(i10) + (this.zzi.length >> 1);
                zzu(iZzt, 2);
                int i11 = i9 + i10;
                i7 = iZzt;
                length = i11;
            } else {
                int iZzt2 = zzt(i10);
                zzu(iZzt2, 1);
                i7 = iZzt2;
                length = i10;
            }
        }
        if (length % this.zzd != 0) {
            throw new IllegalStateException(zzghs.zzd("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        zzghc.zzh(i8 >= i7);
        this.zzk -= length;
        int i12 = this.zzj + length;
        this.zzj = i12;
        this.zzj = i12 % this.zzi.length;
        int i13 = this.zzh;
        int i14 = this.zzd;
        this.zzh = i13 + (i7 / i14);
        this.zzg += (long) ((length - i7) / i14);
    }

    private final int zzt(int i7) {
        int iZzw = ((zzw(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        zzghc.zzh(iZzw >= 0);
        int iMin = (int) Math.min((i7 * 0.2f) + 0.5f, iZzw);
        int i8 = this.zzd;
        return (iMin / i8) * i8;
    }

    private final void zzu(int i7, int i8) {
        int i9;
        if (i7 == 0) {
            return;
        }
        zzghc.zza(this.zzk >= i7);
        if (i8 == 2) {
            int i10 = this.zzj;
            int i11 = this.zzk;
            int i12 = i10 + i11;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i12 <= length) {
                System.arraycopy(bArr, i12 - i7, this.zzl, 0, i7);
            } else {
                int i13 = i11 - (length - i10);
                if (i13 >= i7) {
                    System.arraycopy(bArr, i13 - i7, this.zzl, 0, i7);
                } else {
                    int i14 = i7 - i13;
                    System.arraycopy(bArr, length - i14, this.zzl, 0, i14);
                    System.arraycopy(this.zzi, 0, this.zzl, i14, i13);
                }
            }
        } else {
            int i15 = this.zzj;
            int i16 = i15 + i7;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i16 <= length2) {
                System.arraycopy(bArr2, i15, this.zzl, 0, i7);
            } else {
                int i17 = length2 - i15;
                System.arraycopy(bArr2, i15, this.zzl, 0, i17);
                System.arraycopy(this.zzi, 0, this.zzl, i17, i7 - i17);
            }
        }
        zzghc.zzd(i7 % this.zzd == 0, "sizeToOutput is not aligned to frame size: %s", i7);
        zzghc.zzh(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzghc.zzd(i7 % this.zzd == 0, "byteOutput size is not aligned to frame size %s", i7);
        if (i8 != 3) {
            for (int i18 = 0; i18 < i7; i18 += 2) {
                int i19 = i18 + 1;
                int iZzv = zzv(bArr3[i19], bArr3[i18]);
                if (i8 == 0) {
                    i9 = ((((i18 * zzbbn.zzq.zzf) / (i7 - 1)) * (-90)) / zzbbn.zzq.zzf) + 100;
                } else {
                    i9 = 10;
                    if (i8 == 2) {
                        i9 = 10 + (((90000 * i18) / (i7 - 1)) / zzbbn.zzq.zzf);
                    }
                }
                int i20 = (iZzv * i9) / 100;
                if (i20 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = 127;
                } else if (i20 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = -128;
                } else {
                    bArr3[i18] = (byte) (i20 & 255);
                    bArr3[i19] = (byte) (i20 >> 8);
                }
            }
        }
        zzk(i7).put(bArr3, 0, i7).flip();
    }

    private static int zzv(byte b7, byte b8) {
        return (b7 << 8) | (b8 & 255);
    }

    private final int zzw(long j7) {
        return (int) ((j7 * ((long) this.zzb.zzb)) / 1000000);
    }

    private static final boolean zzx(byte b7, byte b8) {
        return Math.abs(zzv(b7, b8)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzcg, com.google.android.gms.internal.ads.zzcf
    public final boolean zzc() {
        return super.zzc() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzd(ByteBuffer byteBuffer) {
        int iLimit;
        int i7;
        int iPosition;
        while (byteBuffer.hasRemaining() && !zzl()) {
            if (this.zzf != 0) {
                zzghc.zzh(this.zzj < this.zzi.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i8 = this.zzd;
                            iLimit = i8 * (iPosition2 / i8);
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i9 = this.zzj;
                int i10 = this.zzk;
                int i11 = i9 + i10;
                int length = this.zzi.length;
                if (i11 < length) {
                    i7 = length - i11;
                } else {
                    i11 = i10 - (length - i9);
                    i7 = i9 - i11;
                }
                int iMin = Math.min(iPosition3, i7);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.zzi, i11, iMin);
                int i12 = this.zzk + iMin;
                this.zzk = i12;
                zzghc.zzh(i12 <= this.zzi.length);
                boolean z7 = iLimit < iLimit2 && iPosition3 < i7;
                zzs(z7);
                if (z7) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.zzi.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i13 = this.zzd;
                            iPosition = ((iLimit4 / i13) * i13) + i13;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    zzk(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    protected final zzcc zzm(zzcc zzccVar) throws zzce {
        if (zzccVar.zzd == 2) {
            return zzccVar.zzb == -1 ? zzcc.zza : zzccVar;
        }
        throw new zzce("Unhandled input format:", zzccVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzn() {
        if (this.zzk > 0) {
            zzs(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzo() {
        if (zzc()) {
            int i7 = this.zzb.zzc;
            this.zzd = i7 + i7;
            int iZzw = zzw(100000L) / 2;
            int i8 = this.zzd;
            int i9 = (iZzw / i8) * i8;
            int i10 = i9 + i9;
            if (this.zzi.length != i10) {
                this.zzi = new byte[i10];
                this.zzl = new byte[i10];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzp() {
        this.zze = false;
        byte[] bArr = zzeo.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final void zzq(boolean z7) {
        this.zze = z7;
    }

    public final long zzr() {
        return this.zzg;
    }
}
