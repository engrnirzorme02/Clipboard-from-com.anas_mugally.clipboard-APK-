package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhh extends zzbe {
    private final int zzb;
    private final zzwi zzc;

    public zzhh(boolean z7, zzwi zzwiVar) {
        this.zzc = zzwiVar;
        this.zzb = zzwiVar.zza();
    }

    private final int zzw(int i7, boolean z7) {
        if (z7) {
            return this.zzc.zzb(i7);
        }
        if (i7 >= this.zzb - 1) {
            return -1;
        }
        return i7 + 1;
    }

    private final int zzx(int i7, boolean z7) {
        if (z7) {
            return this.zzc.zzc(i7);
        }
        if (i7 <= 0) {
            return -1;
        }
        return i7 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i7, zzbd zzbdVar, long j7) {
        int iZzq = zzq(i7);
        int iZzu = zzu(iZzq);
        int iZzt = zzt(iZzq);
        zzs(iZzq).zzb(i7 - iZzu, zzbdVar, j7);
        Object objZzv = zzv(iZzq);
        if (!zzbd.zza.equals(zzbdVar.zzb)) {
            objZzv = Pair.create(objZzv, zzbdVar.zzb);
        }
        zzbdVar.zzb = objZzv;
        zzbdVar.zzn += iZzt;
        zzbdVar.zzo += iZzt;
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i7, zzbc zzbcVar, boolean z7) {
        int iZzp = zzp(i7);
        int iZzu = zzu(iZzp);
        zzs(iZzp).zzd(i7 - zzt(iZzp), zzbcVar, z7);
        zzbcVar.zzc += iZzu;
        if (z7) {
            Object objZzv = zzv(iZzp);
            Object obj = zzbcVar.zzb;
            obj.getClass();
            zzbcVar.zzb = Pair.create(objZzv, obj);
        }
        return zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zze(Object obj) {
        int iZze;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iZzr = zzr(obj2);
            if (iZzr != -1 && (iZze = zzs(iZzr).zze(obj3)) != -1) {
                return zzt(iZzr) + iZze;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final Object zzf(int i7) {
        int iZzp = zzp(i7);
        return Pair.create(zzv(iZzp), zzs(iZzp).zzf(i7 - zzt(iZzp)));
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzh(int i7, int i8, boolean z7) {
        int iZzq = zzq(i7);
        int iZzu = zzu(iZzq);
        int iZzh = zzs(iZzq).zzh(i7 - iZzu, i8 == 2 ? 0 : i8, z7);
        if (iZzh != -1) {
            return iZzu + iZzh;
        }
        int iZzw = zzw(iZzq, z7);
        while (iZzw != -1 && zzs(iZzw).zzg()) {
            iZzw = zzw(iZzw, z7);
        }
        if (iZzw != -1) {
            return zzu(iZzw) + zzs(iZzw).zzk(z7);
        }
        if (i8 == 2) {
            return zzk(z7);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzi(int i7, int i8, boolean z7) {
        int iZzq = zzq(i7);
        int iZzu = zzu(iZzq);
        int iZzi = zzs(iZzq).zzi(i7 - iZzu, 0, false);
        if (iZzi != -1) {
            return iZzu + iZzi;
        }
        int iZzx = zzx(iZzq, false);
        while (iZzx != -1 && zzs(iZzx).zzg()) {
            iZzx = zzx(iZzx, false);
        }
        if (iZzx != -1) {
            return zzu(iZzx) + zzs(iZzx).zzj(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzj(boolean z7) {
        int i7 = this.zzb;
        if (i7 != 0) {
            int iZzd = z7 ? this.zzc.zzd() : i7 - 1;
            while (zzs(iZzd).zzg()) {
                iZzd = zzx(iZzd, z7);
                if (iZzd == -1) {
                }
            }
            return zzu(iZzd) + zzs(iZzd).zzj(z7);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzk(boolean z7) {
        if (this.zzb != 0) {
            int iZze = z7 ? this.zzc.zze() : 0;
            while (zzs(iZze).zzg()) {
                iZze = zzw(iZze, z7);
                if (iZze == -1) {
                }
            }
            return zzu(iZze) + zzs(iZze).zzk(z7);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbc zzo(Object obj, zzbc zzbcVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzr = zzr(obj2);
        int iZzu = zzu(iZzr);
        zzs(iZzr).zzo(obj3, zzbcVar);
        zzbcVar.zzc += iZzu;
        zzbcVar.zzb = obj;
        return zzbcVar;
    }

    protected abstract int zzp(int i7);

    protected abstract int zzq(int i7);

    protected abstract int zzr(Object obj);

    protected abstract zzbe zzs(int i7);

    protected abstract int zzt(int i7);

    protected abstract int zzu(int i7);

    protected abstract Object zzv(int i7);
}
