package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvn extends zzalf<zzvn, zza> implements zzamo {
    private static final zzvn zzc;
    private static volatile zzamv<zzvn> zzd;
    private int zze;
    private int zzf;
    private zzvq zzg;
    private zzajv zzh = zzajv.zza;

    public static final class zza extends zzalf.zzb<zzvn, zza> implements zzamo {
        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzvn.zza((zzvn) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzvn.zzc);
        }

        public final zza zza(zzvq zzvqVar) {
            zzg();
            zzvn.zza((zzvn) this.zza, zzvqVar);
            return this;
        }

        public final zza zza(int i7) {
            zzg();
            ((zzvn) this.zza).zzf = 0;
            return this;
        }
    }

    static {
        zzvn zzvnVar = new zzvn();
        zzc = zzvnVar;
        zzalf.zza((Class<zzvn>) zzvn.class, zzvnVar);
    }

    private zzvn() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamv<zzvn> zzf() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvq zzd() {
        zzvq zzvqVar = this.zzg;
        return zzvqVar == null ? zzvq.zze() : zzvqVar;
    }

    public final zzajv zze() {
        return this.zzh;
    }

    public static zzvn zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzvn) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalf
    protected final Object zza(int i7, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zzvm.zza[i7 - 1]) {
            case 1:
                return new zzvn();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzvn> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zzvn.class) {
                    try {
                        zzaVar = zzd;
                        if (zzaVar == null) {
                            zzaVar = new zzalf.zza(zzc);
                            zzd = zzaVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zzaVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    static /* synthetic */ void zza(zzvn zzvnVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzvnVar.zzh = zzajvVar;
    }

    static /* synthetic */ void zza(zzvn zzvnVar, zzvq zzvqVar) {
        zzvqVar.getClass();
        zzvnVar.zzg = zzvqVar;
        zzvnVar.zze |= 1;
    }
}
