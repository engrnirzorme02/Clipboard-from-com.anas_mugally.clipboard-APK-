package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.C3553a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaa {
    private final zzr zza;
    private final boolean zzb;
    private final zzx zzc;

    private zzaa(zzx zzxVar, boolean z7, zzr zzrVar, int i7) {
        this.zzc = zzxVar;
        this.zzb = z7;
        this.zza = zzrVar;
    }

    public static zzaa zzc(zzr zzrVar) {
        return new zzaa(new zzx(zzrVar), false, zzq.zza, C3553a.e.API_PRIORITY_OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzh(CharSequence charSequence) {
        zzx zzxVar = this.zzc;
        return new zzw(zzxVar, this, charSequence, zzxVar.zza);
    }

    public final zzaa zzb() {
        return new zzaa(this.zzc, true, this.zza, C3553a.e.API_PRIORITY_OTHER);
    }

    public final Iterable zzd(CharSequence charSequence) {
        return new zzy(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZzh = zzh(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzh.hasNext()) {
            arrayList.add((String) itZzh.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
