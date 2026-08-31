package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbnr implements zzbmi, zzbnq {
    private final zzbnq zza;
    private final HashSet zzb = new HashSet();

    public zzbnr(zzbnq zzbnqVar) {
        this.zza = zzbnqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi, com.google.android.gms.internal.ads.zzbmt
    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final void zzf() {
        HashSet<AbstractMap.SimpleEntry> hashSet = this.zzb;
        for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
            AbstractC3490o0.m17545k("Unregistering eventhandler: ".concat(String.valueOf(((zzbjl) simpleEntry.getValue()).toString())));
            this.zza.zzn((String) simpleEntry.getKey(), (zzbjl) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbnq
    public final void zzm(String str, zzbjl zzbjlVar) {
        this.zza.zzm(str, zzbjlVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbjlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnq
    public final void zzn(String str, zzbjl zzbjlVar) {
        this.zza.zzn(str, zzbjlVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbjlVar));
    }
}
