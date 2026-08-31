package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaaq implements zzbs {
    private final Context zza;
    private final zzbr zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzabr zze;
    private final zzdb zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzaav zzi;
    private zzek zzj = new zzek(10);
    private zzu zzk;
    private zzdl zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    /* synthetic */ zzaaq(zzaai zzaaiVar, byte[] bArr) {
        this.zza = zzaaiVar.zze();
        zzbr zzbrVarZzg = zzaaiVar.zzg();
        zzbrVarZzg.getClass();
        this.zzb = zzbrVarZzg;
        this.zzc = new SparseArray();
        zzgjz.zzi();
        this.zzd = zzaaiVar.zzh();
        zzdb zzdbVarZzi = zzaaiVar.zzi();
        this.zzf = zzdbVarZzi;
        this.zzh = zzaaiVar.zzj() != -9223372036854775807L ? -zzaaiVar.zzj() : -9223372036854775807L;
        zzaav zzaavVarZzk = zzaaiVar.zzk();
        this.zzi = zzaavVarZzk;
        this.zze = new zzzv(zzaaiVar.zzf(), zzaavVarZzk, zzdbVarZzi);
        new zzaah(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzs().zzM();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzh zzC(zzh zzhVar) {
        return (zzhVar == null || !zzhVar.zzf()) ? zzh.zza : zzhVar;
    }

    final /* synthetic */ void zzA(long j7) {
        this.zzq = j7;
    }

    public final void zza(int i7) {
        this.zzr = 1;
    }

    public final zzabr zzb(int i7) {
        SparseArray sparseArray = this.zzc;
        if (zzeo.zza(sparseArray, 0)) {
            return (zzabr) sparseArray.get(0);
        }
        zzaak zzaakVar = new zzaak(this, this.zza, 0);
        this.zzg.add(zzaakVar);
        sparseArray.put(0, zzaakVar);
        return zzaakVar;
    }

    public final void zzc(Surface surface, zzeg zzegVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzeg) this.zzm.second).equals(zzegVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzegVar);
        zzegVar.zza();
        zzegVar.zzb();
    }

    public final void zzd() {
        zzeg zzegVar = zzeg.zza;
        zzegVar.zza();
        zzegVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdl zzdlVar = this.zzl;
        if (zzdlVar != null) {
            zzdlVar.zzl(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[Catch: zzdi -> 0x0031, TRY_LEAVE, TryCatch #1 {zzdi -> 0x0031, blocks: (B:7:0x0010, B:9:0x0015, B:11:0x001b, B:14:0x0023, B:18:0x0034, B:20:0x003a, B:23:0x0041, B:28:0x0062), top: B:40:0x0010 }] */
    final /* synthetic */ boolean zzi(zzu zzuVar, int i7) throws zzabq {
        zzghc.zzh(this.zzo == 0);
        zzh zzhVarZzC = zzC(zzuVar.zzE);
        try {
            int i8 = zzhVarZzC.zzd;
            if (i8 != 7) {
                if (zzdj.zzc(i8) && Build.VERSION.SDK_INT >= 29) {
                    Object[] objArr = {Integer.valueOf(i8)};
                    String str = zzeo.zza;
                    zzds.zzc("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                    zzhVarZzC = zzh.zza;
                } else if (i8 != 2 || i8 == 10) {
                    zzhVarZzC = zzh.zza;
                }
            } else if (Build.VERSION.SDK_INT >= 34 || !zzdj.zzd()) {
                i8 = 7;
                if (zzdj.zzc(i8)) {
                    if (i8 != 2) {
                        zzhVarZzC = zzh.zza;
                    } else {
                        zzhVarZzC = zzh.zza;
                    }
                } else if (i8 != 2) {
                    zzhVarZzC = zzh.zza;
                } else {
                    zzhVarZzC = zzh.zza;
                }
            } else {
                zzg zzgVarZzd = zzhVarZzC.zzd();
                zzgVarZzd.zzc(6);
                zzhVarZzC = zzgVarZzd.zzg();
            }
            zzh zzhVar = zzhVarZzC;
            zzdb zzdbVar = this.zzf;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            final zzdl zzdlVarZzd = zzdbVar.zzd(looperMyLooper, null);
            this.zzl = zzdlVarZzd;
            try {
                zzbr zzbrVar = this.zzb;
                Context context = this.zza;
                zzk zzkVar = zzk.zzb;
                Objects.requireNonNull(zzdlVarZzd);
                zzbrVar.zza(context, zzhVar, zzkVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzaaj
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zzdlVarZzd.zzm(runnable);
                    }
                }, 0L, false);
                throw null;
            } catch (zzbn e7) {
                throw new zzabq(e7, zzuVar);
            }
        } catch (zzdi e8) {
            throw new zzabq(e8, zzuVar);
        }
    }

    final /* synthetic */ boolean zzj(boolean z7) {
        return this.zze.zzh(false);
    }

    final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    final /* synthetic */ void zzl(long j7, long j8) {
        this.zze.zzv(j7, j8);
    }

    final /* synthetic */ void zzm(boolean z7) {
        if (this.zzo == 1) {
            this.zzn++;
            zzabr zzabrVar = this.zze;
            zzabrVar.zzg(z7);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzaap zzaapVar = (zzaap) this.zzj.zzd();
                zzaapVar.getClass();
                zzabrVar.zzs(1, this.zzk, zzaapVar.zza, zzaapVar.zzb, zzgjz.zzi());
            }
            this.zzp = -9223372036854775807L;
            this.zzq = -9223372036854775807L;
            zzdl zzdlVar = this.zzl;
            zzdlVar.getClass();
            zzdlVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaal
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    final /* synthetic */ void zzn(boolean z7) {
        this.zze.zzw(z7);
    }

    final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    final /* synthetic */ void zzp(zzaar zzaarVar) {
        this.zze.zzl(zzaarVar);
    }

    final /* synthetic */ void zzq(float f7) {
        this.zzi.zzc(f7);
        this.zze.zzm(f7);
    }

    final /* synthetic */ void zzr(int i7) {
        this.zze.zzr(i7);
    }

    final /* synthetic */ boolean zzs() {
        int i7 = this.zzr;
        return i7 != -1 && i7 == 0;
    }

    final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    final /* synthetic */ long zzu() {
        return this.zzh;
    }

    final /* synthetic */ zzaav zzv() {
        return this.zzi;
    }

    final /* synthetic */ zzek zzw() {
        return this.zzj;
    }

    final /* synthetic */ void zzx(zzek zzekVar) {
        this.zzj = zzekVar;
    }

    final /* synthetic */ long zzy() {
        return this.zzp;
    }

    final /* synthetic */ long zzz() {
        return this.zzq;
    }
}
