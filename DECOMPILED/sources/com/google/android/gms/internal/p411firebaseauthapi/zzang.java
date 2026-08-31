package com.google.android.gms.internal.p411firebaseauthapi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
class zzang<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Object[] zza;
    private int zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzanm zze;
    private Map<K, V> zzf;

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzanm(this);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzang)) {
            return super.equals(obj);
        }
        zzang zzangVar = (zzang) obj;
        int size = size();
        if (size != zzangVar.size()) {
            return false;
        }
        int i7 = this.zzb;
        if (i7 != zzangVar.zzb) {
            return entrySet().equals(zzangVar.entrySet());
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (!zza(i8).equals(zzangVar.zza(i8))) {
                return false;
            }
        }
        if (i7 != size) {
            return this.zzc.equals(zzangVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        return iZza >= 0 ? (V) ((zzank) this.zza[iZza]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i7 = this.zzb;
        int iHashCode = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode += this.zza[i8].hashCode();
        }
        return this.zzc.size() > 0 ? iHashCode + this.zzc.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return zzb(iZza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzb + this.zzc.size();
    }

    private zzang() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final Iterable<Map.Entry<K, V>> zzc() {
        return this.zzc.isEmpty() ? Collections.EMPTY_SET : this.zzc.entrySet();
    }

    final Set<Map.Entry<K, V>> zzd() {
        return new zzanh(this);
    }

    public final boolean zze() {
        return this.zzd;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    private final int zza(K k7) {
        int i7;
        int i8;
        int i9;
        int iCompareTo;
        int i10 = this.zzb;
        int i11 = i10 - 1;
        if (i11 < 0) {
            i7 = 0;
            while (i7 <= i11) {
                i9 = (i7 + i11) / 2;
                iCompareTo = k7.compareTo((Comparable) ((zzank) this.zza[i9]).getKey());
                if (iCompareTo < 0) {
                    i11 = i9 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i9;
                    }
                    i7 = i9 + 1;
                }
            }
            i8 = i7 + 1;
        } else {
            int iCompareTo2 = k7.compareTo((Comparable) ((zzank) this.zza[i11]).getKey());
            if (iCompareTo2 > 0) {
                i8 = i10 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i11;
                }
                i7 = 0;
                while (i7 <= i11) {
                    i9 = (i7 + i11) / 2;
                    iCompareTo = k7.compareTo((Comparable) ((zzank) this.zza[i9]).getKey());
                    if (iCompareTo < 0) {
                        i11 = i9 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i9;
                        }
                        i7 = i9 + 1;
                    }
                }
                i8 = i7 + 1;
            }
        }
        return -i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzb(int i7) {
        zzg();
        V v7 = (V) ((zzank) this.zza[i7]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i7 + 1, objArr, i7, (this.zzb - i7) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zzank(this, it.next());
            this.zzb++;
            it.remove();
        }
        return v7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final V put(K k7, V v7) {
        zzg();
        int iZza = zza(k7);
        if (iZza >= 0) {
            return (V) ((zzank) this.zza[iZza]).setValue(v7);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i7 = -(iZza + 1);
        if (i7 >= 16) {
            return zzf().put(k7, v7);
        }
        int i8 = this.zzb;
        if (i8 == 16) {
            zzank zzankVar = (zzank) this.zza[15];
            this.zzb = i8 - 1;
            zzf().put((Comparable) zzankVar.getKey(), zzankVar.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i7, objArr, i7 + 1, (objArr.length - i7) - 1);
        this.zza[i7] = new zzank(this, k7, v7);
        this.zzb++;
        return null;
    }

    public final Map.Entry<K, V> zza(int i7) {
        if (i7 < this.zzb) {
            return (zzank) this.zza[i7];
        }
        throw new ArrayIndexOutOfBoundsException(i7);
    }

    public void zza() {
        Map<K, V> mapUnmodifiableMap;
        Map<K, V> mapUnmodifiableMap2;
        if (this.zzd) {
            return;
        }
        if (this.zzc.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(this.zzc);
        }
        this.zzc = mapUnmodifiableMap;
        if (this.zzf.isEmpty()) {
            mapUnmodifiableMap2 = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(this.zzf);
        }
        this.zzf = mapUnmodifiableMap2;
        this.zzd = true;
    }
}
