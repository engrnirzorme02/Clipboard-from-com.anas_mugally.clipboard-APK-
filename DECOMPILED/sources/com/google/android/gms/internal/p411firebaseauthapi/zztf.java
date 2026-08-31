package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zztf extends zzalf<zztf, zza> implements zzamo {
    private static final zztf zzc;
    private static volatile zzamv<zztf> zzd;
    private int zze;
    private int zzf;
    private zztl zzg;
    private zzwb zzh;

    public static final class zza extends zzalf.zzb<zztf, zza> implements zzamo {
        public final zza zza(zztl zztlVar) {
            zzg();
            zztf.zza((zztf) this.zza, zztlVar);
            return this;
        }

        private zza() {
            super(zztf.zzc);
        }

        public final zza zza(zzwb zzwbVar) {
            zzg();
            zztf.zza((zztf) this.zza, zzwbVar);
            return this;
        }
    }

    static {
        zztf zztfVar = new zztf();
        zzc = zztfVar;
        zzalf.zza((Class<zztf>) zztf.class, zztfVar);
    }

    private zztf() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamv<zztf> zzf() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztl zzd() {
        zztl zztlVar = this.zzg;
        return zztlVar == null ? zztl.zzd() : zztlVar;
    }

    public final zzwb zze() {
        zzwb zzwbVar = this.zzh;
        return zzwbVar == null ? zzwb.zzd() : zzwbVar;
    }

    public static zztf zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zztf) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalf
    protected final Object zza(int i7, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zzth.zza[i7 - 1]) {
            case 1:
                return new zztf();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv<zztf> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zztf.class) {
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

    static /* synthetic */ void zza(zztf zztfVar, zztl zztlVar) {
        zztlVar.getClass();
        zztfVar.zzg = zztlVar;
        zztfVar.zze |= 1;
    }

    static /* synthetic */ void zza(zztf zztfVar, zzwb zzwbVar) {
        zzwbVar.getClass();
        zztfVar.zzh = zzwbVar;
        zztfVar.zze |= 2;
    }
}
