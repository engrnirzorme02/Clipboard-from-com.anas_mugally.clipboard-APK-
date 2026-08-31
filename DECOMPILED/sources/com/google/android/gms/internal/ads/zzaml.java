package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaml {
    private final zzaeb zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzaml(zzaeb zzaebVar) {
        this.zza = zzaebVar;
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
    private final void zze(int i7) {
        long j7 = this.zzl;
        if (j7 != -9223372036854775807L) {
            long j8 = this.zzb;
            long j9 = this.zzk;
            if (j8 == j9) {
                return;
            }
            int i8 = (int) (j8 - j9);
            this.zza.zzx(j7, this.zzm ? 1 : 0, i8, i7, null);
        }
    }

    public final void zza() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzb(long j7, int i7, int i8, long j8, boolean z7) {
        this.zzg = false;
        this.zzh = false;
        this.zze = j8;
        this.zzd = 0;
        this.zzb = j7;
        if (i8 >= 32 && i8 != 40) {
            if (this.zzi && !this.zzj) {
                if (z7) {
                    zze(i7);
                }
                this.zzi = false;
            }
            if (i8 <= 35 || i8 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z8 = i8 >= 16 && i8 <= 21;
        this.zzc = z8;
        this.zzf = z8 || i8 <= 9;
    }

    public final void zzc(byte[] bArr, int i7, int i8) {
        if (this.zzf) {
            int i9 = this.zzd;
            int i10 = (i7 + 2) - i9;
            if (i10 >= i8) {
                this.zzd = i9 + (i8 - i7);
            } else {
                this.zzg = (bArr[i10] & 128) != 0;
                this.zzf = false;
            }
        }
    }

    public final void zzd(long j7, int i7, boolean z7) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z7 && this.zzi) {
                zze(i7 + ((int) (j7 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }
}
