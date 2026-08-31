package p129Q3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: Q3.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1274m extends AbstractC1271j implements Set {

    /* JADX INFO: renamed from: b */
    private transient AbstractC1272k f4537b;

    AbstractC1274m() {
    }

    /* JADX INFO: renamed from: A */
    public static AbstractC1274m m5571A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        AbstractC1209m.m5293e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m5574n(length, objArr2);
    }

    /* JADX INFO: renamed from: B */
    private static boolean m5572B(int i7, int i8) {
        return i7 < (i8 >> 1) + (i8 >> 2);
    }

    /* JADX INFO: renamed from: m */
    static int m5573m(int i7) {
        int iMax = Math.max(i7, 2);
        if (iMax >= 751619276) {
            AbstractC1209m.m5293e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: n */
    private static AbstractC1274m m5574n(int i7, Object... objArr) {
        if (i7 == 0) {
            return m5576x();
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return m5577y(obj);
        }
        int iM5573m = m5573m(i7);
        Object[] objArr2 = new Object[iM5573m];
        int i8 = iM5573m - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object objM5598a = AbstractC1280s.m5598a(objArr[i11], i11);
            int iHashCode = objM5598a.hashCode();
            int iM5511a = AbstractC1270i.m5511a(iHashCode);
            while (true) {
                int i12 = iM5511a & i8;
                Object obj2 = objArr2[i12];
                if (obj2 == null) {
                    objArr[i10] = objM5598a;
                    objArr2[i12] = objM5598a;
                    i9 += iHashCode;
                    i10++;
                    break;
                }
                if (obj2.equals(objM5598a)) {
                    break;
                }
                iM5511a++;
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new C1287z(obj3);
        }
        if (m5573m(i10) < iM5573m / 2) {
            return m5574n(i10, objArr);
        }
        if (m5572B(i10, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new C1285x(objArr, i9, objArr2, i8, i10);
    }

    /* JADX INFO: renamed from: p */
    public static AbstractC1274m m5575p(Collection collection) {
        if ((collection instanceof AbstractC1274m) && !(collection instanceof SortedSet)) {
            AbstractC1274m abstractC1274m = (AbstractC1274m) collection;
            if (!abstractC1274m.mo5518k()) {
                return abstractC1274m;
            }
        }
        Object[] array = collection.toArray();
        return m5574n(array.length, array);
    }

    /* JADX INFO: renamed from: x */
    public static AbstractC1274m m5576x() {
        return C1285x.f4561t;
    }

    /* JADX INFO: renamed from: y */
    public static AbstractC1274m m5577y(Object obj) {
        return new C1287z(obj);
    }

    /* JADX INFO: renamed from: z */
    public static AbstractC1274m m5578z(Object obj, Object obj2, Object obj3) {
        return m5574n(3, obj, obj2, obj3);
    }

    @Override // p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: a */
    public AbstractC1272k mo5513a() {
        AbstractC1272k abstractC1272k = this.f4537b;
        if (abstractC1272k != null) {
            return abstractC1272k;
        }
        AbstractC1272k abstractC1272kMo5579q = mo5579q();
        this.f4537b = abstractC1272kMo5579q;
        return abstractC1272kMo5579q;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1274m) && mo5580v() && ((AbstractC1274m) obj).mo5580v() && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC1286y.m5614a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC1286y.m5615b(this);
    }

    /* JADX INFO: renamed from: q */
    AbstractC1272k mo5579q() {
        return AbstractC1272k.m5531m(toArray());
    }

    /* JADX INFO: renamed from: v */
    boolean mo5580v() {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public abstract AbstractC1260B iterator();
}
