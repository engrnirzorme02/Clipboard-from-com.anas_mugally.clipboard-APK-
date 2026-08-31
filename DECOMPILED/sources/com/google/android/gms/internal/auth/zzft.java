package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class zzft {
    private static final zzfs zza;
    private static final zzfs zzb;

    static {
        zzfs zzfsVar;
        try {
            zzfsVar = (zzfs) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzfsVar = null;
        }
        zza = zzfsVar;
        zzb = new zzfs();
    }

    static zzfs zza() {
        return zza;
    }

    static zzfs zzb() {
        return zzb;
    }
}
