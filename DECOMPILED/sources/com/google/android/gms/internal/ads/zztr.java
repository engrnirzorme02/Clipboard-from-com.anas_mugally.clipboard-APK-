package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zztr implements zzvi {
    private final zzada zza;
    private zzacu zzb;
    private zzacv zzc;

    public zztr(zzada zzadaVar) {
        this.zza = zzadaVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zza(zzi zziVar, Uri uri, Map map, long j7, long j8, zzacx zzacxVar) throws zzwr {
        zzacl zzaclVar = new zzacl(zziVar, j7, j8);
        this.zzc = zzaclVar;
        if (this.zzb != null) {
            return;
        }
        zzacu[] zzacuVarArrZzb = this.zza.zzb(uri, map);
        int length = zzacuVarArrZzb.length;
        zzgjw zzgjwVarZzv = zzgjz.zzv(length);
        if (length == 1) {
            this.zzb = zzacuVarArrZzb[0];
        } else {
            for (zzacu zzacuVar : zzacuVarArrZzb) {
                try {
                    if (zzacuVar.zzd(zzaclVar)) {
                        this.zzb = zzacuVar;
                        zzghc.zzh(true);
                        zzaclVar.zzl();
                        break;
                    } else {
                        zzgjwVarZzv.zzh(zzacuVar.zze());
                        boolean z7 = this.zzb != null || zzaclVar.zzn() == j7;
                        zzghc.zzh(z7);
                        zzaclVar.zzl();
                    }
                } catch (EOFException unused) {
                    if (this.zzb != null || zzaclVar.zzn() == j7) {
                    }
                } catch (Throwable th) {
                    zzghc.zzh(this.zzb != null || zzaclVar.zzn() == j7);
                    zzaclVar.zzl();
                    throw th;
                }
                zzghc.zzh(z7);
                zzaclVar.zzl();
            }
            if (this.zzb == null) {
                String strZzd = zzggw.zzd(zzgkp.zzc(zzgjz.zzr(zzacuVarArrZzb), zztq.zza), ", ");
                StringBuilder sb = new StringBuilder(strZzd.length() + 58);
                sb.append("None of the available extractors (");
                sb.append(strZzd);
                sb.append(") could read the stream.");
                throw new zzwr(sb.toString(), uri, zzgjwVarZzv.zzi());
            }
        }
        this.zzb.zzf(zzacxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzb() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzc() {
        zzacu zzacuVar = this.zzb;
        if (zzacuVar != null && (zzacuVar instanceof zzahg)) {
            ((zzahg) zzacuVar).zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final long zzd() {
        zzacv zzacvVar = this.zzc;
        if (zzacvVar != null) {
            return zzacvVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zze(long j7, long j8) {
        zzacu zzacuVar = this.zzb;
        zzacuVar.getClass();
        zzacuVar.zzh(j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final int zzf(zzads zzadsVar) {
        zzacv zzacvVar;
        zzacu zzacuVar = this.zzb;
        if (zzacuVar == null || (zzacvVar = this.zzc) == null) {
            throw null;
        }
        return zzacuVar.zzg(zzacvVar, zzadsVar);
    }
}
