package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzas<K, V> extends zzal<K, V> {
    private static final zzal<Object, Object> zza = new zzas(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzas(Object obj, Object[] objArr, int i7) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i7;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0037->B:21:0x004d], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0062->B:31:0x0079], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0088->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzal, java.util.Map
    public final V get(Object obj) {
        V v7;
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i7 = this.zzd;
        if (obj == null) {
            v7 = null;
        } else if (i7 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                v7 = (V) objArr[1];
                Objects.requireNonNull(v7);
            } else {
                v7 = null;
            }
        } else if (obj2 == null) {
            v7 = null;
        } else if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int iZza = zzad.zza(obj.hashCode());
            while (true) {
                int i8 = iZza & length;
                int i9 = bArr[i8] & 255;
                if (i9 == 255) {
                    break;
                }
                if (obj.equals(objArr[i9])) {
                    v7 = (V) objArr[i9 ^ 1];
                } else {
                    iZza = i8 + 1;
                }
            }
            v7 = null;
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int iZza2 = zzad.zza(obj.hashCode());
            while (true) {
                int i10 = iZza2 & length2;
                int i11 = sArr[i10] & 65535;
                if (i11 == 65535) {
                    break;
                }
                if (obj.equals(objArr[i11])) {
                    v7 = (V) objArr[i11 ^ 1];
                } else {
                    iZza2 = i10 + 1;
                }
            }
            v7 = null;
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int iZza3 = zzad.zza(obj.hashCode());
            while (true) {
                int i12 = iZza3 & length3;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                }
                if (obj.equals(objArr[i13])) {
                    v7 = (V) objArr[i13 ^ 1];
                } else {
                    iZza3 = i12 + 1;
                }
            }
            v7 = null;
        }
        if (v7 == null) {
            return null;
        }
        return v7;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzal
    final zzag<V> zza() {
        return new zzaw(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzal
    final zzaq<Map.Entry<K, V>> zzb() {
        return new zzar(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzal
    final zzaq<K> zzc() {
        return new zzat(this, new zzaw(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzal
    final boolean zzd() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    static <K, V> zzas<K, V> zza(int i7, Object[] objArr, zzao<K, V> zzaoVar) {
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
        zzan zzanVar;
        boolean z10;
        int i10 = i7;
        Object[] objArrCopyOf = objArr;
        if (i10 == 0) {
            return (zzas) zza;
        }
        zzan zzanVar2 = null;
        ?? r9 = 0;
        zzan zzanVar3 = null;
        zzan zzanVar4 = null;
        boolean z11 = false;
        int i11 = 1;
        if (i10 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzae.zza(obj, obj2);
            return new zzas<>(null, objArrCopyOf, 1);
        }
        zzu.zzb(i10, objArrCopyOf.length >> 1);
        char c9 = 2;
        int iMax = Math.max(i10, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else {
            iHighestOneBit = 1073741824;
            zzu.zza(iMax < 1073741824, "collection too large");
        }
        if (i10 != 1) {
            int i12 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i13 = 0;
                int i14 = 0;
                while (i13 < i10) {
                    int i15 = i13 * 2;
                    int i16 = i14 * 2;
                    Object obj3 = objArrCopyOf[i15];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i15 ^ i11];
                    Objects.requireNonNull(obj4);
                    zzae.zza(obj3, obj4);
                    int iZza = zzad.zza(obj3.hashCode());
                    while (true) {
                        int i17 = iZza & i12;
                        z8 = z11;
                        i9 = i11;
                        int i18 = bArr[i17] & 255;
                        if (i18 == 255) {
                            bArr[i17] = (byte) i16;
                            if (i14 < i13) {
                                objArrCopyOf[i16] = obj3;
                                objArrCopyOf[i16 ^ 1] = obj4;
                            }
                            i14++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i18 == true ? 1 : 0])) {
                            int i19 = ~i18;
                            Object obj5 = objArrCopyOf[i19 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            zzanVar3 = new zzan(obj3, obj4, obj5);
                            objArrCopyOf[i19 == true ? 1 : 0] = obj4;
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
                    sArr[2] = zzanVar3;
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
                        int i22 = i21 * 2;
                        int i23 = i20 * 2;
                        Object obj6 = objArrCopyOf[i22];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i22 ^ 1];
                        Objects.requireNonNull(obj7);
                        zzae.zza(obj6, obj7);
                        int iZza2 = zzad.zza(obj6.hashCode());
                        while (true) {
                            int i24 = iZza2 & i12;
                            int i25 = sArr[i24] & 65535;
                            if (i25 == 65535) {
                                sArr[i24] = (short) i23;
                                if (i20 < i21) {
                                    objArrCopyOf[i23] = obj6;
                                    objArrCopyOf[i23 ^ 1] = obj7;
                                }
                                i20++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[i25 == true ? 1 : 0])) {
                                int i26 = ~i25;
                                Object obj8 = objArrCopyOf[i26 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                zzanVar4 = new zzan(obj6, obj7, obj8);
                                objArrCopyOf[i26 == true ? 1 : 0] = obj7;
                                break;
                            }
                            iZza2 = i24 + 1;
                        }
                    }
                    if (i20 == i10) {
                        r9 = sArr;
                        z10 = z7;
                    } else {
                        r9 = new Object[]{sArr, Integer.valueOf(i20), zzanVar4};
                        z10 = z7;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < i10) {
                        int i29 = i27 * 2;
                        int i30 = i28 * 2;
                        Object obj9 = objArrCopyOf[i29];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i29 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzae.zza(obj9, obj10);
                        int iZza3 = zzad.zza(obj9.hashCode());
                        while (true) {
                            int i31 = iZza3 & i12;
                            int i32 = iArr[i31];
                            if (i32 == -1) {
                                iArr[i31] = i30;
                                if (i28 < i27) {
                                    objArrCopyOf[i30] = obj9;
                                    objArrCopyOf[i30 ^ 1] = obj10;
                                }
                                i28++;
                                c8 = c9;
                                break;
                            }
                            c8 = c9;
                            if (obj9.equals(objArrCopyOf[i32])) {
                                int i33 = i32 ^ 1;
                                Object obj11 = objArrCopyOf[i33];
                                Objects.requireNonNull(obj11);
                                zzanVar2 = new zzan(obj9, obj10, obj11);
                                objArrCopyOf[i33] = obj10;
                                break;
                            }
                            iZza3 = i31 + 1;
                            c9 = c8;
                        }
                        i27++;
                        c9 = c8;
                    }
                    c7 = c9;
                    if (i28 == i10) {
                        r7 = iArr;
                        r16 = z7;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i28);
                        objArr3[c7] = zzanVar2;
                        r7 = objArr3;
                        r16 = z7;
                    }
                }
            }
            z9 = r7 instanceof Object[];
            r8 = r7;
            if (z9) {
                objArr2 = (Object[]) r7;
                zzanVar = (zzan) objArr2[c7];
                if (zzaoVar != null) {
                    throw zzanVar.zza();
                }
                zzaoVar.zza = zzanVar;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i8]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
                r8 = obj12;
                i10 = iIntValue;
            }
            return new zzas<>(r8, objArrCopyOf, i10);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        zzae.zza(obj13, obj14);
        z10 = false;
        i8 = 1;
        c7 = 2;
        r7 = r9;
        r16 = z10;
        z9 = r7 instanceof Object[];
        r8 = r7;
        if (z9) {
            objArr2 = (Object[]) r7;
            zzanVar = (zzan) objArr2[c7];
            if (zzaoVar != null) {
                throw zzanVar.zza();
            }
            zzaoVar.zza = zzanVar;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i8]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 << 1);
            r8 = obj15;
            i10 = iIntValue2;
        }
        return new zzas<>(r8, objArrCopyOf, i10);
    }
}
