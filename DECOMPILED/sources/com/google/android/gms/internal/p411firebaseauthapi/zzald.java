package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.C3553a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzald extends zzajp<Float> implements zzalm<Float>, RandomAccess {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new zzald(fArr, 0, false);
    }

    zzald() {
        this(zza, 0, true);
    }

    private static int zzd(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zze(int i7) {
        return "Index:" + i7 + ", Size:" + this.zzc;
    }

    private final void zzf(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zze(i7));
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i7 < 0 || i7 > (i8 = this.zzc)) {
            throw new IndexOutOfBoundsException(zze(i7));
        }
        float[] fArr = this.zzb;
        if (i8 < fArr.length) {
            System.arraycopy(fArr, i7, fArr, i7 + 1, i8 - i7);
        } else {
            float[] fArr2 = new float[zzd(fArr.length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, i7);
            System.arraycopy(this.zzb, i7, fArr2, i7 + 1, this.zzc - i7);
            this.zzb = fArr2;
        }
        this.zzb[i7] = fFloatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zza();
        zzalh.zza(collection);
        if (!(collection instanceof zzald)) {
            return super.addAll(collection);
        }
        zzald zzaldVar = (zzald) collection;
        int i7 = zzaldVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzc;
        if (C3553a.e.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        float[] fArr = this.zzb;
        if (i9 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i9);
        }
        System.arraycopy(zzaldVar.zzb, 0, this.zzb, this.zzc, zzaldVar.zzc);
        this.zzc = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzald)) {
            return super.equals(obj);
        }
        zzald zzaldVar = (zzald) obj;
        if (this.zzc != zzaldVar.zzc) {
            return false;
        }
        float[] fArr = zzaldVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (Float.floatToIntBits(this.zzb[i7]) != Float.floatToIntBits(fArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Float.valueOf(zzb(i7));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzb[i7]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.zzb[i7] == fFloatValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        zza();
        zzf(i7);
        float[] fArr = this.zzb;
        float f7 = fArr[i7];
        int i8 = this.zzc;
        if (i7 < i8 - 1) {
            System.arraycopy(fArr, i7 + 1, fArr, i7, (i8 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        zza();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i8, fArr, i7, this.zzc - i8);
        this.zzc -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        zzf(i7);
        float[] fArr = this.zzb;
        float f7 = fArr[i7];
        fArr[i7] = fFloatValue;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalm
    public final /* synthetic */ zzalm<Float> zza(int i7) {
        if (i7 >= this.zzc) {
            return new zzald(i7 == 0 ? zza : Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zzb(int i7) {
        zzf(i7);
        return this.zzb[i7];
    }

    final void zzc(int i7) {
        float[] fArr = this.zzb;
        if (i7 <= fArr.length) {
            return;
        }
        if (fArr.length == 0) {
            this.zzb = new float[Math.max(i7, 10)];
            return;
        }
        int length = fArr.length;
        while (length < i7) {
            length = zzd(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzald(float[] fArr, int i7, boolean z7) {
        super(z7);
        this.zzb = fArr;
        this.zzc = i7;
    }

    public final void zza(float f7) {
        zza();
        int i7 = this.zzc;
        float[] fArr = this.zzb;
        if (i7 == fArr.length) {
            float[] fArr2 = new float[zzd(fArr.length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, this.zzc);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        fArr3[i8] = f7;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Float) obj).floatValue());
        return true;
    }
}
