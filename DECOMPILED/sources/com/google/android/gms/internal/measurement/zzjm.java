package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjm {
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    private zzjm() {
    }

    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context context) {
        return zza() && !zzd(context);
    }

    public static boolean zzc(Context context) {
        return !zza() || zzd(context);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
    private static boolean zzd(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzjm.class) {
            try {
                if (zzb) {
                    return true;
                }
                int i7 = 1;
                while (true) {
                    boolean z7 = false;
                    if (i7 <= 2) {
                        if (zza == null) {
                            zza = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = zza;
                        if (userManager == null) {
                            z7 = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z7 = true;
                                }
                            } catch (NullPointerException e7) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e7);
                                zza = null;
                                i7++;
                            }
                        }
                        if (z7) {
                            zzb = true;
                        }
                        return z7;
                    }
                    if (z7) {
                        zza = null;
                    }
                    if (z7) {
                        zzb = true;
                    }
                    return z7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
