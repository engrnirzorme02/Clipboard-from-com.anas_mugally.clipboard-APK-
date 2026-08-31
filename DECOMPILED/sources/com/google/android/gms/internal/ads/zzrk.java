package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrk extends zzcg {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzeo.zzb;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzcf
    public final long zza(long j7) {
        return Math.max(0L, j7 - zzeo.zzr(this.zze + this.zzd, this.zzb.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzd(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i7 = iLimit - iPosition;
        if (i7 == 0) {
            return;
        }
        int iMin = Math.min(i7, this.zzg);
        this.zzj += (long) (iMin / this.zzb.zze);
        this.zzg -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.zzg <= 0) {
            int i8 = i7 - iMin;
            int length = (this.zzi + i8) - this.zzh.length;
            ByteBuffer byteBufferZzk = zzk(length);
            int i9 = this.zzi;
            String str = zzeo.zza;
            int iMax = Math.max(0, Math.min(length, i9));
            byteBufferZzk.put(this.zzh, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i8));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferZzk.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i10 = i8 - iMax2;
            int i11 = this.zzi - iMax;
            this.zzi = i11;
            byte[] bArr = this.zzh;
            System.arraycopy(bArr, iMax, bArr, 0, i11);
            byteBuffer.get(this.zzh, this.zzi, i10);
            this.zzi += i10;
            byteBufferZzk.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcg, com.google.android.gms.internal.ads.zzcf
    public final ByteBuffer zzf() {
        int i7;
        if (super.zzg() && (i7 = this.zzi) > 0) {
            zzk(i7).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcg, com.google.android.gms.internal.ads.zzcf
    public final boolean zzg() {
        return super.zzg() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcc zzm(zzcc zzccVar) throws zzce {
        if (!zzeo.zzA(zzccVar.zzd)) {
            throw new zzce("Unhandled input format:", zzccVar);
        }
        this.zzf = true;
        return (this.zzd == 0 && this.zze == 0) ? zzcc.zza : zzccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    protected final void zzn() {
        if (this.zzf) {
            int i7 = this.zzi;
            if (i7 > 0) {
                this.zzj += (long) (i7 / this.zzb.zze);
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    protected final void zzo() {
        if (this.zzf) {
            this.zzf = false;
            int i7 = this.zze;
            int i8 = this.zzb.zze;
            this.zzh = new byte[i7 * i8];
            this.zzg = this.zzd * i8;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    protected final void zzp() {
        this.zzh = zzeo.zzb;
    }

    public final void zzq(int i7, int i8) {
        this.zzd = i7;
        this.zze = i8;
    }

    public final void zzr() {
        this.zzj = 0L;
    }

    public final long zzs() {
        return this.zzj;
    }
}
