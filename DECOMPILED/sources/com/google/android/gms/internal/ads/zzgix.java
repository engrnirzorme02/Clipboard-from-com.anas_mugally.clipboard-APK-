package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgix implements zzgkx {
    private transient Set zza;
    private transient Collection zzb;
    private transient Map zzc;

    zzgix() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgkx) {
            return zzt().equals(((zzgkx) obj).zzt());
        }
        return false;
    }

    public final int hashCode() {
        return zzt().hashCode();
    }

    public final String toString() {
        return zzt().toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public boolean zze(Object obj, Object obj2) {
        throw null;
    }

    abstract Set zzh();

    abstract Collection zzj();

    Iterator zzk() {
        throw null;
    }

    abstract Map zzl();

    public final Set zzr() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set setZzh = zzh();
        this.zza = setZzh;
        return setZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final Collection zzs() {
        Collection collection = this.zzb;
        if (collection != null) {
            return collection;
        }
        Collection collectionZzj = zzj();
        this.zzb = collectionZzj;
        return collectionZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final Map zzt() {
        Map map = this.zzc;
        if (map != null) {
            return map;
        }
        Map mapZzl = zzl();
        this.zzc = mapZzl;
        return mapZzl;
    }
}
