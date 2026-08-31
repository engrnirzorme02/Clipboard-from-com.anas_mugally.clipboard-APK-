package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzhjw implements zzhkk {
    private final zzhjs zza;
    private final zzhkv zzb;
    private final boolean zzc;
    private final zzhhs zzd;

    private zzhjw(zzhkv zzhkvVar, zzhhs zzhhsVar, zzhjs zzhjsVar) {
        this.zzb = zzhkvVar;
        this.zzc = zzhjsVar instanceof zzhid;
        this.zzd = zzhhsVar;
        this.zza = zzhjsVar;
    }

    static zzhjw zzh(zzhkv zzhkvVar, zzhhs zzhhsVar, zzhjs zzhjsVar) {
        return new zzhjw(zzhkvVar, zzhhsVar, zzhjsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final Object zza() {
        zzhjs zzhjsVar = this.zza;
        return zzhjsVar instanceof zzhih ? ((zzhih) zzhjsVar).zzbg() : zzhjsVar.zzdd().zzbt();
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final boolean zzb(Object obj, Object obj2) {
        if (!((zzhih) obj).zzt.equals(((zzhih) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzhid) obj).zza.equals(((zzhid) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final int zzc(Object obj) {
        int iHashCode = ((zzhih) obj).zzt.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzhid) obj).zza.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzd(Object obj, Object obj2) {
        zzhkm.zzI(this.zzb, obj, obj2);
        if (this.zzc) {
            zzhkm.zzH(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final int zze(Object obj) {
        int iZzh = ((zzhih) obj).zzt.zzh();
        return this.zzc ? iZzh + ((zzhid) obj).zza.zzg() : iZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzf(Object obj, zzhlk zzhlkVar) {
        Iterator itZzc = ((zzhid) obj).zza.zzc();
        while (itZzc.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzc.next();
            zzhhv zzhhvVar = (zzhhv) entry.getKey();
            if (zzhhvVar.zzc() != zzhlj.MESSAGE || zzhhvVar.zzd() || zzhhvVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzhiz) {
                zzhlkVar.zzv(zzhhvVar.zza(), ((zzhiz) entry).zza().zzc());
            } else {
                zzhlkVar.zzv(zzhhvVar.zza(), entry.getValue());
            }
        }
        ((zzhih) obj).zzt.zzf(zzhlkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzg(Object obj, zzhkf zzhkfVar, zzhhr zzhhrVar) {
        this.zzb.zzh(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzj(Object obj, byte[] bArr, int i7, int i8, zzhgp zzhgpVar) {
        zzhih zzhihVar = (zzhih) obj;
        if (zzhihVar.zzt == zzhkw.zza()) {
            zzhihVar.zzt = zzhkw.zzb();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzk(Object obj) {
        this.zzb.zzj(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final boolean zzl(Object obj) {
        return ((zzhid) obj).zza.zze();
    }
}
