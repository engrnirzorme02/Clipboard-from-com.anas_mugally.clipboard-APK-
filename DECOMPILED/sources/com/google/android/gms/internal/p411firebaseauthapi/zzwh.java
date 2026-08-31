package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwh extends zzalf<zzwh, zza> implements zzamo {
    private static final zzwh zzc;
    private static volatile zzamv<zzwh> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzalf.zzb<zzwh, zza> implements zzamo {
        public final zza zza(zzvy zzvyVar) {
            zzg();
            zzwh.zza((zzwh) this.zza, zzvyVar);
            return this;
        }

        private zza() {
            super(zzwh.zzc);
        }

        public final zza zza(int i7) {
            zzg();
            ((zzwh) this.zza).zzf = i7;
            return this;
        }
    }

    static {
        zzwh zzwhVar = new zzwh();
        zzc = zzwhVar;
        zzalf.zza((Class<zzwh>) zzwh.class, zzwhVar);
    }

    private zzwh() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzwh zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvy zzb() {
        zzvy zzvyVarZza = zzvy.zza(this.zze);
        return zzvyVarZza == null ? zzvy.UNRECOGNIZED : zzvyVarZza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalf
    protected final Object zza(int i7, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zzwg.zza[i7 - 1]) {
            case 1:
                return new zzwh();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzwh> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zzwh.class) {
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

    static /* synthetic */ void zza(zzwh zzwhVar, zzvy zzvyVar) {
        zzwhVar.zze = zzvyVar.zza();
    }
}
