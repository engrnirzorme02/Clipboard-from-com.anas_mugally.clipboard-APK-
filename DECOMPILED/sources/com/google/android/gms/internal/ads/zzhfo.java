package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhfo {
    public static final zzhfo zza = new zzhfo(new zzhfp());
    public static final zzhfo zzb = new zzhfo(new zzhft());
    private final zzhfn zzc;

    static {
        new zzhfo(new zzhfv());
        new zzhfo(new zzhfu());
        new zzhfo(new zzhfq());
        new zzhfo(new zzhfs());
        new zzhfo(new zzhfr());
    }

    public zzhfo(zzhfw zzhfwVar) {
        this.zzc = !zzgxe.zza() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzhfk(zzhfwVar, null) : new zzhfl(zzhfwVar, null) : new zzhfm(zzhfwVar, null);
    }

    public static List zza(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zzb(String str) {
        return this.zzc.zza(str);
    }
}
