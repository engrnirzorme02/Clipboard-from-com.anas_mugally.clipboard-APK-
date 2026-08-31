package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p152T5.AbstractC1608F;
import p152T5.AbstractC1638q;
import p278j6.AbstractC5905g;
import p278j6.C5904f;
import p302m6.C6402d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzht implements zzgx {
    public static final zzht zza = new zzht();

    private zzht() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgdVar.zzc().zze(i7, zzb(objZza, objZza2));
    }

    public final Object zzb(Object obj, Object obj2) throws zzce {
        boolean z7 = obj instanceof Byte;
        if (z7 && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z8 = obj instanceof Short;
        if (z8 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z9 = obj instanceof Integer;
        if (z9 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z10 = obj instanceof Long;
        if (z10 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj2).longValue() ^ ((Number) obj).longValue());
        }
        int i7 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(C6402d.f24428b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i7 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i7] ^ ((Number) obj2).byteValue())));
                    i7++;
                }
                return AbstractC1638q.m6590d0(arrayList);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i7 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i7] ^ ((Number) obj2).intValue()));
                    i7++;
                }
                return AbstractC1638q.m6592f0(arrayList2);
            }
        }
        if (z7 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b7 : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b7 ^ ((Number) obj).byteValue())));
            }
            return arrayList3.toArray(new Byte[0]);
        }
        if (z8 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s7 : sArr) {
                arrayList4.add(Short.valueOf((short) (s7 ^ ((Number) obj).shortValue())));
            }
            return arrayList4.toArray(new Short[0]);
        }
        if (z9 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i8 : iArr) {
                arrayList5.add(Integer.valueOf(i8 ^ ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z10 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j7 : jArr) {
                arrayList6.add(Long.valueOf(j7 ^ ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        boolean z11 = obj instanceof byte[];
        if (z11 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList7 = new ArrayList(bArr2.length);
            for (byte b8 : bArr2) {
                arrayList7.add(Byte.valueOf((byte) (b8 ^ ((Number) obj2).byteValue())));
            }
            return arrayList7.toArray(new Byte[0]);
        }
        boolean z12 = obj instanceof short[];
        if (z12 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr2.length);
            for (short s8 : sArr2) {
                arrayList8.add(Short.valueOf((short) (s8 ^ ((Number) obj2).shortValue())));
            }
            return arrayList8.toArray(new Short[0]);
        }
        boolean z13 = obj instanceof int[];
        if (z13 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            ArrayList arrayList9 = new ArrayList(iArr2.length);
            for (int i9 : iArr2) {
                arrayList9.add(Integer.valueOf(i9 ^ ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z14 = obj instanceof long[];
        if (z14 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList10 = new ArrayList(jArr2.length);
            for (long j8 : jArr2) {
                arrayList10.add(Long.valueOf(j8 ^ ((Number) obj2).longValue()));
            }
            return arrayList10.toArray(new Long[0]);
        }
        if (z11 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length3 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzgw.zza(this, length3, bArr4.length);
            C5904f c5904fK = AbstractC5905g.m26663k(0, length3);
            ArrayList arrayList11 = new ArrayList(AbstractC1638q.m6774s(c5904fK, 10));
            Iterator it = c5904fK.iterator();
            while (it.hasNext()) {
                int iMo6617a = ((AbstractC1608F) it).mo6617a();
                arrayList11.add(Byte.valueOf((byte) (bArr4[iMo6617a] ^ bArr3[iMo6617a])));
            }
            return arrayList11.toArray(new Byte[0]);
        }
        if (z12 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length4 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzgw.zza(this, length4, sArr4.length);
            C5904f c5904fK2 = AbstractC5905g.m26663k(0, length4);
            ArrayList arrayList12 = new ArrayList(AbstractC1638q.m6774s(c5904fK2, 10));
            Iterator it2 = c5904fK2.iterator();
            while (it2.hasNext()) {
                int iMo6617a2 = ((AbstractC1608F) it2).mo6617a();
                arrayList12.add(Short.valueOf((short) (sArr4[iMo6617a2] ^ sArr3[iMo6617a2])));
            }
            return arrayList12.toArray(new Short[0]);
        }
        if (z13 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length5 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzgw.zza(this, length5, iArr4.length);
            C5904f c5904fK3 = AbstractC5905g.m26663k(0, length5);
            ArrayList arrayList13 = new ArrayList(AbstractC1638q.m6774s(c5904fK3, 10));
            Iterator it3 = c5904fK3.iterator();
            while (it3.hasNext()) {
                int iMo6617a3 = ((AbstractC1608F) it3).mo6617a();
                arrayList13.add(Integer.valueOf(iArr4[iMo6617a3] ^ iArr3[iMo6617a3]));
            }
            return arrayList13.toArray(new Integer[0]);
        }
        if (!z14 || !(obj2 instanceof long[])) {
            throw new zzce(4, 5, null);
        }
        long[] jArr3 = (long[]) obj;
        int length6 = jArr3.length;
        long[] jArr4 = (long[]) obj2;
        zzgw.zza(this, length6, jArr4.length);
        C5904f c5904fK4 = AbstractC5905g.m26663k(0, length6);
        ArrayList arrayList14 = new ArrayList(AbstractC1638q.m6774s(c5904fK4, 10));
        Iterator it4 = c5904fK4.iterator();
        while (it4.hasNext()) {
            int iMo6617a4 = ((AbstractC1608F) it4).mo6617a();
            arrayList14.add(Long.valueOf(jArr3[iMo6617a4] ^ jArr4[iMo6617a4]));
        }
        return arrayList14.toArray(new Long[0]);
    }
}
