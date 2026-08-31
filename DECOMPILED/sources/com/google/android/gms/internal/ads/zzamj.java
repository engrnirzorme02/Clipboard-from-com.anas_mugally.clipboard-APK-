package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
final class zzamj {
    private final zzaeb zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzamj(zzaeb zzaebVar, boolean z7, boolean z8) {
        this.zza = zzaebVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzfm(bArr, 0, 0);
        this.zzh = false;
    }

    public final void zza(zzfk zzfkVar) {
        this.zzb.append(zzfkVar.zzd, zzfkVar);
    }

    public final void zzb(zzfj zzfjVar) {
        this.zzc.append(zzfjVar.zza, zzfjVar);
    }

    public final void zzc() {
        this.zzh = false;
    }

    public final void zzd(long j7, int i7, long j8, boolean z7) {
        this.zze = i7;
        this.zzg = j8;
        this.zzf = j7;
        this.zzl = z7;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zze(long j7, int i7, boolean z7) {
        boolean z8 = false;
        if (this.zze == 9) {
            if (z7 && this.zzh) {
                long j8 = this.zzf;
                int i8 = i7 + ((int) (j7 - j8));
                long j9 = this.zzj;
                if (j9 != -9223372036854775807L) {
                    long j10 = this.zzi;
                    if (j8 != j10) {
                        this.zza.zzx(j9, this.zzk ? 1 : 0, (int) (j8 - j10), i8, null);
                    }
                }
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        boolean z9 = this.zzl;
        boolean z10 = this.zzk;
        int i9 = this.zze;
        if (i9 == 5 || (z9 && i9 == 1)) {
            z8 = true;
        }
        boolean z11 = z10 | z8;
        this.zzk = z11;
        this.zze = 24;
        return z11;
    }
}
