package p206b0;

import androidx.datastore.preferences.protobuf.AbstractC2512f;
import androidx.datastore.preferences.protobuf.AbstractC2533t;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1434l;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p174X.C1900d;
import p174X.InterfaceC1885E;
import p196a0.AbstractC2176d;
import p196a0.C2178f;
import p196a0.C2179g;
import p196a0.C2180h;

/* JADX INFO: renamed from: b0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2926h implements InterfaceC1885E {

    /* JADX INFO: renamed from: a */
    public static final C2926h f12044a = new C2926h();

    /* JADX INFO: renamed from: b0.h$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12045a;

        static {
            int[] iArr = new int[C2180h.b.values().length];
            try {
                iArr[C2180h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C2180h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C2180h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C2180h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C2180h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C2180h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C2180h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C2180h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C2180h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f12045a = iArr;
        }
    }

    private C2926h() {
    }

    /* JADX INFO: renamed from: a */
    private final void m14671a(String str, C2180h c2180h, C2921c c2921c) throws C1900d {
        C2180h.b bVarM8849g0 = c2180h.m8849g0();
        switch (bVarM8849g0 == null ? -1 : a.f12045a[bVarM8849g0.ordinal()]) {
            case -1:
                throw new C1900d("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new C1434l();
            case 1:
                c2921c.m14659i(AbstractC2927i.m14675a(str), Boolean.valueOf(c2180h.m8841X()));
                return;
            case 2:
                c2921c.m14659i(AbstractC2927i.m14678d(str), Float.valueOf(c2180h.m8844b0()));
                return;
            case 3:
                c2921c.m14659i(AbstractC2927i.m14677c(str), Double.valueOf(c2180h.m8843a0()));
                return;
            case 4:
                c2921c.m14659i(AbstractC2927i.m14679e(str), Integer.valueOf(c2180h.m8845c0()));
                return;
            case 5:
                c2921c.m14659i(AbstractC2927i.m14680f(str), Long.valueOf(c2180h.m8846d0()));
                return;
            case 6:
                AbstractC2924f.a aVarM14681g = AbstractC2927i.m14681g(str);
                String strM8847e0 = c2180h.m8847e0();
                AbstractC6118n.m27186d(strM8847e0, "value.string");
                c2921c.m14659i(aVarM14681g, strM8847e0);
                return;
            case 7:
                AbstractC2924f.a aVarM14682h = AbstractC2927i.m14682h(str);
                List listM8820T = c2180h.m8848f0().m8820T();
                AbstractC6118n.m27186d(listM8820T, "value.stringSet.stringsList");
                c2921c.m14659i(aVarM14682h, AbstractC1638q.m6598l0(listM8820T));
                return;
            case 8:
                AbstractC2924f.a aVarM14676b = AbstractC2927i.m14676b(str);
                byte[] bArrM11155y = c2180h.m8842Y().m11155y();
                AbstractC6118n.m27186d(bArrM11155y, "value.bytes.toByteArray()");
                c2921c.m14659i(aVarM14676b, bArrM11155y);
                return;
            case 9:
                throw new C1900d("Value not set.", null, 2, null);
        }
    }

    /* JADX INFO: renamed from: c */
    private final C2180h m14672c(Object obj) {
        if (obj instanceof Boolean) {
            AbstractC2533t abstractC2533tM11631h = C2180h.m8832h0().m8850r(((Boolean) obj).booleanValue()).m11631h();
            AbstractC6118n.m27186d(abstractC2533tM11631h, "newBuilder().setBoolean(value).build()");
            return (C2180h) abstractC2533tM11631h;
        }
        if (obj instanceof Float) {
            AbstractC2533t abstractC2533tM11631h2 = C2180h.m8832h0().m8853u(((Number) obj).floatValue()).m11631h();
            AbstractC6118n.m27186d(abstractC2533tM11631h2, "newBuilder().setFloat(value).build()");
            return (C2180h) abstractC2533tM11631h2;
        }
        if (obj instanceof Double) {
            AbstractC2533t abstractC2533tM11631h3 = C2180h.m8832h0().m8852t(((Number) obj).doubleValue()).m11631h();
            AbstractC6118n.m27186d(abstractC2533tM11631h3, "newBuilder().setDouble(value).build()");
            return (C2180h) abstractC2533tM11631h3;
        }
        if (obj instanceof Integer) {
            AbstractC2533t abstractC2533tM11631h4 = C2180h.m8832h0().m8854v(((Number) obj).intValue()).m11631h();
            AbstractC6118n.m27186d(abstractC2533tM11631h4, "newBuilder().setInteger(value).build()");
            return (C2180h) abstractC2533tM11631h4;
        }
        if (obj instanceof Long) {
            AbstractC2533t abstractC2533tM11631h5 = C2180h.m8832h0().m8855w(((Number) obj).longValue()).m11631h();
            AbstractC6118n.m27186d(abstractC2533tM11631h5, "newBuilder().setLong(value).build()");
            return (C2180h) abstractC2533tM11631h5;
        }
        if (obj instanceof String) {
            AbstractC2533t abstractC2533tM11631h6 = C2180h.m8832h0().m8856x((String) obj).m11631h();
            AbstractC6118n.m27186d(abstractC2533tM11631h6, "newBuilder().setString(value).build()");
            return (C2180h) abstractC2533tM11631h6;
        }
        if (obj instanceof Set) {
            C2180h.a aVarM8832h0 = C2180h.m8832h0();
            C2179g.a aVarM8819U = C2179g.m8819U();
            AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            AbstractC2533t abstractC2533tM11631h7 = aVarM8832h0.m8857y(aVarM8819U.m8821r((Set) obj)).m11631h();
            AbstractC6118n.m27186d(abstractC2533tM11631h7, "newBuilder()\n           …                 .build()");
            return (C2180h) abstractC2533tM11631h7;
        }
        if (obj instanceof byte[]) {
            AbstractC2533t abstractC2533tM11631h8 = C2180h.m8832h0().m8851s(AbstractC2512f.m11143j((byte[]) obj)).m11631h();
            AbstractC6118n.m27186d(abstractC2533tM11631h8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (C2180h) abstractC2533tM11631h8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // p174X.InterfaceC1885E
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2924f getDefaultValue() {
        return AbstractC2925g.m14669a();
    }

    @Override // p174X.InterfaceC1885E
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object writeTo(AbstractC2924f abstractC2924f, OutputStream outputStream, InterfaceC1875e interfaceC1875e) {
        Map mapMo14653a = abstractC2924f.mo14653a();
        C2178f.a aVarM8809U = C2178f.m8809U();
        for (Map.Entry entry : mapMo14653a.entrySet()) {
            aVarM8809U.m8813r(((AbstractC2924f.a) entry.getKey()).m14668a(), m14672c(entry.getValue()));
        }
        ((C2178f) aVarM8809U.m11631h()).m11039h(outputStream);
        return C1444v.f4971a;
    }

    @Override // p174X.InterfaceC1885E
    public Object readFrom(InputStream inputStream, InterfaceC1875e interfaceC1875e) throws C1900d {
        C2178f c2178fM8803a = AbstractC2176d.f7043a.m8803a(inputStream);
        C2921c c2921cM14670b = AbstractC2925g.m14670b(new AbstractC2924f.b[0]);
        Map mapM8811R = c2178fM8803a.m8811R();
        AbstractC6118n.m27186d(mapM8811R, "preferencesProto.preferencesMap");
        for (Map.Entry entry : mapM8811R.entrySet()) {
            String name = (String) entry.getKey();
            C2180h value = (C2180h) entry.getValue();
            C2926h c2926h = f12044a;
            AbstractC6118n.m27186d(name, "name");
            AbstractC6118n.m27186d(value, "value");
            c2926h.m14671a(name, value, c2921cM14670b);
        }
        return c2921cM14670b.m14667d();
    }
}
