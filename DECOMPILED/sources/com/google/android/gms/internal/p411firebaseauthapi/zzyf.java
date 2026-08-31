package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyf extends zzalf<zzyf, zza> implements zzamo {
    private static final zzyf zzc;
    private static volatile zzamv<zzyf> zzd;
    private int zze;
    private int zzf;
    private zzyl zzg;
    private zzajv zzh = zzajv.zza;

    public static final class zza extends zzalf.zzb<zzyf, zza> implements zzamo {
        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzyf.zza((zzyf) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzyf.zzc);
        }

        public final zza zza(zzyl zzylVar) {
            zzg();
            zzyf.zza((zzyf) this.zza, zzylVar);
            return this;
        }
    }

    static {
        zzyf zzyfVar = new zzyf();
        zzc = zzyfVar;
        zzalf.zza((Class<zzyf>) zzyf.class, zzyfVar);
    }

    private zzyf() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzyl zzd() {
        zzyl zzylVar = this.zzg;
        return zzylVar == null ? zzyl.zzd() : zzylVar;
    }

    public final zzajv zze() {
        return this.zzh;
    }

    public static zzyf zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzyf) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalf
    protected final Object zza(int i7, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zzye.zza[i7 - 1]) {
            case 1:
                return new zzyf();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzyf> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zzyf.class) {
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

    static /* synthetic */ void zza(zzyf zzyfVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzyfVar.zzh = zzajvVar;
    }

    static /* synthetic */ void zza(zzyf zzyfVar, zzyl zzylVar) {
        zzylVar.getClass();
        zzyfVar.zzg = zzylVar;
        zzyfVar.zze |= 1;
    }
}
