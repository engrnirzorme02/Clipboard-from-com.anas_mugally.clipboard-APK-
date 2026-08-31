package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgjq extends zzgjr implements Map {
    protected zzgjq() {
    }

    @Override // java.util.Map
    public final void clear() {
        zza().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return zza().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return zza().containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return zza().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || zza().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return zza().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return zza().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return zza().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return zza().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return zza().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        zza().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return zza().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return zza().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return zza().values();
    }

    protected abstract Map zza();

    @Override // com.google.android.gms.internal.ads.zzgjr
    protected /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }

    protected final boolean zzc(Object obj) {
        zzgkr zzgkrVar = new zzgkr(entrySet().iterator());
        if (obj == null) {
            while (zzgkrVar.hasNext()) {
                if (zzgkrVar.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (zzgkrVar.hasNext()) {
            if (obj.equals(zzgkrVar.next())) {
                return true;
            }
        }
        return false;
    }

    protected final boolean zzd(Object obj) {
        return zzgkw.zzb(this, obj);
    }

    protected final int zze() {
        return zzglz.zzc(entrySet());
    }
}
