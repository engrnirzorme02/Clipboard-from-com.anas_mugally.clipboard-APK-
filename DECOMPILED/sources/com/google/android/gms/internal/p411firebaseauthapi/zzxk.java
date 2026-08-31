package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxk extends zzalf<zzxk, zza> implements zzamo {
    private static final zzxk zzc;
    private static volatile zzamv<zzxk> zzd;
    private int zze;
    private zzalm<zzb> zzf = zzalf.zzp();

    public static final class zza extends zzalf.zzb<zzxk, zza> implements zzamo {
        public final zza zza(zzb zzbVar) {
            zzg();
            zzxk.zza((zzxk) this.zza, zzbVar);
            return this;
        }

        private zza() {
            super(zzxk.zzc);
        }

        public final zza zza(int i7) {
            zzg();
            ((zzxk) this.zza).zze = i7;
            return this;
        }
    }

    public static final class zzb extends zzalf<zzb, zza> implements zzamo {
        private static final zzb zzc;
        private static volatile zzamv<zzb> zzd;
        private String zze = "";
        private int zzf;
        private int zzg;
        private int zzh;

        public static final class zza extends zzalf.zzb<zzb, zza> implements zzamo {
            public final zza zza(int i7) {
                zzg();
                ((zzb) this.zza).zzg = i7;
                return this;
            }

            private zza() {
                super(zzb.zzc);
            }

            public final zza zza(zzxz zzxzVar) {
                zzg();
                zzb.zza((zzb) this.zza, zzxzVar);
                return this;
            }

            public final zza zza(zzxc zzxcVar) {
                zzg();
                zzb.zza((zzb) this.zza, zzxcVar);
                return this;
            }

            public final zza zza(String str) {
                zzg();
                zzb.zza((zzb) this.zza, str);
                return this;
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzalf.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        public static zza zza() {
            return (zza) zzc.zzm();
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalf
        protected final Object zza(int i7, Object obj, Object obj2) {
            zzamv zzaVar;
            switch (zzxm.zza[i7 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    return zzalf.zza(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzamv<zzb> zzamvVar = zzd;
                    if (zzamvVar != null) {
                        return zzamvVar;
                    }
                    synchronized (zzb.class) {
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

        static /* synthetic */ void zza(zzb zzbVar, zzxz zzxzVar) {
            zzbVar.zzh = zzxzVar.zza();
        }

        static /* synthetic */ void zza(zzb zzbVar, zzxc zzxcVar) {
            zzbVar.zzf = zzxcVar.zza();
        }

        static /* synthetic */ void zza(zzb zzbVar, String str) {
            str.getClass();
            zzbVar.zze = str;
        }
    }

    static {
        zzxk zzxkVar = new zzxk();
        zzc = zzxkVar;
        zzalf.zza((Class<zzxk>) zzxk.class, zzxkVar);
    }

    private zzxk() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalf
    protected final Object zza(int i7, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zzxm.zza[i7 - 1]) {
            case 1:
                return new zzxk();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzb.class});
            case 4:
                return zzc;
            case 5:
                zzamv<zzxk> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zzxk.class) {
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

    static /* synthetic */ void zza(zzxk zzxkVar, zzb zzbVar) {
        zzbVar.getClass();
        zzalm<zzb> zzalmVar = zzxkVar.zzf;
        if (!zzalmVar.zzc()) {
            zzxkVar.zzf = zzalf.zza(zzalmVar);
        }
        zzxkVar.zzf.add(zzbVar);
    }
}
