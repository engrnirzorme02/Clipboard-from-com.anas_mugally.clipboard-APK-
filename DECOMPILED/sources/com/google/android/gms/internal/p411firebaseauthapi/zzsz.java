package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsz extends zzalf<zzsz, zza> implements zzamo {
    private static final zzsz zzc;
    private static volatile zzamv<zzsz> zzd;
    private int zze;
    private int zzf;
    private zztc zzg;

    public static final class zza extends zzalf.zzb<zzsz, zza> implements zzamo {
        public final zza zza(int i7) {
            zzg();
            ((zzsz) this.zza).zzf = i7;
            return this;
        }

        private zza() {
            super(zzsz.zzc);
        }

        public final zza zza(zztc zztcVar) {
            zzg();
            zzsz.zza((zzsz) this.zza, zztcVar);
            return this;
        }
    }

    static {
        zzsz zzszVar = new zzsz();
        zzc = zzszVar;
        zzalf.zza((Class<zzsz>) zzsz.class, zzszVar);
    }

    private zzsz() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztc zzd() {
        zztc zztcVar = this.zzg;
        return zztcVar == null ? zztc.zzd() : zztcVar;
    }

    public static zzsz zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzsz) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalf
    protected final Object zza(int i7, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zztb.zza[i7 - 1]) {
            case 1:
                return new zzsz();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzsz> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zzsz.class) {
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

    static /* synthetic */ void zza(zzsz zzszVar, zztc zztcVar) {
        zztcVar.getClass();
        zzszVar.zzg = zztcVar;
        zzszVar.zze |= 1;
    }
}
