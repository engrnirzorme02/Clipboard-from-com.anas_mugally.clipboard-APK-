package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.common.util.AbstractC3757l;
import com.google.android.gms.common.util.AbstractC3758m;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;
import p199a3.C2197b;

/* JADX INFO: renamed from: com.google.android.gms.common.server.response.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3734a {

    /* JADX INFO: renamed from: com.google.android.gms.common.server.response.a$b */
    public interface b {
        /* JADX INFO: renamed from: b */
        Object mo8936b(Object obj);

        /* JADX INFO: renamed from: e */
        Object mo8937e(Object obj);
    }

    /* JADX INFO: renamed from: a */
    private final void m18115a(a aVar, Object obj) {
        int i7 = aVar.f14872d;
        Object objM18127c0 = aVar.m18127c0(obj);
        String str = aVar.f14874f;
        switch (i7) {
            case 0:
                if (objM18127c0 != null) {
                    setIntegerInternal(aVar, str, ((Integer) objM18127c0).intValue());
                    return;
                } else {
                    m18117c(str);
                    return;
                }
            case 1:
                zaf(aVar, str, (BigInteger) objM18127c0);
                return;
            case 2:
                if (objM18127c0 != null) {
                    setLongInternal(aVar, str, ((Long) objM18127c0).longValue());
                    return;
                } else {
                    m18117c(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException("Unsupported type for conversion: " + i7);
            case 4:
                if (objM18127c0 != null) {
                    zan(aVar, str, ((Double) objM18127c0).doubleValue());
                    return;
                } else {
                    m18117c(str);
                    return;
                }
            case 5:
                zab(aVar, str, (BigDecimal) objM18127c0);
                return;
            case 6:
                if (objM18127c0 != null) {
                    setBooleanInternal(aVar, str, ((Boolean) objM18127c0).booleanValue());
                    return;
                } else {
                    m18117c(str);
                    return;
                }
            case 7:
                setStringInternal(aVar, str, (String) objM18127c0);
                return;
            case 8:
            case 9:
                if (objM18127c0 != null) {
                    setDecodedBytesInternal(aVar, str, (byte[]) objM18127c0);
                    return;
                } else {
                    m18117c(str);
                    return;
                }
        }
    }

    /* JADX INFO: renamed from: b */
    private static final void m18116b(StringBuilder sb, a aVar, Object obj) {
        int i7 = aVar.f14870b;
        if (i7 == 11) {
            Class cls = aVar.f14876s;
            AbstractC3718s.m18083l(cls);
            sb.append(((AbstractC3734a) cls.cast(obj)).toString());
        } else {
            if (i7 != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(AbstractC3757l.m18190a((String) obj));
            sb.append("\"");
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m18117c(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + str + ") has a null value, but expected a primitive");
        }
    }

    protected static final Object zaD(a aVar, Object obj) {
        return aVar.f14879v != null ? aVar.m18128d0(obj) : obj;
    }

    public <T extends AbstractC3734a> void addConcreteTypeArrayInternal(a aVar, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends AbstractC3734a> void addConcreteTypeInternal(a aVar, String str, T t7) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, a> getFieldMappings();

    protected Object getFieldValue(a aVar) {
        String str = aVar.f14874f;
        if (aVar.f14876s == null) {
            return getValueObject(str);
        }
        AbstractC3718s.m18088q(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", aVar.f14874f);
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }

    protected abstract Object getValueObject(String str);

    protected boolean isFieldSet(a aVar) {
        if (aVar.f14872d != 11) {
            return isPrimitiveFieldSet(aVar.f14874f);
        }
        if (aVar.f14873e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected abstract boolean isPrimitiveFieldSet(String str);

    protected void setBooleanInternal(a aVar, String str, boolean z7) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    protected void setDecodedBytesInternal(a aVar, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    protected void setIntegerInternal(a aVar, String str, int i7) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    protected void setLongInternal(a aVar, String str, long j7) {
        throw new UnsupportedOperationException("Long not supported");
    }

    protected void setStringInternal(a aVar, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    protected void setStringMapInternal(a aVar, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    protected void setStringsInternal(a aVar, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, a> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            a aVar = fieldMappings.get(str);
            if (isFieldSet(aVar)) {
                Object objZaD = zaD(aVar, getFieldValue(aVar));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objZaD != null) {
                    switch (aVar.f14872d) {
                        case 8:
                            sb.append("\"");
                            sb.append(AbstractC3748c.m18155c((byte[]) objZaD));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(AbstractC3748c.m18156d((byte[]) objZaD));
                            sb.append("\"");
                            break;
                        case 10:
                            AbstractC3758m.m18191a(sb, (HashMap) objZaD);
                            break;
                        default:
                            if (aVar.f14871c) {
                                ArrayList arrayList = (ArrayList) objZaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    if (i7 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i7);
                                    if (obj != null) {
                                        m18116b(sb, aVar, obj);
                                    }
                                }
                                sb.append("]");
                            } else {
                                m18116b(sb, aVar, objZaD);
                            }
                            break;
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final void zaA(a aVar, String str) {
        if (aVar.f14879v != null) {
            m18115a(aVar, str);
        } else {
            setStringInternal(aVar, aVar.f14874f, str);
        }
    }

    public final void zaB(a aVar, Map map) {
        if (aVar.f14879v != null) {
            m18115a(aVar, map);
        } else {
            setStringMapInternal(aVar, aVar.f14874f, map);
        }
    }

    public final void zaC(a aVar, ArrayList arrayList) {
        if (aVar.f14879v != null) {
            m18115a(aVar, arrayList);
        } else {
            setStringsInternal(aVar, aVar.f14874f, arrayList);
        }
    }

    public final void zaa(a aVar, BigDecimal bigDecimal) {
        if (aVar.f14879v != null) {
            m18115a(aVar, bigDecimal);
        } else {
            zab(aVar, aVar.f14874f, bigDecimal);
        }
    }

    protected void zab(a aVar, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(a aVar, ArrayList arrayList) {
        if (aVar.f14879v != null) {
            m18115a(aVar, arrayList);
        } else {
            zad(aVar, aVar.f14874f, arrayList);
        }
    }

    protected void zad(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(a aVar, BigInteger bigInteger) {
        if (aVar.f14879v != null) {
            m18115a(aVar, bigInteger);
        } else {
            zaf(aVar, aVar.f14874f, bigInteger);
        }
    }

    protected void zaf(a aVar, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(a aVar, ArrayList arrayList) {
        if (aVar.f14879v != null) {
            m18115a(aVar, arrayList);
        } else {
            zah(aVar, aVar.f14874f, arrayList);
        }
    }

    protected void zah(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(a aVar, boolean z7) {
        if (aVar.f14879v != null) {
            m18115a(aVar, Boolean.valueOf(z7));
        } else {
            setBooleanInternal(aVar, aVar.f14874f, z7);
        }
    }

    public final void zaj(a aVar, ArrayList arrayList) {
        if (aVar.f14879v != null) {
            m18115a(aVar, arrayList);
        } else {
            zak(aVar, aVar.f14874f, arrayList);
        }
    }

    protected void zak(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(a aVar, byte[] bArr) {
        if (aVar.f14879v != null) {
            m18115a(aVar, bArr);
        } else {
            setDecodedBytesInternal(aVar, aVar.f14874f, bArr);
        }
    }

    public final void zam(a aVar, double d7) {
        if (aVar.f14879v != null) {
            m18115a(aVar, Double.valueOf(d7));
        } else {
            zan(aVar, aVar.f14874f, d7);
        }
    }

    protected void zan(a aVar, String str, double d7) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(a aVar, ArrayList arrayList) {
        if (aVar.f14879v != null) {
            m18115a(aVar, arrayList);
        } else {
            zap(aVar, aVar.f14874f, arrayList);
        }
    }

    protected void zap(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(a aVar, float f7) {
        if (aVar.f14879v != null) {
            m18115a(aVar, Float.valueOf(f7));
        } else {
            zar(aVar, aVar.f14874f, f7);
        }
    }

    protected void zar(a aVar, String str, float f7) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(a aVar, ArrayList arrayList) {
        if (aVar.f14879v != null) {
            m18115a(aVar, arrayList);
        } else {
            zat(aVar, aVar.f14874f, arrayList);
        }
    }

    protected void zat(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(a aVar, int i7) {
        if (aVar.f14879v != null) {
            m18115a(aVar, Integer.valueOf(i7));
        } else {
            setIntegerInternal(aVar, aVar.f14874f, i7);
        }
    }

    public final void zav(a aVar, ArrayList arrayList) {
        if (aVar.f14879v != null) {
            m18115a(aVar, arrayList);
        } else {
            zaw(aVar, aVar.f14874f, arrayList);
        }
    }

    protected void zaw(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(a aVar, long j7) {
        if (aVar.f14879v != null) {
            m18115a(aVar, Long.valueOf(j7));
        } else {
            setLongInternal(aVar, aVar.f14874f, j7);
        }
    }

    public final void zay(a aVar, ArrayList arrayList) {
        if (aVar.f14879v != null) {
            m18115a(aVar, arrayList);
        } else {
            zaz(aVar, aVar.f14874f, arrayList);
        }
    }

    protected void zaz(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.server.response.a$a */
    public static class a extends AbstractC1945a {
        public static final C3737d CREATOR = new C3737d();

        /* JADX INFO: renamed from: a */
        private final int f14869a;

        /* JADX INFO: renamed from: b */
        protected final int f14870b;

        /* JADX INFO: renamed from: c */
        protected final boolean f14871c;

        /* JADX INFO: renamed from: d */
        protected final int f14872d;

        /* JADX INFO: renamed from: e */
        protected final boolean f14873e;

        /* JADX INFO: renamed from: f */
        protected final String f14874f;

        /* JADX INFO: renamed from: r */
        protected final int f14875r;

        /* JADX INFO: renamed from: s */
        protected final Class f14876s;

        /* JADX INFO: renamed from: t */
        protected final String f14877t;

        /* JADX INFO: renamed from: u */
        private C3741h f14878u;

        /* JADX INFO: renamed from: v */
        private final b f14879v;

        a(int i7, int i8, boolean z7, int i9, boolean z8, String str, int i10, String str2, C2197b c2197b) {
            this.f14869a = i7;
            this.f14870b = i8;
            this.f14871c = z7;
            this.f14872d = i9;
            this.f14873e = z8;
            this.f14874f = str;
            this.f14875r = i10;
            if (str2 == null) {
                this.f14876s = null;
                this.f14877t = null;
            } else {
                this.f14876s = C3736c.class;
                this.f14877t = str2;
            }
            if (c2197b == null) {
                this.f14879v = null;
            } else {
                this.f14879v = c2197b.m8939U();
            }
        }

        /* JADX INFO: renamed from: T */
        public static a m18118T(String str, int i7) {
            return new a(8, false, 8, false, str, i7, null, null);
        }

        /* JADX INFO: renamed from: U */
        public static a m18119U(String str, int i7, Class cls) {
            return new a(11, false, 11, false, str, i7, cls, null);
        }

        /* JADX INFO: renamed from: V */
        public static a m18120V(String str, int i7, Class cls) {
            return new a(11, true, 11, true, str, i7, cls, null);
        }

        /* JADX INFO: renamed from: W */
        public static a m18121W(String str, int i7) {
            return new a(0, false, 0, false, str, i7, null, null);
        }

        /* JADX INFO: renamed from: X */
        public static a m18122X(String str, int i7) {
            return new a(7, false, 7, false, str, i7, null, null);
        }

        /* JADX INFO: renamed from: Y */
        public static a m18123Y(String str, int i7) {
            return new a(7, true, 7, true, str, i7, null, null);
        }

        /* JADX INFO: renamed from: Z */
        public int m18125Z() {
            return this.f14875r;
        }

        /* JADX INFO: renamed from: a0 */
        final C2197b m18126a0() {
            b bVar = this.f14879v;
            if (bVar == null) {
                return null;
            }
            return C2197b.m8938T(bVar);
        }

        /* JADX INFO: renamed from: c0 */
        public final Object m18127c0(Object obj) {
            AbstractC3718s.m18083l(this.f14879v);
            return AbstractC3718s.m18083l(this.f14879v.mo8937e(obj));
        }

        /* JADX INFO: renamed from: d0 */
        public final Object m18128d0(Object obj) {
            AbstractC3718s.m18083l(this.f14879v);
            return this.f14879v.mo8936b(obj);
        }

        /* JADX INFO: renamed from: e0 */
        final String m18129e0() {
            String str = this.f14877t;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* JADX INFO: renamed from: f0 */
        public final Map m18130f0() {
            AbstractC3718s.m18083l(this.f14877t);
            AbstractC3718s.m18083l(this.f14878u);
            return (Map) AbstractC3718s.m18083l(this.f14878u.m18139U(this.f14877t));
        }

        /* JADX INFO: renamed from: g0 */
        public final void m18131g0(C3741h c3741h) {
            this.f14878u = c3741h;
        }

        /* JADX INFO: renamed from: h0 */
        public final boolean m18132h0() {
            return this.f14879v != null;
        }

        public final String toString() {
            AbstractC3714q.a aVarM18056a = AbstractC3714q.m18055d(this).m18056a("versionCode", Integer.valueOf(this.f14869a)).m18056a("typeIn", Integer.valueOf(this.f14870b)).m18056a("typeInArray", Boolean.valueOf(this.f14871c)).m18056a("typeOut", Integer.valueOf(this.f14872d)).m18056a("typeOutArray", Boolean.valueOf(this.f14873e)).m18056a("outputFieldName", this.f14874f).m18056a("safeParcelFieldId", Integer.valueOf(this.f14875r)).m18056a("concreteTypeName", m18129e0());
            Class cls = this.f14876s;
            if (cls != null) {
                aVarM18056a.m18056a("concreteType.class", cls.getCanonicalName());
            }
            b bVar = this.f14879v;
            if (bVar != null) {
                aVarM18056a.m18056a("converterName", bVar.getClass().getCanonicalName());
            }
            return aVarM18056a.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            int i8 = this.f14869a;
            int iM8053a = AbstractC1947c.m8053a(parcel);
            AbstractC1947c.m8072t(parcel, 1, i8);
            AbstractC1947c.m8072t(parcel, 2, this.f14870b);
            AbstractC1947c.m8059g(parcel, 3, this.f14871c);
            AbstractC1947c.m8072t(parcel, 4, this.f14872d);
            AbstractC1947c.m8059g(parcel, 5, this.f14873e);
            AbstractC1947c.m8044E(parcel, 6, this.f14874f, false);
            AbstractC1947c.m8072t(parcel, 7, m18125Z());
            AbstractC1947c.m8044E(parcel, 8, m18129e0(), false);
            AbstractC1947c.m8042C(parcel, 9, m18126a0(), i7, false);
            AbstractC1947c.m8054b(parcel, iM8053a);
        }

        protected a(int i7, boolean z7, int i8, boolean z8, String str, int i9, Class cls, b bVar) {
            this.f14869a = 1;
            this.f14870b = i7;
            this.f14871c = z7;
            this.f14872d = i8;
            this.f14873e = z8;
            this.f14874f = str;
            this.f14875r = i9;
            this.f14876s = cls;
            if (cls == null) {
                this.f14877t = null;
            } else {
                this.f14877t = cls.getCanonicalName();
            }
            this.f14879v = bVar;
        }
    }
}
