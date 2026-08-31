package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzaak implements zzabr {
    final /* synthetic */ zzaaq zza;
    private zzgjz zzb;
    private zzu zzc;
    private long zzd;
    private long zze;
    private int zzf;

    public zzaak(zzaaq zzaaqVar, Context context, int i7) {
        Objects.requireNonNull(zzaaqVar);
        this.zza = zzaaqVar;
        zzeo.zzS(context);
        this.zzb = zzgjz.zzi();
        this.zze = -9223372036854775807L;
        zzabo zzaboVar = zzabo.zzb;
    }

    private static final void zzy(zzu zzuVar) {
        zzs zzsVarZza = zzuVar.zza();
        zzsVarZza.zzC(zzaaq.zzC(zzuVar.zzE));
        zzsVarZza.zzM();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zza() {
        zzaaq zzaaqVar = this.zza;
        if (zzaaqVar.zzt()) {
            zzaaqVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzb() {
        zzaaq zzaaqVar = this.zza;
        if (zzaaqVar.zzt()) {
            zzaaqVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzc(zzabo zzaboVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzd(zzu zzuVar) {
        return this.zza.zzi(zzuVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzg(boolean z7) {
        this.zze = -9223372036854775807L;
        this.zza.zzm(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzh(boolean z7) {
        return this.zza.zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzi() {
        zzaaq zzaaqVar = this.zza;
        zzaaqVar.zzA(this.zze);
        if (zzaaqVar.zzy() >= zzaaqVar.zzz()) {
            zzaaqVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final Surface zzk() {
        zzghc.zzh(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzl(zzaar zzaarVar) {
        this.zza.zzp(zzaarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzm(float f7) {
        this.zza.zzq(f7);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzn(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzgjz.zzq(list);
        zzu zzuVar = this.zzc;
        if (zzuVar != null) {
            zzy(zzuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzo(long j7) {
        this.zzd = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzp(Surface surface, zzeg zzegVar) {
        this.zza.zzc(surface, zzegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzq() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzr(int i7) {
        this.zza.zzr(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzs(int i7, zzu zzuVar, long j7, int i8, List list) {
        zzghc.zzh(false);
        this.zzb = zzgjz.zzq(list);
        this.zzc = zzuVar;
        zzaaq zzaaqVar = this.zza;
        zzaaqVar.zzA(-9223372036854775807L);
        zzy(zzuVar);
        long j8 = this.zze;
        long j9 = -4611686018427387904L;
        if (zzaaqVar.zzt()) {
            if (j8 != -9223372036854775807L) {
                j9 = j8 + 1;
            }
        } else if (j8 != -9223372036854775807L) {
            return;
        }
        long j10 = j9;
        zzaaqVar.zzw().zza(j10, new zzaap(j7 + this.zzd, i8, j10));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzt() {
        zzaaq zzaaqVar = this.zza;
        if (zzaaqVar.zzw().zzc() == 0) {
            zzaaqVar.zzo();
            return;
        }
        zzek zzekVar = new zzek(10);
        boolean z7 = true;
        while (zzaaqVar.zzw().zzc() > 0) {
            zzaap zzaapVar = (zzaap) zzaaqVar.zzw().zzd();
            zzaapVar.getClass();
            if (z7) {
                int i7 = zzaapVar.zzb;
                if (i7 == 0 || i7 == 1) {
                    zzaapVar = new zzaap(zzaapVar.zza, 0, zzaapVar.zzc);
                } else {
                    zzaaqVar.zzo();
                }
            }
            zzekVar.zza(zzaapVar.zzc, zzaapVar);
            z7 = false;
        }
        zzaaqVar.zzx(zzekVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzu(long j7, zzabp zzabpVar) {
        int i7;
        zzghc.zzh(false);
        long j8 = j7 + this.zzd;
        zzaaq zzaaqVar = this.zza;
        long jZzb = zzaaqVar.zzv().zzb(j8);
        if (jZzb == -9223372036854775807L || zzaaqVar.zzu() == -9223372036854775807L || jZzb >= zzaaqVar.zzu() || (i7 = this.zzf) >= 2) {
            if (zzaaqVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i7 + 1;
        zzabpVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzv(long j7, long j8) {
        this.zza.zzl(j7 + this.zzd, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzw(boolean z7) {
        zzaaq zzaaqVar = this.zza;
        if (zzaaqVar.zzt()) {
            zzaaqVar.zzn(z7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzx() {
        this.zza.zzg();
    }
}
