package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzhkn extends zzhkr {
    zzhkn() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhkr
    public final void zza() {
        if (!zzb()) {
            for (int i7 = 0; i7 < zzc(); i7++) {
                Map.Entry entryZzd = zzd(i7);
                if (((zzhhv) ((zzhko) entryZzd).zza()).zzd()) {
                    entryZzd.setValue(Collections.unmodifiableList((List) entryZzd.getValue()));
                }
            }
            for (Map.Entry entry : zze()) {
                if (((zzhhv) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
