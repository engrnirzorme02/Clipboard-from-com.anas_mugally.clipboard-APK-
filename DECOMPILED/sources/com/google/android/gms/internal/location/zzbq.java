package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes2.dex */
final class zzbq<E> extends zzbo<E> {
    private final zzbs<E> zza;

    zzbq(zzbs<E> zzbsVar, int i7) {
        super(zzbsVar.size(), i7);
        this.zza = zzbsVar;
    }

    @Override // com.google.android.gms.internal.location.zzbo
    protected final E zza(int i7) {
        return this.zza.get(i7);
    }
}
