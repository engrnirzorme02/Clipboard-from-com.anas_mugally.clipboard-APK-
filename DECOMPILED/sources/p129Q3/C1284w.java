package p129Q3;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: Q3.w */
/* JADX INFO: loaded from: classes2.dex */
final class C1284w extends AbstractC1273l {

    /* JADX INFO: renamed from: s */
    static final AbstractC1273l f4546s = new C1284w(null, new Object[0], 0);

    /* JADX INFO: renamed from: e */
    private final transient Object f4547e;

    /* JADX INFO: renamed from: f */
    final transient Object[] f4548f;

    /* JADX INFO: renamed from: r */
    private final transient int f4549r;

    /* JADX INFO: renamed from: Q3.w$a */
    static class a extends AbstractC1274m {

        /* JADX INFO: renamed from: c */
        private final transient AbstractC1273l f4550c;

        /* JADX INFO: renamed from: d */
        private final transient Object[] f4551d;

        /* JADX INFO: renamed from: e */
        private final transient int f4552e;

        /* JADX INFO: renamed from: f */
        private final transient int f4553f;

        /* JADX INFO: renamed from: Q3.w$a$a, reason: collision with other inner class name */
        class C7644a extends AbstractC1272k {
            C7644a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i7) {
                AbstractC1209m.m5300l(i7, a.this.f4553f);
                int i8 = i7 * 2;
                Object obj = a.this.f4551d[a.this.f4552e + i8];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f4551d[i8 + (a.this.f4552e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // p129Q3.AbstractC1271j
            /* JADX INFO: renamed from: k */
            public boolean mo5518k() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f4553f;
            }
        }

        a(AbstractC1273l abstractC1273l, Object[] objArr, int i7, int i8) {
            this.f4550c = abstractC1273l;
            this.f4551d = objArr;
            this.f4552e = i7;
            this.f4553f = i8;
        }

        @Override // p129Q3.AbstractC1271j
        /* JADX INFO: renamed from: b */
        int mo5514b(Object[] objArr, int i7) {
            return mo5513a().mo5514b(objArr, i7);
        }

        @Override // p129Q3.AbstractC1271j, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f4550c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // p129Q3.AbstractC1271j
        /* JADX INFO: renamed from: k */
        boolean mo5518k() {
            return true;
        }

        @Override // p129Q3.AbstractC1274m
        /* JADX INFO: renamed from: q */
        AbstractC1272k mo5579q() {
            return new C7644a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f4553f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: w */
        public AbstractC1260B iterator() {
            return mo5513a().iterator();
        }
    }

    /* JADX INFO: renamed from: Q3.w$b */
    static final class b extends AbstractC1274m {

        /* JADX INFO: renamed from: c */
        private final transient AbstractC1273l f4555c;

        /* JADX INFO: renamed from: d */
        private final transient AbstractC1272k f4556d;

        b(AbstractC1273l abstractC1273l, AbstractC1272k abstractC1272k) {
            this.f4555c = abstractC1273l;
            this.f4556d = abstractC1272k;
        }

        @Override // p129Q3.AbstractC1274m, p129Q3.AbstractC1271j
        /* JADX INFO: renamed from: a */
        public AbstractC1272k mo5513a() {
            return this.f4556d;
        }

        @Override // p129Q3.AbstractC1271j
        /* JADX INFO: renamed from: b */
        int mo5514b(Object[] objArr, int i7) {
            return mo5513a().mo5514b(objArr, i7);
        }

        @Override // p129Q3.AbstractC1271j, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f4555c.get(obj) != null;
        }

        @Override // p129Q3.AbstractC1271j
        /* JADX INFO: renamed from: k */
        boolean mo5518k() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f4555c.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: w */
        public AbstractC1260B iterator() {
            return mo5513a().iterator();
        }
    }

    /* JADX INFO: renamed from: Q3.w$c */
    static final class c extends AbstractC1272k {

        /* JADX INFO: renamed from: c */
        private final transient Object[] f4557c;

        /* JADX INFO: renamed from: d */
        private final transient int f4558d;

        /* JADX INFO: renamed from: e */
        private final transient int f4559e;

        c(Object[] objArr, int i7, int i8) {
            this.f4557c = objArr;
            this.f4558d = i7;
            this.f4559e = i8;
        }

        @Override // java.util.List
        public Object get(int i7) {
            AbstractC1209m.m5300l(i7, this.f4559e);
            Object obj = this.f4557c[(i7 * 2) + this.f4558d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // p129Q3.AbstractC1271j
        /* JADX INFO: renamed from: k */
        boolean mo5518k() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4559e;
        }
    }

    private C1284w(Object obj, Object[] objArr, int i7) {
        this.f4547e = obj;
        this.f4548f = objArr;
        this.f4549r = i7;
    }

    /* JADX INFO: renamed from: p */
    static C1284w m5606p(int i7, Object[] objArr) {
        return m5607q(i7, objArr, null);
    }

    /* JADX INFO: renamed from: q */
    static C1284w m5607q(int i7, Object[] objArr, AbstractC1273l.a aVar) {
        if (i7 == 0) {
            return (C1284w) f4546s;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC1265d.m5508a(obj, obj2);
            return new C1284w(null, objArr, 1);
        }
        AbstractC1209m.m5305q(i7, objArr.length >> 1);
        Object objM5608r = m5608r(objArr, i7, AbstractC1274m.m5573m(i7), 0);
        if (objM5608r instanceof Object[]) {
            Object[] objArr2 = (Object[]) objM5608r;
            AbstractC1273l.a.C7642a c7642a = (AbstractC1273l.a.C7642a) objArr2[2];
            if (aVar == null) {
                throw c7642a.m5570a();
            }
            aVar.f4533e = c7642a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objM5608r = obj3;
            i7 = iIntValue;
        }
        return new C1284w(objM5608r, objArr, i7);
    }

    /* JADX INFO: renamed from: r */
    private static Object m5608r(Object[] objArr, int i7, int i8, int i9) {
        int i10;
        AbstractC1273l.a.C7642a c7642a = null;
        int i11 = 1;
        if (i7 == 1) {
            Object obj = objArr[i9];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i9 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC1265d.m5508a(obj, obj2);
            return null;
        }
        int i12 = i8 - 1;
        if (i8 <= 128) {
            byte[] bArr = new byte[i8];
            Arrays.fill(bArr, (byte) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i7; i14++) {
                int i15 = (i14 * 2) + i9;
                int i16 = (i13 * 2) + i9;
                Object obj3 = objArr[i15];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC1265d.m5508a(obj3, obj4);
                int iM5511a = AbstractC1270i.m5511a(obj3.hashCode());
                while (true) {
                    int i17 = iM5511a & i12;
                    int i18 = bArr[i17] & 255;
                    if (i18 == 255) {
                        bArr[i17] = (byte) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj3;
                            objArr[i16 ^ 1] = obj4;
                        }
                        i13++;
                        break;
                    }
                    if (obj3.equals(objArr[i18])) {
                        int i19 = i18 ^ 1;
                        Object obj5 = objArr[i19];
                        Objects.requireNonNull(obj5);
                        c7642a = new AbstractC1273l.a.C7642a(obj3, obj4, obj5);
                        objArr[i19] = obj4;
                        break;
                    }
                    iM5511a = i17 + 1;
                }
            }
            return i13 == i7 ? bArr : new Object[]{bArr, Integer.valueOf(i13), c7642a};
        }
        if (i8 <= 32768) {
            short[] sArr = new short[i8];
            Arrays.fill(sArr, (short) -1);
            int i20 = 0;
            for (int i21 = 0; i21 < i7; i21++) {
                int i22 = (i21 * 2) + i9;
                int i23 = (i20 * 2) + i9;
                Object obj6 = objArr[i22];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i22 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC1265d.m5508a(obj6, obj7);
                int iM5511a2 = AbstractC1270i.m5511a(obj6.hashCode());
                while (true) {
                    int i24 = iM5511a2 & i12;
                    int i25 = sArr[i24] & 65535;
                    if (i25 == 65535) {
                        sArr[i24] = (short) i23;
                        if (i20 < i21) {
                            objArr[i23] = obj6;
                            objArr[i23 ^ 1] = obj7;
                        }
                        i20++;
                        break;
                    }
                    if (obj6.equals(objArr[i25])) {
                        int i26 = i25 ^ 1;
                        Object obj8 = objArr[i26];
                        Objects.requireNonNull(obj8);
                        c7642a = new AbstractC1273l.a.C7642a(obj6, obj7, obj8);
                        objArr[i26] = obj7;
                        break;
                    }
                    iM5511a2 = i24 + 1;
                }
            }
            return i20 == i7 ? sArr : new Object[]{sArr, Integer.valueOf(i20), c7642a};
        }
        int[] iArr = new int[i8];
        Arrays.fill(iArr, -1);
        int i27 = 0;
        int i28 = 0;
        while (i27 < i7) {
            int i29 = (i27 * 2) + i9;
            int i30 = (i28 * 2) + i9;
            Object obj9 = objArr[i29];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i29 ^ i11];
            Objects.requireNonNull(obj10);
            AbstractC1265d.m5508a(obj9, obj10);
            int iM5511a3 = AbstractC1270i.m5511a(obj9.hashCode());
            while (true) {
                int i31 = iM5511a3 & i12;
                int i32 = iArr[i31];
                if (i32 == -1) {
                    iArr[i31] = i30;
                    if (i28 < i27) {
                        objArr[i30] = obj9;
                        objArr[i30 ^ 1] = obj10;
                    }
                    i28++;
                    i10 = i11;
                    break;
                }
                i10 = i11;
                if (obj9.equals(objArr[i32])) {
                    int i33 = i32 ^ 1;
                    Object obj11 = objArr[i33];
                    Objects.requireNonNull(obj11);
                    c7642a = new AbstractC1273l.a.C7642a(obj9, obj10, obj11);
                    objArr[i33] = obj10;
                    break;
                }
                iM5511a3 = i31 + 1;
                i11 = i10;
            }
            i27++;
            i11 = i10;
        }
        int i34 = i11;
        if (i28 == i7) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i34] = Integer.valueOf(i28);
        objArr2[2] = c7642a;
        return objArr2;
    }

    /* JADX INFO: renamed from: s */
    static Object m5609s(Object obj, Object[] objArr, int i7, int i8, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i7 == 1) {
            Object obj3 = objArr[i8];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i8 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iM5511a = AbstractC1270i.m5511a(obj2.hashCode());
            while (true) {
                int i9 = iM5511a & length;
                int i10 = bArr[i9] & 255;
                if (i10 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i10])) {
                    return objArr[i10 ^ 1];
                }
                iM5511a = i9 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iM5511a2 = AbstractC1270i.m5511a(obj2.hashCode());
            while (true) {
                int i11 = iM5511a2 & length2;
                int i12 = sArr[i11] & 65535;
                if (i12 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i12])) {
                    return objArr[i12 ^ 1];
                }
                iM5511a2 = i11 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iM5511a3 = AbstractC1270i.m5511a(obj2.hashCode());
            while (true) {
                int i13 = iM5511a3 & length3;
                int i14 = iArr[i13];
                if (i14 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                iM5511a3 = i13 + 1;
            }
        }
    }

    @Override // p129Q3.AbstractC1273l
    /* JADX INFO: renamed from: d */
    AbstractC1274m mo5553d() {
        return new a(this, this.f4548f, 0, this.f4549r);
    }

    @Override // p129Q3.AbstractC1273l
    /* JADX INFO: renamed from: e */
    AbstractC1274m mo5554e() {
        return new b(this, new c(this.f4548f, 0, this.f4549r));
    }

    @Override // p129Q3.AbstractC1273l
    /* JADX INFO: renamed from: f */
    AbstractC1271j mo5555f() {
        return new c(this.f4548f, 1, this.f4549r);
    }

    @Override // p129Q3.AbstractC1273l, java.util.Map
    public Object get(Object obj) {
        Object objM5609s = m5609s(this.f4547e, this.f4548f, this.f4549r, 0, obj);
        if (objM5609s == null) {
            return null;
        }
        return objM5609s;
    }

    @Override // p129Q3.AbstractC1273l
    /* JADX INFO: renamed from: h */
    boolean mo5557h() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f4549r;
    }
}
