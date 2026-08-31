package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwl extends zzalf<zzwl, zza> implements zzamo {
    private static final zzwl zzc;
    private static volatile zzamv<zzwl> zzd;
    private int zze;
    private zzwo zzf;

    public static final class zza extends zzalf.zzb<zzwl, zza> implements zzamo {
        public final zza zza(zzwo zzwoVar) {
            zzg();
            zzwl.zza((zzwl) this.zza, zzwoVar);
            return this;
        }

        private zza() {
            super(zzwl.zzc);
        }
    }

    static {
        zzwl zzwlVar = new zzwl();
        zzc = zzwlVar;
        zzalf.zza((Class<zzwl>) zzwl.class, zzwlVar);
    }

    private zzwl() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zzwo zzc() {
        zzwo zzwoVar = this.zzf;
        return zzwoVar == null ? zzwo.zzf() : zzwoVar;
    }

    public static zzwl zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzwl) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalf
    protected final Object zza(int i7, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zzwn.zza[i7 - 1]) {
            case 1:
                return new zzwl();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzwl> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zzwl.class) {
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

    static /* synthetic */ void zza(zzwl zzwlVar, zzwo zzwoVar) {
        zzwoVar.getClass();
        zzwlVar.zzf = zzwoVar;
        zzwlVar.zze |= 1;
    }
}
