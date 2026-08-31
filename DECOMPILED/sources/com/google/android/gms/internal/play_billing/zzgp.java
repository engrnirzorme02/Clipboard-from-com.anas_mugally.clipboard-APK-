package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgp implements zzgv {
    private final zzgl zza;
    private final zzhh zzb;
    private final boolean zzc;
    private final zzev zzd;

    private zzgp(zzhh zzhhVar, zzev zzevVar, zzgl zzglVar) {
        this.zzb = zzhhVar;
        this.zzc = zzglVar instanceof zzff;
        this.zzd = zzevVar;
        this.zza = zzglVar;
    }

    static zzgp zzc(zzhh zzhhVar, zzev zzevVar, zzgl zzglVar) {
        return new zzgp(zzhhVar, zzevVar, zzglVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int zza(Object obj) {
        int iZzb = ((zzfi) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzff) obj).zzb.zzd() : iZzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int zzb(Object obj) {
        int iHashCode = ((zzfi) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzff) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final Object zze() {
        zzgl zzglVar = this.zza;
        return zzglVar instanceof zzfi ? ((zzfi) zzglVar).zzo() : zzglVar.zzK().zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzf(Object obj) {
        this.zzb.zzb(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzg(Object obj, Object obj2) {
        zzgx.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgx.zzo(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzh(Object obj, byte[] bArr, int i7, int i8, zzdw zzdwVar) {
        zzfi zzfiVar = (zzfi) obj;
        if (zzfiVar.zzc == zzhi.zzc()) {
            zzfiVar.zzc = zzhi.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzi(Object obj, zzhu zzhuVar) {
        Iterator itZzf = ((zzff) obj).zzb.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzey zzeyVar = (zzey) entry.getKey();
            if (zzeyVar.zzc() != zzht.MESSAGE || zzeyVar.zze() || zzeyVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzfs) {
                zzhuVar.zzw(zzeyVar.zza(), ((zzfs) entry).zza().zzb());
            } else {
                zzhuVar.zzw(zzeyVar.zza(), entry.getValue());
            }
        }
        ((zzfi) obj).zzc.zzk(zzhuVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean zzj(Object obj, Object obj2) {
        if (!((zzfi) obj).zzc.equals(((zzfi) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzff) obj).zzb.equals(((zzff) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean zzk(Object obj) {
        return ((zzff) obj).zzb.zzi();
    }
}
