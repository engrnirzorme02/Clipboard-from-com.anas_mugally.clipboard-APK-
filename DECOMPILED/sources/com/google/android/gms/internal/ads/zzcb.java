package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcb {
    private final zzgjz zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzcb(zzgjz zzgjzVar) {
        this.zza = zzgjzVar;
        zzcc zzccVar = zzcc.zza;
        this.zzd = false;
    }

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z7;
        do {
            z7 = false;
            for (int i7 = 0; i7 <= zzj(); i7++) {
                if (!this.zzc[i7].hasRemaining()) {
                    List list = this.zzb;
                    zzcf zzcfVar = (zzcf) list.get(i7);
                    if (!zzcfVar.zzg()) {
                        ByteBuffer byteBuffer2 = i7 > 0 ? this.zzc[i7 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzcf.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzcfVar.zzd(byteBuffer2);
                        this.zzc[i7] = zzcfVar.zzf();
                        boolean z8 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i7].hasRemaining()) {
                            z8 = false;
                        }
                        z7 |= z8;
                    } else if (!this.zzc[i7].hasRemaining() && i7 < zzj()) {
                        ((zzcf) list.get(i7 + 1)).zze();
                    }
                }
            }
        } while (z7);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcb)) {
            return false;
        }
        zzgjz zzgjzVar = this.zza;
        int size = zzgjzVar.size();
        zzgjz zzgjzVar2 = ((zzcb) obj).zza;
        if (size != zzgjzVar2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < zzgjzVar.size(); i7++) {
            if (zzgjzVar.get(i7) != zzgjzVar2.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcc zza(zzcc zzccVar) throws zzce {
        zzcc zzccVar2 = zzcc.zza;
        if (zzccVar.equals(zzccVar2)) {
            throw new zzce("Unhandled input format:", zzccVar);
        }
        int i7 = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i7 >= zzgjzVar.size()) {
                return zzccVar;
            }
            zzcf zzcfVar = (zzcf) zzgjzVar.get(i7);
            zzcc zzccVarZzb = zzcfVar.zzb(zzccVar);
            if (zzcfVar.zzc()) {
                zzghc.zzh(!zzccVarZzb.equals(zzccVar2));
                zzccVar = zzccVarZzb;
            }
            i7++;
        }
    }

    public final void zzb(zzcd zzcdVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        long jZza = zzcdVar.zzb;
        int i7 = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i7 >= zzgjzVar.size()) {
                break;
            }
            zzcf zzcfVar = (zzcf) zzgjzVar.get(i7);
            zzcfVar.zzi(new zzcd(jZza));
            if (zzcfVar.zzc()) {
                jZza = zzcfVar.zza(jZza);
                zzghc.zzh(jZza >= 0);
                list.add(zzcfVar);
            }
            i7++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i8 = 0; i8 <= zzj(); i8++) {
            this.zzc[i8] = ((zzcf) list.get(i8)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzcf.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(zzcf.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzcf) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((zzcf) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i7 = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i7 >= zzgjzVar.size()) {
                this.zzc = new ByteBuffer[0];
                zzcc zzccVar = zzcc.zza;
                this.zzd = false;
                return;
            } else {
                zzcf zzcfVar = (zzcf) zzgjzVar.get(i7);
                zzcfVar.zzi(zzcd.zza);
                zzcfVar.zzj();
                i7++;
            }
        }
    }
}
