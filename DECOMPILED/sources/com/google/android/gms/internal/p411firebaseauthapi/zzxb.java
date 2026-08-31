package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxb extends zzalf<zzxb, zza> implements zzamo {
    private static final zzxb zzc;
    private static volatile zzamv<zzxb> zzd;
    private String zze = "";
    private zzajv zzf = zzajv.zza;
    private int zzg;

    public static final class zza extends zzalf.zzb<zzxb, zza> implements zzamo {
        public final zza zza(zzxz zzxzVar) {
            zzg();
            zzxb.zza((zzxb) this.zza, zzxzVar);
            return this;
        }

        private zza() {
            super(zzxb.zzc);
        }

        public final zza zza(String str) {
            zzg();
            zzxb.zza((zzxb) this.zza, str);
            return this;
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzxb.zza((zzxb) this.zza, zzajvVar);
            return this;
        }
    }

    static {
        zzxb zzxbVar = new zzxb();
        zzc = zzxbVar;
        zzalf.zza((Class<zzxb>) zzxb.class, zzxbVar);
    }

    private zzxb() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzxb zzc() {
        return zzc;
    }

    public final zzxz zzd() {
        zzxz zzxzVarZza = zzxz.zza(this.zzg);
        return zzxzVarZza == null ? zzxz.UNRECOGNIZED : zzxzVarZza;
    }

    public final zzajv zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public static zza zza(zzxb zzxbVar) {
        return (zza) zzc.zzm().zza(zzxbVar);
    }

    public static zzxb zza(byte[] bArr, zzaku zzakuVar) {
        return (zzxb) zzalf.zza(zzc, bArr, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalf
    protected final Object zza(int i7, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zzxd.zza[i7 - 1]) {
            case 1:
                return new zzxb();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzxb> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zzxb.class) {
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

    static /* synthetic */ void zza(zzxb zzxbVar, zzxz zzxzVar) {
        zzxbVar.zzg = zzxzVar.zza();
    }

    static /* synthetic */ void zza(zzxb zzxbVar, String str) {
        str.getClass();
        zzxbVar.zze = str;
    }

    static /* synthetic */ void zza(zzxb zzxbVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzxbVar.zzf = zzajvVar;
    }
}
