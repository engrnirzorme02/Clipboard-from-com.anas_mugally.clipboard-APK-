package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdtq {
    public final long zza;
    public final int[] zzb;

    private zzdtq(long j7, int[] iArr) {
        this.zza = j7;
        this.zzb = iArr;
    }

    public static zzgjz zza(JsonReader jsonReader) {
        int i7 = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzgjz zzgjzVarZzi = zzgjz.zzi();
            jsonReader.beginObject();
            zzdtq zzdtqVar = null;
            Long lValueOf = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Objects.equals(strNextName, "id")) {
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(strNextName, "event_types")) {
                    zzgjw zzgjwVar2 = new zzgjw();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgjwVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzgjzVarZzi = zzgjwVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (lValueOf != null && !zzgjzVarZzi.isEmpty()) {
                long jLongValue = lValueOf.longValue();
                int[] iArr = new int[zzgjzVarZzi.size()];
                for (int i8 = 0; i8 < zzgjzVarZzi.size(); i8++) {
                    iArr[i8] = ((Integer) zzgjzVarZzi.get(i8)).intValue();
                }
                zzdtqVar = new zzdtq(jLongValue, iArr);
            }
            if (zzdtqVar != null) {
                zzgjwVar.zzf(zzdtqVar);
            }
        }
        jsonReader.endArray();
        return zzgjwVar.zzi();
    }
}
