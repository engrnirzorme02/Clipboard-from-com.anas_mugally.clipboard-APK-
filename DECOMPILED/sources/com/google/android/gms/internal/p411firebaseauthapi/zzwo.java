package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwo extends zzalf<zzwo, zza> implements zzamo {
    private static final zzwo zzc;
    private static volatile zzamv<zzwo> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public static final class zza extends zzalf.zzb<zzwo, zza> implements zzamo {
        public final zza zza(zzwk zzwkVar) {
            zzg();
            zzwo.zza((zzwo) this.zza, zzwkVar);
            return this;
        }

        private zza() {
            super(zzwo.zzc);
        }

        public final zza zza(zzwj zzwjVar) {
            zzg();
            zzwo.zza((zzwo) this.zza, zzwjVar);
            return this;
        }

        public final zza zza(zzwm zzwmVar) {
            zzg();
            zzwo.zza((zzwo) this.zza, zzwmVar);
            return this;
        }
    }

    static {
        zzwo zzwoVar = new zzwo();
        zzc = zzwoVar;
        zzalf.zza((Class<zzwo>) zzwo.class, zzwoVar);
    }

    private zzwo() {
    }

    public static zza zzd() {
        return (zza) zzc.zzm();
    }

    public static zzwo zzf() {
        return zzc;
    }

    public final zzwk zza() {
        zzwk zzwkVarZza = zzwk.zza(this.zzg);
        return zzwkVarZza == null ? zzwk.UNRECOGNIZED : zzwkVarZza;
    }

    public final zzwj zzb() {
        zzwj zzwjVarZza = zzwj.zza(this.zzf);
        return zzwjVarZza == null ? zzwj.UNRECOGNIZED : zzwjVarZza;
    }

    public final zzwm zzc() {
        zzwm zzwmVarZza = zzwm.zza(this.zze);
        return zzwmVarZza == null ? zzwm.UNRECOGNIZED : zzwmVarZza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalf
    protected final Object zza(int i7, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zzwq.zza[i7 - 1]) {
            case 1:
                return new zzwo();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzwo> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zzwo.class) {
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

    static /* synthetic */ void zza(zzwo zzwoVar, zzwk zzwkVar) {
        zzwoVar.zzg = zzwkVar.zza();
    }

    static /* synthetic */ void zza(zzwo zzwoVar, zzwj zzwjVar) {
        zzwoVar.zzf = zzwjVar.zza();
    }

    static /* synthetic */ void zza(zzwo zzwoVar, zzwm zzwmVar) {
        zzwoVar.zze = zzwmVar.zza();
    }
}
