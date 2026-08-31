package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzco {
    private static final String zza;
    private static final String zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;

    static {
        String str = zzeo.zza;
        zza = Integer.toString(0, 36);
        zzb = Integer.toString(1, 36);
        zzc = Integer.toString(2, 36);
        zzd = Integer.toString(3, 36);
        zze = Integer.toString(4, 36);
    }

    public static ArrayList zza(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (zzcq zzcqVar : (zzcq[]) spanned.getSpans(0, spanned.length(), zzcq.class)) {
            arrayList.add(zzb(spanned, zzcqVar, 1, zzcqVar.zza()));
        }
        for (zzcs zzcsVar : (zzcs[]) spanned.getSpans(0, spanned.length(), zzcs.class)) {
            arrayList.add(zzb(spanned, zzcsVar, 2, zzcsVar.zza()));
        }
        for (zzcp zzcpVar : (zzcp[]) spanned.getSpans(0, spanned.length(), zzcp.class)) {
            arrayList.add(zzb(spanned, zzcpVar, 3, null));
        }
        for (zzct zzctVar : (zzct[]) spanned.getSpans(0, spanned.length(), zzct.class)) {
            arrayList.add(zzb(spanned, zzctVar, 4, zzctVar.zza()));
        }
        return arrayList;
    }

    private static Bundle zzb(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(zza, spanned.getSpanStart(obj));
        bundle2.putInt(zzb, spanned.getSpanEnd(obj));
        bundle2.putInt(zzc, spanned.getSpanFlags(obj));
        bundle2.putInt(zzd, i7);
        if (bundle != null) {
            bundle2.putBundle(zze, bundle);
        }
        return bundle2;
    }
}
