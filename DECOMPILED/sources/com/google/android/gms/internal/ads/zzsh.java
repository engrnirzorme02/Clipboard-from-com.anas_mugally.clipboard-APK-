package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class zzsh extends zzhg {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzsh() {
        super(2, 0);
        this.zzi = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzhg, com.google.android.gms.internal.ads.zzhb
    public final void zza() {
        super.zza();
        this.zzh = 0;
    }

    public final void zzm(int i7) {
        this.zzi = i7;
    }

    public final long zzn() {
        return this.zzg;
    }

    public final int zzo() {
        return this.zzh;
    }

    public final boolean zzp() {
        return this.zzh > 0;
    }

    public final boolean zzq(zzhg zzhgVar) {
        ByteBuffer byteBuffer;
        zzghc.zza(!zzhgVar.zzi(1073741824));
        zzghc.zza(!zzhgVar.zzi(268435456));
        zzghc.zza(!zzhgVar.zzi(4));
        if (zzp()) {
            if (this.zzh >= this.zzi) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzhgVar.zzc;
            if (byteBuffer2 != null && (byteBuffer = this.zzc) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i7 = this.zzh;
        this.zzh = i7 + 1;
        if (i7 == 0) {
            this.zze = zzhgVar.zze;
            if (zzhgVar.zzi(1)) {
                zzg(1);
            }
        }
        ByteBuffer byteBuffer3 = zzhgVar.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzhgVar.zze;
        return true;
    }
}
