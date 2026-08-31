package com.google.android.gms.internal.fido;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfj {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzfn zzb;

    static {
        zzfn zzfoVar;
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                zzfoVar = (zzfn) Class.forName(zza[i7]).asSubclass(zzfn.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                zzfoVar = null;
            }
            if (zzfoVar != null) {
                zzb = zzfoVar;
            }
        }
        zzfoVar = new zzfo();
        zzb = zzfoVar;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i7) {
        zzfk.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
