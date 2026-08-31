package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzxe extends zzalf<zzxe, zza> implements zzamo {
    private static final zzxe zzc;
    private static volatile zzamv<zzxe> zzd;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    public static final class zza extends zzalf.zzb<zzxe, zza> implements zzamo {
        private zza() {
            super(zzxe.zzc);
        }
    }

    static {
        zzxe zzxeVar = new zzxe();
        zzc = zzxeVar;
        zzalf.zza((Class<zzxe>) zzxe.class, zzxeVar);
    }

    private zzxe() {
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalf
    protected final Object zza(int i7, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zzxg.zza[i7 - 1]) {
            case 1:
                return new zzxe();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzxe> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zzxe.class) {
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
}
