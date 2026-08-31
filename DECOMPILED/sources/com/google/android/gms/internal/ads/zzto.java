package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzto implements zzur {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzuz zzc = new zzuz();
    private final zzrp zzd = new zzrp();
    private Looper zze;
    private zzbe zzf;
    private zzox zzg;

    protected void zzM() {
    }

    protected abstract void zza(zzgy zzgyVar);

    protected void zzc() {
    }

    protected abstract void zzd();

    protected final void zze(zzbe zzbeVar) {
        this.zzf = zzbeVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((zzuq) arrayList.get(i7)).zza(this, zzbeVar);
        }
    }

    protected final zzuz zzf(zzup zzupVar) {
        return this.zzc.zza(0, zzupVar);
    }

    protected final zzuz zzg(int i7, zzup zzupVar) {
        return this.zzc.zza(0, zzupVar);
    }

    protected final zzrp zzh(zzup zzupVar) {
        return this.zzd.zza(0, zzupVar);
    }

    protected final zzrp zzi(int i7, zzup zzupVar) {
        return this.zzd.zza(0, zzupVar);
    }

    protected final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    protected final zzox zzk() {
        zzox zzoxVar = this.zzg;
        zzoxVar.getClass();
        return zzoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzl(Handler handler, zzva zzvaVar) {
        this.zzc.zzb(handler, zzvaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzm(zzva zzvaVar) {
        this.zzc.zzc(zzvaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzn(Handler handler, zzrq zzrqVar) {
        this.zzd.zzb(handler, zzrqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzo(zzrq zzrqVar) {
        this.zzd.zzc(zzrqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzp(zzuq zzuqVar, zzgy zzgyVar, zzox zzoxVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z7 = true;
        if (looper != null && looper != looperMyLooper) {
            z7 = false;
        }
        zzghc.zza(z7);
        this.zzg = zzoxVar;
        zzbe zzbeVar = this.zzf;
        this.zza.add(zzuqVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzuqVar);
            zza(zzgyVar);
        } else if (zzbeVar != null) {
            zzq(zzuqVar);
            zzuqVar.zza(this, zzbeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzq(zzuq zzuqVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzuqVar);
        if (zIsEmpty) {
            zzM();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzr(zzuq zzuqVar) {
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(zzuqVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzs(zzuq zzuqVar) {
        ArrayList arrayList = this.zza;
        arrayList.remove(zzuqVar);
        if (!arrayList.isEmpty()) {
            zzr(zzuqVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzd();
    }
}
