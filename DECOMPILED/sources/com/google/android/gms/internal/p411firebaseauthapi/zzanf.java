package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzanf extends zzang {
    zzanf() {
        super();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzang
    public final void zza() {
        if (!zze()) {
            for (int i7 = 0; i7 < zzb(); i7++) {
                Map.Entry entryZza = zza(i7);
                if (((zzakz) entryZza.getKey()).zze()) {
                    entryZza.setValue(Collections.unmodifiableList((List) entryZza.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzakz) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
