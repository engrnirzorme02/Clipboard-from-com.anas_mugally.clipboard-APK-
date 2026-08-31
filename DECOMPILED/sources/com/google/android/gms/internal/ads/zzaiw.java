package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaiw implements zzadz {
    public final int zza;
    public final zzgnc zzb;

    public zzaiw(int i7, int[] iArr) {
        this.zza = i7;
        this.zzb = iArr != null ? zzgnc.zzb(iArr) : zzgnc.zza();
    }

    public final String toString() {
        zzgnc zzgncVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgncVar.zzc());
        for (int i7 = 0; i7 < zzgncVar.zzc(); i7++) {
            arrayList.add(zzeo.zzx(zzgncVar.zzd(i7)));
        }
        String strZzx = zzeo.zzx(this.zza);
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder(strZzx.length() + 37 + string.length() + 1);
        sb.append("UnsupportedBrands{major=");
        sb.append(strZzx);
        sb.append(", compatible=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
