package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfqa {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfqb zzc;
    private final zzfoh zzd;
    private final zzfoc zze;
    private final boolean zzf;
    private zzfpp zzg;
    private final Object zzh = new Object();

    public zzfqa(Context context, zzfqb zzfqbVar, zzfoh zzfohVar, zzfoc zzfocVar, boolean z7) {
        this.zzb = context;
        this.zzc = zzfqbVar;
        this.zzd = zzfohVar;
        this.zze = zzfocVar;
        this.zzf = z7;
    }

    private final synchronized Class zzd(zzfpq zzfpqVar) {
        try {
            if (zzfpqVar.zza() == null) {
                throw new zzfpz(4010, "mc");
            }
            String strZza = zzfpqVar.zza().zza();
            HashMap map = zza;
            Class cls = (Class) map.get(strZza);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfpqVar.zzb())) {
                    throw new zzfpz(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzc = zzfpqVar.zzc();
                    if (!fileZzc.exists()) {
                        fileZzc.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzfpqVar.zzb().getAbsolutePath(), fileZzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZza, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e7) {
                    e = e7;
                    throw new zzfpz(2008, e);
                } catch (IllegalArgumentException e8) {
                    e = e8;
                    throw new zzfpz(2008, e);
                } catch (SecurityException e9) {
                    e = e9;
                    throw new zzfpz(2008, e);
                }
            } catch (GeneralSecurityException e10) {
                throw new zzfpz(2026, e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean zza(zzfpq zzfpqVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfpp zzfppVar = new zzfpp(zzd(zzfpqVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfpqVar.zzd(), null, new Bundle(), 2), zzfpqVar, this.zzc, this.zzd, this.zzf);
                if (!zzfppVar.zzf()) {
                    throw new zzfpz(4000, "init failed");
                }
                int iZzh = zzfppVar.zzh();
                if (iZzh != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzh).length() + 4);
                    sb.append("ci: ");
                    sb.append(iZzh);
                    throw new zzfpz(4001, sb.toString());
                }
                synchronized (this.zzh) {
                    zzfpp zzfppVar2 = this.zzg;
                    if (zzfppVar2 != null) {
                        try {
                            zzfppVar2.zzg();
                        } catch (zzfpz e7) {
                            this.zzd.zzc(e7.zza(), -1L, e7);
                        }
                        this.zzg = zzfppVar;
                    } else {
                        this.zzg = zzfppVar;
                    }
                    throw th;
                }
                this.zzd.zzb(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e8) {
                throw new zzfpz(2004, e8);
            }
        } catch (zzfpz e9) {
            this.zzd.zzc(e9.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e9);
            return false;
        } catch (Exception e10) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return false;
        }
    }

    public final zzfok zzb() {
        zzfpp zzfppVar;
        synchronized (this.zzh) {
            zzfppVar = this.zzg;
        }
        return zzfppVar;
    }

    public final zzfpq zzc() {
        synchronized (this.zzh) {
            try {
                zzfpp zzfppVar = this.zzg;
                if (zzfppVar == null) {
                    return null;
                }
                return zzfppVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
