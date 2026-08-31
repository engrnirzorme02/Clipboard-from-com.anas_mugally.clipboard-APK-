package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class zzom implements zzov {
    public static final zzght zza = zzok.zza;
    private static final Random zzb = new Random();
    private final zzbd zzc;
    private final zzbc zzd;
    private final HashMap zze;
    private zzou zzf;
    private zzbe zzg;
    private String zzh;
    private long zzi;

    public zzom() {
        throw null;
    }

    private final void zzl(zzme zzmeVar) {
        if (zzmeVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzol zzolVar = (zzol) this.zze.get(str);
                zzolVar.getClass();
                zzm(zzolVar);
                return;
            }
            return;
        }
        zzol zzolVar2 = (zzol) this.zze.get(this.zzh);
        int i7 = zzmeVar.zzc;
        zzup zzupVar = zzmeVar.zzd;
        this.zzh = zzo(i7, zzupVar).zze();
        zzc(zzmeVar);
        if (zzupVar == null || !zzupVar.zzb()) {
            return;
        }
        if (zzolVar2 != null) {
            if (zzolVar2.zzg() == zzupVar.zzd && zzolVar2.zzh() != null) {
                zzup zzupVarZzh = zzolVar2.zzh();
                if (zzupVarZzh.zzb == zzupVar.zzb) {
                    zzup zzupVarZzh2 = zzolVar2.zzh();
                    if (zzupVarZzh2.zzc == zzupVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i7, new zzup(zzupVar.zza, zzupVar.zzd));
    }

    private final void zzm(zzol zzolVar) {
        if (zzolVar.zzg() != -1) {
            this.zzi = zzolVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzol zzolVar = (zzol) this.zze.get(this.zzh);
        return (zzolVar == null || zzolVar.zzg() == -1) ? this.zzi + 1 : zzolVar.zzg();
    }

    private final zzol zzo(int i7, zzup zzupVar) {
        HashMap map = this.zze;
        long j7 = Long.MAX_VALUE;
        zzol zzolVar = null;
        for (zzol zzolVar2 : map.values()) {
            zzolVar2.zzc(i7, zzupVar);
            if (zzolVar2.zzb(i7, zzupVar)) {
                long jZzg = zzolVar2.zzg();
                if (jZzg == -1 || jZzg < j7) {
                    zzolVar = zzolVar2;
                    j7 = jZzg;
                } else if (jZzg == j7) {
                    String str = zzeo.zza;
                    if (zzolVar.zzh() != null && zzolVar2.zzh() != null) {
                        zzolVar = zzolVar2;
                    }
                }
            }
        }
        if (zzolVar != null) {
            return zzolVar;
        }
        String strZzp = zzp();
        zzol zzolVar3 = new zzol(this, strZzp, i7, zzupVar);
        map.put(strZzp, zzolVar3);
        return zzolVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final void zza(zzou zzouVar) {
        this.zzf = zzouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized String zzb(zzbe zzbeVar, zzup zzupVar) {
        return zzo(zzbeVar.zzo(zzupVar.zza, this.zzd).zzc, zzupVar).zze();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003e, B:23:0x0048, B:26:0x0051, B:28:0x0057, B:30:0x006c, B:31:0x0085, B:33:0x008b, B:34:0x008e, B:36:0x009a, B:38:0x00a0, B:44:0x00b1), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0048 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003e, B:23:0x0048, B:26:0x0051, B:28:0x0057, B:30:0x006c, B:31:0x0085, B:33:0x008b, B:34:0x008e, B:36:0x009a, B:38:0x00a0, B:44:0x00b1), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003e, B:23:0x0048, B:26:0x0051, B:28:0x0057, B:30:0x006c, B:31:0x0085, B:33:0x008b, B:34:0x008e, B:36:0x009a, B:38:0x00a0, B:44:0x00b1), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003e, B:23:0x0048, B:26:0x0051, B:28:0x0057, B:30:0x006c, B:31:0x0085, B:33:0x008b, B:34:0x008e, B:36:0x009a, B:38:0x00a0, B:44:0x00b1), top: B:47:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized void zzc(zzme zzmeVar) {
        int i7;
        zzol zzolVarZzo;
        Object obj;
        int i8;
        zzol zzolVarZzo2;
        zzol zzolVar;
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbe zzbeVar = zzmeVar.zzb;
            if (!zzbeVar.zzg()) {
                zzup zzupVar = zzmeVar.zzd;
                if (zzupVar == null) {
                    i7 = zzmeVar.zzc;
                    zzolVarZzo = zzo(i7, zzupVar);
                    if (this.zzh == null) {
                        this.zzh = zzolVarZzo.zze();
                    }
                    if (zzupVar != null) {
                        obj = zzupVar.zza;
                        long j7 = zzupVar.zzd;
                        i8 = zzupVar.zzb;
                        zzolVarZzo2 = zzo(i7, new zzup(obj, j7, i8));
                        if (!zzolVarZzo2.zzi()) {
                            zzolVarZzo2.zzj(true);
                            zzbc zzbcVar = this.zzd;
                            zzbeVar.zzo(obj, zzbcVar);
                            zzbcVar.zzc(i8);
                            Math.max(0L, zzeo.zzp(0L) + zzeo.zzp(0L));
                        }
                    }
                    if (!zzolVarZzo.zzi()) {
                        zzolVarZzo.zzj(true);
                    }
                    if (zzolVarZzo.zze().equals(this.zzh)) {
                        zzolVarZzo.zzl(true);
                        this.zzf.zzc(zzmeVar, zzolVarZzo.zze());
                    }
                } else if (zzupVar.zzd >= zzi() && ((zzolVar = (zzol) this.zze.get(this.zzh)) == null || zzolVar.zzg() != -1 || zzolVar.zzf() == zzmeVar.zzc)) {
                    i7 = zzmeVar.zzc;
                    zzolVarZzo = zzo(i7, zzupVar);
                    if (this.zzh == null) {
                        this.zzh = zzolVarZzo.zze();
                    }
                    if (zzupVar != null && zzupVar.zzb()) {
                        obj = zzupVar.zza;
                        long j8 = zzupVar.zzd;
                        i8 = zzupVar.zzb;
                        zzolVarZzo2 = zzo(i7, new zzup(obj, j8, i8));
                        if (!zzolVarZzo2.zzi()) {
                            zzolVarZzo2.zzj(true);
                            zzbc zzbcVar2 = this.zzd;
                            zzbeVar.zzo(obj, zzbcVar2);
                            zzbcVar2.zzc(i8);
                            Math.max(0L, zzeo.zzp(0L) + zzeo.zzp(0L));
                        }
                    }
                    if (!zzolVarZzo.zzi()) {
                        zzolVarZzo.zzj(true);
                    }
                    if (zzolVarZzo.zze().equals(this.zzh) && !zzolVarZzo.zzk()) {
                        zzolVarZzo.zzl(true);
                        this.zzf.zzc(zzmeVar, zzolVarZzo.zze());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized void zzd(zzme zzmeVar) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbe zzbeVar = this.zzg;
            this.zzg = zzmeVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzol zzolVar = (zzol) it.next();
                if (!zzolVar.zza(zzbeVar, this.zzg) || zzolVar.zzd(zzmeVar)) {
                    it.remove();
                    if (zzolVar.zzi()) {
                        if (zzolVar.zze().equals(this.zzh)) {
                            zzm(zzolVar);
                        }
                        this.zzf.zzd(zzmeVar, zzolVar.zze(), false);
                    }
                }
            }
            zzl(zzmeVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized void zze(zzme zzmeVar, int i7) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzol zzolVar = (zzol) it.next();
                if (zzolVar.zzd(zzmeVar)) {
                    it.remove();
                    if (zzolVar.zzi()) {
                        boolean zEquals = zzolVar.zze().equals(this.zzh);
                        boolean z7 = false;
                        if (i7 == 0 && zEquals && zzolVar.zzk()) {
                            z7 = true;
                        }
                        if (zEquals) {
                            zzm(zzolVar);
                        }
                        this.zzf.zzd(zzmeVar, zzolVar.zze(), z7);
                    }
                }
            }
            zzl(zzmeVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized void zzg(zzme zzmeVar) {
        zzou zzouVar;
        try {
            String str = this.zzh;
            if (str != null) {
                zzol zzolVar = (zzol) this.zze.get(str);
                if (zzolVar == null) {
                    throw null;
                }
                zzm(zzolVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzol zzolVar2 = (zzol) it.next();
                it.remove();
                if (zzolVar2.zzi() && (zzouVar = this.zzf) != null) {
                    zzouVar.zzd(zzmeVar, zzolVar2.zze(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ zzbd zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzbc zzk() {
        return this.zzd;
    }

    public zzom(zzght zzghtVar) {
        this.zzc = new zzbd();
        this.zzd = new zzbc();
        this.zze = new HashMap();
        this.zzg = zzbe.zza;
        this.zzi = -1L;
    }
}
