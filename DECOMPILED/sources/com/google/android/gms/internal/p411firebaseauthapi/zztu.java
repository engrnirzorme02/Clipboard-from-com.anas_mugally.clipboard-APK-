package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zztu extends zzalf<zztu, zza> implements zzamo {
    private static final zztu zzc;
    private static volatile zzamv<zztu> zzd;
    private int zze;
    private int zzf;
    private zzua zzg;
    private zzajv zzh = zzajv.zza;

    public static final class zza extends zzalf.zzb<zztu, zza> implements zzamo {
        public final zza zza(zzajv zzajvVar) {
            zzg();
            zztu.zza((zztu) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zztu.zzc);
        }

        public final zza zza(zzua zzuaVar) {
            zzg();
            zztu.zza((zztu) this.zza, zzuaVar);
            return this;
        }
    }

    static {
        zztu zztuVar = new zztu();
        zzc = zztuVar;
        zzalf.zza((Class<zztu>) zztu.class, zztuVar);
    }

    private zztu() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamv<zztu> zzf() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzua zzd() {
        zzua zzuaVar = this.zzg;
        return zzuaVar == null ? zzua.zzd() : zzuaVar;
    }

    public final zzajv zze() {
        return this.zzh;
    }

    public static zztu zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zztu) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalf
    protected final Object zza(int i7, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zztw.zza[i7 - 1]) {
            case 1:
                return new zztu();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv<zztu> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zztu.class) {
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

    static /* synthetic */ void zza(zztu zztuVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zztuVar.zzh = zzajvVar;
    }

    static /* synthetic */ void zza(zztu zztuVar, zzua zzuaVar) {
        zzuaVar.getClass();
        zztuVar.zzg = zzuaVar;
        zztuVar.zze |= 1;
    }
}
