package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzgjk extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    zzgjk() {
        zza(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final int[] zzl() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final Object[] zzm() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final Object[] zzn() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private final void zzv(int i7) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i7)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzw, reason: merged with bridge method [inline-methods] */
    public final int zzh() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzx(int i7, int i8, int i9, int i10) {
        int i11 = i8 - 1;
        Object objZza = zzgjl.zza(i8);
        if (i10 != 0) {
            zzgjl.zzc(objZza, i9 & i11, i10 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzl = zzl();
        for (int i12 = 0; i12 <= i7; i12++) {
            int iZzb = zzgjl.zzb(obj, i12);
            while (iZzb != 0) {
                int i13 = iZzb - 1;
                int i14 = iArrZzl[i13];
                int i15 = ((~i7) & i14) | i12;
                int i16 = i15 & i11;
                int iZzb2 = zzgjl.zzb(objZza, i16);
                zzgjl.zzc(objZza, i16, iZzb);
                iArrZzl[i13] = ((~i11) & i15) | (iZzb2 & i11);
                iZzb = i14 & i7;
            }
        }
        this.zze = objZza;
        zzv(i11);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzy, reason: merged with bridge method [inline-methods] */
    public final int zzi(Object obj) {
        if (zzb()) {
            return -1;
        }
        int iZzb = zzgjs.zzb(obj);
        int iZzh = zzh();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzb2 = zzgjl.zzb(obj2, iZzb & iZzh);
        if (iZzb2 != 0) {
            int i7 = ~iZzh;
            int i8 = iZzb & i7;
            do {
                int i9 = iZzb2 - 1;
                int i10 = zzl()[i9];
                if ((i10 & i7) == i8 && Objects.equals(obj, zzm()[i9])) {
                    return i9;
                }
                iZzb2 = i10 & iZzh;
            } while (iZzb2 != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final Object zzj(Object obj) {
        if (!zzb()) {
            int iZzh = zzh();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZze = zzgjl.zze(obj, null, iZzh, obj2, zzl(), zzm(), null);
            if (iZze != -1) {
                Object obj3 = zzn()[iZze];
                zze(iZze, iZzh);
                this.zzg--;
                zzd();
                return obj3;
            }
        }
        return zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzb()) {
            return;
        }
        zzd();
        Map mapZzc = zzc();
        if (mapZzc != null) {
            this.zzf = zzgne.zzc(size(), 3, 1073741823);
            mapZzc.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzm(), 0, this.zzg, (Object) null);
        Arrays.fill(zzn(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzl(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.containsKey(obj);
        }
        return zzi(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.zzg; i7++) {
            if (Objects.equals(obj, zzn()[i7])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzgjf zzgjfVar = new zzgjf(this, null);
        this.zzi = zzgjfVar;
        return zzgjfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.get(obj);
        }
        int iZzi = zzi(obj);
        if (iZzi == -1) {
            return null;
        }
        return zzn()[iZzi];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzgjh zzgjhVar = new zzgjh(this, null);
        this.zzh = zzgjhVar;
        return zzgjhVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i7;
        if (zzb()) {
            zzghc.zzi(zzb(), "Arrays already allocated");
            int i8 = this.zzf;
            int iMax = Math.max(i8 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzgjl.zza(iMax2);
            zzv(iMax2 - 1);
            this.zza = new int[i8];
            this.zzb = new Object[i8];
            this.zzc = new Object[i8];
        }
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.put(obj, obj2);
        }
        int[] iArrZzl = zzl();
        Object[] objArrZzm = zzm();
        Object[] objArrZzn = zzn();
        int i9 = this.zzg;
        int i10 = i9 + 1;
        int iZzb = zzgjs.zzb(obj);
        int iZzh = zzh();
        int i11 = iZzb & iZzh;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzb2 = zzgjl.zzb(obj3, i11);
        if (iZzb2 == 0) {
            if (i10 > iZzh) {
                iZzh = zzx(iZzh, zzgjl.zzd(iZzh), iZzb, i9);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzgjl.zzc(obj4, i11, i10);
            }
            i7 = 1;
        } else {
            int i12 = ~iZzh;
            int i13 = iZzb & i12;
            int i14 = 0;
            while (true) {
                int i15 = iZzb2 - 1;
                int i16 = iArrZzl[i15];
                i7 = 1;
                int i17 = i16 & i12;
                if (i17 == i13 && Objects.equals(obj, objArrZzm[i15])) {
                    Object obj5 = objArrZzn[i15];
                    objArrZzn[i15] = obj2;
                    return obj5;
                }
                int i18 = i16 & iZzh;
                i14++;
                if (i18 == 0) {
                    if (i14 < 9) {
                        if (i10 <= iZzh) {
                            iArrZzl[i15] = (i10 & iZzh) | i17;
                            break;
                        }
                        iZzh = zzx(iZzh, zzgjl.zzd(iZzh), iZzb, i9);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzh() + 1, 1.0f);
                    int iZzf = zzf();
                    while (iZzf >= 0) {
                        linkedHashMap.put(zzm()[iZzf], zzn()[iZzf]);
                        iZzf = zzg(iZzf);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzd();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzb2 = i18;
            }
        }
        int length = zzl().length;
        if (i10 > length) {
            int i19 = i7;
            int iMin = Math.min(1073741823, (Math.max(i19, length >>> 1) + length) | i19);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzl(), iMin);
                this.zzb = Arrays.copyOf(zzm(), iMin);
                this.zzc = Arrays.copyOf(zzn(), iMin);
            }
        }
        zzl()[i9] = (~iZzh) & iZzb;
        zzm()[i9] = obj;
        zzn()[i9] = obj2;
        this.zzg = i10;
        zzd();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.remove(obj);
        }
        Object objZzj = zzj(obj);
        if (objZzj == zzd) {
            return null;
        }
        return objZzj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzc = zzc();
        return mapZzc != null ? mapZzc.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzgjj zzgjjVar = new zzgjj(this, null);
        this.zzj = zzgjjVar;
        return zzgjjVar;
    }

    final void zza(int i7) {
        this.zzf = zzgne.zzc(i7, 1, 1073741823);
    }

    final boolean zzb() {
        return this.zze == null;
    }

    final Map zzc() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void zzd() {
        this.zzf += 32;
    }

    final void zze(int i7, int i8) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzl = zzl();
        Object[] objArrZzm = zzm();
        Object[] objArrZzn = zzn();
        int size = size();
        int i9 = size - 1;
        if (i7 >= i9) {
            objArrZzm[i7] = null;
            objArrZzn[i7] = null;
            iArrZzl[i7] = 0;
            return;
        }
        int i10 = i7 + 1;
        Object obj2 = objArrZzm[i9];
        objArrZzm[i7] = obj2;
        objArrZzn[i7] = objArrZzn[i9];
        objArrZzm[i9] = null;
        objArrZzn[i9] = null;
        iArrZzl[i7] = iArrZzl[i9];
        iArrZzl[i9] = 0;
        int iZzb = zzgjs.zzb(obj2) & i8;
        int iZzb2 = zzgjl.zzb(obj, iZzb);
        if (iZzb2 == size) {
            zzgjl.zzc(obj, iZzb, i10);
            return;
        }
        while (true) {
            int i11 = iZzb2 - 1;
            int i12 = iArrZzl[i11];
            int i13 = i12 & i8;
            if (i13 == size) {
                iArrZzl[i11] = (i12 & (~i8)) | (i8 & i10);
                return;
            }
            iZzb2 = i13;
        }
    }

    final int zzf() {
        return isEmpty() ? -1 : 0;
    }

    final int zzg(int i7) {
        int i8 = i7 + 1;
        if (i8 < this.zzg) {
            return i8;
        }
        return -1;
    }

    final /* synthetic */ Object zzk() {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    final /* synthetic */ Object zzo(int i7) {
        return zzm()[i7];
    }

    final /* synthetic */ Object zzp(int i7) {
        return zzn()[i7];
    }

    final /* synthetic */ void zzq(int i7, Object obj) {
        zzn()[i7] = obj;
    }

    final /* synthetic */ int zzs() {
        return this.zzf;
    }

    final /* synthetic */ int zzt() {
        return this.zzg;
    }

    final /* synthetic */ void zzu(int i7) {
        this.zzg = i7;
    }

    zzgjk(int i7) {
        zza(8);
    }
}
