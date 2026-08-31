package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcf extends zzbw {
    static final zzbw zza = new zzcf(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzcf(Object obj, Object[] objArr, int i7) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i7;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    static zzcf zzg(int i7, Object[] objArr, zzbv zzbvVar) {
        int iHighestOneBit;
        boolean z7;
        int i8;
        char c7;
        ?? r7;
        char c8;
        short[] sArr;
        boolean z8;
        int i9;
        ?? r16;
        boolean z9;
        ?? r8;
        Object[] objArr2;
        zzbu zzbuVar;
        boolean z10;
        int i10 = i7;
        Object[] objArrCopyOf = objArr;
        if (i10 == 0) {
            return (zzcf) zza;
        }
        zzbu zzbuVar2 = null;
        ?? r9 = 0;
        zzbu zzbuVar3 = null;
        zzbu zzbuVar4 = null;
        boolean z11 = false;
        int i11 = 1;
        if (i10 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzbo.zza(obj, obj2);
            return new zzcf(null, objArrCopyOf, 1);
        }
        zzbg.zzb(i10, objArrCopyOf.length >> 1, "index");
        char c9 = 2;
        int iMax = Math.max(i10, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i10 != 1) {
            int i12 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i13 = 0;
                int i14 = 0;
                while (i13 < i10) {
                    int i15 = i14 + i14;
                    int i16 = i13 + i13;
                    Object obj3 = objArrCopyOf[i16];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i16 ^ i11];
                    Objects.requireNonNull(obj4);
                    zzbo.zza(obj3, obj4);
                    int iZza = zzbp.zza(obj3.hashCode());
                    while (true) {
                        int i17 = iZza & i12;
                        z8 = z11;
                        i9 = i11;
                        int i18 = bArr[i17] & 255;
                        if (i18 == 255) {
                            bArr[i17] = (byte) i15;
                            if (i14 < i13) {
                                objArrCopyOf[i15] = obj3;
                                objArrCopyOf[i15 ^ 1] = obj4;
                            }
                            i14++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i18 == true ? 1 : 0])) {
                            int i19 = ~i18;
                            Object obj5 = objArrCopyOf[i19 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            zzbu zzbuVar5 = new zzbu(obj3, obj4, obj5);
                            objArrCopyOf[i19 == true ? 1 : 0] = obj4;
                            zzbuVar3 = zzbuVar5;
                            break;
                        }
                        iZza = i17 + 1;
                        z11 = z8;
                        i11 = i9;
                    }
                    i13++;
                    z11 = z8;
                    i11 = i9;
                }
                z7 = z11;
                i8 = i11;
                if (i14 == i10) {
                    c7 = 2;
                    r7 = bArr;
                    r16 = z7;
                } else {
                    sArr = new Object[3];
                    sArr[z7 ? 1 : 0] = bArr;
                    sArr[i8] = Integer.valueOf(i14);
                    sArr[2] = zzbuVar3;
                    r9 = sArr;
                    z10 = z7;
                }
            } else {
                z7 = false;
                i8 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i20 = 0;
                    for (int i21 = 0; i21 < i10; i21++) {
                        int i22 = i20 + i20;
                        int i23 = i21 + i21;
                        Object obj6 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i23 ^ 1];
                        Objects.requireNonNull(obj7);
                        zzbo.zza(obj6, obj7);
                        int iZza2 = zzbp.zza(obj6.hashCode());
                        while (true) {
                            int i24 = iZza2 & i12;
                            char c10 = (char) sArr[i24];
                            if (c10 == 65535) {
                                sArr[i24] = (short) i22;
                                if (i20 < i21) {
                                    objArrCopyOf[i22] = obj6;
                                    objArrCopyOf[i22 ^ 1] = obj7;
                                }
                                i20++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c10])) {
                                int i25 = c10 ^ 1;
                                Object obj8 = objArrCopyOf[i25 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                zzbu zzbuVar6 = new zzbu(obj6, obj7, obj8);
                                objArrCopyOf[i25 == true ? 1 : 0] = obj7;
                                zzbuVar4 = zzbuVar6;
                                break;
                            }
                            iZza2 = i24 + 1;
                        }
                    }
                    if (i20 == i10) {
                        r9 = sArr;
                        z10 = z7;
                    } else {
                        r9 = new Object[]{sArr, Integer.valueOf(i20), zzbuVar4};
                        z10 = z7;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < i10) {
                        int i28 = i27 + i27;
                        int i29 = i26 + i26;
                        Object obj9 = objArrCopyOf[i29];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i29 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzbo.zza(obj9, obj10);
                        int iZza3 = zzbp.zza(obj9.hashCode());
                        while (true) {
                            int i30 = iZza3 & i12;
                            int i31 = iArr[i30];
                            if (i31 == -1) {
                                iArr[i30] = i28;
                                if (i27 < i26) {
                                    objArrCopyOf[i28] = obj9;
                                    objArrCopyOf[i28 ^ 1] = obj10;
                                }
                                i27++;
                                c8 = c9;
                                break;
                            }
                            c8 = c9;
                            if (obj9.equals(objArrCopyOf[i31])) {
                                int i32 = i31 ^ 1;
                                Object obj11 = objArrCopyOf[i32];
                                Objects.requireNonNull(obj11);
                                zzbu zzbuVar7 = new zzbu(obj9, obj10, obj11);
                                objArrCopyOf[i32] = obj10;
                                zzbuVar2 = zzbuVar7;
                                break;
                            }
                            iZza3 = i30 + 1;
                            c9 = c8;
                        }
                        i26++;
                        c9 = c8;
                    }
                    c7 = c9;
                    if (i27 == i10) {
                        r7 = iArr;
                        r16 = z7;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i27);
                        objArr3[c7] = zzbuVar2;
                        r7 = objArr3;
                        r16 = z7;
                    }
                }
            }
            z9 = r7 instanceof Object[];
            r8 = r7;
            if (z9) {
                objArr2 = (Object[]) r7;
                zzbuVar = (zzbu) objArr2[c7];
                if (zzbvVar != null) {
                    throw zzbuVar.zza();
                }
                zzbvVar.zzc = zzbuVar;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i8]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r8 = obj12;
                i10 = iIntValue;
            }
            return new zzcf(r8, objArrCopyOf, i10);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        zzbo.zza(obj13, obj14);
        z10 = false;
        i10 = 1;
        i8 = 1;
        c7 = 2;
        r7 = r9;
        r16 = z10;
        z9 = r7 instanceof Object[];
        r8 = r7;
        if (z9) {
            objArr2 = (Object[]) r7;
            zzbuVar = (zzbu) objArr2[c7];
            if (zzbvVar != null) {
                throw zzbuVar.zza();
            }
            zzbvVar.zzc = zzbuVar;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i8]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r8 = obj15;
            i10 = iIntValue2;
        }
        return new zzcf(r8, objArrCopyOf, i10);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.play_billing.zzbw, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i7 = this.zzd;
            Object[] objArr = this.zzb;
            if (i7 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iZza = zzbp.zza(obj.hashCode());
                    while (true) {
                        int i8 = iZza & length;
                        int i9 = bArr[i8] & 255;
                        if (i9 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i9])) {
                            obj2 = objArr[i9 ^ 1];
                        } else {
                            iZza = i8 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzbp.zza(obj.hashCode());
                    while (true) {
                        int i10 = iZza2 & length2;
                        char c7 = (char) sArr[i10];
                        if (c7 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c7])) {
                            obj2 = objArr[c7 ^ 1];
                        } else {
                            iZza2 = i10 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzbp.zza(obj.hashCode());
                    while (true) {
                        int i11 = iZza3 & length3;
                        int i12 = iArr[i11];
                        if (i12 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iZza3 = i11 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    final zzbq zza() {
        return new zzce(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    final zzbx zzd() {
        return new zzcc(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    final zzbx zze() {
        return new zzcd(this, new zzce(this.zzb, 0, this.zzd));
    }
}
