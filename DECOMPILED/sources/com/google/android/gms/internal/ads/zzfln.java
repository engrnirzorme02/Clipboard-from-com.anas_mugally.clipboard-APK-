package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfln extends zzflj {
    private final zzfll zza;
    private zzfny zzc;
    private zzfmx zzd;
    private final String zzg;
    private final zzfml zzb = new zzfml();
    private boolean zze = false;
    private boolean zzf = false;

    zzfln(zzflk zzflkVar, zzfll zzfllVar, String str) {
        this.zza = zzfllVar;
        this.zzg = str;
        zzk(null);
        if (zzfllVar.zzi() == zzflm.HTML || zzfllVar.zzi() == zzflm.JAVASCRIPT) {
            this.zzd = new zzfmy(str, zzfllVar.zzf());
        } else {
            this.zzd = new zzfnb(str, zzfllVar.zze(), null);
        }
        this.zzd.zza();
        zzfmh.zza().zzb(this);
        this.zzd.zzj(zzflkVar);
    }

    private final void zzk(View view) {
        this.zzc = new zzfny(view);
    }

    @Override // com.google.android.gms.internal.ads.zzflj
    public final void zza() {
        if (this.zze || this.zzd == null) {
            return;
        }
        this.zze = true;
        zzfmh.zza().zzc(this);
        this.zzd.zzo(zzfmp.zza().zzg());
        this.zzd.zzn(zzfmf.zza().zzb());
        this.zzd.zzk(this, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzflj
    public final void zzb(View view) {
        if (this.zzf || zzi() == view) {
            return;
        }
        zzk(view);
        this.zzd.zzp();
        Collection<zzfln> collectionZze = zzfmh.zza().zze();
        if (collectionZze == null || collectionZze.isEmpty()) {
            return;
        }
        for (zzfln zzflnVar : collectionZze) {
            if (zzflnVar != this && zzflnVar.zzi() == view) {
                zzflnVar.zzc.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflj
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zzm();
        zzfmh.zza().zzd(this);
        this.zzd.zzb();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzflj
    public final void zzd(View view, zzflq zzflqVar, String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzflqVar, "Ad overlay");
    }

    public final List zzf() {
        return this.zzb.zza();
    }

    public final zzfmx zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzi() {
        return (View) this.zzc.get();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}
